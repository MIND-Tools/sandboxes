package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.commands.FileCCustomCreateCommand;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.commands.InlineCodeCCustomCreateCommand;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.policies.DataDefinitionCompartmentItemSemanticEditPolicy;

public class DataDefinitionCompartmentCustomItemSemanticEditPolicy extends
		DataDefinitionCompartmentItemSemanticEditPolicy {

	protected Command getCreateCommand(CreateElementRequest req) {
		if (org.ow2.mindEd.adl.editor.graphic.ui.providers.MindElementTypes.FileC_3118 == req
				.getElementType()) {
			return getGEFWrapper(new FileCCustomCreateCommand(
					req));
		}
		if (org.ow2.mindEd.adl.editor.graphic.ui.providers.MindElementTypes.InlineCodeC_3119 == req
				.getElementType()) {
			return getGEFWrapper(new InlineCodeCCustomCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
