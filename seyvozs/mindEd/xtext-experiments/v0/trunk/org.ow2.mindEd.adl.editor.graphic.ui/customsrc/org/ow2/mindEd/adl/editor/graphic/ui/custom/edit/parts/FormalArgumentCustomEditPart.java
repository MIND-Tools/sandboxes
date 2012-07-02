package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts;

import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.FormalArgumentEditPart;

/**
 * This is an argument contained in a FormalArgumentsList
 * @author maroto
 *
 */
public class FormalArgumentCustomEditPart extends FormalArgumentEditPart {

	public FormalArgumentCustomEditPart(View view) {
		super(view);
	}
	
	
	@Override
	protected NodeFigure createNodePlate() {
		NodeFigure result = getMindProxy().createNodePlate();
		if (result == null)
			result = super.createNodePlate();
		return result;
	}
	
	
	

}
