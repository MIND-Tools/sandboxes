package org.ow2.fractal.mind.diagram.custom.helpers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.notation.View;

import adl.diagram.edit.policies.MindBaseItemSemanticEditPolicy;


public class ItemSemanticEditPolicyHelper {
	
	
	public static Command getAllCreateCommand(CreateElementRequest req, EditPart host) {
					
		EditCommandRequestWrapper reqWrap;
		Command cmd = null;
		
		while (
				(cmd == null)
				&&
				!(host instanceof AbstractBorderedShapeEditPart)
				)
		{
			host = host.getParent();
			req.setContainer(((View) host.getModel()).getElement());
			
			reqWrap = new EditCommandRequestWrapper(req);
			cmd = host.getCommand(reqWrap);
		}
		
		return cmd;
	}

}
