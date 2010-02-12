package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.AdlDefinitionCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompartmentPrimitiveComponentDefinitionBodyCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompartmentPrimitiveComponentDefinitionBodyCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CustomDragDropEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindCreationEditPolicy;

import adl.diagram.edit.parts.PrimitiveComponentDefinitionCompartmentPrimitiveDefinitionBodyEditPart;

public class CompartmentPrimitiveComponentDefinitionBodyCustomEditPart extends
		PrimitiveComponentDefinitionCompartmentPrimitiveDefinitionBodyEditPart {

	public CompartmentPrimitiveComponentDefinitionBodyCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new MindCreationEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CompartmentPrimitiveComponentDefinitionBodyCustomItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new CompartmentPrimitiveComponentDefinitionBodyCustomCanonicalEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new CustomDragDropEditPolicy());
	}

}
