package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts;

import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.TemplateSpecifierReferenceEditPart;

public class TemplateSpecifierReferenceCustomEditPart extends
		TemplateSpecifierReferenceEditPart {

	public TemplateSpecifierReferenceCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	public NodeFigure createNodePlate() {
		NodeFigure fig = getMindProxy().createNodePlate();
		if (fig == null)
			fig = super.createNodePlate();
		return fig;
	}

}
