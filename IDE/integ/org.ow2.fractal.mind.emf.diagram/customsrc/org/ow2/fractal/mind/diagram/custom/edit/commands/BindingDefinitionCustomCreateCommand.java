package org.ow2.fractal.mind.diagram.custom.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.ow2.fractal.mind.diagram.custom.figures.InterfaceDefinitionShape.Role;

import adl.AdlFactory;
import adl.ArchitectureDefinition;
import adl.BindingDefinition;
import adl.CompositeComponentDefinition;
import adl.InterfaceDefinition;
import adl.diagram.edit.commands.BindingDefinitionCreateCommand;
import adl.diagram.edit.policies.MindBaseItemSemanticEditPolicy;

public class BindingDefinitionCustomCreateCommand extends
		BindingDefinitionCreateCommand {

	
	private final EObject customSource;

	private final EObject customTarget;
	
	private final CompositeComponentDefinition customContainer;

	
	public BindingDefinitionCustomCreateCommand(
			CreateRelationshipRequest request, EObject source, EObject target) {
		super(request, source, target);
		customSource = source;
		customTarget = target;
		customContainer = deduceContainer(customSource,customTarget);
	}
	
	
	public boolean canExecute() {
		if (customSource == null && customTarget == null) {
			return false;
		}
		EObject sourceParent = null;
		EObject targetParent = null;
		adl.Role sourceRole = null;
		adl.Role targetRole = null;
		
		if (customSource != null) {
			if (false == customSource instanceof InterfaceDefinition) {
				return false;
			}
			sourceParent = customSource.eContainer();
			sourceRole = ((InterfaceDefinition) customSource).getRole();
		}
		
		if (customTarget != null) {
			if (false == customTarget instanceof InterfaceDefinition) {
				return false;
			}
			targetParent = customTarget.eContainer();
			targetRole = ((InterfaceDefinition) customTarget).getRole();
		}
		
		if (customTarget != null && customSource != null) {
			if (customSource == customTarget) {
				return false;
			}
			if (sourceParent == targetParent) {
				return false;
			}
			if (sourceParent.eContainer() != targetParent &&
					sourceParent.eContainer() != targetParent.eContainer() &&
					sourceParent != targetParent.eContainer()) {
				return false;
			}
			if (sourceRole == targetRole) {
				return false;
			}
		}
		
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		
		
		// target may be null here but it's possible to check constraint
		if (getContainer() == null) {
			return false;
		}
		return MindBaseItemSemanticEditPolicy.LinkConstraints
				.canCreateBindingDefinition_4001(getContainer(), getSource(),
						getTarget());
	}

	@Override
	protected void doConfigure(BindingDefinition newElement,
			IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {
		super.doConfigure(newElement, monitor, info);
	}

	@Override
	public CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in create link command"); //$NON-NLS-1$
		}

		BindingDefinition newElement = AdlFactory.eINSTANCE
				.createBindingDefinition();
		getContainer().getElements().add(newElement);
		newElement.setInterfaceSource(getSource());
		newElement.setInterfaceSourceParent((ArchitectureDefinition)getSource().eContainer());
		newElement.setInterfaceTarget(getTarget());
		newElement.setInterfaceTargetParent((ArchitectureDefinition)getTarget().eContainer());
		doConfigure(newElement, monitor, info);
		((CreateElementRequest) getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);
	}

	@Override
	public CompositeComponentDefinition getContainer() {
		return customContainer;
	}

	public static CompositeComponentDefinition deduceContainer(EObject source,
			EObject target) {
		// Find container element for the new link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		if (target!=null && getRank(source)>getRank(target))
		{
			EObject tmpSource = source;
			source=target;
			target = tmpSource;
		}
		for (EObject sourceElement = source; sourceElement != null; sourceElement = sourceElement.eContainer()) {
			if (sourceElement instanceof CompositeComponentDefinition) {
				if(target!=null && target!=source)
				{
					for (EObject targetElement = target; targetElement != null; targetElement = targetElement.eContainer()) 
					{
						if (targetElement instanceof CompositeComponentDefinition) 
						{
							if(targetElement==sourceElement)
							{
								return (CompositeComponentDefinition) targetElement;
							}
						}
					}
				}
				else
						return (CompositeComponentDefinition) sourceElement;
			}
		}
		return null;
	}
	
	public static int getRank(EObject object)
	{
		int rank=0;
		for (EObject element = object; element != null; element = element.eContainer()) {
			rank++;
		}
		return rank;
	}
	
	@Override
	public InterfaceDefinition getSource() {
		return (InterfaceDefinition) customSource;
	}

	@Override
	public InterfaceDefinition getTarget() {
		return (InterfaceDefinition) customTarget;
	}

}