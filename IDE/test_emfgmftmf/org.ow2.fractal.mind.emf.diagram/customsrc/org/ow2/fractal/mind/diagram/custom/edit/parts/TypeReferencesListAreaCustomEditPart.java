package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.AdlDefinitionCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.TypeReferencesListAreaCustomCanonicalEditPolicy;

import adl.diagram.edit.parts.TypeReferencesListCompartmentReferencesListAreaEditPart;

public class TypeReferencesListAreaCustomEditPart extends
		TypeReferencesListCompartmentReferencesListAreaEditPart {

	public TypeReferencesListAreaCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new TypeReferencesListAreaCustomCanonicalEditPolicy());
	}

}
