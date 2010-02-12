package org.ow2.fractal.mind.diagram.custom.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.ow2.fractal.mind.diagram.custom.edit.commands.BindingDefinitionCustomCreateCommand;
import org.ow2.fractal.mind.diagram.custom.edit.commands.BindingDefinitionCustomReorientCommand;

import adl.diagram.edit.commands.BindingDefinitionReorientCommand;
import adl.diagram.edit.parts.BindingDefinitionEditPart;
import adl.diagram.edit.policies.InterfaceDefinitionItemSemanticEditPolicy;
import adl.diagram.providers.MindElementTypes;

public class InterfaceDefinitionCustomItemSemanticEditPolicy extends
		InterfaceDefinitionItemSemanticEditPolicy {

	@Override
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		// TODO Auto-generated method stub
		if (MindElementTypes.BindingDefinition_4001 == req.getElementType()) {
			return getGEFWrapper(new BindingDefinitionCustomCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	@Override
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		// TODO Auto-generated method stub
		return super.getCreateRelationshipCommand(req);
	}

	@Override
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		// TODO Auto-generated method stub
		return super.getDestroyElementCommand(req);
	}

	@Override
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case BindingDefinitionEditPart.VISUAL_ID:
			return getGEFWrapper(new BindingDefinitionCustomReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	@Override
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		// TODO Auto-generated method stub
		if (MindElementTypes.BindingDefinition_4001 == req.getElementType()) {
			return getGEFWrapper(new BindingDefinitionCustomCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	public InterfaceDefinitionCustomItemSemanticEditPolicy() {
		super();
	}

	@Override
	protected Command getEditContextCommand(GetEditContextRequest req) {
		// TODO Auto-generated method stub
		return super.getEditContextCommand(req);
	}

	@Override
	protected TransactionalEditingDomain getEditingDomain() {
		// TODO Auto-generated method stub
		return super.getEditingDomain();
	}

}
