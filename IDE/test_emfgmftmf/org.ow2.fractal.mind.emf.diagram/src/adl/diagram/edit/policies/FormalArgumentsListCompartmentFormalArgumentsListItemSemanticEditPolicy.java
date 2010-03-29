package adl.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import adl.diagram.edit.commands.FormalArgumentCreateCommand;
import adl.diagram.providers.MindElementTypes;

/**
 * @generated
 */
public class FormalArgumentsListCompartmentFormalArgumentsListItemSemanticEditPolicy
		extends MindBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FormalArgumentsListCompartmentFormalArgumentsListItemSemanticEditPolicy() {
		super(MindElementTypes.FormalArgumentsList_3003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MindElementTypes.FormalArgument_3004 == req.getElementType()) {
			return getGEFWrapper(new FormalArgumentCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
