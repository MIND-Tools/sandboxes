package org.ow2.fractal.mind.ide;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.ow2.fractal.mind.ide.impl.MindModelManagerImpl;
import org.ow2.fratal.mind.ide.emf.mindide.MindPathEntry;
import org.ow2.fratal.mind.ide.emf.mindide.MindProject;

public abstract class MindModelManager {
	private static MindModelManagerImpl SINGLETON = null;
	
	
	public static MindModelManager getMindModelManager() {
		if (SINGLETON == null) {
			SINGLETON = new MindModelManagerImpl();
			SINGLETON.init();
		}
		return SINGLETON;
	}


	public abstract MindModel getMindModel();


	public abstract MindProject getMindProject(IProject project);


	public IStatus validate(MindProject p, EList<MindPathEntry> mindpath) {
		return getMindModel().validate(p, mindpath);
	}

}
