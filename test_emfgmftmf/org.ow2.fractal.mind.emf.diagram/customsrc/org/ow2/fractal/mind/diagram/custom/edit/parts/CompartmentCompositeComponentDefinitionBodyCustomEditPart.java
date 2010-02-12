package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.layout.FreeFormLayoutEx;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.AdlDefinitionCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompartmentCompositeComponentDefinitionBodyCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompartmentCompositeComponentDefinitionBodyCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CustomDragDropEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.layouts.CustomFreeFormLayoutEx;

import adl.diagram.edit.parts.CompositeComponentDefinitionCompartmentCompositeComponentDefinitionBodyEditPart;
import adl.diagram.edit.policies.CompositeComponentDefinitionItemSemanticEditPolicy;

public class CompartmentCompositeComponentDefinitionBodyCustomEditPart extends
		CompositeComponentDefinitionCompartmentCompositeComponentDefinitionBodyEditPart {

	public CompartmentCompositeComponentDefinitionBodyCustomEditPart(View view) {
		super(view);
	}

	@Override
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new MindCreationEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CompartmentCompositeComponentDefinitionBodyCustomItemSemanticEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new CompartmentCompositeComponentDefinitionBodyCustomCanonicalEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new CustomDragDropEditPolicy());
	}
	
	
	/**
	 * Returns the layout manager to be used by this shape compartment. This
	 * implementation returns a {@link CustomFreeformLayoutEx} instance.
	 * 
	 * @return a layout manager.
	 */
	protected LayoutManager getLayoutManager() {
		return new CustomFreeFormLayoutEx();
	}
	
	
}
