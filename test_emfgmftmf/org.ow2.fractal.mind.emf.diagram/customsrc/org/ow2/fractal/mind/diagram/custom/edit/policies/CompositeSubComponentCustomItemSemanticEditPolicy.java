package org.ow2.fractal.mind.diagram.custom.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import adl.diagram.edit.policies.CompositeSubComponentItemSemanticEditPolicy;

public class CompositeSubComponentCustomItemSemanticEditPolicy extends
		CompositeSubComponentItemSemanticEditPolicy {
	
	// A sub component can't be override
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

}
