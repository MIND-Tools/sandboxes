package org.ow2.fractal.mind.ide.ui.navigator;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;

public class MindLabelProvider extends AdapterFactoryLabelProvider implements
		ILabelProvider, org.eclipse.ui.navigator.ICommonLabelProvider {

	public MindLabelProvider() {
		super(MindUICore.mindViewAdapterFactory());
	}

	public void init(ICommonContentExtensionSite aConfig) {
		
	}

	public void restoreState(IMemento aMemento) {
	}

	public void saveState(IMemento aMemento) {
	}

	public String getDescription(Object anElement) {
		return getText(anElement);
	}

}
