package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.CreateViewAndOptionallyElementCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SemanticCreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.INodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ContainerNodeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;

public class MindBodyContainerNodeEditPolicy extends ContainerNodeEditPolicy {
		
	@Override
	protected CreateViewAndOptionallyElementCommand getCreateOtherEndCommand(
			IAdaptable endAdapter, Point location) {
		return super.getCreateOtherEndCommand(endAdapter, location);
	}

	/**
	 * Only handles connection end requests. Cannot start a connection on a
	 * container.
	 */
	public Command getCommand(Request request) {
		if (RequestConstants.REQ_CONNECTION_START.equals(request.getType())) {
			if (request instanceof CreateConnectionViewAndElementRequest) {
				return getConnectionAndRelationshipCreateCommand((CreateConnectionViewAndElementRequest) request);
			} else if (request instanceof CreateUnspecifiedTypeConnectionRequest) {
				return getUnspecifiedConnectionCreateCommand((CreateUnspecifiedTypeConnectionRequest) request);
			}
		}else if (RequestConstants.REQ_CONNECTION_END
			.equals(request.getType())) {
			if (request instanceof CreateConnectionViewAndElementRequest) {
				return getConnectionAndRelationshipCompleteCommand((CreateConnectionViewAndElementRequest) request);
			} else if (request instanceof CreateUnspecifiedTypeConnectionRequest) {
				return getUnspecifiedConnectionCompleteCommand((CreateUnspecifiedTypeConnectionRequest) request);
			}
		}
		return super.getCommand(request);
	}
	
	/**
	 * Gets the command to start the creation of a new connection and
	 * relationship (if applicable) for a unspecified type request. This will
	 * update all the individual requests appropriately.
	 * 
	 * @param request
	 *            the unspecified type request
	 * @return the command
	 */
	protected Command getUnspecifiedConnectionCreateCommand(
			final CreateUnspecifiedTypeConnectionRequest request) {

		if (request.isDirectionReversed()) {
			return new Command() {

				/**
				 * All we know is the target and the possible relationship
				 * types. At this point, there is no way to validate the
				 * commands for this scenario.
				 */
				public boolean canExecute() {
					return true;
				}
			};
		} else {

			// Get the start command for each individual request, this will
			// update each request as required.
			final List<Command> commands = new ArrayList<Command>();
			for (Iterator<?> iter = request.getAllRequests().iterator(); iter
				.hasNext();) {
				Request individualRequest = (Request) iter.next();				
				Command cmd = null;
				if (individualRequest instanceof CreateConnectionViewAndElementRequest) {
					cmd = getConnectionAndRelationshipCreateCommand((CreateConnectionViewAndElementRequest) individualRequest);
				} else if (individualRequest instanceof CreateConnectionViewRequest) {
					cmd = getConnectionCreateCommand((CreateConnectionViewRequest) individualRequest);
				}
				if (cmd != null && cmd.canExecute()) {
					commands.add(cmd);
				}
			}

			if (commands.isEmpty()) {
				// GEF's AbstractConnectionCreationTool expects a null command
				// when the gesture should be disabled.
				return null;
			}
			
			// return an executable command that does nothing
			return new Command() {/* do nothing*/};
		}
	}
	
	@Override
	protected INodeEditPart getConnectableEditPart() {
		if (getHost() instanceof INodeEditPart)
			return (INodeEditPart) getHost();
		else {
			EditPart virtualHost = getHost();
			while (!(virtualHost instanceof INodeEditPart)) {
				virtualHost = virtualHost.getParent();
			}
			return  (INodeEditPart) virtualHost;
		}
	}
	
	@Override
	protected INodeEditPart getConnectionCompleteEditPart(Request request) {
		if (getHost() instanceof INodeEditPart) {
			return (INodeEditPart) getHost();
		}
		return getConnectableEditPart();
	}
	
	
	/**
	 * Gets the command to complete the creation of a new connection and
	 * relationship.
	 * 
	 * @param request
	 * @return Command
	 */
	@Override
	protected Command getConnectionAndRelationshipCompleteCommand(
			CreateConnectionViewAndElementRequest request) {
		
		request.setSourceEditPart(getConnectableEditPart());
		
		// get the element descriptor
		CreateElementRequestAdapter requestAdapter = request
				.getConnectionViewAndElementDescriptor().getCreateElementRequestAdapter();
		// get the semantic request
		CreateRelationshipRequest createElementRequest = (CreateRelationshipRequest) requestAdapter
				.getAdapter(CreateRelationshipRequest.class);
		
		createElementRequest.setPrompt(!request.isUISupressed());
		
		// complete the semantic request by filling in the source and
		// destination
		INodeEditPart targetEP = getConnectionCompleteEditPart(request);
		View sourceView = (View)request.getSourceEditPart().getModel();
		View targetView = (View)targetEP.getModel();
		
		// resolve the source
		EObject source = ViewUtil.resolveSemanticElement(sourceView);
		if (source == null) {
			source = sourceView;
		}
		createElementRequest.setSource(source);
		
		// resolve the target
		EObject target = ViewUtil.resolveSemanticElement(targetView);
		if (target == null) {
			target = targetView;
		}
		createElementRequest.setTarget(target);
		
		// get the create element request based on the elementdescriptor's
		// request
		Command createElementCommand = targetEP
				.getCommand(new EditCommandRequestWrapper(
						(CreateRelationshipRequest) requestAdapter
								.getAdapter(CreateRelationshipRequest.class), request.getExtendedData()));
		
		// create the create semantic element wrapper command
		if (null == createElementCommand)
			return null;
		
		SemanticCreateCommand semanticCommand = new SemanticCreateCommand(
			requestAdapter, createElementCommand);
		// get the view command
		Command viewCommand = getConnectionCompleteCommand(request);
		if (null == viewCommand)
			return null;
		// form the compound command and return
		CompositeCommand cc = new CompositeCommand(semanticCommand.getLabel());
		cc.compose( semanticCommand );
		cc.compose( new CommandProxy(viewCommand) );
		return new ICommandProxy(cc);
	}

}
