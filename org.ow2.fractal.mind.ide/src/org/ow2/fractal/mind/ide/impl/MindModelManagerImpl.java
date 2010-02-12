package org.ow2.fractal.mind.ide.impl;

import org.eclipse.core.resources.IProject;
import org.ow2.fractal.mind.ide.MindModel;
import org.ow2.fractal.mind.ide.MindModelManager;
import org.ow2.fractal.mind.ide.emf.mindide.MindProject;

public class MindModelManagerImpl extends MindModelManager {
	MindModelImpl _model;
	
	/**
	 * Initialize the manager.
	 */
	public void init() {
		_model = new MindModelImpl();
		_model.init();
	}
	
	
	@Override
	public MindModel getMindModel() {
		return _model;
	}
	
	
	@Override
	public MindProject getMindProject(IProject project) {
		if (project == null) return null;
		return _model.getMindProject(project);
	}

}
