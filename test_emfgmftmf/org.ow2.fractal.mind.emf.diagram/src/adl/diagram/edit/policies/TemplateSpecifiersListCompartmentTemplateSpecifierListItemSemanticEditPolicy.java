package adl.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import adl.diagram.edit.commands.TemplateSpecifierCreateCommand;
import adl.diagram.providers.MindElementTypes;

/**
 * @generated
 */
public class TemplateSpecifiersListCompartmentTemplateSpecifierListItemSemanticEditPolicy
		extends MindBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TemplateSpecifiersListCompartmentTemplateSpecifierListItemSemanticEditPolicy() {
		super(MindElementTypes.TemplateSpecifiersList_3001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MindElementTypes.TemplateSpecifier_3002 == req.getElementType()) {
			return getGEFWrapper(new TemplateSpecifierCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
