package org.ow2.fractal.mind.ide.impl;

import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.ow2.fractal.mind.ide.MindIdeCore;
import org.ow2.fractal.mind.ide.MindModel;
import org.ow2.fractal.mind.ide.RepoTypeAdapter;

public class WSRepoTypeAdapter implements RepoTypeAdapter {
	
	public WSRepoTypeAdapter() {
	}

	@Override
	public void initRepo(MindModel mm) {
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for ( IProject p : projects) {
			if (!p.isOpen()) continue;
			try {
				mm.init(p);
			} catch (CoreException e) {
				MindIdeCore.log(e, "Cannot init project "+p.getName());
			} catch (IOException e) {
				MindIdeCore.log(e, "Cannot init project "+p.getName());
			}
		}
	}
}
