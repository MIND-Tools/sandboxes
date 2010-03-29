package org.ow2.fractal.mind.diagram.custom.layouts;

import org.eclipse.gmf.runtime.draw2d.ui.mapmode.MapModeUtil;
import org.eclipse.gmf.runtime.draw2d.ui.text.FlowUtilitiesEx;
import org.eclipse.gmf.runtime.draw2d.ui.text.TextFlowEx;

public class TextFlowCustomEx extends TextFlowEx {

	private FlowUtilitiesCustomEx flowUtilities;
	
	
	public FlowUtilitiesCustomEx getFlowUtilities() {
        if (flowUtilities == null) {
            flowUtilities = new FlowUtilitiesCustomEx(MapModeUtil.getMapMode(this));
        }
        return flowUtilities;
    }
}
