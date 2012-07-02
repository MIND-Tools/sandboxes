package org.ow2.mindEd.ide.ui.navigator;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;
import org.ow2.mindEd.ide.core.MindIdeCore;

public class MindContentProvider extends AdapterFactoryContentProvider implements ITreeContentProvider,
		ICommonContentProvider {

	public MindContentProvider() {
		super(MindUICore.mindViewAdapterFactory());
	}

	public void init(ICommonContentExtensionSite aConfig) {
	}

	public void restoreState(IMemento aMemento) {
	}

	public void saveState(IMemento aMemento) {
	}
	
	@Override
	public Object[] getElements(Object object) {
		if (object == ResourcesPlugin.getWorkspace().getRoot()) {
			return MindIdeCore.getModel().getMindRepository().getRepos().toArray();
		}
		return super.getElements(object);
	}

}
