package org.ow2.mindEd.adl.editor.graphic.ui.custom.figures;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.graphics.Color;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.figures.AbstractComponentNameWrappingLabel;

public class LabelImplementationTitle extends
		AbstractComponentNameWrappingLabel {
	
	
	protected static Dimension MAXIMUM_SIZE = new Dimension(5000,20);
	protected static Color BACKGROUND_COLOR = WHITE;
	protected static Color BORDER_COLOR = WHITE;
	
	public LabelImplementationTitle() {
		super();
		//set the title
		this.setText(" Implementation");
		//set the size
		setMaximumSize(MAXIMUM_SIZE);
		//set color
		setBackgroundColor(BACKGROUND_COLOR);
		
		setEditable(false);
		
	}

	

}
