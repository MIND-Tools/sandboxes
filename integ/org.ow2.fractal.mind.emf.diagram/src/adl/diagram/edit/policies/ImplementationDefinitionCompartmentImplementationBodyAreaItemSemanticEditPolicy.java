package adl.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import adl.diagram.edit.commands.FileCCreateCommand;
import adl.diagram.edit.commands.InlineCodeCCreateCommand;
import adl.diagram.providers.MindElementTypes;

/**
 * @generated
 */
public class ImplementationDefinitionCompartmentImplementationBodyAreaItemSemanticEditPolicy
		extends MindBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ImplementationDefinitionCompartmentImplementationBodyAreaItemSemanticEditPolicy() {
		super(MindElementTypes.ImplementationDefinition_3016);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MindElementTypes.FileC_3017 == req.getElementType()) {
			return getGEFWrapper(new FileCCreateCommand(req));
		}
		if (MindElementTypes.InlineCodeC_3018 == req.getElementType()) {
			return getGEFWrapper(new InlineCodeCCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
