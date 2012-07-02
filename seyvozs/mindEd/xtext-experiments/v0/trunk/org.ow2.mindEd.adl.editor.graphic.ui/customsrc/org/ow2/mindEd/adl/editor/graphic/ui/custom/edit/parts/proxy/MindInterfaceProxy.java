package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy;

import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies.OpenDefinitionEditPolicy;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.part.BorderItemDragTracker;

public class MindInterfaceProxy extends MindProxy {
	
	public MindInterfaceProxy(GraphicalEditPart editPart, int vID) {
		super(editPart,vID, TYPE_INTERFACE);
	}
	
	public MindInterfaceProxy(GraphicalEditPart editPart, int vID, int mindType) {
		super(editPart, vID, mindType);
	}

	
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		editPart.installEditPolicy(EditPolicyRoles.OPEN_ROLE, 
				new OpenDefinitionEditPolicy());
	}

	@Override
	public DragTracker getDragTracker(Request request) {
		return new BorderItemDragTracker(editPart);
	}
	
	@Override
	public boolean addFixedChild(EditPart childEditPart) {
		// To open the referenced definition on double clic
		childEditPart.installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDefinitionEditPolicy());
		return false;
	}
	
	
}
