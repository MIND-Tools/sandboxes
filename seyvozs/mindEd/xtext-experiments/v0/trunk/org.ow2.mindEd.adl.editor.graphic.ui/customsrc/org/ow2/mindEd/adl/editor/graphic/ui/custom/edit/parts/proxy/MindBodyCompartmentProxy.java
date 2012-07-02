package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy;

import org.eclipse.draw2d.LayoutManager;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies.CustomDragDropEditPolicy;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies.CustomXYLayoutEditPolicy;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.layouts.CustomFreeFormLayoutEx;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.part.CustomDragEditPartsTracker;

public class MindBodyCompartmentProxy extends MindCompartmentProxy {

	public MindBodyCompartmentProxy(GraphicalEditPart editPart, int vID) {
		super(editPart, vID, TYPE_COMPARTMENT_BODY);
	}

	public MindBodyCompartmentProxy(GraphicalEditPart editPart, int vID,
			int mindType) {
		super(editPart, vID, mindType);
	}
	
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		// Customized drag and drop features
		editPart.installEditPolicy(
				EditPolicyRoles.DRAG_DROP_ROLE,
				new CustomDragDropEditPolicy());
		// Extended layout features
		editPart.installEditPolicy(
				EditPolicy.LAYOUT_ROLE, 
				new CustomXYLayoutEditPolicy());
		
	}
	
	/**
	 * Call this to implement our custom drag tracker which gives us extended drag and drop features
	 * @param ep
	 * @return
	 */
	public DragTracker getDragTracker(Request request) {
		return new CustomDragEditPartsTracker(editPart);
	}
	
	/**
	 * Returns the layout manager to be used by this shape compartment. This
	 * implementation returns a {@link CustomFreeformLayoutEx} instance.
	 * 
	 * @return a layout manager.
	 */
	public LayoutManager getLayoutManager() {
		if (layoutManager == null) {
			layoutManager = new CustomFreeFormLayoutEx();
		}
		return layoutManager;
		
	}

}
