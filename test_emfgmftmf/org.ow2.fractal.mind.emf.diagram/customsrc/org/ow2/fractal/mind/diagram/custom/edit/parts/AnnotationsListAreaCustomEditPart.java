package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.FormalArgumentsListAreaCustomCanonicalEditPolicy;

import adl.diagram.edit.parts.AnnotationsListCompartmentAnnotationsAreaEditPart;

public class AnnotationsListAreaCustomEditPart extends
		AnnotationsListCompartmentAnnotationsAreaEditPart {

	public AnnotationsListAreaCustomEditPart(View view) {
		super(view);
	}
	
//	@Override
//	protected void createDefaultEditPolicies() {
//		super.createDefaultEditPolicies();
//		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
//				new AnnotationsListAreaCustomCanonicalEditPolicy());
//	}
	
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
