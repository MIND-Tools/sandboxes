package org.ow2.fractal.mind.diagram.custom.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import adl.AdlFactory;
import adl.ArchitectureDefinition;
import adl.BindingDefinition;
import adl.CompositeComponentDefinition;
import adl.InterfaceDefinition;
import adl.diagram.edit.commands.BindingDefinitionCreateCommand;
import adl.diagram.edit.commands.BindingDefinitionReorientCommand;
import adl.diagram.edit.policies.MindBaseItemSemanticEditPolicy;

public class BindingDefinitionCustomReorientCommand extends
		BindingDefinitionReorientCommand {
	


	@Override
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setInterfaceSource(getNewSource());
		getLink().setInterfaceSourceParent((ArchitectureDefinition)getNewSource().eContainer());
		CompositeComponentDefinition container = BindingDefinitionCustomCreateCommand.deduceContainer(getNewSource(),getLink().getInterfaceTarget());
		if(container != getLink().eContainer())
		{
			container.getElements().add(getLink());
		}
		return CommandResult.newOKCommandResult(getLink());
	}

	@Override
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setInterfaceTarget(getNewTarget());
		getLink().setInterfaceTargetParent((ArchitectureDefinition)getNewTarget().eContainer());
		CompositeComponentDefinition container = BindingDefinitionCustomCreateCommand.deduceContainer(getLink().getInterfaceSource(),getNewTarget());
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
	
	
	public boolean canReorientSource() {
		if (super.canReorientSource() != false) {
			InterfaceDefinition newSource = getNewSource();
			InterfaceDefinition target = getLink().getInterfaceTarget();
			
			if (newSource != null) {
				if (newSource.getRole() == target.getRole()) {
					return false;
				}
				
				EObject sourceParent = newSource.eContainer();
				EObject targetParent = target.eContainer();
				if (sourceParent == targetParent) {
					return false;
				}
				if (sourceParent.eContainer() != targetParent &&
						sourceParent.eContainer() != targetParent.eContainer() &&
						sourceParent != targetParent.eContainer()) {
					return false;
				}
				
				return true;
			}
		}
		return false;
	}
	
	public boolean canReorientTarget() {
		if (super.canReorientTarget() != false) {
			InterfaceDefinition source = getLink().getInterfaceSource();
			InterfaceDefinition newTarget = getNewTarget();
			
			if (newTarget != null) {
				if (source.getRole() == newTarget.getRole()) {
					return false;
				}
				
				EObject sourceParent = source.eContainer();
				EObject targetParent = newTarget.eContainer();
				if (sourceParent == targetParent) {
					return false;
				}
				if (sourceParent.eContainer() != targetParent &&
						sourceParent.eContainer() != targetParent.eContainer() &&
						sourceParent != targetParent.eContainer()) {
					return false;
				}
				
				return true;
			}
		}
		return false;
	}
	
	
	
}
