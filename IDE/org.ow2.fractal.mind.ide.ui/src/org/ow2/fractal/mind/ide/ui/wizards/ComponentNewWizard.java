package org.ow2.fractal.mind.ide.ui.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.core.runtime.*;
import org.eclipse.jface.operation.*;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.osgi.util.NLS;
import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;

import java.io.*;

import org.eclipse.ui.*;
import org.ow2.fractal.mind.ide.MindIdeCore;
import org.ow2.fractal.mind.ide.MindModel;
import org.ow2.fractal.mind.ide.emf.mindide.ComponentKind;
import org.ow2.fractal.mind.ide.emf.mindide.MindAdl;
import org.ow2.fractal.mind.ide.emf.mindide.MindPackage;
import org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc;
import org.ow2.fractal.mind.ide.emf.mindide.MindideFactory;
import org.ow2.fractal.mind.ide.template.TemplateCompositeADL;
import org.ow2.fractal.mind.ide.template.TemplatePrimitiveADL;
import org.ow2.fractal.mind.ide.template.TemplatePrimitiveC;
import org.ow2.fractal.mind.ide.template.TemplateTypeADL;
import org.ow2.fractal.mind.ide.ui.Activator;
import org.ow2.fractal.mind.emf.diagram.custom.util.CustomMindDiagramEditorUtil;

/**
 * Create a Mind ADL Component wizard which has one page {@link ComponentNewWizardPage}.
 */

public class ComponentNewWizard extends Wizard implements INewWizard {
	private ComponentNewWizardPage _page;
	private ISelection _selection;
	MindModel _model;

	/**
	 * Constructor for ComponentNewWizard.
	 */
	public ComponentNewWizard() {
		super();
		setNeedsProgressMonitor(true);
		_model = MindIdeCore.getModel();
	}
	
	/**
	 * Adding the page to the wizard.
	 */

	@Override
	public void addPages() {
		_page = new ComponentNewWizardPage(_model, _selection);
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
		final String fileName = _page.getComponentName();
		final ComponentKind kind = _page.getComponentKind();
		
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(containerName, packageName, fileName, monitor, kind);
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
			MessageDialog.openError(getShell(), Messages.ComponentNewWizard_exception_error, realException.getMessage());
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
		String componentName,
		 IProgressMonitor monitor, ComponentKind kind)
		throws CoreException {
		// create a sample file
		monitor.beginTask(NLS.bind(Messages.ComponentNewWizard_create_adl, packageName+"."+componentName), 2); 
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(containerName));
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throwCoreException(NLS.bind(Messages.error_container_does_not_exists , containerName )); 
		}
		MindRootSrc rs = _model.findOrCreateRootSrc((IContainer) resource);
		if (rs == null)
			throwCoreException(NLS.bind(Messages.error_cannot_find_or_create_source_folder, containerName));
		MindPackage p = _model.findOrCreatePackage(rs, packageName);
		if (p == null)
			throwCoreException(NLS.bind(Messages.error_cannot_find_or_create_package, containerName));
		MindAdl adl = MindideFactory.eINSTANCE.createMindAdl();
		IContainer container = MindIdeCore.getResource(p);
		create(container, monitor);
		final IFile file = container.getFile(new Path(componentName+".adl")); //$NON-NLS-1$
		adl.setFullpath(file.getFullPath().toPortableString());
		if (packageName.length() != 0)
			adl.setQualifiedName(packageName+"."+componentName); //$NON-NLS-1$
		else
			adl.setQualifiedName(componentName); 
		adl.setName(componentName);
		adl.setKind(kind);
		adl.setPackage(p);
		if (kind == ComponentKind.PRIMITIVE) {
			String cfileName = componentName.substring(0, 1).toLowerCase()
					+ componentName.substring(1);
			final IFile cfile = container.getFile(new Path(cfileName + ".c")); //$NON-NLS-1$
			try {
				InputStream stream = openCContentStream(adl);
				if (cfile.exists()) {
					//file.setContents(stream, true, true, monitor);
				} else {
					cfile.create(stream, true, monitor);
				}
				stream.close();
			} catch (IOException e) {
			}
		}
		InputStream stream = openContentStream(adl);
		if (file.exists()) {
			//file.setContents(stream, true, true, monitor);
		} else {
			file.create(stream, true, monitor);
		}
//		// -- Debut modif Olivier Marot
		createDiagram(monitor, adl);
		// -- Fin modif Olivier Marot
		
		monitor.worked(1);
		monitor.setTaskName(Messages.ComponentNewWizard__opening_file);
		getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				Activator.openFile(file);
			}
		});
		monitor.worked(1);
	}

//	// -- Debut modif Olivier Marot
	static private void createDiagram(IProgressMonitor monitor, MindAdl adl) {
		monitor.setTaskName("Creating and opening diagram");
		URI modelURI = URI.createURI(adl.getFullpath());
		URI diagramURI = URI.createURI(adl.getFullpath()+MindIdeCore.DIAGRAM_EXT);
		CustomMindDiagramEditorUtil.initDiagram(diagramURI, modelURI, monitor);
		monitor.worked(1);
	}
	// -- Fin modif Olivier Marot
	
	private InputStream openCContentStream(MindAdl adl) {
		return new ByteArrayInputStream(new TemplatePrimitiveC().generate(adl).getBytes());
	}

	private void create(IContainer container, IProgressMonitor monitor) throws CoreException {
		Assert.isNotNull(container);
		if (container.exists()) return;
		create(container.getParent(), monitor);
		Assert.isTrue(container.getType() == IResource.FOLDER);
		((IFolder)container).create(false, true, monitor);
		
	}

	/**
	 * We will initialize file contents with a sample text.
	 * @param a 
	 */

	private InputStream openContentStream(MindAdl a) {
		
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
		setWindowTitle(Messages.ComponentNewWizard_window_title);
	}
}