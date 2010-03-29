package org.ow2.fractal.mind.ide;

import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.ow2.fractal.mind.ide.emf.mindide.MindObject;

/**
 * Mind builder. Do noting in lot 1. Keeping for next lot.
 * @author chomats
 *
 */
public class MindIdeBuilder extends IncrementalProjectBuilder {

/**
 * ID of mind ide builder.
 */
	public static final String BUILDER_ID = "org.ow2.fractal.mind.cadse.builder";
	

	@Override
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor)
			throws CoreException {
		return null;
	}	

	protected void fullBuild(final IProgressMonitor monitor, Map<IResource, MindObject> mapResourceToMind)
			throws CoreException {
	}

	protected void incrementalBuild(IResourceDelta delta,
			IProgressMonitor monitor, Map<IResource, MindObject> mapResourceToMind) throws CoreException {
	}
}
