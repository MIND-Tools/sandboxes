package org.ow2.mindEd.adl.editor.graphic.ui.custom.listeners;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartListener;

/**
 * not implemented yet
 * @author maroto
 *
 */
public class MindEditPartListener implements EditPartListener {

	@Override
	public void childAdded(EditPart editpart, int i) {
		editpart.refresh();
		editpart.getParent().refresh();
		editpart.getParent().getParent().refresh();
	}

	@Override
	public void partActivated(EditPart editpart) {
		editpart.refresh();
	}

	@Override
	public void partDeactivated(EditPart editpart) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removingChild(EditPart editpart, int i) {
		editpart.refresh();
	}

	@Override
	public void selectedStateChanged(EditPart editpart) {
		// TODO Auto-generated method stub

	}

}
