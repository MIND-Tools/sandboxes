package org.ow2.mindEd.adl.editor.graphic.ui.custom.figures;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.graphics.Color;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.figures.AbstractComponentNameWrappingLabel;

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
