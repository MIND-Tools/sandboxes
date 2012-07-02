package org.ow2.mindEd.ide.core.impl;

import java.io.IOException;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.ow2.mindEd.ide.core.MindIdeCore;
import org.ow2.mindEd.ide.core.MindModel;
import org.ow2.mindEd.ide.core.RepoTypeAdapter;

public class LocalRepoTypeAdapter implements RepoTypeAdapter {
	
	public LocalRepoTypeAdapter() {
	}

	@Override
	public void initRepo(MindModel mm) {
		IFolder localRepo = mm.getLocalRepoFolder();
		try {
			localRepo.accept(new MindIdeWorkspaceChangeListener((MindModelImpl) mm, null));
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
