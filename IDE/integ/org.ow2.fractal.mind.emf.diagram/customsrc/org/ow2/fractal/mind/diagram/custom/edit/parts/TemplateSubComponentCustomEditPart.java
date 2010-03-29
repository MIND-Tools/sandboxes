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
import org.ow2.fractal.mind.diagram.custom.edit.policies.TemplateSubComponentCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.helpers.ComponentHelper;
import org.ow2.fractal.mind.diagram.custom.layouts.InterfaceBorderItemLocator;

import adl.diagram.edit.parts.CompositeComponentDefinitionCompartmentCompositeComponentDefinitionBodyEditPart;
import adl.diagram.edit.parts.InterfaceDefinitionEditPart;
import adl.diagram.edit.parts.TemplateSubComponentCompartmentTemplateSubBodyEditPart;
import adl.diagram.edit.parts.TemplateSubComponentEditPart;
import adl.diagram.part.MindVisualIDRegistry;
import adl.impl.BindingDefinitionImpl;
import adl.impl.InterfaceDefinitionImpl;

/**
 * Extends ComponentTypeDefinitionEditPart for customization
 * @author mao
 *
 */
public class TemplateSubComponentCustomEditPart extends
		TemplateSubComponentEditPart {

	public TemplateSubComponentCustomEditPart(View view) {
		super(view);

	}
	
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new TemplateSubComponentCustomCanonicalEditPolicy());
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
		if (childEditPart instanceof TemplateSubComponentCompartmentTemplateSubBodyEditPart) {
			IFigure body = getPrimaryShape().getFigureTemplateSubBodyArea();
			ComponentHelper.setupBody(body);
			body
					.add(((TemplateSubComponentCompartmentTemplateSubBodyEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return super.addFixedChild(childEditPart);
	}
	
	@Override
	public DragTracker getDragTracker(Request request) {
		return ComponentHelper.getDragTracker(this);
	}
	
	@Override
	protected LayoutEditPolicy createLayoutEditPolicy() {
		return new ComponentLayoutEditPolicy();
	}
}
