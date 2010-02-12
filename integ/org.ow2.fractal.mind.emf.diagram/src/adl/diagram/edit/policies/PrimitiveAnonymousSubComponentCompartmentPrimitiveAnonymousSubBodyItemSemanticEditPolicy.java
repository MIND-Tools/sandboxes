package adl.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import adl.diagram.edit.commands.DataDefinitionCreateCommand;
import adl.diagram.edit.commands.ImplementationDefinitionCreateCommand;
import adl.diagram.providers.MindElementTypes;

/**
 * @generated
 */
public class PrimitiveAnonymousSubComponentCompartmentPrimitiveAnonymousSubBodyItemSemanticEditPolicy
		extends MindBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PrimitiveAnonymousSubComponentCompartmentPrimitiveAnonymousSubBodyItemSemanticEditPolicy() {
		super(MindElementTypes.PrimitiveAnonymousSubComponent_3014);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MindElementTypes.ImplementationDefinition_3016 == req
				.getElementType()) {
			return getGEFWrapper(new ImplementationDefinitionCreateCommand(req));
		}
		if (MindElementTypes.DataDefinition_3019 == req.getElementType()) {
			return getGEFWrapper(new DataDefinitionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
