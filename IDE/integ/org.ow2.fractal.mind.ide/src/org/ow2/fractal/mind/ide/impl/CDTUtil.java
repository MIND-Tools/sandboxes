package org.ow2.fractal.mind.ide.impl;

import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.cdt.core.envvar.IEnvironmentVariable;
import org.eclipse.cdt.core.model.CoreModel;
import org.eclipse.cdt.core.settings.model.CSourceEntry;
import org.eclipse.cdt.core.settings.model.ICConfigurationDescription;
import org.eclipse.cdt.core.settings.model.ICProjectDescription;
import org.eclipse.cdt.core.settings.model.ICProjectDescriptionManager;
import org.eclipse.cdt.core.settings.model.ICSettingEntry;
import org.eclipse.cdt.core.settings.model.ICSourceEntry;
import org.eclipse.cdt.core.settings.model.WriteAccessException;
import org.eclipse.cdt.internal.core.envvar.EnvironmentVariableManager;
import org.eclipse.cdt.internal.core.envvar.UserDefinedEnvironmentSupplier;
import org.eclipse.cdt.utils.envvar.StorableEnvironment;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.ow2.fractal.mind.ide.FamilyJobCST;
import org.ow2.fractal.mind.ide.MindActivator;

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
		r.schedule();
	}

	public static void removeCSourceFolder(final IFolder f)
			throws CoreException {
		if (!f.getProject().isOpen() || !f.getProject().exists())
			return;

		Job r = new RemoveCSourceFolderJob(f);
		r.schedule();
	}

	public static void changeMINDCLocation(final String mindcLocation) {
		Job r = new ChangeMindcLocation(mindcLocation);
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

	
}
