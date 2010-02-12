package org.ow2.fractal.mind.diagram.custom.edit.parts;

import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.draw2d.IFigure;
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
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.ConnectorImpl;
import org.eclipse.gmf.runtime.notation.impl.ShapeImpl;
import org.ow2.fractal.mind.diagram.custom.edit.commands.BindingDefinitionCustomReorientCommand;
import org.ow2.fractal.mind.diagram.custom.edit.policies.ComponentLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompositeComponentDefinitionCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.InterfaceBorderItemSelectionCustomEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.PrimitiveComponentDefinitionCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.helpers.ComponentHelper;
import org.ow2.fractal.mind.diagram.custom.layouts.InterfaceBorderItemLocator;

import adl.diagram.edit.parts.InterfaceDefinitionEditPart;
import adl.diagram.edit.parts.PrimitiveComponentDefinitionCompartmentPrimitiveDefinitionBodyEditPart;
import adl.diagram.edit.parts.PrimitiveComponentDefinitionEditPart;
import adl.diagram.edit.parts.PrimitiveReferencesListEditPart;
import adl.diagram.part.MindVisualIDRegistry;
import adl.impl.BindingDefinitionImpl;
import adl.impl.InterfaceDefinitionImpl;

/**
 * Extends PrimitiveComponentDefinitionEditPart to implement custom behavior
 * - recognize child's custom edit part
 * - disable spacing
 * - set child's default size
 * - implement interface's custom behavior
 * - change the binding's container in case of drag & drop
 * @author maroto
 *
 */
public class PrimitiveComponentDefinitionCustomEditPart extends
		PrimitiveComponentDefinitionEditPart {

	public PrimitiveComponentDefinitionCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new PrimitiveComponentDefinitionCustomCanonicalEditPolicy());
		removeEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE);
	}
	
	@Override
	protected IFigure setupContentPane(IFigure nodeShape) {
		// Get a ComponentLayout
		return ComponentHelper.setupContentPane(nodeShape);
	}
	
	
	@Override
	public DragTracker getDragTracker(Request request) {
		return ComponentHelper.getDragTracker(this);
	}
	
	@Override
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PrimitiveComponentDefinitionCompartmentPrimitiveDefinitionBodyEditPart) {
			IFigure body = getPrimaryShape().getFigurePrimitiveBodyArea();
			ComponentHelper.setupBody(body);
			body
					.add(((PrimitiveComponentDefinitionCompartmentPrimitiveDefinitionBodyEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return super.addFixedChild(childEditPart);
	}
	
	@Override
	protected void addChildVisual(EditPart childEditPart, int index) {
		if(childEditPart instanceof InterfaceDefinitionCustomEditPart)
		{
			//implements interface's custom behavior
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
	protected LayoutEditPolicy createLayoutEditPolicy() {
		return new ComponentLayoutEditPolicy();
	}
	
}
