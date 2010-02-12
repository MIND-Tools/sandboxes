package org.ow2.fractal.mind.diagram.custom.edit.parts;

import java.util.List;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.figures.ShapeCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.internal.figures.NestedResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.layout.FreeFormLayoutEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.AdlDefinitionCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompositeReferencesListAreaCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompositeReferencesListAreaCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.FixedChildrenLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.layouts.ConstrainedFlowLayout;

import adl.diagram.edit.parts.CompositeReferencesListCompartmentReferencesListAreaEditPart;
import adl.diagram.edit.policies.CompositeReferencesListItemSemanticEditPolicy;

public class CompositeReferencesListAreaCustomEditPart extends
		CompositeReferencesListCompartmentReferencesListAreaEditPart {

	public CompositeReferencesListAreaCustomEditPart(View view) {
		super(view);
	}
	
	protected LayoutManager layoutManager;
	
	/**
	 * Custom layout
	 */
	@Override
	protected LayoutManager getLayoutManager() {
		if (layoutManager == null) {
			layoutManager = new ConstrainedFlowLayout(false);
		}
		return layoutManager;
	}

	/**
	 * Custom layout edit policy to support the custom layout manager
	 */
	@Override
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new MindCreationEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CompositeReferencesListAreaCustomItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new NonResizableEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new CompositeReferencesListAreaCustomCanonicalEditPolicy());
	}
	
	protected LayoutEditPolicy createLayoutEditPolicy() {
		return new FixedChildrenLayoutEditPolicy();
	}
	
	@Override
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);
		getParent().refresh();
	}
	
	@Override
	public void refresh() {
		super.refresh();
		getParent().refresh();
	}
	
	

}
