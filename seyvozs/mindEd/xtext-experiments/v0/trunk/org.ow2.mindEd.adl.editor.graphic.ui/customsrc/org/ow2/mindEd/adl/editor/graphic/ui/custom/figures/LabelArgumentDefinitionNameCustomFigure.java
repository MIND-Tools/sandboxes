package org.ow2.mindEd.adl.editor.graphic.ui.custom.figures;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.swt.graphics.Color;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.figures.IFractalShape;

public class LabelArgumentDefinitionNameCustomFigure extends
				WrappingLabel implements IFractalShape {

	protected static Dimension PREFERRED_SIZE = new Dimension(500,20);
	protected static Dimension MAXIMUM_SIZE = new Dimension(500,20);
	protected static Color BACKGROUND_COLOR = WHITE;
	protected static Color BORDER_COLOR = WHITE;
	protected static Color FOREGROUND_COLOR = WHITE;
	
	public LabelArgumentDefinitionNameCustomFigure() {
		super();
		//set size
		setPreferredSize(PREFERRED_SIZE);
		setMaximumSize(MAXIMUM_SIZE);
		//set color
		setBackgroundColor(BACKGROUND_COLOR);
		setForegroundColor(FOREGROUND_COLOR);
		
	}
	
}
