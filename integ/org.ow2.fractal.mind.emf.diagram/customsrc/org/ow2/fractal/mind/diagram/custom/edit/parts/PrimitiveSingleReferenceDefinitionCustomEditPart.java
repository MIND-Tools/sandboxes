package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.AdlDefinitionCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.FixedChildrenLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.PrimitiveSingleReferenceDefinitionCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.PrimitiveSingleReferenceDefinitionCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.layouts.IFractalSize;

import adl.diagram.edit.parts.PrimitiveReferenceDefinition2EditPart;
import adl.diagram.edit.parts.PrimitiveReferenceDefinitionEditPart;

public class PrimitiveSingleReferenceDefinitionCustomEditPart extends
		PrimitiveReferenceDefinitionEditPart {

	public PrimitiveSingleReferenceDefinitionCustomEditPart(View view) {
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
		
		EditPart pane = getPrimaryChildEditPart();
		int nbChildren = 0;
		if (pane != null) {
			nbChildren = pane.getChildren().size();
		}
		
		int height = IFractalSize.TITLE_HEIGHT;
		if (nbChildren > 0) {
			height += nbChildren*IFractalSize.DEFAULT_LABEL_HEIGHT + 3;
		}
		
		Dimension size = new Dimension(width, height);
		Point loc = new Point(0, 0);
		((GraphicalEditPart) getParent()).setLayoutConstraint(
			this,
			getFigure(),
			new Rectangle(loc, size));
	}
	
	@Override
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new MindCreationEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new PrimitiveSingleReferenceDefinitionCustomItemSemanticEditPolicy());
		removeEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE);
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new PrimitiveSingleReferenceDefinitionCustomCanonicalEditPolicy());
	}
	
	protected LayoutEditPolicy createLayoutEditPolicy() {
		return new FixedChildrenLayoutEditPolicy();
	}
	
	@Override
	public EditPolicy getPrimaryDragEditPolicy() {
		return new NonResizableEditPolicy();
	}

}
