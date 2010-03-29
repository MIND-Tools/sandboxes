package org.ow2.fractal.mind.diagram.custom.edit.parts;

import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.ConnectorImpl;
import org.eclipse.gmf.runtime.notation.impl.ShapeImpl;
import org.ow2.fractal.mind.diagram.custom.edit.commands.BindingDefinitionCustomReorientCommand;
import org.ow2.fractal.mind.diagram.custom.edit.policies.AdlDefinitionCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.ComponentLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompositeAnonymousSubComponentCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.InterfaceBorderItemSelectionCustomEditPolicy;
import org.ow2.fractal.mind.diagram.custom.helpers.ComponentHelper;
import org.ow2.fractal.mind.diagram.custom.layouts.ComponentLayout;
import org.ow2.fractal.mind.diagram.custom.layouts.InterfaceBorderItemLocator;
import org.ow2.fractal.mind.diagram.custom.providers.DragEditPartsCustomTracker;

import adl.diagram.edit.parts.CompositeAnonymousSubComponentCompartmentCompositeAnonymousSubBodyEditPart;
import adl.diagram.edit.parts.CompositeAnonymousSubComponentEditPart;
import adl.diagram.edit.parts.CompositeAnonymousSubComponentNameEditPart;
import adl.diagram.edit.parts.CompositeReferencesListEditPart;
import adl.diagram.edit.parts.CompositeSubComponentEditPart;
import adl.diagram.edit.parts.FormalArgumentsListEditPart;
import adl.diagram.edit.parts.InterfaceDefinitionEditPart;
import adl.diagram.edit.parts.TemplateSpecifiersListEditPart;
import adl.diagram.part.MindVisualIDRegistry;
import adl.impl.BindingDefinitionImpl;
import adl.impl.InterfaceDefinitionImpl;

/**
 * Extends CompositeAnonymousSubComponentEditPart to implement custom behavior
 * - recognize child's custom edit part
 * - disable spacing
 * - set child's default size
 * - implement interface's custom behavior
 * - change the binding's container in case of drag & drop
 * @author maroto
 *
 */
public class CompositeAnonymousSubComponentCustomEditPart extends
			CompositeAnonymousSubComponentEditPart {

	public CompositeAnonymousSubComponentCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new CompositeAnonymousSubComponentCustomCanonicalEditPolicy());
		removeEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE);
	}
	
	@Override
	protected IFigure setupContentPane(IFigure nodeShape) {
		// Get a ComponentLayout
		return ComponentHelper.setupContentPane(nodeShape);
	}
	
	@Override
	protected void addChildVisual(EditPart childEditPart, int index) {
		if(childEditPart instanceof InterfaceDefinitionCustomEditPart)
		{
			//Make interfaces stick to the component's border
			//Use InterfaceBorderItemLocator
			InterfaceBorderItemLocator locator = new InterfaceBorderItemLocator(
					getMainFigure());
			getBorderedFigure().getBorderItemContainer().add(
					((InterfaceDefinitionCustomEditPart) childEditPart).getFigure(), locator);
			return;
		}
		else if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}
	
	@Override
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CompositeAnonymousSubComponentCompartmentCompositeAnonymousSubBodyEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureCompositeAnonymousSubBodyArea();
			// Set the layout
			ComponentHelper.setupBody(pane);
			pane
					.add(((CompositeAnonymousSubComponentCompartmentCompositeAnonymousSubBodyEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return super.addFixedChild(childEditPart);
	}

	@Override
	protected LayoutEditPolicy createLayoutEditPolicy() {
		return new ComponentLayoutEditPolicy();
	}
	
	
	@Override
	public DragTracker getDragTracker(Request request) {
		return ComponentHelper.getDragTracker(this);
	}
	
	
	
}
