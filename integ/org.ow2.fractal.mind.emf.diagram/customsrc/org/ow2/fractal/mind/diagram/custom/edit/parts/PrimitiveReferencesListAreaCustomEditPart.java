package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.LayoutManager;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.AdlDefinitionCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompositeReferencesListAreaCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.FixedChildrenLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.PrimitiveReferencesListAreaCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.PrimitiveReferencesListAreaCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.layouts.ConstrainedFlowLayout;

import adl.diagram.edit.parts.PrimitiveReferencesListCompartmentReferencesListAreaEditPart;

public class PrimitiveReferencesListAreaCustomEditPart extends
		PrimitiveReferencesListCompartmentReferencesListAreaEditPart {

	public PrimitiveReferencesListAreaCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new MindCreationEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new PrimitiveReferencesListAreaCustomItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new NonResizableEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new PrimitiveReferencesListAreaCustomCanonicalEditPolicy());
	}
	
	protected LayoutManager layoutManager;
	
	@Override
	protected LayoutManager getLayoutManager() {
		if (layoutManager == null) {
			layoutManager = new ConstrainedFlowLayout(false);
		}
		return layoutManager;
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
