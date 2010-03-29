package org.ow2.fractal.mind.diagram.custom.layouts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.text.TextFragmentBox;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.gmf.runtime.draw2d.ui.text.FlowUtilitiesEx;
import org.eclipse.swt.graphics.Font;

public class FlowUtilitiesCustomEx extends FlowUtilitiesEx {

	public FlowUtilitiesCustomEx(IMapMode mapmode) {
		super(mapmode);
	}
	
	public float getAverageCharWidth(TextFragmentBox fragment, Font font) {
	    
		return super.getAverageCharWidth(fragment, font) + 5;
	    
	}

}
