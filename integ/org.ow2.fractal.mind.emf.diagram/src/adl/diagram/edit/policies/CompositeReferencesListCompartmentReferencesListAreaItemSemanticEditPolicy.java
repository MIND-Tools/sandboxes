package adl.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import adl.diagram.edit.commands.CompositeReferenceDefinitionCreateCommand;
import adl.diagram.providers.MindElementTypes;

/**
 * @generated
 */
public class CompositeReferencesListCompartmentReferencesListAreaItemSemanticEditPolicy
		extends MindBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CompositeReferencesListCompartmentReferencesListAreaItemSemanticEditPolicy() {
		super(MindElementTypes.CompositeReferencesList_3033);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MindElementTypes.CompositeReferenceDefinition_3034 == req
				.getElementType()) {
			return getGEFWrapper(new CompositeReferenceDefinitionCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
