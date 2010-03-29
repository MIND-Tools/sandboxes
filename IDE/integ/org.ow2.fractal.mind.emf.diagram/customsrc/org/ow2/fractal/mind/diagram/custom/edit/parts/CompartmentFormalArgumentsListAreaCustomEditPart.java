package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;

import adl.diagram.edit.parts.FormalArgumentsListCompartmentFormalArgumentsListEditPart;

public class CompartmentFormalArgumentsListAreaCustomEditPart extends
		FormalArgumentsListCompartmentFormalArgumentsListEditPart {

	public CompartmentFormalArgumentsListAreaCustomEditPart(View view) {
		super(view);
	}
	
//	protected LayoutManager layoutManager; 
//	
//	
//	@Override
//	public IFigure createFigure() {
//		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
//				.createFigure();
//		result.setLayoutManager(getLayoutManager());
//		return result;
//	}
//
//	protected LayoutManager getLayoutManager() {
//		if (layoutManager == null) {
//			layoutManager = new ConstrainedToolbarLayout();
//		}
//		return layoutManager;
//	}
	
//	@Override
//	public void createDefaultEditPolicies() {
//		super.createDefaultEditPolicies();
//		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
//		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
//				new NonResizableEditPolicy());
//	}
//	
//	protected LayoutEditPolicy createLayoutEditPolicy() {
//		LayoutEditPolicy lep = new LayoutEditPolicy() {
//
//			protected EditPolicy createChildEditPolicy(EditPart child) {
//				EditPolicy result = new NonResizableEditPolicy();
//				return result;
//			}
//
//			protected Command getMoveChildrenCommand(Request request) {
//				return null;
//			}
//
//			protected Command getCreateCommand(CreateRequest request) {
//				return null;
//			}
//		};
//		return lep;
//	}

}
