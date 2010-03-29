package adl.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import adl.diagram.edit.commands.ArgumentDefinition4CreateCommand;
import adl.diagram.providers.MindElementTypes;

/**
 * @generated
 */
public class PrimitiveReferenceDefinitionCompartmentComponentReferenceDefinitionAreaItemSemanticEditPolicy
		extends MindBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PrimitiveReferenceDefinitionCompartmentComponentReferenceDefinitionAreaItemSemanticEditPolicy() {
		super(MindElementTypes.PrimitiveReferenceDefinition_3036);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MindElementTypes.ArgumentDefinition_3030 == req.getElementType()) {
			return getGEFWrapper(new ArgumentDefinition4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
