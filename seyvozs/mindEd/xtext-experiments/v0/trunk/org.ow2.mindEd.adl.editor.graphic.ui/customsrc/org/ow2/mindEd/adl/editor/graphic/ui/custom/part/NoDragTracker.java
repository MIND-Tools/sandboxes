package org.ow2.mindEd.adl.editor.graphic.ui.custom.part;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.tools.DragEditPartsTrackerEx;

public class NoDragTracker extends DragEditPartsTrackerEx {

	public NoDragTracker(EditPart sourceEditPart) {
		super(sourceEditPart);
	}
	
	@Override
	/**
	 * Does not allow drag
	 */
	public void performDrag() {
		return;
	}

	@Override
	protected void showSourceFeedback() {
//		super.showSourceFeedback();
	}

}
