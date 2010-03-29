package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.AdlDefinitionCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompartmentDataDefinitionBodyCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CustomDragDropEditPolicy;
import org.ow2.fractal.mind.diagram.custom.helpers.CanonicalEditPolicyHelper;

import adl.diagram.edit.parts.DataDefinitionCompartmentDataDefinitionBodyAreaEditPart;
import adl.diagram.edit.policies.DataDefinitionCompartmentDataDefinitionBodyAreaCanonicalEditPolicy;
import adl.diagram.part.MindVisualIDRegistry;

public class CompartmentDataDefinitionBodyCustomEditPart extends
		DataDefinitionCompartmentDataDefinitionBodyAreaEditPart {

	public CompartmentDataDefinitionBodyCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new CompartmentDataDefinitionBodyCustomCanonicalEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new CustomDragDropEditPolicy());
	}

}
