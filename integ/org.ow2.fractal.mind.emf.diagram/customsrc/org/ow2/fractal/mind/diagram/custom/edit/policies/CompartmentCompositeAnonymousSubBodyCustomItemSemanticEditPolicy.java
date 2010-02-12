package org.ow2.fractal.mind.diagram.custom.edit.policies;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.ow2.fractal.mind.diagram.custom.helpers.ItemSemanticEditPolicyHelper;

import adl.diagram.edit.commands.AnnotationsListCreateCommand;
import adl.diagram.edit.commands.CompositeAnonymousSubComponentCreateCommand;
import adl.diagram.edit.commands.CompositeReferenceDefinition2CreateCommand;
import adl.diagram.edit.commands.CompositeSubComponentCreateCommand;
import adl.diagram.edit.commands.FormalArgumentsListCreateCommand;
import adl.diagram.edit.commands.InterfaceDefinitionCreateCommand;
import adl.diagram.edit.commands.PrimitiveAnonymousSubComponentCreateCommand;
import adl.diagram.edit.commands.PrimitiveSubComponentCreateCommand;
import adl.diagram.edit.commands.TemplateSpecifiersListCreateCommand;
import adl.diagram.edit.policies.CompositeAnonymousSubComponentCompartmentCompositeAnonymousSubBodyItemSemanticEditPolicy;
import adl.diagram.providers.MindElementTypes;

public class CompartmentCompositeAnonymousSubBodyCustomItemSemanticEditPolicy
		extends
		CompositeAnonymousSubComponentCompartmentCompositeAnonymousSubBodyItemSemanticEditPolicy {
	
	@Override
	protected Command getCreateCommand(CreateElementRequest req) {
		Command cmd = super.getCreateCommand(req);
		
		if (cmd == null) {
			cmd = ItemSemanticEditPolicyHelper.getAllCreateCommand(req, getHost());
		}
		
		return cmd;
	}	

}
