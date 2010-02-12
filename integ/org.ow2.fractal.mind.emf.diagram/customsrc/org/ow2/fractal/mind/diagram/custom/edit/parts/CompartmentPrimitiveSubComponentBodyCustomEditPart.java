package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.AdlDefinitionCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompartmentPrimitiveSubComponentBodyCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompartmentPrimitiveSubComponentBodyCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CustomDragDropEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindCreationEditPolicy;

import adl.diagram.edit.parts.PrimitiveSubComponentCompartmentPrimitiveSubComponentBodyEditPart;

public class CompartmentPrimitiveSubComponentBodyCustomEditPart extends
		PrimitiveSubComponentCompartmentPrimitiveSubComponentBodyEditPart {

	public CompartmentPrimitiveSubComponentBodyCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new MindCreationEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CompartmentPrimitiveSubComponentBodyCustomItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new CompartmentPrimitiveSubComponentBodyCustomCanonicalEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new CustomDragDropEditPolicy());
	}

}
