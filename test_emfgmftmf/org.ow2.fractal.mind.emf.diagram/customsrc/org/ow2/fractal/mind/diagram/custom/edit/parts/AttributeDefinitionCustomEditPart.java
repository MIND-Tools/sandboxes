package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.AttributeDefinitionCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.FixedChildrenLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.figures.AttributeDefinitionCustomFigure;

import adl.diagram.edit.parts.AttributeDefinitionEditPart;
import adl.diagram.edit.policies.AttributeDefinitionItemSemanticEditPolicy;

/**
 * Overrides AttributeDefinitionEditPart
 * @author mao
 *
 */

public class AttributeDefinitionCustomEditPart extends
		AttributeDefinitionEditPart {
	

	public AttributeDefinitionCustomEditPart(View view) {
		super(view);
	}
	
	/**
	 * Custom constraint for the custom layout
	 */
	public void refreshBounds() {
		((GraphicalEditPart) getParent()).setLayoutConstraint(
		this,
		getFigure(),
		new Rectangle(-1,-1,-1,AttributeDefinitionCustomFigure.ATTRIBUTE_HEIGHT)
		);
	}

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		removeEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE);
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new AttributeDefinitionCustomItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new MindCreationEditPolicy());
	}

	@Override
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy lep = new FixedChildrenLayoutEditPolicy();
		return lep;
	}
	
	
	
}
