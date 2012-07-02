package org.ow2.mindEd.ide.ui.properties;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.actions.ActionContext;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.ow2.mindEd.ide.core.MindIdeCore;
import org.ow2.mindEd.ide.core.MindModelManager;
import org.ow2.mindEd.ide.model.MindAdl;
import org.ow2.mindEd.ide.model.MindPackage;
import org.ow2.mindEd.ide.model.MindPathEntry;
import org.ow2.mindEd.ide.model.MindPathKind;
import org.ow2.mindEd.ide.model.MindProject;
import org.ow2.mindEd.ide.model.MindideFactory;
import org.ow2.mindEd.ide.model.MindidePackage;
import org.ow2.mindEd.ide.ui.actions.MPEActionGroup;
import org.ow2.mindEd.ide.ui.util.ExtendedModel;

/**
 * 
 * Mind path entry tree viewer for the property page.
 *
 */
public class MindMPETreeViewer implements ExtendedModel, MpeMindPathModel {
	
	/**
	 * @param parent
 * @param mindpathentries 
	 */
	public MindMPETreeViewer(Composite parent, MindProject project, EList<MindPathEntry> mindpathentries) {
		this._mindpathentries = mindpathentries;
		this.addChildControls(parent);
		_project = project;
	}

	//	private Shell shell;
	private TreeViewer _treeviewer;
	
	private EList<MindPathEntry> _mindpathentries;
	private Set<MindPathEntryViewer> _changeListeners = new HashSet<MindPathEntryViewer>();
	MindProject _project;
	
	private IAction _editAction = new Action("edit", null) {
		@Override
		public void run() {
			edit(getSelection());		
		}
		
	};
	
	MPEActionGroup _mpeActionGroup;
	
	

	/**
	 * Create a new shell, add the widgets, open the shell
	 * @return the shell that was created	 
	 */
	private void addChildControls(Composite composite) {

		// Create a composite to hold the children
		GridData gridData = new GridData (GridData.HORIZONTAL_ALIGN_FILL | GridData.FILL_BOTH);
		composite.setLayoutData (gridData);

		// Set numColumns to 3 for the buttons 
		GridLayout layout = new GridLayout(3, false);
		layout.marginWidth = 4;
		composite.setLayout (layout);

		// Create the table 
		
		// Create and setup the TableViewer
		_treeviewer = new TreeViewer(composite, SWT.BORDER | SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		_treeviewer.setUseHashlookup(false);
		

		_treeviewer.setContentProvider(new MindMPEContentProvider());
		_treeviewer.setLabelProvider(new MindMPELabelProvider());
		// The input for the table viewer is the instance of ExampleTaskList
		_treeviewer.setInput(_mindpathentries);
		_treeviewer.addDoubleClickListener(new DblClickListener());

		hookContextMenu();
		_treeviewer.getControl().setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.FILL_BOTH));

		
	}

	
	protected MindProject getProject() {
		return _project;
	}


	protected void fillContextMenu(IMenuManager manager) {
		_mpeActionGroup = new MPEActionGroup(getShell(), getProject(), this);
		_mpeActionGroup.setContext(new ActionContext(_treeviewer.getSelection()));
		_mpeActionGroup.fillContextMenu(manager);
	}
	
	public static void createOrEditApplication(Shell shell, MindProject p, MindPathEntry mpe, MpeMindPathModel model) {
		ApplicationWizardPage dialog = new ApplicationWizardPage(p, mpe, shell);
		dialog.setIgnoreCase(false);
		dialog.setAllowDuplicates(false);
		dialog.setMultipleSelection(false);
		dialog.setTitle("Application entry");
		
		ArrayList<MindAdl> packages = new ArrayList<MindAdl>(MindModelManager.getMindModelManager().getMindModel().getAllComponents(p));
		dialog.setElements(packages.toArray());
		if (dialog.open() == Window.OK) {
			MindAdl theAdl = (MindAdl) dialog.getFirstResult();
			if (theAdl != null) {
				if (mpe == null) {
					mpe = MindideFactory.eINSTANCE.createMindPathEntry();
					mpe.setEntryKind(MindPathKind.APPLI);
					mpe.setName(theAdl.getQualifiedName()+":"+dialog.getApplicationName());
					model.mpeAdded(mpe);
				} else {
					mpe.setName(theAdl.getQualifiedName()+":"+dialog.getApplicationName());
					model.mpeChanged(mpe);
				}
			}
		}
	}
	
	
	public static final void createOrEditImportPackage(Shell shell, MindProject project, MindPathEntry mpe, MpeMindPathModel model) {
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(shell, new PackageLabelProbider());
		dialog.setIgnoreCase(false);
		dialog.setAllowDuplicates(false);
		dialog.setMultipleSelection(false);
		dialog.setTitle("Import package entry");
		
		ArrayList<String> packages = new ArrayList<String>(MindModelManager.getMindModelManager().getMindModel().getAllPackages().keySet());
		for (MindPathEntry modelMPE : model.getEntries()) {
			if (modelMPE == mpe || modelMPE.getEntryKind() != MindPathKind.IMPORT_PACKAGE) {
				continue;
			}
			packages.remove(modelMPE.getName());
		}
		// remove my packages
		Map<String, MindPackage> myPackages = MindModelManager.getMindModelManager().getMindModel().getAllPackages(project);
		packages.removeAll(myPackages.keySet());
		
		if (mpe != null) {
			dialog.setInitialElementSelections(Collections.singletonList(mpe.getName()));
		}
		dialog.setElements(packages.toArray());
		if (dialog.open() == Window.OK) {
			String resultPackage = (String) dialog.getFirstResult();
			if (resultPackage != null) {
				if (mpe == null) {
					mpe = MindideFactory.eINSTANCE.createMindPathEntry();
					mpe.setEntryKind(MindPathKind.IMPORT_PACKAGE);
					mpe.setName(resultPackage);
					model.mpeAdded(mpe);
				} else {
					mpe.setName(resultPackage);
					model.mpeChanged(mpe);
				}
			}
		}
	}
	
	public static void createOrEditSourceFolder(Shell shell, MindProject project, MindPathEntry mpe, MpeMindPathModel model) {
		SourceEntryDialog dialog = new SourceEntryDialog(shell, project, mpe, model.getEntries());
		
		if (mpe != null) {
			Path path = new Path(mpe.getName());
			if (path.segmentCount()>1) {
				IFolder p = ResourcesPlugin.getWorkspace().getRoot().getFolder(
						path);
				if (p != null) {
					dialog.setInitialFocus(p);
				}
			}
		}
		if (dialog.open() == Window.OK) {
			IContainer p = (IContainer) dialog.getFirstResult();
			if (p != null) {
				if (mpe == null) {
					mpe = MindideFactory.eINSTANCE
							.createMindPathEntry();
					mpe.setEntryKind(MindPathKind.SOURCE);
					mpe.setName(p.getFullPath()
							.toPortableString());
					model.mpeAdded(mpe);
				} else {
					mpe.setName(p.getFullPath()
							.toPortableString());
					model.mpeChanged(mpe);
				}
			}
		}
	}
	
	
	public static void createOrEditProjectReference(Shell shell, MindProject project, MindPathEntry mpe, MpeMindPathModel model) {
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(shell, new MindMPELabelProvider());
		dialog.setIgnoreCase(false);
		dialog.setAllowDuplicates(false);
		dialog.setMultipleSelection(false);
		dialog.setTitle("Project entry");
		if (mpe != null) {
			IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(mpe.getName());
			if (p != null) {
				MindProject mp = MindIdeCore.get(p);
				if (mp != null) {
					dialog.setInitialElementSelections(Collections.singletonList(mp));
				}
			}
		}
		List<MindProject> allProject = MindModelManager.getMindModelManager().getMindModel().getAllProject();
		allProject.remove(project);
		for (MindPathEntry mpe2 : project.getMindpathentries()) {
			if (mpe2.getEntryKind() == MindPathKind.PROJECT && mpe2.getResolvedBy() != null)
				allProject.remove(mpe2.getResolvedBy());
		}
		dialog.setElements(allProject.toArray());
		if (dialog.open() == Window.OK) {
			MindProject p = (MindProject) dialog.getFirstResult();
			if (p != null) {
				if (mpe == null) {
					mpe = MindideFactory.eINSTANCE
							.createMindPathEntry();
					mpe.setEntryKind(MindPathKind.PROJECT);
					mpe.setName(p.getProject().getFullPath()
							.toPortableString());
					model.mpeAdded(mpe);
				} else {
					mpe.setName(p.getProject().getFullPath()
							.toPortableString());
					model.mpeChanged(mpe);
				}
			}
		}
	}
	
	private final class DblClickListener implements IDoubleClickListener {
		public void doubleClick(DoubleClickEvent event) {
			IStructuredSelection sel = (IStructuredSelection) event.getSelection();
			EObject obj = (EObject) sel.getFirstElement();
			if (obj != null)
				edit(obj);

		}
	}
	
	
	
	protected void hookContextMenu() {
		MenuManager manager = new MenuManager("#PopupMenu");
		manager.setRemoveAllWhenShown(true);

		manager.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager1) {
				MindMPETreeViewer.this.fillContextMenu(manager1);
			}

		});

		Menu menu = manager.createContextMenu(_treeviewer.getControl());
		_treeviewer.getControl().setMenu(menu);
		///getSite().registerContextMenu(manager, fTreeViewer);
	}

	public void edit(EObject obj) {
		if (obj.eClass() == MindidePackage.Literals.MIND_PATH_ENTRY) {
			MindPathEntry mpe = (MindPathEntry) obj;
			switch (mpe.getEntryKind()) {
			case PROJECT:
				createOrEditProjectReference(getShell(), _project, mpe, this);
				break;
			case IMPORT_PACKAGE:
				createOrEditImportPackage(getShell(), _project, mpe, this);
				break;
			case APPLI:
				createOrEditApplication(getShell(), _project, mpe, this);
				break;
			case SOURCE:
				createOrEditSourceFolder(getShell(), _project, mpe, this);
				break;
			default:
				break;
			}
		}
	}


	public Shell getShell() {
		return _treeviewer.getControl().getShell();
	}
	
	
	/**
	 * InnerClass that acts as a proxy for the ExampleTaskList 
	 * providing content for the Table. It implements the ITaskListViewer 
	 * interface since it must register changeListeners with the 
	 * ExampleTaskList 
	 */
	class MindMPEContentProvider implements IStructuredContentProvider, MindPathEntryViewer, ITreeContentProvider {
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
			if (newInput != null)
				_changeListeners.add(this);
			if (oldInput != null)
				_changeListeners.remove(this);
		}

		public void dispose() {
			_changeListeners.remove(this);
		}

		// Return the tasks as an array of Objects
		public Object[] getElements(Object parent) {
			return _mindpathentries.toArray();
		}		

		public void addMindPathEntry(MindPathEntry mpe) {
			_treeviewer.add(_mindpathentries, new MindPathEntry[]{ mpe });
		}

		public void removeMindPathEntry(MindPathEntry mpe) {
			_treeviewer.remove(mpe);
		}

		public void updateMindPathEntry(MindPathEntry mpe) {
			_treeviewer.update(mpe, null);	
		}

		public Object[] getChildren(Object parentElement) {
			return null;
		}

		public Object getParent(Object element) {
			return null;
		}

		public boolean hasChildren(Object element) {
			return false;
		}
	}
	
	


	/**
	 * @return currently selected item
	 */
	public MindPathEntry getSelection() {
		return (MindPathEntry) ((IStructuredSelection)_treeviewer.getSelection()).getFirstElement();
	}

	

	
	/* (non-Javadoc)
	 * @see org.ow2.mindEd.ide.ui.properties.MpeMindPathModel#mpeChanged(org.ow2.fratal.mind.ide.emf.mindide.MindPathEntry)
	 */
	public void mpeChanged(MindPathEntry mpe) {
		for (MindPathEntryViewer l : _changeListeners) {
			l.updateMindPathEntry(mpe);
		}
	}
	
	/* (non-Javadoc)
	 * @see org.ow2.mindEd.ide.ui.properties.MpeMindPathModel#mpeRemoved(org.ow2.fratal.mind.ide.emf.mindide.MindPathEntry)
	 */
	public void mpeRemoved(MindPathEntry mpe) {
		_mindpathentries.remove(mpe);
		for (MindPathEntryViewer l : _changeListeners) {
			l.removeMindPathEntry(mpe);
		}
	}

	public EList<MindPathEntry> getModel() {
		return _mindpathentries;
	}

	public void addListener(MindPathEntryViewer e) {
		_changeListeners.add(e);
	}

	/* (non-Javadoc)
	 * @see org.ow2.mindEd.ide.ui.properties.MpeMindPathModel#mpeAdded(org.ow2.fratal.mind.ide.emf.mindide.MindPathEntry)
	 */
	public void mpeAdded(MindPathEntry mpe) {
		_mindpathentries.add(mpe);
		for (MindPathEntryViewer l : _changeListeners) {
			l.addMindPathEntry(mpe);
		}
	}


	public void add(EObject obj) {
		mpeAdded((MindPathEntry) obj);
	}


	public void remove(EObject obj) {
		mpeRemoved((MindPathEntry) obj);
	}


	public void update(EObject obj) {
		mpeChanged((MindPathEntry) obj);
	}


	public List<MindPathEntry> getEntries() {
		return _mindpathentries;
	}

}