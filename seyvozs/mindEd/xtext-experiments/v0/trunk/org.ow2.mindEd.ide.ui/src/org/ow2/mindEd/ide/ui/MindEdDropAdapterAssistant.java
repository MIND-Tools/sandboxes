package org.ow2.mindEd.ide.ui;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.TransferData;
import org.eclipse.ui.navigator.CommonDropAdapter;
import org.eclipse.ui.navigator.CommonDropAdapterAssistant;

public class MindEdDropAdapterAssistant extends CommonDropAdapterAssistant {

	public MindEdDropAdapterAssistant() {
	}

	@Override
	public IStatus validateDrop(Object target, int operation,
			TransferData transferType) {
		System.out.println(target.getClass());
		return null;
	}

	@Override
	public IStatus handleDrop(CommonDropAdapter aDropAdapter,
			DropTargetEvent aDropTargetEvent, Object aTarget) {
		// TODO Auto-generated method stub
		return null;
	}

}
