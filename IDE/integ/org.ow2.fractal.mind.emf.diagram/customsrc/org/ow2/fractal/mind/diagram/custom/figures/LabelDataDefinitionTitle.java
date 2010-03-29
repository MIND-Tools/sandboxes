package org.ow2.fractal.mind.diagram.custom.figures;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.graphics.Color;

public class LabelDataDefinitionTitle extends
		AbstractComponentNameWrappingLabel {

	protected static Dimension MAXIMUM_SIZE = new Dimension(5000,20);
	protected static Color BACKGROUND_COLOR = WHITE;
	protected static Color BORDER_COLOR = WHITE;
	
	public LabelDataDefinitionTitle() {
		super();
		//set the title
		this.setText(" Data Definition");
		//set the size
		setMaximumSize(MAXIMUM_SIZE);
		//set color
		setBackgroundColor(BACKGROUND_COLOR);
		setForegroundColor(BACKGROUND_COLOR);
		
		setEditable(false);
		
	}
	
}
