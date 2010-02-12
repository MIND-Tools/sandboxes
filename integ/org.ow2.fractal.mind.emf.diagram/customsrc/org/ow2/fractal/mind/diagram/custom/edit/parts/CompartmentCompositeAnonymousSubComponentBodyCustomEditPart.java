package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.AdlDefinitionCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompartmentCompositeAnonymousSubBodyCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompartmentCompositeAnonymousSubComponentBodyCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CustomDragDropEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindCreationEditPolicy;

import adl.diagram.edit.parts.CompositeAnonymousSubComponentCompartmentCompositeAnonymousSubBodyEditPart;
import adl.diagram.edit.policies.CompositeAnonymousSubComponentCompartmentCompositeAnonymousSubBodyCanonicalEditPolicy;
import adl.diagram.edit.policies.CompositeAnonymousSubComponentCompartmentCompositeAnonymousSubBodyItemSemanticEditPolicy;

public class CompartmentCompositeAnonymousSubComponentBodyCustomEditPart
		extends
		CompositeAnonymousSubComponentCompartmentCompositeAnonymousSubBodyEditPart {

	
	public CompartmentCompositeAnonymousSubComponentBodyCustomEditPart(View view) {
		super(view);
	}

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new CompartmentCompositeAnonymousSubBodyCustomItemSemanticEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CREATION_ROLE,
				new MindCreationEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new CompartmentCompositeAnonymousSubComponentBodyCustomCanonicalEditPolicy());
		installEditPolicy(
				EditPolicyRoles.DRAG_DROP_ROLE,
				new CustomDragDropEditPolicy());
	}
	
}
