package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;

/**
 * Does not allow children to be moved or created
 * @author maroto
 *
 */
public class FixedChildrenLayoutEditPolicy extends LayoutEditPolicy {

	protected EditPolicy createChildEditPolicy(EditPart child) {
		EditPolicy result = new NonResizableEditPolicy();
		return result;
	}

	protected Command getMoveChildrenCommand(Request request) {
		return null;
	}

	protected Command getCreateCommand(CreateRequest request) {
		return null;
	}

}
