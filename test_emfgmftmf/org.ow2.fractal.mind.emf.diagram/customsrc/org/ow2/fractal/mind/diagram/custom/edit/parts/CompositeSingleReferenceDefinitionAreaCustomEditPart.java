package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.AdlDefinitionCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompositeSingleReferenceDefinitionAreaCustomCanonicalEditPolicy;

import adl.diagram.edit.parts.CompositeReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart;

public class CompositeSingleReferenceDefinitionAreaCustomEditPart extends
			CompositeReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart {

	public CompositeSingleReferenceDefinitionAreaCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new CompositeSingleReferenceDefinitionAreaCustomCanonicalEditPolicy());
	}
	
	@Override
	protected void addChild(EditPart childEditPart, int index) {
		super.addChild(childEditPart, index);
		getParent().refresh();
	}
	
	@Override
	protected void removeChild(EditPart childEditPart) {
		super.removeChild(childEditPart);
		getParent().refresh();
	}

}
