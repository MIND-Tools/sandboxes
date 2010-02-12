package org.ow2.fractal.mind.ide;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.ow2.fractal.mind.ide.impl.MindProjectImpl;
import org.ow2.fractal.mind.ide.impl.MindIdeWorkspaceChangeListener;
import org.ow2.fratal.mind.ide.emf.mindide.MindFile;
import org.ow2.fratal.mind.ide.emf.mindide.MindObject;
import org.ow2.fratal.mind.ide.emf.mindide.MindPackage;
import org.ow2.fratal.mind.ide.emf.mindide.MindProject;
import org.ow2.fratal.mind.ide.emf.mindide.MindRootSrc;

public class MindIdeBuilder extends IncrementalProjectBuilder {


	public static final String BUILDER_ID = "org.ow2.fractal.mind.cadse.builder";
	private MindProject mp;


	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.internal.events.InternalBuilder#build(int,
	 *      java.util.Map, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor)
			throws CoreException {
//		Map<IResource, MindObject> mapResourceToMind = new HashMap<IResource, MindObject>();
//		if (!getProject().exists() || !getProject().isOpen()) {
//			//delete project
//			mp = MindModelManager.getMindModelManager().getMindProject(getProject());
//			if (mp != null) {
//				mp.getRepo().getMindprojects().remove(mp);
//			}
//			return null;
//		}
//		try {
//			mp = MindModelManager.getMindModelManager().getMindModel().init(getProject());
//		} catch (IOException e) {
//			MindIdeCore.log(e, "");
//			return null;
//		}
//		
//		syncDelete(mapResourceToMind);
//		
//		if (kind == FULL_BUILD) {
//			((MindProjectImpl)mp).syncMindPathFile();
//			fullBuild(monitor, mapResourceToMind);
//		} else {
//			IResourceDelta delta = getDelta(getProject());
//			if (delta.findMember(new Path(MindProjectImpl.MINDPATH_FILENAME)) != null)
//					((MindProjectImpl)mp).syncMindPathFile();
//			if (delta == null) {
//				fullBuild(monitor, mapResourceToMind);
//			} else {
//				incrementalBuild(delta, monitor, mapResourceToMind);
//			}
//		}
		
		return null;
	}





	

	

	

	protected void fullBuild(final IProgressMonitor monitor, Map<IResource, MindObject> mapResourceToMind)
			throws CoreException {
//		
//	//		getProject().accept(new ProjectVisitor(mp, mapResourceToMind));
//		
	}

	

	protected void incrementalBuild(IResourceDelta delta,
			IProgressMonitor monitor, Map<IResource, MindObject> mapResourceToMind) throws CoreException {
//		delta.accept(new ProjectVisitor(mp, mapResourceToMind));
	}
}
