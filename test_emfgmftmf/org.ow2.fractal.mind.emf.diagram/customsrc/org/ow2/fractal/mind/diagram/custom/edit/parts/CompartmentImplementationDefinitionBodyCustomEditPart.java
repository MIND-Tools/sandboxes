package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.AdlDefinitionCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompartmentImplementationDefinitionBodyCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CustomDragDropEditPolicy;

import adl.diagram.edit.parts.ImplementationDefinitionCompartmentImplementationBodyAreaEditPart;

public class CompartmentImplementationDefinitionBodyCustomEditPart extends
		ImplementationDefinitionCompartmentImplementationBodyAreaEditPart {

	public CompartmentImplementationDefinitionBodyCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new CompartmentImplementationDefinitionBodyCustomCanonicalEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new CustomDragDropEditPolicy());
	}

}
