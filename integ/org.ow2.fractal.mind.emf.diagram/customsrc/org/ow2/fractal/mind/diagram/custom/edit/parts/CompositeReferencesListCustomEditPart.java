package org.ow2.fractal.mind.diagram.custom.edit.parts;


import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompositeReferencesListCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.FixedChildrenLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.layouts.ConstrainedFlowLayout;
import org.ow2.fractal.mind.diagram.custom.layouts.IFractalSize;

import adl.diagram.edit.parts.CompositeReferencesListEditPart;
import adl.diagram.part.MindVisualIDRegistry;

/**
 * Extends CompositeReferencesListEditPart to implement custom behavior
 * - disable spacing
 * - set default size
 * @author maroto
 *
 */
public class CompositeReferencesListCustomEditPart extends
		CompositeReferencesListEditPart {
	
	public CompositeReferencesListCustomEditPart(View view) {
		super(view);
	}	
	
	@Override
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			// No spacing
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}
	
	
	
	@Override
	protected void refreshBounds() {
		int width = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE.getSize_Width())).intValue();
		int height = -1;
		
		CompositeReferencesListAreaCustomEditPart pane = getPane();
		LayoutManager areaLayout = null;
		if (pane != null)
			areaLayout = pane.getLayoutManager();
		if (areaLayout != null && areaLayout instanceof ConstrainedFlowLayout) {
			layoutAllChildren(getFigure());
			height = ((ConstrainedFlowLayout)areaLayout).totalHeight +
					IFractalSize.TITLE_HEIGHT + 6;
		}
		
		Dimension size = new Dimension(width, height);
		Point loc = new Point(0, 0);
		((GraphicalEditPart) getParent()).setLayoutConstraint(
			this,
			getFigure(),
			new Rectangle(loc, size));
	}
	
	private void layoutAllChildren(IFigure fig) {
		LayoutManager manager = fig.getLayoutManager();
		if (manager != null && fig instanceof Shape) {
			manager.layout(fig);
		}
		List children = fig.getChildren();
		for (Iterator iterator = children.iterator(); iterator.hasNext();) {
			IFigure child = (IFigure) iterator.next();
			if (child != null) {
				layoutAllChildren(child);
			}
		}
		
	}
	
	public CompositeReferencesListAreaCustomEditPart getPane() {
		EditPart pane = getChildBySemanticHint(MindVisualIDRegistry
				.getType(CompositeReferencesListAreaCustomEditPart.VISUAL_ID));
		if (pane instanceof CompositeReferencesListAreaCustomEditPart)
			return (CompositeReferencesListAreaCustomEditPart) pane;
		return null;
		 
	}
	

	@Override
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new MindCreationEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CompositeReferencesListCustomItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new NonResizableEditPolicy());
	}
	
	protected LayoutEditPolicy createLayoutEditPolicy() {
		return new FixedChildrenLayoutEditPolicy();
	}
	
	
	
	
	

}
