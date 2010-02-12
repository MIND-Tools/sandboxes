package org.ow2.fractal.mind.ide;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.IAdapterManager;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;
import org.ow2.fractal.mind.ide.impl.MindAdlCustomImpl;
import org.ow2.fractal.mind.ide.impl.MindProjectImpl;
import org.ow2.fractal.mind.ide.preferences.MindPreference;
import org.ow2.fratal.mind.ide.emf.mindide.MindAdl;
import org.ow2.fratal.mind.ide.emf.mindide.MindAllRepo;
import org.ow2.fratal.mind.ide.emf.mindide.MindFile;
import org.ow2.fratal.mind.ide.emf.mindide.MindObject;
import org.ow2.fratal.mind.ide.emf.mindide.MindPackage;
import org.ow2.fratal.mind.ide.emf.mindide.MindProject;
import org.ow2.fratal.mind.ide.emf.mindide.MindRepo;
import org.ow2.fratal.mind.ide.emf.mindide.MindRootSrc;
import org.ow2.fratal.mind.ide.emf.mindide.impl.MindFileImpl;
import org.ow2.fratal.mind.ide.emf.mindide.impl.MindPackageImpl;
import org.ow2.fratal.mind.ide.emf.mindide.impl.MindRepoImpl;
import org.ow2.fratal.mind.ide.emf.mindide.impl.MindRootSrcImpl;

public class MindActivator extends Plugin {
	public static final String ID = "org.ow2.fractal.mind.path";
	MindProjectAdapterFactory _mindProjectAdapterFactory;
	ResourceProjectAdapterFactory _resourceProjectAdapterFactory;
	static private MindActivator SINGLETON;
	static MindPreference pref;
	
	class MindProjectAdapterFactory implements IAdapterFactory {

		/* (non-Javadoc)
		 * Method declared on IAdapterFactory
		 */
		public Object getAdapter(Object adaptableObject, Class adapterType) {
			if (adapterType == MindProject.class && adaptableObject instanceof IProject) {
				return MindModelManager.getMindModelManager().getMindProject((IProject) adaptableObject);
			}
			if (adaptableObject instanceof IResource) {
				 MindObject r = MindIdeCore.get((IResource) adaptableObject);
				 if (adapterType.isInstance(r)) {
					 return r;
				 }
			}
			return null;
		}

		/* (non-Javadoc)
		 * Method declared on IAdapterFactory
		 */
		public Class[] getAdapterList() {
			return new Class[] {MindProject.class, MindFile.class, MindPackage.class, MindRootSrc.class, MindAdl.class, MindRepo.class, MindAllRepo.class};
		}
	}

	class ResourceProjectAdapterFactory implements IAdapterFactory {

		/* (non-Javadoc)
		 * Method declared on IAdapterFactory
		 */
		public Object getAdapter(Object adaptableObject, Class adapterType) {
			if (adapterType == IProject.class && adaptableObject instanceof MindProject) {
				return ((MindProject) adaptableObject).getProject();
			}
			if (adaptableObject instanceof MindObject) {
				 IResource r = 	MindIdeCore.getResource((MindObject) adaptableObject);
				 if (adapterType.isInstance(r)) {
					 return r;
				 }
			}
			if (adaptableObject instanceof MindRepo) {
				if (adapterType == Collection.class)
					return Collections.emptyList();
			}
			return null;
		}

		/* (non-Javadoc)
		 * Method declared on IAdapterFactory
		 */
		public Class[] getAdapterList() {
			return new Class[] { IProject.class, IFile.class, IContainer.class, IFolder.class, IResource.class, Collection.class };
		}
	}

	
	public MindActivator() {
	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		registerAdapters();
		pref = new MindPreference();
		pref.initListener();
		SINGLETON = this;
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		unregisterAdapters();
		pref.dispose();
		pref = null;
		SINGLETON = null;
	}
	
	private void registerAdapters() {
		_mindProjectAdapterFactory = new MindProjectAdapterFactory();
		_resourceProjectAdapterFactory = new ResourceProjectAdapterFactory();
		IAdapterManager manager = Platform.getAdapterManager();
		manager.registerAdapters(_mindProjectAdapterFactory, IProject.class);
		manager.registerAdapters(_mindProjectAdapterFactory, IFile.class);
		manager.registerAdapters(_mindProjectAdapterFactory, IFolder.class);
		manager.registerAdapters(_mindProjectAdapterFactory, IWorkspaceRoot.class);
		
		manager.registerAdapters(_resourceProjectAdapterFactory, MindProjectImpl.class);
		manager.registerAdapters(_resourceProjectAdapterFactory, MindRootSrcImpl.class);
		manager.registerAdapters(_resourceProjectAdapterFactory, MindPackageImpl.class);
		manager.registerAdapters(_resourceProjectAdapterFactory, MindFileImpl.class);
		manager.registerAdapters(_resourceProjectAdapterFactory, MindAdlCustomImpl.class);
		manager.registerAdapters(_resourceProjectAdapterFactory, MindRepoImpl.class);
	}
        
	private void unregisterAdapters() {
		IAdapterManager manager = Platform.getAdapterManager();
		manager.unregisterAdapters(_mindProjectAdapterFactory);
		manager.unregisterAdapters(_resourceProjectAdapterFactory);
	}
	
	public static MindPreference getPref() {
		return pref;
	}

	public static void log(IStatus status) {
		if (SINGLETON!= null)
			SINGLETON.getLog().log(status);
	}

}
