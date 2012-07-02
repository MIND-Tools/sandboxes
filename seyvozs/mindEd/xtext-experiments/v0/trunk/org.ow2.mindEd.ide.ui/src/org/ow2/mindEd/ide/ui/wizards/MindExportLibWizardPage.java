package org.ow2.mindEd.ide.ui.wizards;

import java.io.File;
import java.util.ArrayList;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.ow2.mindEd.ide.core.MindIdeCore;
import org.ow2.mindEd.ide.model.MindObject;
import org.ow2.mindEd.ide.model.MindPackage;
import org.ow2.mindEd.ide.model.MindProject;
import org.ow2.mindEd.ide.model.MindRootSrc;
import org.ow2.mindEd.ide.ui.navigator.MindLabelProvider;


/**
 * The "Mind package" wizard page allows setting the container for the new package as well
 * as the source folder, package name.
 */

public class MindExportLibWizardPage extends WizardPage implements PageUdapteStatus {
	private ISelection _selection;
	//private ComposedAdapterFactory _adapterFactory;
	//private AdapterFactoryLabelProvider _renderer;
	private Text _nameText;
	private CheckboxTableViewer _projectsTableViewer;
	private IPath _resultPath;
	private Object[] _projects;

	public MindExportLibWizardPage() {
		super("wizardPage"); //$NON-NLS-1$
		setTitle("Export lib");
		setDescription("Export lib");
	}
	
	private File getFileFrom(IPath currPath, boolean mustAContainer) {
		if (currPath == null) {
			return null;
		}
		File file = currPath.toFile();
		IResource r = ResourcesPlugin.getWorkspace().getRoot().findMember(currPath);
		if (r != null && r.getLocation() != null) {
			file = r.getLocation().toFile();
		}
		if (mustAContainer && file != null && file.isFile()) {
			file = file.getParentFile();
		}
		return file;
	}
	
	public IPath selectExternalFile(Shell shell, String msg, IPath currPath) {

		File file = getFileFrom(currPath, true);

		FileDialog dialog = new FileDialog(shell);
		dialog.setText(msg);
		String[] fileFilter = new String[] {"*.mar"};
		if (fileFilter != null) {
		dialog.setFilterExtensions(fileFilter);
		}
		if (file != null) {
		dialog.setFilterPath(file.getAbsolutePath());
		}
		String res = dialog.open();
		if (res != null) {
		return Path.fromOSString(res).makeAbsolute();
		}
		return null;
		}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(final Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		
		GridData gd;
		//initializeEditingDomain();
		//// package
		
		Label label = new Label(container, SWT.NULL);
		label.setText("Library name:");

		_nameText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 1;
		_nameText.setLayoutData(gd);
		_nameText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		Button file = new Button(container, SWT.PUSH);
		file.setText("...");
		file.addSelectionListener(new SelectionListener() {			
		
			public void widgetSelected(SelectionEvent e) {
				_resultPath = selectExternalFile(parent.getShell(), "Select the archive file",_resultPath);
				_nameText.setText(_resultPath.toOSString());
				dialogChanged();
			}
			
			public void widgetDefaultSelected(SelectionEvent e) {				
			}
		});
		
		label = new Label(container, SWT.NULL);
		label.setText("Projects name:");
		gd = new GridData(GridData.BEGINNING);
		gd.horizontalSpan = 3;
		label.setLayoutData(gd);
		
		Table table= new Table(container, SWT.CHECK + SWT.BORDER);
		gd = new GridData(GridData.FILL_BOTH);
		gd.horizontalSpan = 3;
		table.setLayoutData(gd);
		_projectsTableViewer= new CheckboxTableViewer(table);

		_projectsTableViewer.setContentProvider(new ArrayContentProvider());
		_projectsTableViewer.setLabelProvider(new MindLabelProvider());
		_projectsTableViewer.setInput(MindIdeCore.getModel().getAllProject());
		_projectsTableViewer.addCheckStateListener(new ICheckStateListener() {
			public void checkStateChanged(CheckStateChangedEvent event) {
				dialogChanged();
			}			
		});
		initialize();
		dialogChanged();
		setControl(container);
	}

	private void initialize() {
		
		if (_selection != null && _selection.isEmpty() == false
				&& _selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) _selection;
			if (ssel.size() > 1)
				return;
			Object obj = ssel.getFirstElement();
			if (obj instanceof IResource) {
				IContainer container;
				if (obj instanceof IContainer)
					container = (IContainer) obj;
				else
					container = ((IResource) obj).getParent();
				MindObject mo = MindIdeCore.get(container);
				obj= mo;
			}
			if (initMind(obj))
				return;
			if (obj instanceof IAdaptable) {
				IAdaptable adapt = (IAdaptable) obj;
				MindObject mo = (MindObject) adapt.getAdapter(MindObject.class);
				if (mo == null) {
					IResource r = (IResource) adapt.getAdapter(IResource.class);
					if (r != null) {
						IContainer container;
						if (r instanceof IContainer)
							container = (IContainer) r;
						else
							container = (r).getParent();
						mo = MindIdeCore.get(container);
					}
				}
				initMind(mo);
			}
		}
	}

	private boolean initMind(Object obj) {
		if (obj instanceof MindPackage) {
			MindPackage mindpackage = (MindPackage) obj;
			_nameText.setText(mindpackage.getName());
			_nameText.setFocus();
			return true;
		}
		else if (obj instanceof MindProject) {
			MindProject mp = (MindProject) obj;
			if (mp.getRootsrcs().size() !=0) {
				MindRootSrc srcFolder = mp.getRootsrcs().get(0);
				if (srcFolder != null && srcFolder.getPackages().size() != 0) {
					MindPackage mindpackage = srcFolder.getPackages().get(0);
					if (mindpackage != null)
						_nameText.setText(mindpackage.getName());
				}
				_nameText.setFocus();
			}
			return true;
		}
		else if (obj instanceof MindRootSrc) {
			MindRootSrc rs = (MindRootSrc) obj;
			if (rs.getPackages().size() != 0) {
				MindPackage mindpackage = rs.getPackages().get(0);
				if (mindpackage != null)
					_nameText.setText(mindpackage.getName());
			}
			_nameText.setFocus();
			return true;
			
		}
		return false;		
	}

	
	/**
	 * Ensures that all fields are valide.
	 */

	public void dialogChanged() {
		String packageName = getName();
		_resultPath = new Path(packageName);
		
		if (!"mar".equals(_resultPath.getFileExtension()))  {
			updateStatus("Enter a path of archive file ending with '.mar'");
			return;
		}
		
		_projects = _projectsTableViewer.getCheckedElements();
		if (_projects == null || _projects.length == 0) {
			updateStatus("Selecting at least one project");
			return;
		}
		
		updateStatus(null);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	public String getName() {
		return _nameText.getText();
	}
	
	public void updateErrorStatus(String msg) {
		updateStatus(msg);
	}

	public MindProject[] getMindProjects() {
		ArrayList<MindProject> ret = new ArrayList<MindProject>();
		if (_projects != null)
		for (Object o : _projects) {
			if (o instanceof MindProject)
				ret.add((MindProject) o);
		}
		return (MindProject[]) ret.toArray(new MindProject[ret.size()]);
	}

	public String getDestinationPath() {
		return _resultPath.toOSString();
	}

}