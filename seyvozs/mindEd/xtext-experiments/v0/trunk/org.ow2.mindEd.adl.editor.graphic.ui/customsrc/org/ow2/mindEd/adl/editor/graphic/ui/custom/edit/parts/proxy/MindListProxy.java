package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies.FixedChildrenLayoutEditPolicy;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies.NoDragDropEditPolicy;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.layouts.ConstrainedFlowLayout;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.layouts.IFractalSize;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.part.NoDragTracker;

public class MindListProxy extends MindProxy {

	/**
	 * This is the layout used for this edit part's compartment
	 */
	ConstrainedToolbarLayout layoutManager  = new ConstrainedToolbarLayout();;
	
	public MindListProxy(GraphicalEditPart editPart, int vID) {
		super(editPart,vID, TYPE_LIST);
	}
	
	public MindListProxy(GraphicalEditPart editPart, int vID, int mindType) {
		super(editPart, vID, mindType);
	}
	
	
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		// No drag and drop allowed
		editPart.installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new NoDragDropEditPolicy());
		editPart.installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new NoDragDropEditPolicy());
		editPart.installEditPolicy(EditPolicy.LAYOUT_ROLE,
				new FixedChildrenLayoutEditPolicy());
	}

	
	@Override
	public IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			nodeShape.setLayoutManager(layoutManager);
		}
		return nodeShape;
	}
	
	public DragTracker getDragTracker(Request request) {
		// Do not allow drag and drop
		return new NoDragTracker(editPart);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean refreshBounds() {
		// The height depends on the children inside the area of this ReferencesList
//		int width = ((Integer) realEditPart.getStructuralFeatureValue(NotationPackage.eINSTANCE.getSize_Width())).intValue();
		int width = -1;
		int height = -1;
		
		// Get the area and its layout manager
		GraphicalEditPart pane = getCompartment();
		LayoutManager areaLayout = null;
		if (pane != null)
			areaLayout = getMindProxyFor(pane).getLayoutManager();
		if (areaLayout != null && areaLayout instanceof ConstrainedFlowLayout) {
			// The manager should be a ConstrainedFlowLayout
			// It keeps the total height used so we can use it here
			areaLayout.layout(pane.getFigure());
			height = ((ConstrainedFlowLayout)areaLayout).getTotalHeight() +
					IFractalSize.TITLE_HEIGHT;
			
		}
		else if (areaLayout != null){
			List<EditPart> children = pane.getChildren();
			int nbChildren = children.size();
			height = IFractalSize.TITLE_HEIGHT + IFractalSize.TITLE_HEIGHT * nbChildren + 12;
		}
		
		// Now set the constraint
		Dimension size = new Dimension(width, height);
		Point loc = new Point(0, 0);
		((GraphicalEditPart) editPart.getParent()).setLayoutConstraint(
			editPart,
			getGraphicalEditPart().getFigure(),
			new Rectangle(loc, size));
		
		return true;
	}
}
