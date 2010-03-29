package org.ow2.fractal.mind.ide.ui.navigator;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;
import org.ow2.fractal.mind.ide.MindIdeCore;
import org.ow2.fractal.mind.ide.MindModel;
import org.ow2.fractal.mind.ide.emf.edit.custom.MindPathItemProvider;
import org.ow2.fratal.mind.ide.emf.mindide.MindProject;


public class MindContentResources extends AdapterFactoryContentProvider implements  ITreeContentProvider,
		ICommonContentProvider {

	public MindContentResources() {
		super(MindUICore.getAdapterFactory());
	}

	public void init(ICommonContentExtensionSite aConfig) {
	}

	public void restoreState(IMemento aMemento) {
	}

	public void saveState(IMemento aMemento) {
	}
	
	
	@Override
	public Object getParent(Object element) {
		Object parent= super.getParent(element);
		if (parent instanceof MindModel) {
			return ResourcesPlugin.getWorkspace().getRoot();
		}
		if (parent instanceof MindProject) {
			return ((MindProject)parent).getProject();
		}
		return parent;
	}

	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof IProject) {
			MindProject mp = MindIdeCore.get((IProject)inputElement);
			if (mp != null) {
				return new Object[] {
						new MindPathItemProvider(MindUICore.getAdapterFactory(), mp)
				};
			}
		}
		if (inputElement instanceof MindPathItemProvider) {
			return super.getChildren(inputElement);
		}
		return new Object[0];
	}
	
	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof IProject) {
			MindProject mp = MindIdeCore.get((IProject)element);
			return mp !=  null;
		}
		if (element instanceof MindPathItemProvider) {
			return super.hasChildren(element);
		}
		return false;
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IProject) {
			MindProject mp = MindIdeCore.get((IProject)parentElement);
			if (mp != null) {
				return new Object[] {
						new MindPathItemProvider(MindUICore.getAdapterFactory(), mp)
				};
			}
		}
		if (parentElement instanceof MindPathItemProvider) {
			return super.getChildren(parentElement);
		}
		return new Object[0];
	}

	
}