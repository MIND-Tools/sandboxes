package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies.InterfaceBorderItemSelectionCustomEditPolicy;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.InterfaceDefinitionCustomEditPart;

import org.ow2.mindEd.adl.editor.graphic.ui.part.MindVisualIDRegistry;

public class ComponentLayoutEditPolicy extends LayoutEditPolicy {

	//implements interface's custom behavior
	protected EditPolicy createChildEditPolicy(EditPart child) {
		View childView = (View) child.getModel();
		switch (MindVisualIDRegistry.getVisualID(childView)) {
		case InterfaceDefinitionCustomEditPart.VISUAL_ID:
			return new InterfaceBorderItemSelectionCustomEditPolicy();
		}
		EditPolicy result = child
				.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
		if (result == null) {
			result = new NonResizableEditPolicy();
		}
		return result;
	}

	protected Command getMoveChildrenCommand(Request request) {
		return null;
	}

	protected Command getCreateCommand(CreateRequest request) {
		return null;
	}

}
