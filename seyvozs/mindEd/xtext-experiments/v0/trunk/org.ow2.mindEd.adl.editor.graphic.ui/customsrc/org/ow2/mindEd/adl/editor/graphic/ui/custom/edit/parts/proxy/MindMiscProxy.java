package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies.NoDragDropEditPolicy;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies.ParentCreationEditPolicy;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.listeners.MindListLayoutListener;

public class MindMiscProxy extends MindProxy {

	public MindMiscProxy(GraphicalEditPart editPart, int vID) {
		super(editPart,vID, TYPE_ITEM);
	}
	
	public MindMiscProxy(GraphicalEditPart editPart, int vID, int mindType) {
		super(editPart, vID, mindType);
	}
		
	
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		// No drag and drop
		editPart.removeEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE);
		editPart.installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new NoDragDropEditPolicy());
		// Extended creation features
		editPart.installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new ParentCreationEditPolicy());
		setCreationMode(CREATION_MODE_PARENT);
		
	}
	
	/**
	 * Default layout is OK but we don't want the spacing
	 */
	public IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			//no spacing anymore
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			nodeShape.setLayoutManager(layout);
			nodeShape.addLayoutListener(new MindListLayoutListener(getGraphicalEditPart()));
		}
		return nodeShape; // use nodeShape itself as contentPane
	}


	public boolean addChildVisual(EditPart childEditPart, int index) {
		return false;
	}


	public boolean addFixedChild(EditPart childEditPart) {
		return false;
	}


	public DragTracker getDragTracker(EditPart ep) {
		return null;
	}
	
	
	
	public NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(15,15);
		return result;
	}

	
	
	public void setLayoutManager(IFigure figure) {}

	public LayoutEditPolicy createLayoutEditPolicy() {
		return null;
	}
	
}
