package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompositeComponentDefinitionCustomCanonicalEditPolicy;

import adl.diagram.edit.parts.TypeReferenceDefinitionEditPart;

/**
 * Extends TypeReferenceDefinitionEditPart to implement custom behavior
 * - disable spacing
 * - set default size
 * @author maroto
 *
 */
public class TypeReferenceDefinitionCustomEditPart extends
		TypeReferenceDefinitionEditPart {

	
	public TypeReferenceDefinitionCustomEditPart(View view) {
		super(view);
	}
	
	
	
	@Override
	protected NodeFigure createNodePlate() {
		//set default size
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(100, 50);
		return result;
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
	
}
