package adl.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import adl.ArchitectureDefinition;
import adl.BindingDefinition;
import adl.InterfaceDefinition;
import adl.diagram.edit.policies.MindBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class BindingDefinitionReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public BindingDefinitionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof BindingDefinition) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof InterfaceDefinition && newEnd instanceof InterfaceDefinition)) {
			return false;
		}
		InterfaceDefinition target = getLink().getInterfaceTarget();
		if (!(getLink().eContainer() instanceof ArchitectureDefinition)) {
			return false;
		}
		ArchitectureDefinition container = (ArchitectureDefinition) getLink()
				.eContainer();
		return MindBaseItemSemanticEditPolicy.LinkConstraints
				.canExistBindingDefinition_4001(container, getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof InterfaceDefinition && newEnd instanceof InterfaceDefinition)) {
			return false;
		}
		InterfaceDefinition source = getLink().getInterfaceSource();
		if (!(getLink().eContainer() instanceof ArchitectureDefinition)) {
			return false;
		}
		ArchitectureDefinition container = (ArchitectureDefinition) getLink()
				.eContainer();
		return MindBaseItemSemanticEditPolicy.LinkConstraints
				.canExistBindingDefinition_4001(container, source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setInterfaceSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setInterfaceTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected BindingDefinition getLink() {
		return (BindingDefinition) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected InterfaceDefinition getOldSource() {
		return (InterfaceDefinition) oldEnd;
	}

	/**
	 * @generated
	 */
	protected InterfaceDefinition getNewSource() {
		return (InterfaceDefinition) newEnd;
	}

	/**
	 * @generated
	 */
	protected InterfaceDefinition getOldTarget() {
		return (InterfaceDefinition) oldEnd;
	}

	/**
	 * @generated
	 */
	protected InterfaceDefinition getNewTarget() {
		return (InterfaceDefinition) newEnd;
	}
}
