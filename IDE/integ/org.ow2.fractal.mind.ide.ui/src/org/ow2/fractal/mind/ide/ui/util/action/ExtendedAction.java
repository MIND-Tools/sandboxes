package org.ow2.fractal.mind.ide.ui.util.action;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.ow2.fractal.mind.ide.ui.util.ExtendedModel;

public interface ExtendedAction {
	
	void run();

	boolean isActive();
	
	void setSelection(IStructuredSelection sel);
	
	void setExtendedModel(ExtendedModel model);
}
