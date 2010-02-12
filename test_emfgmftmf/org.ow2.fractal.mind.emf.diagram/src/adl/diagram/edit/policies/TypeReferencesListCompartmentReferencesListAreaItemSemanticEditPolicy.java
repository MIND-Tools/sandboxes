package adl.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import adl.diagram.edit.commands.TypeReferenceDefinitionCreateCommand;
import adl.diagram.providers.MindElementTypes;

/**
 * @generated
 */
public class TypeReferencesListCompartmentReferencesListAreaItemSemanticEditPolicy
		extends MindBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TypeReferencesListCompartmentReferencesListAreaItemSemanticEditPolicy() {
		super(MindElementTypes.TypeReferencesList_3037);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MindElementTypes.TypeReferenceDefinition_3038 == req
				.getElementType()) {
			return getGEFWrapper(new TypeReferenceDefinitionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
