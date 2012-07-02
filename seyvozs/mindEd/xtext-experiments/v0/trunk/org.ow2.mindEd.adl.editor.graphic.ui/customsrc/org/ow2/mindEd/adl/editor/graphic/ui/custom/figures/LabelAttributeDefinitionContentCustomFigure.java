package org.ow2.mindEd.adl.editor.graphic.ui.custom.figures;

import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.swt.graphics.Color;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.figures.IFractalShape;

public class LabelAttributeDefinitionContentCustomFigure extends WrappingLabel implements IFractalShape {

	protected static Color BACKGROUND_COLOR = LIGHT_GREEN;
	
	public LabelAttributeDefinitionContentCustomFigure() {
		super();
		setOpaque(false);
		setBackgroundColor(BACKGROUND_COLOR);
	}

	
	
}
