package org.ow2.mindEd.adl.editor.graphic.ui.custom.layouts;

import org.eclipse.draw2d.text.TextFragmentBox;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.gmf.runtime.draw2d.ui.text.FlowUtilitiesEx;
import org.eclipse.swt.graphics.Font;

/**
 * Used to correct label's behaviour
 * @author maroto
 *
 */
public class FlowUtilitiesCustomEx extends FlowUtilitiesEx {

	public FlowUtilitiesCustomEx(IMapMode mapmode) {
		super(mapmode);
	}
	
	public float getAverageCharWidth(TextFragmentBox fragment, Font font) {
		return super.getAverageCharWidth(fragment, font) + 5;
	}

}
