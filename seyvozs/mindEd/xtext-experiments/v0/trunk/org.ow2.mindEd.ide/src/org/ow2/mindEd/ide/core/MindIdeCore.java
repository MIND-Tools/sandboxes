package org.ow2.mindEd.ide.core;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.List;
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
import org.eclipse.emf.common.util.EList;
import org.eclipse.osgi.util.NLS;
import org.ow2.mindEd.ide.core.impl.CDTUtil;
import org.ow2.mindEd.ide.core.template.TemplateCompositeADL;
import org.ow2.mindEd.ide.core.template.TemplateITFADL;
import org.ow2.mindEd.ide.core.template.TemplatePrimitiveADL;
import org.ow2.mindEd.ide.core.template.TemplatePrimitiveC;
import org.ow2.mindEd.ide.core.template.TemplateTypeADL;
import org.ow2.mindEd.ide.model.ComponentKind;
import org.ow2.mindEd.ide.model.MindAdl;
import org.ow2.mindEd.ide.model.MindAllRepo;
import org.ow2.mindEd.ide.model.MindFile;
import org.ow2.mindEd.ide.model.MindLibOrProject;
import org.ow2.mindEd.ide.model.MindObject;
import org.ow2.mindEd.ide.model.MindPackage;
import org.ow2.mindEd.ide.model.MindPathEntry;
import org.ow2.mindEd.ide.model.MindPathKind;
import org.ow2.mindEd.ide.model.MindProject;
import org.ow2.mindEd.ide.model.MindRepo;
import org.ow2.mindEd.ide.model.MindRootSrc;
import org.ow2.mindEd.ide.model.MindideFactory;
import org.ow2.mindEd.ide.model.MindidePackage;

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
		if (obj == null)
			return null;
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
		IPath fullpath = adaptableObject.getFullPath();
		IFolder localRepoFolder = getModel().getLocalRepoFolder();
		if (localRepoFolder.contains(adaptableObject)) {
			for (MindLibOrProject lop : getModel().getLocalRepo().getMindLibOrProjects()) {
				IFolder f = localRepoFolder.getFolder(lop.getName());
				if (f.equals(adaptableObject))
					return lop;
				if (f.contains(adaptableObject)) {
					MindObject ret =  findInRootSrc(fullpath, lop.getRootsrcs());
					if (ret != null)
						return ret;
				}
			}
		}
		MindAllRepo allrepo = getMindAllRepos();
		for (MindRepo r : allrepo.getRepos()) {
			MindObject ret = findInRootSrc(fullpath, r.getRootsrcs());
			if (ret != null)
				return ret;
		}
		return null;
	}
	
	public static MindObject findInRootSrc(IPath fullpath, EList<MindRootSrc> eList) {
		for (MindRootSrc rs : eList) {
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
	
	
	static public void createCTemplate(MindPackage adl, String qn, String componentName,
			IProgressMonitor monitor)
			throws CoreException {		
		createCTemplate(MindIdeCore.getResource(adl), componentName, qn, monitor);
	}
	
	static public void createCTemplate(MindAdl adl, String componentName,
			IProgressMonitor monitor)
			throws CoreException {
		createCTemplate(MindIdeCore.getResource(adl).getParent(), componentName, adl.getQualifiedName(), monitor);
	}
	
	/**
	 * Create a file .c with a template.
	 * 
	 * @param container where put the file c
	 * @param componentName the componant of the adl or the name of file c
	 * @param qn reference to qualified name of the component
	 * @param monitor
	 * @throws CoreException
	 */
	static public void createCTemplate(IContainer container, String componentName, String qn,
			IProgressMonitor monitor)
			throws CoreException {
		String cfileName = componentName.substring(0, 1).toLowerCase()
				+ componentName.substring(1);
		final IFile cfile = container.getFile(new Path(cfileName + ".c")); //$NON-NLS-1$
		try {
			InputStream stream = openCContentStream(qn);
			if (cfile.exists()) {
				//file.setContents(stream, true, true, monitor);
			} else {
				cfile.create(stream, true, monitor);
			}
			stream.close();
		} catch (IOException e) {
		}
	}
	
	/**
	 * Create a file .c with a template.
	 * 
	 * @param f file of the new CFile to create
	 * @param monitor
	 * @throws CoreException
	 */
	static public void createCTemplate(IFile f, IProgressMonitor monitor) throws MindException, CoreException {
		MindProject p = get(f.getProject());
		if (p == null)
			throw new MindException("The project '"+f.getProject().getName()+"' isn't a mind project.");
		if (!f.getName().endsWith(".c"))
			throw new MindException("Bad extendsion for '"+f.getName()+"'");
		String cn = f.getName().substring(0, f.getName().length() - 2);
		if (cn.contains(".")) {
			throw new MindException("The component name '"+f.getName()+"' contains '.'.");
		}
		IPath mindItfPath = f.getFullPath();
		
		// search the goot root source for compute package
		for (MindRootSrc rs : p.getRootsrcs()) {
			IFolder rsContainer = getResource(rs);
			if (rsContainer.getFullPath().isPrefixOf(mindItfPath)) {
				StringBuilder qn = new StringBuilder();
				IPath packagePath = f.getParent().getFullPath().removeFirstSegments(rsContainer.getFullPath().segmentCount());
				for (String s : packagePath.segments()) {
					qn.append(s);
					qn.append('.');
				}
				qn.append(cn);
				createCTemplate(f.getParent(), cn, qn.toString(), monitor);
				return;
			}
		}
		throw new MindException("Cannot found the root source for '"+mindItfPath.toPortableString()+"'.");
		
	}
	
	static public void createITFTemplate(MindPackage adl, String qn, String componentName,
			IProgressMonitor monitor)
			throws CoreException {		
		createITFTemplate(MindIdeCore.getResource(adl), componentName, qn, monitor);
	}
	
	static public void createITFTemplate(IFile f, IProgressMonitor monitor) throws MindException, CoreException {
		MindProject p = get(f.getProject());
		if (p == null)
			throw new MindException("The project '"+f.getProject().getName()+"' isn't a mind project.");
		if (!f.getName().endsWith(".itf"))
			throw new MindException("Bad extendsion for '"+f.getName()+"'");
		String cn = f.getName().substring(0, f.getName().length() - 4);
		if (cn.contains(".")) {
			throw new MindException("The component name '"+f.getName()+"' contains '.'.");
		}
		IPath mindItfPath = f.getFullPath();
		
		// search the goot root source for compute package
		for (MindRootSrc rs : p.getRootsrcs()) {
			IFolder rsContainer = getResource(rs);
			if (rsContainer.getFullPath().isPrefixOf(mindItfPath)) {
				StringBuilder qn = new StringBuilder();
				IPath packagePath = f.getParent().getFullPath().removeFirstSegments(rsContainer.getFullPath().segmentCount());
				for (String s : packagePath.segments()) {
					qn.append(s);
					qn.append('.');
				}
				qn.append(cn);
				createITFTemplate(f.getParent(), cn, qn.toString(), monitor);
				return;
			}
		}
		throw new MindException("Cannot found the root source for '"+mindItfPath.toPortableString()+"'.");
		
	}
	
	/**
	 * Create a file .itf with a template.
	 * 
	 * @param container where put the file itf
	 * @param componentName the componant of the adl or the name of file itf
	 * @param qn reference to qualified name of the component
	 * @param monitor
	 * @throws CoreException
	 */
	static public void createITFTemplate(IContainer container, String componentName, String qn,
			IProgressMonitor monitor)
			throws CoreException {
		String cfileName = componentName.substring(0, 1).toLowerCase()
				+ componentName.substring(1);
		final IFile cfile = container.getFile(new Path(cfileName + ".itf")); //$NON-NLS-1$
		try {
			InputStream stream = openITFContentStream(qn);
			if (cfile.exists()) {
				//file.setContents(stream, true, true, monitor);
			} else {
				cfile.create(stream, true, monitor);
			}
			stream.close();
		} catch (IOException e) {
		}
	}
	
	static private InputStream openCContentStream(String qn) {
		return new ByteArrayInputStream(new TemplatePrimitiveC().generate(qn).getBytes());
	}
	
	static private InputStream openITFContentStream(String qn) {
		return new ByteArrayInputStream(new TemplateITFADL().generate(qn).getBytes());
	}
/*	
	static private InputStream openADLContentStream(String qn) {
		return new ByteArrayInputStream(new TemplateTypeADL().generate(qn).getBytes());
	}
*/
	public static void rebuidAll() {
		List<MindProject> projects = getModel().getAllProject();
		for (MindProject mp : projects) {
			rebuild(mp);
		}
		
	}

	public static void rebuild(MindProject mp) {
		IProject p = mp.getProject();
		try {
			p.touch(null);
		} catch (CoreException e) {
		}
	}
	
	static public void createADL(IFile f, IProgressMonitor monitor) throws MindException, CoreException {
		
		MindProject p = get(f.getProject());
		if (p == null)
			throw new MindException("The project '"+f.getProject().getName()+"' isn't a mind project.");
		if (!f.getName().endsWith(".adl"))
			throw new MindException("Bad extendsion for '"+f.getName()+"'");
		String cn = f.getName().substring(0, f.getName().length() - 4);
		if (cn.contains(".")) {
			throw new MindException("The component name '"+f.getName()+"' contains '.'.");
		}
		IPath mindItfPath = f.getFullPath();
		
		// search the goot root source for compute package
		for (MindRootSrc rs : p.getRootsrcs()) {
			IFolder rsContainer = getResource(rs);
			if (rsContainer.getFullPath().isPrefixOf(mindItfPath)) {
				StringBuilder qn = new StringBuilder();
				IPath packagePath = f.getParent().getFullPath().removeFirstSegments(rsContainer.getFullPath().segmentCount());
				for (int i = 0 ; i<packagePath.segments().length; i++) {
					if(i != 0)
						qn.append('.');
					qn.append(packagePath.segments()[i]);
				}
				createADL(rsContainer, cn, qn.toString(), monitor, ComponentKind.PRIMITIVE);
				return;
			}
		}
		throw new MindException("Cannot found the root source for '"+mindItfPath.toPortableString()+"'.");
	
	}
	
static public void createADL(IFile f, IProgressMonitor monitor, ComponentKind kind) throws MindException, CoreException {
		
		MindProject p = get(f.getProject());
		if (p == null)
			throw new MindException("The project '"+f.getProject().getName()+"' isn't a mind project.");
		if (!f.getName().endsWith(".adl"))
			throw new MindException("Bad extendsion for '"+f.getName()+"'");
		String cn = f.getName().substring(0, f.getName().length() - 4);
		if (cn.contains(".")) {
			throw new MindException("The component name '"+f.getName()+"' contains '.'.");
		}
		IPath mindItfPath = f.getFullPath();
		
		// search the goot root source for compute package
		for (MindRootSrc rs : p.getRootsrcs()) {
			IFolder rsContainer = getResource(rs);
			if (rsContainer.getFullPath().isPrefixOf(mindItfPath)) {
				StringBuilder qn = new StringBuilder();
				IPath packagePath = f.getParent().getFullPath().removeFirstSegments(rsContainer.getFullPath().segmentCount());
				for (int i = 0 ; i<packagePath.segments().length; i++) {
					if(i != 0)
						qn.append('.');
					qn.append(packagePath.segments()[i]);
				}
				createADL(rsContainer, cn, qn.toString(), monitor, kind);
				return;
			}
		}
		throw new MindException("Cannot found the root source for '"+mindItfPath.toPortableString()+"'.");
	
	}
	
	
	static public void createADL(IContainer resource,
			String componentName,
			String packageName,
			 IProgressMonitor monitor, ComponentKind kind)
			throws CoreException {

		MindRootSrc rs = getModel().findOrCreateRootSrc((IContainer) resource);
		MindPackage p = getModel().findOrCreatePackage(rs, packageName);
		IContainer container = MindIdeCore.getResource(p);
		create(container, monitor);
		MindAdl adl = MindideFactory.eINSTANCE.createMindAdl();
		final IFile file = resource.getFile(new Path(packageName + "/" + componentName+".adl")); //$NON-NLS-1$
		adl.setFullpath(file.getFullPath().toPortableString());

		if (packageName.length() != 0)
			adl.setQualifiedName(packageName+"."+componentName);
		else
			adl.setQualifiedName(componentName); 
		adl.setName(componentName);
		adl.setKind(kind);
		adl.setPackage(p);
		if (kind == ComponentKind.PRIMITIVE) {
			MindIdeCore.createCTemplate(container, 
					componentName, adl.getQualifiedName(), monitor);
		}
		
		InputStream stream = openContentStream(adl);
		if (file.exists()) {
			//file.setContents(stream, true, true, monitor);
		} else {
			file.create(stream, true, monitor);
		}
	}
	
	private static InputStream openContentStream(MindAdl a) {
		
		String contents = ""; //$NON-NLS-1$
		
		switch (a.getKind()) {
		case PRIMITIVE:
			contents = new TemplatePrimitiveADL().generate(a);
			break;
		case TYPE:
			contents = new TemplateTypeADL().generate(a);
			break;
		case COMPOSITE:
			contents = new TemplateCompositeADL().generate(a);
			break;

		default:
			break;
		}
			
		return new ByteArrayInputStream(contents.getBytes());
	}

}
