package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies.FixedChildrenLayoutEditPolicy;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.layouts.ConstrainedFlowLayout;

public class MindListCompartmentProxy extends MindCompartmentProxy {

	public MindListCompartmentProxy(GraphicalEditPart editPart, int vID) {
		super(editPart, vID, TYPE_COMPARTMENT_LIST);
	}

	public MindListCompartmentProxy(GraphicalEditPart editPart, int vID,
			int mindType) {
		super(editPart, vID, mindType);
	}
	
	@Override
	public void createDefaultEditPolicies(){
		super.createDefaultEditPolicies();
		// Extended layout features
		editPart.installEditPolicy(EditPolicy.LAYOUT_ROLE,
				new FixedChildrenLayoutEditPolicy());
		// No drag and drop
		editPart.removeEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE);
	}
	
	@Override
	public void setLayoutManager(IFigure figure) {
		figure.setLayoutManager(getLayoutManager());
	}
	
	
	/**
	 * Implements a ConstrainedFlowLayout
	 * @return
	 */
	@Override
	public LayoutManager getLayoutManager() {
		if (layoutManager == null) {
			layoutManager = new ConstrainedFlowLayout(false);	
			((ConstrainedFlowLayout)layoutManager).setMinorSpacing(3);
			((ConstrainedFlowLayout)layoutManager).setMajorSpacing(3);
		}
		return layoutManager;
	}

}
