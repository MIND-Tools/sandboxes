package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import org.ow2.mindEd.adl.Body;
import org.ow2.mindEd.adl.InterfaceDefinition;

import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.commands.BindingDefinitionCustomCreateCommand;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.commands.BindingDefinitionReorientCommand;

/**
 * This command prevents user from redirecting bindings
 * to non valid sources or target and sets the right container
 * after a valid redirection
 * @author rproust / omarot
 *
 */
public class BindingDefinitionCustomReorientCommand extends
		BindingDefinitionReorientCommand {
	

	
	@Override
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setInterfaceSource(getNewSource());
		Body container = BindingDefinitionCustomCreateCommand.deduceContainer(getNewSource(),getLink().getInterfaceTarget());
		if(container != getLink().eContainer())
		{
			container.getElements().add(getLink());
		}
		return CommandResult.newOKCommandResult(getLink());
	}

	@Override
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setInterfaceTarget(getNewTarget());
		Body container = BindingDefinitionCustomCreateCommand.deduceContainer(getLink().getInterfaceSource(),getNewTarget());
		if(container != getLink().eContainer())
		{
			container.getElements().add(getLink());
		}
		return CommandResult.newOKCommandResult(getLink());
	}

	public BindingDefinitionCustomReorientCommand(
			ReorientRelationshipRequest request) {
		super(request);
	}
	
	/**
	 * Checks constraints
	 */
	public boolean canReorientSource() {
		if (super.canReorientSource() != false) {
			InterfaceDefinition newSource = getNewSource();
			InterfaceDefinition target = getLink().getInterfaceTarget();
			
			if (newSource != null) {
				EObject sourceParent = newSource.eContainer();
				EObject targetParent = target.eContainer();
				
				if (newSource == target) {
					// User is trying to bind an interface with itself - return false
					return false;
				}
				if (sourceParent == targetParent) {
					// User is trying to bind two interfaces of the same component - return false
					return false;
				}
				if (sourceParent.eContainer() != targetParent &&
						sourceParent.eContainer() != targetParent.eContainer() &&
						sourceParent != targetParent.eContainer()) {
					// User is trying to bind from more than one rank of components - return false
					return false;
				}
				
				if (sourceParent.eContainer() == targetParent ||
						sourceParent == targetParent.eContainer()) {
					if (newSource.getRole() != target.getRole()) {
						// User is trying to bind a component with its parent
						// Roles must be the same - return false
						return false;
					}
				}
				else {
					if (newSource.getRole() == target.getRole()) {
						// User is trying to bind two components of the same rank
						// Roles must not be the same - return false
						return false;
					}
				}
				
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Checks constraints
	 */
	public boolean canReorientTarget() {
		if (super.canReorientTarget() != false) {
			InterfaceDefinition source = getLink().getInterfaceSource();
			InterfaceDefinition newTarget = getNewTarget();
			
			if (newTarget != null) {
				EObject sourceParent = source.eContainer();
				EObject targetParent = newTarget.eContainer();
				
				if (source == newTarget) {
					// User is trying to bind an interface with itself - return false
					return false;
				}
				if (sourceParent == targetParent) {
					// User is trying to bind two interfaces of the same component - return false
					return false;
				}
				if (sourceParent.eContainer() != targetParent &&
						sourceParent.eContainer() != targetParent.eContainer() &&
						sourceParent != targetParent.eContainer()) {
					// User is trying to bind from more than one rank of components - return false
					return false;
				}
				
				if (sourceParent.eContainer() == targetParent ||
						sourceParent == targetParent.eContainer()) {
					if (source.getRole() != newTarget.getRole()) {
						// User is trying to bind a component with its parent
						// Roles must be the same - return false
						return false;
					}
				}
				else {
					if (source.getRole() == newTarget.getRole()) {
						// User is trying to bind two components of the same rank
						// Roles must not be the same - return false
						return false;
					}
				}
				
				return true;
			}
		}
		return false;
	}
	
	
	
}
