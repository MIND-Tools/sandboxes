package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.ow2.mindEd.adl.DataDefinition;
import org.ow2.mindEd.adl.ImplementationDefinition;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.commands.InlineCodeCCreateCommand;

public class InlineCodeCCustomCreateCommand extends InlineCodeCCreateCommand {

	public InlineCodeCCustomCreateCommand(CreateElementRequest req) {
		super(req);
	}
	
	public boolean canExecute() {
		EObject container = getElementToEdit();
		if (container instanceof DataDefinition) {
			DataDefinition castContainer = (DataDefinition) getElementToEdit();
			if (castContainer.getFileC() != null) {
				return false;
			}
			return true;
		}
		else if (container instanceof ImplementationDefinition) {
			ImplementationDefinition castContainer = (ImplementationDefinition) getElementToEdit();
			if (castContainer.getFileC() != null) {
				return false;
			}
			return true;
		}
		
		return false;
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		org.ow2.mindEd.adl.InlineCodeC newElement = org.ow2.mindEd.adl.AdlFactory.eINSTANCE
				.createInlineCodeC();

		EObject owner = getElementToEdit();
		if (owner instanceof DataDefinition) {
			((DataDefinition)owner).setInlineCcode(newElement);
		}
		else if (owner instanceof ImplementationDefinition) {
			((ImplementationDefinition)owner).setInlineCcode(newElement);
		}
		else
			return CommandResult.newErrorCommandResult("Owner should be DataDefinition or ImplementationDefinition");

		doConfigure(newElement, monitor, info);

		((CreateElementRequest) getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);
	}

}
