package org.ow2.fractal.mind.diagram.custom.figures;

import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.swt.graphics.Color;

public class LabelAttributeDefinitionContentCustomFigure extends WrappingLabel implements IFractalShape {

	protected static Color BACKGROUND_COLOR = LIGHT_GREEN;
	
	public LabelAttributeDefinitionContentCustomFigure() {
		super();
		setOpaque(false);
		setBackgroundColor(BACKGROUND_COLOR);
	}

	
	
}
