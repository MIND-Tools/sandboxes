package org.ow2.mindEd.ide.ui.wizards;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.ow2.mindEd.ide.core.MindIdeCore;
import org.ow2.mindEd.ide.core.MindModel;

/**
 * Create a Mind package wizard which has one page {@link MindPackageWizardPage}.
 */
public class MindPackageWizard extends Wizard implements INewWizard {
	private MindPackageWizardPage _page;
	private ISelection _selection;
	private MindModel _model;
	
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
					MindIdeCore.createMindPackage(containerName, packageName, monitor);
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
	 * We will accept the selection in the workbench to see if
	 * we can initialize from it.
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this._selection = selection;
		setWindowTitle(Messages.MindPackageWizard_window_title);
	}

}
