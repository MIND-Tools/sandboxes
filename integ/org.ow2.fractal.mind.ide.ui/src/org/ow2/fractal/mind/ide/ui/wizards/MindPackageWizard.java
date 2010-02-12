package org.ow2.fractal.mind.ide.ui.wizards;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.NLS;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.ow2.fractal.mind.ide.MindIdeCore;
import org.ow2.fractal.mind.ide.MindModel;
import org.ow2.fractal.mind.ide.ui.Activator;
import org.ow2.fratal.mind.ide.emf.mindide.MindPackage;
import org.ow2.fratal.mind.ide.emf.mindide.MindRootSrc;

public class MindPackageWizard extends Wizard implements INewWizard {
	private MindPackageWizardPage _page;
	private ISelection _selection;
	MindModel _model;
	
	public MindPackageWizard() {
		super();
		setNeedsProgressMonitor(true);
		_model = MindIdeCore.getModel();
	}

	@Override
	public void addPages() {
		_page = new MindPackageWizardPage(_model, _selection);
		addPage(_page);
	}
	
	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
	 */
	@Override
	public boolean performFinish() {
		final String containerName = _page.getSourceFolderName();
		final String packageName = _page.getPackageName();
		
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(containerName, packageName, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage()); 
			return false;
		}
		return true;
	}
	
	/**
	 * The worker method. It will find the container, create the
	 * file if missing or just replace its contents, and open
	 * the editor on the newly created file.
	 * @param packageName 
	 * @param kind 
	 */

	private void doFinish(
		String containerName,
		String packageName,
		 IProgressMonitor monitor)
		throws CoreException {
		// create a sample file
		monitor.beginTask(NLS.bind(Messages.MindPackageWizard_task , packageName), 2);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(containerName));
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throwCoreException(NLS.bind(Messages.error_container_does_not_exists, containerName));
		}
		MindRootSrc rs = _model.findOrCreateRootSrc((IContainer) resource);
		if (rs == null)
			throwCoreException(NLS.bind(Messages.error_cannot_find_or_create_source_folder, containerName));
		MindPackage p = _model.findOrCreatePackage(rs, packageName);
		if (p == null)
			throwCoreException(NLS.bind(Messages.error_cannot_find_or_create_package, packageName));
		monitor.worked(1);
		
		IContainer container = MindIdeCore.getResource(p);
		create(container, monitor);
		
		monitor.worked(1);
	}
	
	

	private void create(IContainer container, IProgressMonitor monitor) throws CoreException {
		Assert.isNotNull(container);
		if (container.exists()) return;
		create(container.getParent(), monitor);
		Assert.isTrue(container.getType() == IResource.FOLDER);
		((IFolder)container).create(false, true, monitor);
		
	}

	

	private void throwCoreException(String message) throws CoreException {
		IStatus status =
			new Status(IStatus.ERROR, Activator.PLUGIN_ID, IStatus.OK, message, null);
		throw new CoreException(status);
	}

	/**
	 * We will accept the selection in the workbench to see if
	 * we can initialize from it.
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this._selection = selection;
		setWindowTitle(Messages.MindPackageWizard_window_title);
	}

}
