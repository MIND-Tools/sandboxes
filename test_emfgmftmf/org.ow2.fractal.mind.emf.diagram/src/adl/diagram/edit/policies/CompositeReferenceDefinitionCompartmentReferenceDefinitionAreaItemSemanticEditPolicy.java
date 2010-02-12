package adl.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import adl.diagram.edit.commands.ArgumentDefinition3CreateCommand;
import adl.diagram.edit.commands.TemplateDefinition2CreateCommand;
import adl.diagram.providers.MindElementTypes;

/**
 * @generated
 */
public class CompositeReferenceDefinitionCompartmentReferenceDefinitionAreaItemSemanticEditPolicy
		extends MindBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CompositeReferenceDefinitionCompartmentReferenceDefinitionAreaItemSemanticEditPolicy() {
		super(MindElementTypes.CompositeReferenceDefinition_3044);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MindElementTypes.ArgumentDefinition_3026 == req.getElementType()) {
			return getGEFWrapper(new ArgumentDefinition3CreateCommand(req));
		}
		if (MindElementTypes.TemplateDefinition_3027 == req.getElementType()) {
			return getGEFWrapper(new TemplateDefinition2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
