package org.ow2.fractal.mind.diagram.custom.edit.parts;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.FixedChildrenLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.TemplateSpecifiersListCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.layouts.IFractalSize;

import adl.diagram.edit.parts.TemplateSpecifiersListEditPart;

/**
 * Extends TemplateSpecifiersListEditPart to implement custom behavior
 * - disable spacing
 * - set default size
 * @author maroto
 *
 */
public class TemplateSpecifiersListCustomEditPart extends
		TemplateSpecifiersListEditPart {

	public TemplateSpecifiersListCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			//no spacing anymore
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
				new TemplateSpecifiersListCustomItemSemanticEditPolicy());
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
			height += nbChildren*IFractalSize.TEMPLATE_HEIGHT + 3;
		}
		
		((GraphicalEditPart) getParent()).setLayoutConstraint(
				this,
				getFigure(),
				new Rectangle(-1,-1,-1, height)
				);
	}

}
