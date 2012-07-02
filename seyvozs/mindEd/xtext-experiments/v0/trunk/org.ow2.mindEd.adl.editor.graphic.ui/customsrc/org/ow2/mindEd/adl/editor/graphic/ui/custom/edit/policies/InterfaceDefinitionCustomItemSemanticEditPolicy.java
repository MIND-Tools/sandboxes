package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.commands.BindingDefinitionCustomCreateCommand;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.commands.BindingDefinitionCustomReorientCommand;

import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.BindingDefinitionEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.policies.InterfaceDefinitionItemSemanticEditPolicy;
import org.ow2.mindEd.adl.editor.graphic.ui.providers.MindElementTypes;

public class InterfaceDefinitionCustomItemSemanticEditPolicy extends
		InterfaceDefinitionItemSemanticEditPolicy {

	@Override
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (MindElementTypes.BindingDefinition_4003 == req.getElementType()) {
			return getGEFWrapper(new BindingDefinitionCustomCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	@Override
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return super.getCreateRelationshipCommand(req);
	}

	@Override
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
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
		if (MindElementTypes.BindingDefinition_4003 == req.getElementType()) {
			return getGEFWrapper(new BindingDefinitionCustomCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	public InterfaceDefinitionCustomItemSemanticEditPolicy() {
		super();
	}

}
