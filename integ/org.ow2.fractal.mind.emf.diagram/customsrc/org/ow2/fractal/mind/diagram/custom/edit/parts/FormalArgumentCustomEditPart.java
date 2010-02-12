package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

import adl.diagram.edit.parts.FormalArgumentEditPart;

/**
 * Extends FormalArgumentEditPart to implement custom behavior
 * - disable spacing
 * - set default size
 * @author maroto
 *
 */
public class FormalArgumentCustomEditPart extends FormalArgumentEditPart {

	public FormalArgumentCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	protected NodeFigure createNodePlate() {
		//Set default size
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(100, 15);
		return result;
	}
	
	@Override
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			//No spacing anymore
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}
	
	

}
