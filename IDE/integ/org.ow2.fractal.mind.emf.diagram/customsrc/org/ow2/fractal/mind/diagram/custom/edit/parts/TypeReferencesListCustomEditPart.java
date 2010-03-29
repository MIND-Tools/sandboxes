package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

import adl.diagram.edit.parts.TypeReferencesListEditPart;

/**
 * Extends TypeReferencesListEditPart to implement custom behavior
 * - disable spacing
 * - set default size
 * @author maroto
 *
 */
public class TypeReferencesListCustomEditPart extends
		TypeReferencesListEditPart {

	public TypeReferencesListCustomEditPart(View view) {
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
	protected NodeFigure createNodePlate() {
		//set default size
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(500000, 100);
		return result;
	}
}
