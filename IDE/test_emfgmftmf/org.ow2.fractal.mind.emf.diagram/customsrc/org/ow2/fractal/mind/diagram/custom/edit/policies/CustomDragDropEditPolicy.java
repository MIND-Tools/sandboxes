package org.ow2.fractal.mind.diagram.custom.edit.policies;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.type.core.ElementType;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.MetamodelType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

import adl.diagram.part.MindVisualIDRegistry;
import adl.diagram.providers.MindElementTypes;

public class CustomDragDropEditPolicy extends DragDropEditPolicy {

	protected Command getDropCommand(ChangeBoundsRequest request) {
		ChangeBoundsRequest req = new ChangeBoundsRequest(REQ_ADD);
		req.setEditParts(request.getEditParts());
		req.setMoveDelta(request.getMoveDelta());
		req.setSizeDelta(request.getSizeDelta());
		req.setLocation(request.getLocation());
		req.setResizeDirection(request.getResizeDirection());
		Command cmd = getHost().getCommand(req);
		if (cmd == null || !cmd.canExecute()) {
			return getDropObjectsCommand(castToDropObjectsRequest(request));
		}
		
		// Check if the item could be created in the container
		// If not, prevent from dropping
		int visualID = MindVisualIDRegistry.getVisualID(((View)((EditPart)request.getEditParts().get(0)).getModel()));
		IElementType type = MindElementTypes.getElementType(visualID);
		CreateElementRequest r = new CreateElementRequest((EObject) getHost().getModel(), type);
		Command createCommand = getHost().getCommand(new EditCommandRequestWrapper(r));
		if (createCommand == null || !createCommand.canExecute()) {
			return getDropObjectsCommand(castToDropObjectsRequest(request));
		}
		
		return cmd;
	}
	
}
