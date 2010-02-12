package adl.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import adl.diagram.providers.MindElementTypes;

/**
 * @generated
 */
public class BindingDefinitionItemSemanticEditPolicy extends
		MindBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public BindingDefinitionItemSemanticEditPolicy() {
		super(MindElementTypes.BindingDefinition_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
