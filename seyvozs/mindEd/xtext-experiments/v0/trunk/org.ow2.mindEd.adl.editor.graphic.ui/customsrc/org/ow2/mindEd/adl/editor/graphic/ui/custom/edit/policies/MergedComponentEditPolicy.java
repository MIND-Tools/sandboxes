package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.GroupRequest;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ComponentEditPolicy;

/**
 * This edit policy does not allow to delete host's view
 * Not really useful yet, implemented for future use
 * @author maroto
 *
 */
public class MergedComponentEditPolicy extends ComponentEditPolicy {
	
	@Override
	protected Command createDeleteViewCommand(GroupRequest deleteRequest) {
		return null;
	}

}
