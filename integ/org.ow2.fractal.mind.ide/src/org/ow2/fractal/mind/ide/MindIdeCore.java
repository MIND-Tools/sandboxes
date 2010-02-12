package org.ow2.fractal.mind.ide;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.cdt.core.CProjectNature;
import org.eclipse.cdt.core.model.CoreModel;
import org.eclipse.cdt.core.settings.model.COutputEntry;
import org.eclipse.cdt.core.settings.model.CSourceEntry;
import org.eclipse.cdt.core.settings.model.ICConfigurationDescription;
import org.eclipse.cdt.core.settings.model.ICOutputEntry;
import org.eclipse.cdt.core.settings.model.ICProjectDescription;
import org.eclipse.cdt.core.settings.model.ICProjectDescriptionManager;
import org.eclipse.cdt.core.settings.model.ICSettingEntry;
import org.eclipse.cdt.core.settings.model.ICSourceEntry;
import org.eclipse.cdt.managedbuilder.core.IBuilder;
import org.eclipse.cdt.managedbuilder.core.IManagedBuildInfo;
import org.eclipse.cdt.managedbuilder.core.ManagedBuildManager;
import org.eclipse.cdt.managedbuilder.internal.core.Configuration;
import org.eclipse.cdt.managedbuilder.internal.core.ManagedProject;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.ow2.fractal.mind.ide.template.TemplateMake;
import org.ow2.fratal.mind.ide.emf.mindide.MindAllRepo;
import org.ow2.fratal.mind.ide.emf.mindide.MindFile;
import org.ow2.fratal.mind.ide.emf.mindide.MindObject;
import org.ow2.fratal.mind.ide.emf.mindide.MindPackage;
import org.ow2.fratal.mind.ide.emf.mindide.MindPathEntry;
import org.ow2.fratal.mind.ide.emf.mindide.MindPathKind;
import org.ow2.fratal.mind.ide.emf.mindide.MindProject;
import org.ow2.fratal.mind.ide.emf.mindide.MindRepo;
import org.ow2.fratal.mind.ide.emf.mindide.MindRootSrc;
import org.ow2.fratal.mind.ide.emf.mindide.MindideFactory;
import org.ow2.fratal.mind.ide.emf.mindide.MindidePackage;

public class MindIdeCore {

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

	public static MindModel getModel() {
		return MindModelManager.getMindModelManager().getMindModel();
	}

	public static MindAllRepo getMindAllRepos() {
		return MindModelManager.getMindModelManager().getMindModel()
				.getMindRepository();
	}

	public static MindPathEntry newMPESource(IFolder src) {
		MindPathEntry ret = MindideFactory.eINSTANCE.createMindPathEntry();
		ret.setEntryKind(MindPathKind.SOURCE);
		ret.setName(src.getFullPath().toPortableString());
		return ret;
	}
	
	public static MindPathEntry newMPEAppli(String cn, String appliName) {
		MindPathEntry ret = MindideFactory.eINSTANCE.createMindPathEntry();
		ret.setEntryKind(MindPathKind.APPLI);
		ret.setName(cn+":"+appliName);
		return ret;
	}


	public static MindPathEntry newMPEProject(IProject p) {
		MindPathEntry ret = MindideFactory.eINSTANCE.createMindPathEntry();
		ret.setEntryKind(MindPathKind.PROJECT);
		ret.setName(p.getFullPath().toPortableString());
		return ret;
	}

	public static MindPathEntry newMPEImport(String qualifiedPackage) {
		MindPathEntry ret = MindideFactory.eINSTANCE.createMindPathEntry();
		ret.setEntryKind(MindPathKind.IMPORT_PACKAGE);
		ret.setName(qualifiedPackage);
		return ret;
	}

	public static MindProject createMINDProject(String name,
			IProgressMonitor monitor) throws CoreException,
			UnsupportedEncodingException {
		IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(name);
		p.create(monitor);
		p.open(monitor);
		initMindProject(p, monitor);
		return MindModelManager.getMindModelManager().getMindProject(p);
	}

	public static IFile getResource(MindFile obj) {
		IPath p = new Path(obj.getFullpath());
		return ResourcesPlugin.getWorkspace().getRoot().getFile(p);
	}

	public static IFolder getResource(MindPackage obj) {
		IPath p = new Path(obj.getFullpath());
		return ResourcesPlugin.getWorkspace().getRoot().getFolder(p);
	}

	public static IProject getResource(MindProject obj) {
		return obj.getProject();
	}

	public static IFolder getResource(MindRootSrc obj) {
		IPath p = new Path(obj.getFullpath());
		return ResourcesPlugin.getWorkspace().getRoot().getFolder(p);
	}

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
	 * Initialize a mind project
	 * 
	 * @param newProject
	 *            create project
	 * @param monitor
	 * @throws CoreException
	 * @throws UnsupportedEncodingException
	 */
	public static void initMindProject(IProject newProject,
			IProgressMonitor monitor) throws CoreException,
			UnsupportedEncodingException {
		// add nature
		CProjectNature.addNature(newProject, CProjectNature.C_NATURE_ID,
				monitor);
		CProjectNature.addNature(newProject, MindNature.NATURE_ID, monitor);

		// Create the default structure
		IFolder buildFolder = newProject.getFolder("build");
		if (!buildFolder.exists())
			buildFolder.create(true, true, monitor);
		IFolder srcFolder = newProject.getFolder("src");
		if (!srcFolder.exists())
			srcFolder.create(true, true, monitor);
		IFile makefile = newProject.getFile("Makefile");
		if (!makefile.exists())
			makefile.create(
				new ByteArrayInputStream(createMakeTemplate(newProject)), true,
				monitor);

		// Set CDT information
		ICProjectDescriptionManager mgr = CoreModel.getDefault()
				.getProjectDescriptionManager();
		ICProjectDescription des = mgr.getProjectDescription(newProject, true);

		// get default path and set it's
		try {
			MindModelManager.getMindModelManager().getMindModel().init(
					newProject);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (des != null)
			return; // C project description already exists

		des = mgr.createProjectDescription(newProject, true);

		IManagedBuildInfo info = ManagedBuildManager
				.createBuildInfo(newProject);

		ManagedProject mProj = new ManagedProject(des);
		info.setManagedProject(mProj);

		String id = ManagedBuildManager.calculateChildId(
				"org.ow2.fractal.mind.build", null);
		Configuration config = new Configuration(mProj, null, id, "Default");

		ICConfigurationDescription cfgDes = des.createConfiguration(
				ManagedBuildManager.CFG_DATA_PROVIDER_ID, config
						.getConfigurationData());
		config.setConfigurationDescription(cfgDes);
		config.exportArtifactInfo();

		IBuilder bld = config.getEditableBuilder();
		if (bld != null) {
			// It's make (not eclipse)
			bld.setManagedBuildOn(false);
			// The makefile is in the project root
			bld.setBuildPath("${workspace_loc:/" + newProject.getName() + "}");

			// the build directory ('build')
			ICOutputEntry buildEntry = new COutputEntry(buildFolder, null,
					ICSettingEntry.VALUE_WORKSPACE_PATH);
			bld.getBuildData().setOutputDirectories(
					new ICOutputEntry[] { buildEntry });
		}
		// the name of this configuration is Default
		config.setName("Default");
		config.setArtifactName(newProject.getName());

		// ADD the source entry 'src'
		createCSourceFolder(newProject, mgr, des, config);
		mgr.setProjectDescription(newProject, des);
	}

	private static void createCSourceFolder(IProject newProject,
			ICProjectDescriptionManager mgr, ICProjectDescription des,
			Configuration config) throws CoreException {
		ICSourceEntry srcEntry = new CSourceEntry(newProject.getFolder("src"),
				null, ICSettingEntry.VALUE_WORKSPACE_PATH);
		config.setSourceEntries(new ICSourceEntry[] { srcEntry });
		mgr.setProjectDescription(newProject, des);
	}

	/**
	 * The default template for makefile
	 * 
	 * @param newProject2
	 *            the project where put the make file
	 * @return The make file.
	 * @throws UnsupportedEncodingException
	 *             (Cannot find the default charset)
	 * @throws CoreException
	 *             (Cannot find the default charset)
	 */
	protected static byte[] createMakeTemplate(IProject newProject2)
			throws UnsupportedEncodingException, CoreException {
		return (new TemplateMake().generate(newProject2)).getBytes(newProject2
				.getDefaultCharset());
	}

	public static void log(Throwable e, String string) {
		Logger l = Logger.getLogger(MindModelManager.class.getCanonicalName());
		l.log(Level.SEVERE, string, e);
	}

	public static boolean exists(IResource f) {
		return f.exists();
	}

	/*
	 * Converts the given URI to a local file. Use the existing file if the uri
	 * is on the local file system. Otherwise fetch it. Returns null if unable
	 * to fetch it.
	 */
	public static File toLocalFile(URI uri, IProgressMonitor monitor)
			throws CoreException {
		IFileStore fileStore = EFS.getStore(uri);
		File localFile = fileStore.toLocalFile(EFS.NONE, monitor);
		if (localFile == null)
			// non local file system
			localFile = fileStore.toLocalFile(EFS.CACHE, monitor);
		return localFile;
	}

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

	public static void removeCSource(IFolder src) {
		// TODO Auto-generated method stub

	}


	
}
