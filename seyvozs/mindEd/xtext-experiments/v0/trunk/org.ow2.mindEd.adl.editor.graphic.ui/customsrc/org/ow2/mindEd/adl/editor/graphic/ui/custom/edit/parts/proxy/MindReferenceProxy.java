package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies.CustomDragDropEditPolicy;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies.FixedChildrenLayoutEditPolicy;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies.ChildrenCreationEditPolicy;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies.OpenDefinitionEditPolicy;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.layouts.ConstrainedFlowLayout;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.listeners.MindListLayoutListener;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.part.NoDragTracker;

public class MindReferenceProxy extends MindProxy {
	
	public MindReferenceProxy (GraphicalEditPart editPart, int vID) {
		super(editPart, vID, TYPE_REFERENCE);
	}
	
	public MindReferenceProxy(GraphicalEditPart editPart, int vID, int mindType) {
		super(editPart, vID, mindType);
	}
	
	
	@Override
	public DragTracker getDragTracker(Request request) {
		// No drag and drop allowed
		return new NoDragTracker(editPart);
	}
	

	@Override
	public void createDefaultEditPolicies() {
		// Extended layout features
		editPart.installEditPolicy(EditPolicy.LAYOUT_ROLE,
				new FixedChildrenLayoutEditPolicy());
		// Extended creation features
		editPart.installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new ChildrenCreationEditPolicy());
		setCreationMode(CREATION_MODE_CHILD);
		// Extended drag and drop features
		editPart.installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new CustomDragDropEditPolicy());
		// To open the referenced component on double clic
		editPart.installEditPolicy(EditPolicyRoles.OPEN_ROLE, 
				new OpenDefinitionEditPolicy());
		
	}
	
	
	public NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(30,15);
		return result;
	}
	
	
	@Override
	public IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedFlowLayout layout = new ConstrainedFlowLayout(false);
			nodeShape.setLayoutManager(layout);
			nodeShape.addLayoutListener(new MindListLayoutListener(getGraphicalEditPart()));
		}
		return nodeShape; // use nodeShape itself as contentPane
	}
	
	
	@Override
	public boolean refreshBounds() {
		// The height depends on the children inside the area of this ReferencesList
//		int width = -1;
//		
//		List<EditPart> children = realEditPart.getChildren();
//		int nbChildren = children.size();
//		
//		int height = IFractalSize.TITLE_HEIGHT + 20 * nbChildren;
//		
//		// Now set the constraint
//		Dimension size = new Dimension(width, height);
//		
//		int x = ((Integer) realEditPart.getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_X())).intValue();
//		int y = ((Integer) realEditPart.getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_Y())).intValue();
//		Point loc = new Point(x, y);
//		
//		((GraphicalEditPart)realEditPart.getParent()).setLayoutConstraint(
//			realEditPart,
//			realEditPart.getFigure(),
//			new Rectangle(loc, size));
//		
//		realEditPart.getParent().refresh();
//		
//		return true;

		return false;
	}
	
	@Override
	public boolean addFixedChild(EditPart childEditPart) {
		// To open the referenced definition on double clic
		childEditPart.installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDefinitionEditPolicy());
		return false;
	}
	
}
