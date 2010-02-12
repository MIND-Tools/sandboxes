package org.ow2.fractal.mind.ide;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.ow2.fratal.mind.ide.emf.mindide.MindAdl;
import org.ow2.fratal.mind.ide.emf.mindide.MindAllRepo;
import org.ow2.fratal.mind.ide.emf.mindide.MindObject;
import org.ow2.fratal.mind.ide.emf.mindide.MindPackage;
import org.ow2.fratal.mind.ide.emf.mindide.MindPathEntry;
import org.ow2.fratal.mind.ide.emf.mindide.MindProject;
import org.ow2.fratal.mind.ide.emf.mindide.MindRepo;
import org.ow2.fratal.mind.ide.emf.mindide.MindRootSrc;

public interface MindModel {
	MindAllRepo getMindRepository();

	MindProject init(IProject p) throws CoreException, IOException;

	MindProject get(IProject p);

	Map<String, List<MindPackage>>  getAllPackages();

	IStatus validate(MindProject p, EList<MindPathEntry> mindpath);

	List<MindProject> getAllProject();

	Collection<? extends MindAdl> getAllComponents();

	Collection<? extends MindAdl> getAllComponents(MindProject project);

	MindRepo getWSRepo();

	MindRootSrc findRootSrc(IContainer container);

	MindRootSrc findOrCreateRootSrc(IContainer resource);

	MindPackage findOrCreatePackage(MindRootSrc rootSrc, String packageName);

}
