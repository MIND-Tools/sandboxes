package adl.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import adl.diagram.edit.commands.PrimitiveReferenceDefinition2CreateCommand;
import adl.diagram.providers.MindElementTypes;

/**
 * @generated
 */
public class PrimitiveReferencesListCompartmentReferencesListAreaItemSemanticEditPolicy
		extends MindBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PrimitiveReferencesListCompartmentReferencesListAreaItemSemanticEditPolicy() {
		super(MindElementTypes.PrimitiveReferencesList_3035);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MindElementTypes.PrimitiveReferenceDefinition_3036 == req
				.getElementType()) {
			return getGEFWrapper(new PrimitiveReferenceDefinition2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
