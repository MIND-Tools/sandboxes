package org.ow2.fractal.mind.diagram.custom.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.ow2.fractal.mind.diagram.custom.helpers.ItemSemanticEditPolicyHelper;

import adl.diagram.edit.policies.PrimitiveAnonymousSubComponentCompartmentPrimitiveAnonymousSubBodyItemSemanticEditPolicy;

public class CompartmentPrimitiveAnonymousSubComponentCustomItemSemanticEditPolicy
		extends
		PrimitiveAnonymousSubComponentCompartmentPrimitiveAnonymousSubBodyItemSemanticEditPolicy {

	@Override
	protected Command getCreateCommand(CreateElementRequest req) {
		Command cmd = super.getCreateCommand(req);
		
		if (cmd == null) {
			cmd = ItemSemanticEditPolicyHelper.getAllCreateCommand(req, getHost());
		}
		
		return cmd;
	}	
	
}
