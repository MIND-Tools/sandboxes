package org.ow2.fractal.mind.diagram.custom.edit.parts;

import java.util.Map;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.CompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.internal.editparts.DummyEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompositeReferenceDefinitionCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.FixedChildrenLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.layouts.IFractalSize;

import adl.diagram.edit.parts.CompositeReferenceDefinitionEditPart;
import adl.diagram.edit.parts.CompositeReferenceDefinitionReferenceNameEditPart;
import adl.diagram.edit.parts.CompositeReferencesListEditPart;
import adl.diagram.part.MindVisualIDRegistry;
import adl.impl.CompositeReferenceDefinitionImpl;

/**
 * Extends CompositeReferenceDefinitionEditPart to implement custom behavior
 * - disable spacing
 * - set default size
 * - Grid layout data
 * @author maroto
 *
 */
public class CompositeReferenceDefinitionCustomEditPart extends
		CompositeReferenceDefinitionEditPart {

	public CompositeReferenceDefinitionCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			// no spacing
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}
	
	@Override
	protected void refreshBounds() {
		int width = -1;
		
		EditPart pane = getPane();
		int nbChildren = 0;
		if (pane != null) {
			nbChildren = pane.getChildren().size();
		}
		
		int height = IFractalSize.TITLE_HEIGHT;
		if (nbChildren > 0) {
			height += nbChildren*IFractalSize.ARGUMENT_HEIGHT + 6;
		}
		
		Dimension size = new Dimension(width, height);
		Point loc = new Point(0, 0);
		((GraphicalEditPart) getParent()).setLayoutConstraint(
			this,
			getFigure(),
			new Rectangle(loc, size));
		
		getParent().refresh();
	}
	
	public EditPart getPane() {
		return getChildBySemanticHint(MindVisualIDRegistry
				.getType(CompositeReferenceAreaCustomEditPart.VISUAL_ID));
	}
	
	@Override
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new MindCreationEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CompositeReferenceDefinitionCustomItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new NonResizableEditPolicy());
	}
	
	protected LayoutEditPolicy createLayoutEditPolicy() {
		return new FixedChildrenLayoutEditPolicy();
	}

}
