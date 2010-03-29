package org.ow2.fractal.mind.ide;

import org.eclipse.core.resources.IProject;
import org.ow2.fractal.mind.ide.emf.mindide.MindProject;
import org.ow2.fractal.mind.ide.impl.MindModelManagerImpl;

/**
 * Mind model entry manager
 */
public abstract class MindModelManager {
	private static MindModelManagerImpl SINGLETON = null;
	
	/**
	 * 
	 * @return the mind model manager.
	 */
	public static MindModelManager getMindModelManager() {
		if (SINGLETON == null) {
			SINGLETON = new MindModelManagerImpl();
			SINGLETON.init();
		}
		return SINGLETON;
	}

	/**
	 * 
	 * @return a mind model instance.
	 */
	public abstract MindModel getMindModel();


	/**
	 * Return the mind project corresponding to the eclipse project. Return null if the project is not a mind project.
	 * 
	 * @param p an eclipse project
	 * @return a mind project or null.
	 */
	public abstract MindProject getMindProject(IProject project);


}
