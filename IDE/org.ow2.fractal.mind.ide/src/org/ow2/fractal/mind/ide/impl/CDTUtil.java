package org.ow2.fractal.mind.ide.impl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.cdt.core.CProjectNature;
import org.eclipse.cdt.core.envvar.IEnvironmentVariable;
import org.eclipse.cdt.core.model.CoreModel;
import org.eclipse.cdt.core.settings.model.COutputEntry;
import org.eclipse.cdt.core.settings.model.CSourceEntry;
import org.eclipse.cdt.core.settings.model.ICConfigurationDescription;
import org.eclipse.cdt.core.settings.model.ICOutputEntry;
import org.eclipse.cdt.core.settings.model.ICProjectDescription;
import org.eclipse.cdt.core.settings.model.ICProjectDescriptionManager;
import org.eclipse.cdt.core.settings.model.ICSettingEntry;
import org.eclipse.cdt.core.settings.model.ICSourceEntry;
import org.eclipse.cdt.core.settings.model.WriteAccessException;
import org.eclipse.cdt.core.settings.model.extension.CConfigurationData;
import org.eclipse.cdt.internal.core.envvar.EnvironmentVariableManager;
import org.eclipse.cdt.internal.core.envvar.UserDefinedEnvironmentSupplier;
import org.eclipse.cdt.managedbuilder.core.IBuilder;
import org.eclipse.cdt.managedbuilder.core.IManagedBuildInfo;
import org.eclipse.cdt.managedbuilder.core.ManagedBuildManager;
import org.eclipse.cdt.managedbuilder.internal.core.Configuration;
import org.eclipse.cdt.managedbuilder.internal.core.ManagedProject;
import org.eclipse.cdt.utils.envvar.StorableEnvironment;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.ow2.fractal.mind.ide.FamilyJobCST;
import org.ow2.fractal.mind.ide.MindActivator;
import org.ow2.fractal.mind.ide.MindModelManager;
import org.ow2.fractal.mind.ide.MindNature;
import org.ow2.fractal.mind.ide.template.TemplateMake;

public class CDTUtil {

	
	private static final class RemoveCSourceFolderJob extends Job {
		private final IFolder f;

		private RemoveCSourceFolderJob(IFolder f) {
			super("remove CSource folder "+f.getFullPath());
			this.f = f;
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) {
			try {
				if (MindModelImpl.TRACING)
					System.out.println("REMOVE? CSOURCE FOLDER " + f);
				final ICProjectDescriptionManager mgr = CoreModel
						.getDefault().getProjectDescriptionManager();
				final ICProjectDescription des = mgr.getProjectDescription(
						f.getProject(), true);
				if (des == null)
					return Status.OK_STATUS; // Not C project pas encore ou enlever

				ICConfigurationDescription config = des
						.getConfigurationByName("Default");
				ArrayList<ICSourceEntry> srcs = new ArrayList<ICSourceEntry>(
						Arrays.asList(config.getSourceEntries()));
				for (ICSourceEntry icSourceEntry : srcs) {
					if (!f.getProject().isOpen()
							|| !f.getProject().exists())
						return Status.OK_STATUS;
					if (icSourceEntry.getFullPath().equals(f.getFullPath())) {
						if (MindModelImpl.TRACING)
							System.out.println("REMOVING CSOURCE FOLDER "
									+ f);
						srcs.remove(icSourceEntry);
						config.setSourceEntries((ICSourceEntry[]) srcs
								.toArray(new ICSourceEntry[srcs.size()]));
						if (!f.getProject().exists())
							return Status.OK_STATUS;
						mgr.setProjectDescription(f.getProject(), des);
						if (MindModelImpl.TRACING)
							System.out
									.println("DONE REMOVE CSOURCE FOLDER "
											+ f);
						return Status.OK_STATUS;
					}
				}
			} catch (CoreException e) {
				return new Status(Status.ERROR,MindActivator.ID,getName(),e);
			}
			return Status.OK_STATUS;
		}
		
		@Override
		public boolean belongsTo(Object family) {
			return FamilyJobCST.FAMILY_ALL == family || FamilyJobCST.FAMILY_REMOVE_CSOURCE_FOLDER == family;
		}
	}

	private static final class CreateCSourceFolderJob extends Job {
		private final IFolder f;

		private CreateCSourceFolderJob(IFolder f) {
			super("Create CSource folder for "+f.getFullPath());
			this.f = f;
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) {
			try {
				if (MindModelImpl.TRACING)
					System.out.println("CREATE? CSOURCE FOLDER " + f);
				ICProjectDescriptionManager mgr = CoreModel.getDefault()
						.getProjectDescriptionManager();
				ICProjectDescription des = mgr.getProjectDescription(f
						.getProject(), true);
				if (des == null)
					return Status.OK_STATUS; // Not C project pas encore ou enlever
				ICSourceEntry srcEntry = new CSourceEntry(f, null,
						ICSettingEntry.VALUE_WORKSPACE_PATH);
				ICConfigurationDescription config = des
						.getConfigurationByName("Default");
				ArrayList<ICSourceEntry> srcs = new ArrayList<ICSourceEntry>(
						Arrays.asList(config.getSourceEntries()));
				for (ICSourceEntry icSourceEntry : srcs) {
					if (icSourceEntry.getFullPath().equals(f.getFullPath()))
						return Status.OK_STATUS;
				}
				if (MindModelImpl.TRACING)
					System.out.println("CREATING CSOURCE FOLDER " + f);
				srcs.add(srcEntry);
				config.setSourceEntries((ICSourceEntry[]) srcs
						.toArray(new ICSourceEntry[srcs.size()]));
				mgr.setProjectDescription(f.getProject(), des);
				if (MindModelImpl.TRACING)
					System.out.println("DONE CREATE CSOURCE FOLDER " + f);
			} catch (WriteAccessException e) {
				return new Status(Status.ERROR,MindActivator.ID,getName(),e);
			} catch (CoreException e) {
				return new Status(Status.ERROR,MindActivator.ID,getName(),e);
			}
			return Status.OK_STATUS;
		}
		
		@Override
		public boolean belongsTo(Object family) {
			return FamilyJobCST.FAMILY_ALL == family || FamilyJobCST.FAMILY_CREATE_CSOURCE_FOLDER == family;
		}
	}

	private static final class ChangeMindcLocation extends Job {
		private final String mindcLocation;

		private ChangeMindcLocation(String mindcLocation) {
			super("change the MINDC Location : create variable MIND_ROOT in CDT");
			this.mindcLocation = mindcLocation;
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) {
			try {
				if (MindModelImpl.TRACING)
					System.out.println("CHANGE MIND_ROOT to "
							+ mindcLocation);
				UserDefinedEnvironmentSupplier usersupplier = EnvironmentVariableManager.fUserSupplier;
				StorableEnvironment wsEnv = usersupplier
						.getWorkspaceEnvironmentCopy();
				IEnvironmentVariable var = wsEnv.getVariable(MIND_ROOT);
				if (var != null) {
					wsEnv.deleteVariable(MIND_ROOT);
				}
				wsEnv.createVariable(MIND_ROOT, mindcLocation);
				usersupplier.setWorkspaceEnvironment(wsEnv);
				if (MindModelImpl.TRACING)
					System.out.println("DONE CHANGE MIND_ROOT to "
							+ mindcLocation);

			} catch (WriteAccessException e) {
				return new Status(Status.ERROR,MindActivator.ID,getName(),e);
			}
			return Status.OK_STATUS;
		}
		

		@Override
		public boolean belongsTo(Object family) {
			return FamilyJobCST.FAMILY_ALL == family || FamilyJobCST.FAMILY_CHANGE_MINDC_LOCATION == family;
		}
	}

	private static final String MIND_ROOT = "MIND_ROOT";

	public static void createCSourceFolder(final IFolder f)
			throws CoreException {
		Job r = new CreateCSourceFolderJob(f);
		r.setRule(f.getWorkspace().getRoot());
		r.schedule();
	}

	public static void removeCSourceFolder(final IFolder f)
			throws CoreException {
		if (!f.getProject().isOpen() || !f.getProject().exists())
			return;

		Job r = new RemoveCSourceFolderJob(f);
		r.setRule(f.getWorkspace().getRoot());
		r.schedule();
	}

	public static void changeMINDCLocation(final String mindcLocation) {
		Job r = new ChangeMindcLocation(mindcLocation);
		r.setRule(ResourcesPlugin.getWorkspace().getRoot());
		r.schedule();
	}

	public static String getMINDCLocation() {
		UserDefinedEnvironmentSupplier usersupplier = EnvironmentVariableManager.fUserSupplier;
		StorableEnvironment wsEnv = usersupplier.getWorkspaceEnvironmentCopy();
		IEnvironmentVariable var = wsEnv.getVariable(MIND_ROOT);
		if (var != null) {
			return var.getValue();
		}
		return null;
	}

	/**
	 * Initialize a mind project. Do not call this method.
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
		
		// create first
		IFile makefile = newProject.getFile("Makefile");
		if (!makefile.exists())
			makefile.create(
				new ByteArrayInputStream(createMakeTemplate(newProject)), true,
				monitor);
		
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

		IManagedBuildInfo info = ManagedBuildManager.createBuildInfo(newProject);

		ManagedProject mProj = new ManagedProject(des);
		info.setManagedProject(mProj);
	
		String id = ManagedBuildManager.calculateChildId(
				"org.ow2.fractal.mind.build", null);
		Configuration config = new Configuration(mProj, null, id, "Default");

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
			bld.getBuildData();
		}
		// the name of this configuration is Default
		
		config.setName("Default");
		config.setArtifactName(newProject.getName());
		
		// ADD the source entry 'src'
		
		ICSourceEntry srcEntry = new CSourceEntry(newProject.getFolder("src"),
				null, ICSettingEntry.VALUE_WORKSPACE_PATH);
		config.setSourceEntries(new ICSourceEntry[] { srcEntry });
		config.exportArtifactInfo();
		
		CConfigurationData data = config.getConfigurationData();
		data.getBuildData();
		
		des.createConfiguration(ManagedBuildManager.CFG_DATA_PROVIDER_ID, data);
		
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
}
