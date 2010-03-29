package adl.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import adl.diagram.edit.commands.ArgumentDefinitionCreateCommand;
import adl.diagram.edit.commands.TemplateDefinitionCreateCommand;
import adl.diagram.providers.MindElementTypes;

/**
 * @generated
 */
public class CompositeReferenceDefinitionCompartmentComponentReferenceDefinitionAreaItemSemanticEditPolicy
		extends MindBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CompositeReferenceDefinitionCompartmentComponentReferenceDefinitionAreaItemSemanticEditPolicy() {
		super(MindElementTypes.CompositeReferenceDefinition_3034);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MindElementTypes.ArgumentDefinition_3007 == req.getElementType()) {
			return getGEFWrapper(new ArgumentDefinitionCreateCommand(req));
		}
		if (MindElementTypes.TemplateDefinition_3008 == req.getElementType()) {
			return getGEFWrapper(new TemplateDefinitionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
