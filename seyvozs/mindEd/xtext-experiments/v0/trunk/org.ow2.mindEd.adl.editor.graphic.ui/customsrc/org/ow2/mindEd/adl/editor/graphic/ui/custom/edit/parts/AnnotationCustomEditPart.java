package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts;

import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.AnnotationEditPart;


/**
 * Extends TemplateSpecifierEditPart to implement custom behavior
 * - disable spacing
 * - set default size
 * @author maroto
 *
 */
public class AnnotationCustomEditPart extends AnnotationEditPart {

	public AnnotationCustomEditPart(View view) {
		super(view);
	}
	
	
	public NodeFigure createNodePlate() {
		NodeFigure fig = getMindProxy().createNodePlate();
		if (fig == null)
			fig = super.createNodePlate();
		return fig;
	}
	
}
