package org.ow2.mindEd.ide.core.impl;

import org.eclipse.core.resources.IProject;
import org.ow2.mindEd.ide.core.MindModel;
import org.ow2.mindEd.ide.core.MindModelManager;
import org.ow2.mindEd.ide.model.MindLibrary;
import org.ow2.mindEd.ide.model.MindProject;


/**
 * This class is an entry point of the Model of the mindIDE.
 * @author mind team
 *
 */
public class MindModelManagerImpl extends MindModelManager {
	MindModelImpl _model;
	
	/**
	 * Initialize the manager.
	 */
	public void init() {
		_model = new MindModelImpl();
		_model.init();
	}
	
	/**
	 * Return the model of the mindIDE
	 */
	@Override
	public MindModel getMindModel() {
		return _model;
	}
	
	/**
	 * 
	 * Return the associated Mindproject corresponding at project.
	 * @param project the project
	 */
	@Override
	public MindProject getMindProject(IProject project) {
		if (project == null) return null;
		return _model.getMindProject(project);
	}
	
	
	/**
	 * 
	 * Return the associated Mindproject corresponding at project.
	 * @param project the project
	 */
	@Override
	public MindLibrary getMindLib(IProject project) {
		if (project == null) return null;
		return _model.getMindLib(project);
	}
	
	
}
