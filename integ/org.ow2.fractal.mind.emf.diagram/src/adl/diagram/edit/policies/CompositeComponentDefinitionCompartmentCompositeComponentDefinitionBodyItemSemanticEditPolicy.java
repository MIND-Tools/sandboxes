package adl.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import adl.diagram.edit.commands.CompositeAnonymousSubComponentCreateCommand;
import adl.diagram.edit.commands.CompositeSubComponentCreateCommand;
import adl.diagram.edit.commands.PrimitiveAnonymousSubComponentCreateCommand;
import adl.diagram.edit.commands.PrimitiveSubComponentCreateCommand;
import adl.diagram.edit.commands.TemplateSubComponentCreateCommand;
import adl.diagram.providers.MindElementTypes;

/**
 * @generated
 */
public class CompositeComponentDefinitionCompartmentCompositeComponentDefinitionBodyItemSemanticEditPolicy
		extends MindBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CompositeComponentDefinitionCompartmentCompositeComponentDefinitionBodyItemSemanticEditPolicy() {
		super(MindElementTypes.CompositeComponentDefinition_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MindElementTypes.TemplateSubComponent_3024 == req.getElementType()) {
			return getGEFWrapper(new TemplateSubComponentCreateCommand(req));
		}
		if (MindElementTypes.CompositeSubComponent_3013 == req.getElementType()) {
			return getGEFWrapper(new CompositeSubComponentCreateCommand(req));
		}
		if (MindElementTypes.CompositeAnonymousSubComponent_3012 == req
				.getElementType()) {
			return getGEFWrapper(new CompositeAnonymousSubComponentCreateCommand(
					req));
		}
		if (MindElementTypes.PrimitiveSubComponent_3023 == req.getElementType()) {
			return getGEFWrapper(new PrimitiveSubComponentCreateCommand(req));
		}
		if (MindElementTypes.PrimitiveAnonymousSubComponent_3014 == req
				.getElementType()) {
			return getGEFWrapper(new PrimitiveAnonymousSubComponentCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
