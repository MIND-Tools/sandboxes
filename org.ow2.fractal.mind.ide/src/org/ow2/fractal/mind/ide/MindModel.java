package org.ow2.fractal.mind.ide;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.ow2.fractal.mind.ide.emf.mindide.MindAdl;
import org.ow2.fractal.mind.ide.emf.mindide.MindAllRepo;
import org.ow2.fractal.mind.ide.emf.mindide.MindPackage;
import org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry;
import org.ow2.fractal.mind.ide.emf.mindide.MindProject;
import org.ow2.fractal.mind.ide.emf.mindide.MindRepo;
import org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc;

/**
 * The mind model entry.
 * 
 * @author chomats
 *
 */
public interface MindModel {
	/**
	 * 
	 * @return the root entry of emf model.	 */
	MindAllRepo getMindRepository();
	
	/**
	 * Init a project.
	 * @param p a project
	 * @return the mind project object.
	 * @throws CoreException
	 * @throws IOException
	 */

	MindProject init(IProject p) throws CoreException, IOException;

	/**
	 * Return the mind project corresponding to the eclipse project. Return null if the project is not a mind project.
	 * 
	 * @param p an eclipse project
	 * @return a mind project or null.
	 */
	MindProject get(IProject p);

	/**
	 * Return all the packages found in the giving project.
	 * @param a mind project
	 * @return a map string to mind package
	 */
	Map<String, MindPackage>  getAllPackages(MindProject mp);
	
	/**
	 * Return all mind packages found in all repository.
	 * @return a map which contains all packages.
	 */
	Map<String, List<MindPackage>>  getAllPackages();

	/**
	 * Validate the mind path.
	 * @param p a mind project
	 * @param mindpath a list of mind path entry
	 * @return a status
	 */
	IStatus validate(MindProject p, EList<MindPathEntry> mindpath);

	/**
	 * 
	 * @return all mind project.
	 */
	List<MindProject> getAllProject();

	/**
	 * 
	 * @return all mind ald components.
	 */
	Collection<? extends MindAdl> getAllComponents();

	/**
	 * return all mind all components in the giving project.
	 */
	Collection<? extends MindAdl> getAllComponents(MindProject project);

	/**
	 * return the workspace repository
	 * @return
	 */
	MindRepo getWSRepo();

	/**
	 * Find the mind root source corresponding to the giving eclipse container.
	 * @param container an eclipse container
	 * @return the mind root source or null if not found
	 */
	MindRootSrc findRootSrc(IContainer container);

	/**
	 * Find the mind root source corresponding to the giving eclipse container. If not found,
	 * create a new object.
	 * @param container an eclipse container
	 * @return the mind root source
	 */
	MindRootSrc findOrCreateRootSrc(IContainer container);

	/**
	 * Find the mind package corresponding to the giving package. If not found,
	 * create a new object.
	 * @param rootSrc the root source where look for
	 * @param packageName a package
	 * @return the mind package
	 */
	MindPackage findOrCreatePackage(MindRootSrc rootSrc, String packageName);

	/**
	 * Find the mind adl in the giving project mp, in package packageName and the name is componantName.
	 *
	 * @param mp
	 * @param packageName
	 * @param componantName
	 * @return the adl if is found or null
	 */
	MindAdl getAdl(MindProject mp, String packageName, String componantName);

}
