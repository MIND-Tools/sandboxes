package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompositeReferenceAreaCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompositeReferenceAreaCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.FixedChildrenLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.PrimitiveReferenceAreaCustomCanonicalEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.PrimitiveReferenceAreaCustomItemSemanticEditPolicy;

import adl.diagram.edit.parts.PrimitiveReferenceDefinitionCompartmentComponentReferenceDefinitionAreaEditPart;
import adl.diagram.edit.parts.PrimitiveReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart;

public class PrimitiveReferenceAreaCustomEditPart extends
PrimitiveReferenceDefinitionCompartmentComponentReferenceDefinitionAreaEditPart {

	public PrimitiveReferenceAreaCustomEditPart(View view) {
		super(view);
	}
	
	protected LayoutManager layoutManager; 
	
	
	@Override
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		result.setLayoutManager(getLayoutManager());
		return result;
	}

	protected LayoutManager getLayoutManager() {
		if (layoutManager == null) {
			layoutManager = new ConstrainedToolbarLayout();
		}
		return layoutManager;
	}
	
	@Override
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new MindCreationEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new PrimitiveReferenceAreaCustomItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new NonResizableEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new PrimitiveReferenceAreaCustomCanonicalEditPolicy());
	}
	
	protected LayoutEditPolicy createLayoutEditPolicy() {
		return new FixedChildrenLayoutEditPolicy();
	}

	@Override
	protected void addChild(EditPart childEditPart, int index) {
		super.addChild(childEditPart, index);
		getParent().refresh();
	}
	
	@Override
	protected void removeChild(EditPart childEditPart) {
		super.removeChild(childEditPart);
		getParent().refresh();
	}

}
