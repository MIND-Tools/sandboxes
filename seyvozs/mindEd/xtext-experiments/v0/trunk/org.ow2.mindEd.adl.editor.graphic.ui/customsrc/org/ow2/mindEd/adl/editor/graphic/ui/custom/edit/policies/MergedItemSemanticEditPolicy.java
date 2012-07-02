package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;

import org.ow2.mindEd.adl.editor.graphic.ui.edit.policies.MindBaseItemSemanticEditPolicy;

/**
 * This edit policy does not allow manual creation (meaning creation from the user, using tools or else)
 * @author maroto
 */
public class MergedItemSemanticEditPolicy extends
		MindBaseItemSemanticEditPolicy {

	public MergedItemSemanticEditPolicy(IElementType elementType) {
		super(elementType);
	}
	
	// Override is not allowed
	// Return null to prevent user from creating element manually
	@Override
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}
	
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
	return null;
	}
	
	protected Command addDeleteViewCommand(Command mainCommand,
			DestroyRequest completedRequest) {
		return null;
	}

	
	
	
}
