package org.ow2.mindEd.adl.editor.graphic.ui.custom.helpers;

import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy.IMindTypes;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy.MindComponentProxy;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy.MindProxyFactory;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.AdlDefinitionEditPart;

/**
 * Helper to provide static methods for item semantic edit policies.
 * @author maroto
 *
 */
public class ItemSemanticEditPolicyHelper {
	
	/**
	 * Allows the edit policy to return create commands from a parent edit part if none is found
	 * in this one. This method is automatically used when creationMode is set to CREATION_MODE_PARENT in MindEditPart
	 * and allows extended creation behaviour implemented in {@linkplain org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies.ParentCreationEditPolicy}
	 * @param req
	 * @param host
	 * @return
	 */
	public static Command getParentsCreateCommand(CreateElementRequest req, EditPart host) {
					
		EditCommandRequestWrapper reqWrap;
		Command cmd = null;
		
		// Will continue to seek parents unless it finds a component
		if (
				(cmd == null)
				&&
				!(MindProxyFactory.INSTANCE.getMindProxyFor(host) instanceof MindComponentProxy)
				&&
				!(host instanceof AdlDefinitionEditPart)
				)
		{
			// Get the parent and set it to the request's container
			host = host.getParent();
			req.setContainer(((View) host.getModel()).getElement());
			
			// If new host has a ChildrenCreationEditPolicy, don't try to get a command from him
			// because it would lead to a stack overflow
			if (MindProxyFactory.INSTANCE.getMindProxyFor(host).getCreationMode() != IMindTypes.CREATION_MODE_CHILD)
			{
				// Try to get a command from the new host
				reqWrap = new EditCommandRequestWrapper(req);
				cmd = host.getCommand(reqWrap);
			}
			
		}
		
		return cmd;
	}
	
	
	/**
	 * Allows the edit policy to return create commands from a child edit part if none is found
	 * in this one. This method is automatically used when creationMode is set to CREATION_MODE_CHILD in MindEditPart
	 * and allows extended creation behaviour implemented in {@linkplain org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies.ChildrenCreationEditPolicy}<p>
	 * @param req
	 * @param host
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static Command getChildrenCreateCommand(CreateElementRequest req, EditPart host) {
					
		EditCommandRequestWrapper reqWrap;
		Command cmd = null;
		
		List<EditPart> children = host.getChildren();
		for (EditPart child : children)
		{
			// Get the parent and set it to the request's container
			host = child;
			req.setContainer(((View) host.getModel()).getElement());
			
			// Try to get a command from the new host
			reqWrap = new EditCommandRequestWrapper(req);
			cmd = host.getCommand(reqWrap);
			
			// If a command is found, no need to seek with other children
			if (cmd != null) break;
		}
		
		return cmd;
	}

}
