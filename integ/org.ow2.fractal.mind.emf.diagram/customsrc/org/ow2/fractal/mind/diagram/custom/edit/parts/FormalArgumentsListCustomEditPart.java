package org.ow2.fractal.mind.diagram.custom.edit.parts;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.FormalArgumentsListCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.FixedChildrenLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.layouts.IFractalSize;

import adl.diagram.edit.parts.CompositeReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart;
import adl.diagram.edit.parts.CompositeReferenceDefinitionReferenceName2EditPart;
import adl.diagram.edit.parts.FormalArgumentsListCompartmentFormalArgumentsList2EditPart;
import adl.diagram.edit.parts.FormalArgumentsListCompartmentFormalArgumentsListEditPart;
import adl.diagram.edit.parts.FormalArgumentsListEditPart;
import adl.diagram.part.MindVisualIDRegistry;

/**
 * Extends FormalArgumentsListEditPart to implement custom behavior
 * - disable spacing
 * @author maroto
 *
 */
public class FormalArgumentsListCustomEditPart extends
		FormalArgumentsListEditPart {

	public FormalArgumentsListCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			// No spacing
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}
	
	@Override
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new MindCreationEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new FormalArgumentsListCustomItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new NonResizableEditPolicy());
	}
	
	protected LayoutEditPolicy createLayoutEditPolicy() {
		return new FixedChildrenLayoutEditPolicy();
	}
		
	@Override
	public void refreshBounds() {	
		EditPart pane = getPrimaryChildEditPart();
		int nbChildren = 0;
		if (pane != null) {
			nbChildren = pane.getChildren().size();
		}
		
		int height = IFractalSize.TITLE_HEIGHT;
		if (nbChildren > 0) {
			height += nbChildren*IFractalSize.ARGUMENT_HEIGHT + 3;
		}
		
		((GraphicalEditPart) getParent()).setLayoutConstraint(
				this,
				getFigure(),
				new Rectangle(-1,-1,-1, height)
				);
	}
	
	@Override
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof FormalArgumentsListCompartmentFormalArgumentsList2EditPart) {
			IFigure pane = getPrimaryShape().getFigureFormalArgumentsArea();
			setupContentPane(pane); 
			pane
					.add(((FormalArgumentsListCompartmentFormalArgumentsListEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return super.addFixedChild(childEditPart);
	}

	@Override
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof FormalArgumentsListCompartmentFormalArgumentsList2EditPart) {
			IFigure pane = getPrimaryShape().getFigureFormalArgumentsArea();
			setupContentPane(pane);
			pane
					.remove(((FormalArgumentsListCompartmentFormalArgumentsListEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return super.removeFixedChild(childEditPart);
	}
	
	@Override
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof FormalArgumentsListCompartmentFormalArgumentsList2EditPart) {
			return getPrimaryShape().getFigureFormalArgumentsArea();
		}
		return super.getContentPane();
	}
	
	public EditPolicy getPrimaryDragEditPolicy() {
		return new NonResizableEditPolicy();
	}

}
