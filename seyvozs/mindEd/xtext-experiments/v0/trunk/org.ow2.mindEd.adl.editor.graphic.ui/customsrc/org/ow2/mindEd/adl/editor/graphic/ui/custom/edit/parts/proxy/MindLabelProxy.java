package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy;

import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies.ParentCreationEditPolicy;

public class MindLabelProxy extends MindProxy {

	public MindLabelProxy(GraphicalEditPart editPart, int vID) {
		super(editPart, vID, TYPE_LABEL);
	}
	
	public MindLabelProxy(GraphicalEditPart editPart, int vID, int mindType) {
		super(editPart, vID, mindType);
	}
	
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		// Extended creation features
		editPart.installEditPolicy(
				EditPolicyRoles.CREATION_ROLE,
				new ParentCreationEditPolicy());
		setCreationMode(CREATION_MODE_PARENT);
	}

}
