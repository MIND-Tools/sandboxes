package org.ow2.fractal.mind.ide;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.osgi.util.NLS;
import org.ow2.fractal.mind.ide.emf.mindide.MindAllRepo;
import org.ow2.fractal.mind.ide.emf.mindide.MindFile;
import org.ow2.fractal.mind.ide.emf.mindide.MindObject;
import org.ow2.fractal.mind.ide.emf.mindide.MindPackage;
import org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry;
import org.ow2.fractal.mind.ide.emf.mindide.MindPathKind;
import org.ow2.fractal.mind.ide.emf.mindide.MindProject;
import org.ow2.fractal.mind.ide.emf.mindide.MindRepo;
import org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc;
import org.ow2.fractal.mind.ide.emf.mindide.MindideFactory;
import org.ow2.fractal.mind.ide.emf.mindide.MindidePackage;
import org.ow2.fractal.mind.ide.impl.CDTUtil;

/**
 * This class is static. Default access point to manipulate ide model.
 */
public class MindIdeCore {
	public static final String DIAGRAM_EXT = "_diagram";
	
	/**
	 * Returns the mind project corresponding to the given project.
	 * 
	 * @param project
	 *            the given project
	 * @return the Mind project corresponding to the given project, null if the
	 *         given project has not mind nature or it's null.
	 */
	public static MindProject get(IProject project) {
		if (project == null) {
			return null;
		}
		return MindModelManager.getMindModelManager().getMindProject(project);
	}
	
	/**
	 * Returns the mind model. It's general entry of the integrated mind ide model.
	 * 
	 * @return the Mind model.
	 */
	public static MindModel getModel() {
		return MindModelManager.getMindModelManager().getMindModel();
	}

	/**
	 * @return the emf root entry of mind ide model.
	 * 
	 * @see MindideFactory
	 */
	public static MindAllRepo getMindAllRepos() {
		return MindModelManager.getMindModelManager().getMindModel()
				.getMindRepository();
	}

	/**
	 * Create a new mind path entry of kind 'source' giving the source folder.
	 * @param src the source folder which must be added.
	 * @return a mind path entry of kind 'source'
	 * 
	 * @see MindPathEntry
	 * @see MindPathKind
	 */
	public static MindPathEntry newMPESource(IFolder src) {
		MindPathEntry ret = MindideFactory.eINSTANCE.createMindPathEntry();
		ret.setEntryKind(MindPathKind.SOURCE);
		ret.setName(src.getFullPath().toPortableString());
		return ret;
	}
	
	/**
	 * Create a new mind path entry of kind application giving the name of the application and the component.
	 * @param cn the qualified component name.
	 * @param appliName  the name of the application
	 * @return a mind path entry of kind 'appli'
	 * 
	 * @see MindPathEntry
	 * @see MindPathKind
	 */
	public static MindPathEntry newMPEAppli(String cn, String appliName) {
		MindPathEntry ret = MindideFactory.eINSTANCE.createMindPathEntry();
		ret.setEntryKind(MindPathKind.APPLI);
		ret.setName(cn+":"+appliName);
		return ret;
	}


	/**
	 * Create a new mind path entry of kind 'import' giving the qualified package.
	 * @param qualifiedPackage the qualified package which must be imported.
	 * @return a mind path entry of kind 'import'
	 * 
	 * @see MindPathEntry
	 * @see MindPathKind
	 */
	public static MindPathEntry newMPEProject(IProject p) {
		MindPathEntry ret = MindideFactory.eINSTANCE.createMindPathEntry();
		ret.setEntryKind(MindPathKind.PROJECT);
		ret.setName(p.getFullPath().toPortableString());
		return ret;
	}

	/**
	 * Create a new mind path entry of kind 'import' giving the qualified package.
	 * @param qualifiedPackage the qualified package which must be imported.
	 * @return a mind path entry of kind import
	 * 
	 * @see MindPathEntry
	 * @see MindPathKind
	 */
	public static MindPathEntry newMPEImport(String qualifiedPackage) {
		MindPathEntry ret = MindideFactory.eINSTANCE.createMindPathEntry();
		ret.setEntryKind(MindPathKind.IMPORT_PACKAGE);
		ret.setName(qualifiedPackage);
		return ret;
	}

	/**
	 * Create a new mind project giving the name of the project.
	 * @param name the name of the new project
	 * @param monitor a progress monitor
	 * @return a mind project object.
	 * @throws CoreException 
	 * @throws UnsupportedEncodingException
	 * 
	 * @see IProject#create(IProgressMonitor)
	 * @see IProject#open(IProgressMonitor)
	 */
	public static MindProject createMINDProject(String name,
			IProgressMonitor monitor) throws CoreException,
			UnsupportedEncodingException {
		IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(name);
		p.create(monitor);
		p.open(monitor);
		CDTUtil.initMindProject(p, monitor);
		return MindModelManager.getMindModelManager().getMindProject(p);
	}

	/**
	 * Returns the file corresponding to the given mind file.
	 * 
	 * @param obj
	 *            the given mind file
	 * @return the file corresponding to the given mind file.
	 */
	public static IFile getResource(MindFile obj) {
		IPath p = new Path(obj.getFullpath());
		return ResourcesPlugin.getWorkspace().getRoot().getFile(p);
	}

	/**
	 * Returns the folder corresponding to the given mind package.
	 * 
	 * @param obj
	 *            the given mind package
	 * @return the folder corresponding to the given mind package.
	 */
	public static IFolder getResource(MindPackage obj) {
		IPath p = new Path(obj.getFullpath());
		return ResourcesPlugin.getWorkspace().getRoot().getFolder(p);
	}

	/**
	 * Returns the project corresponding to the given mind project.
	 * 
	 * @param obj
	 *            the given mind project
	 * @return the folder corresponding to the given mind project.
	 */
	public static IProject getResource(MindProject obj) {
		return obj.getProject();
	}

	/**
	 * Returns the folder corresponding to the given mind root sources.
	 * 
	 * @param obj
	 *            the given mind root sources
	 * @return the folder corresponding to the given mind root sources.
	 */
	public static IFolder getResource(MindRootSrc obj) {
		IPath p = new Path(obj.getFullpath());
		return ResourcesPlugin.getWorkspace().getRoot().getFolder(p);
	}

	/**
	 * Returns the eclipse resource corresponding to the given mind object. It can be
	 * a folder, a file or a project. Return null if the type is not in
	 * {@link MindidePackage#MIND_ADL}, {@link MindidePackage#MIND_C}, {@link MindidePackage#MIND_IDF}
	 * {@link MindidePackage#MIND_ITF}, {@link MindidePackage#MIND_H}, {@link MindidePackage#MIND_ROOT_SRC},
	 * {@link MindidePackage#MIND_PACKAGE},{@link MindidePackage#MIND_PROJECT} or if obj not instance of MindFile.
	 * 
	 * @param obj
	 *            the given mind object
	 * @return the eclipse resource corresponding to the given mind object or null.
	 */
	public static IResource getResource(MindObject obj) {
		switch (obj.eClass().getClassifierID()) {

		case MindidePackage.MIND_ADL:
		case MindidePackage.MIND_C:
		case MindidePackage.MIND_IDF:
		case MindidePackage.MIND_ITF:
		case MindidePackage.MIND_H:
			return getResource((MindFile) obj);

		case MindidePackage.MIND_ROOT_SRC:
			return getResource((MindRootSrc) obj);
		case MindidePackage.MIND_PACKAGE:
			return getResource((MindPackage) obj);
		case MindidePackage.MIND_PROJECT:
			return getResource((MindProject) obj);

		default:
			break;
		}
		if (obj instanceof MindFile)
			return getResource((MindFile) obj);
		return null;
	}

	/**
	 * Log an error
	 * @param e an exception
	 * @param message a message
	 */
	public static void log(Throwable e, String message) {
		Logger l = Logger.getLogger(MindModelManager.class.getCanonicalName());
		l.log(Level.SEVERE, message, e);
		MindActivator.log(new Status(Status.ERROR, MindActivator.ID, message,e));
	}

	/**
	 * Test if an eclipse resource exists.
	 * @param f
	 * @return true if f exists.
	 */
	public static boolean exists(IResource f) {
		return f.exists();
	}

	/**
	 * Converts the given URI to a local file. Use the existing file if the uri
	 * is on the local file system. Otherwise fetch it. Returns null if unable
	 * to fetch it.
	 */
	private static File toLocalFile(URI uri, IProgressMonitor monitor)
			throws CoreException {
		IFileStore fileStore = EFS.getStore(uri);
		File localFile = fileStore.toLocalFile(EFS.NONE, monitor);
		if (localFile == null)
			// non local file system
			localFile = fileStore.toLocalFile(EFS.CACHE, monitor);
		return localFile;
	}

	/**
	 * Get a java file from an eclipse file
	 * @param rscFile an eclipse file
	 * @return a java file
	 * @throws IOException if the location is null.
	 * @throws CoreException
	 */
	public static File getFile(IResource rscFile) throws IOException,
			CoreException {
		URI location = rscFile.getLocationURI();
		if (location == null)
			throw new IOException("Cannot obtain a location URI for " + rscFile); //$NON-NLS-1$
		File file = toLocalFile(location, null/* no progress monitor available */);
		if (file == null)
			throw new IOException("Unable to fetch file from " + location); //$NON-NLS-1$
		return file;
	}

	/**
	 * Find a mind object from an eclipse resource.
	 * @param adaptableObject an eclipse resource
	 * @return a mind object or null
	 */
	public static MindObject get(IResource adaptableObject) {
		if (adaptableObject.getType() == IResource.PROJECT) {
			return get((IProject) adaptableObject);
		}
		MindAllRepo allrepo = getMindAllRepos();
		IPath fullpath = adaptableObject.getFullPath();
		for (MindRepo r : allrepo.getRepos()) {
			for (MindRootSrc rs : r.getRootsrcs()) {
				IPath p = new Path(rs.getFullpath());
				if (p.isPrefixOf(fullpath)) {
					if (p.segmentCount() == fullpath.segmentCount())
						return rs;
					for (MindPackage pa : rs.getPackages()) {
						p = new Path(pa.getFullpath());
						if (p.isPrefixOf(fullpath)) {
							if (p.segmentCount() == fullpath.segmentCount())
								return pa;
							for (MindFile mf : pa.getFiles()) {
								p = new Path(mf.getFullpath());
								if (p.isPrefixOf(fullpath)) {
									if (p.segmentCount() == fullpath
											.segmentCount())
										return mf;
								}
							}
						}
					}
				}
			}
		}
		return null;
	}
	
	
	/**
	 * Create a mind package form the source container and the package name.
	 * 
	 * @param containerName the name of the container
	 * @param packageName the package name
	 * @param monitor a progresse monitor
	 * @throws CoreException
	 */
	static public void createMindPackage(
		String containerName,
		String packageName,
		 IProgressMonitor monitor)
		throws CoreException {
		if (monitor == null)
			monitor = new NullProgressMonitor();
		
		// create a sample file
		monitor.beginTask(NLS.bind(Messages.MindPackageWizard_task , packageName), 2);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(containerName));
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throwCoreException(NLS.bind(Messages.error_container_does_not_exists, containerName));
		}
		MindRootSrc rs = getModel().findOrCreateRootSrc((IContainer) resource);
		if (rs == null)
			throwCoreException(NLS.bind(Messages.error_cannot_find_or_create_source_folder, containerName));
		MindPackage p = getModel().findOrCreatePackage(rs, packageName);
		if (p == null)
			throwCoreException(NLS.bind(Messages.error_cannot_find_or_create_package, packageName));
		monitor.worked(1);
		
		IContainer container = MindIdeCore.getResource(p);
		create(container, monitor);
		
		monitor.worked(1);
	}
	
	

	static private void create(IContainer container, IProgressMonitor monitor) throws CoreException {
		Assert.isNotNull(container);
		if (container.exists()) return;
		create(container.getParent(), monitor);
		Assert.isTrue(container.getType() == IResource.FOLDER);
		((IFolder)container).create(false, true, monitor);
		
	}

	

	static private void throwCoreException(String message) throws CoreException {
		IStatus status =
			new Status(IStatus.ERROR, MindActivator.ID, IStatus.OK, message, null);
		throw new CoreException(status);
	}
}
