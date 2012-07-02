package org.ow2.mindEd.ide.ui.wizards;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
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
import org.ow2.mindEd.ide.core.impl.MindPathEntryCustomImpl;
import org.ow2.mindEd.ide.model.MindObject;
import org.ow2.mindEd.ide.model.MindPackage;
import org.ow2.mindEd.ide.model.MindPathEntry;
import org.ow2.mindEd.ide.model.MindPathKind;
import org.ow2.mindEd.ide.model.MindProject;
import org.ow2.mindEd.ide.model.MindRootSrc;
import org.ow2.mindEd.ide.ui.Activator;
import org.ow2.mindEd.ide.ui.navigator.MindLabelProvider;


/**
 * The "Mind package" wizard page allows setting the container for the new package as well
 * as the source folder, package name.
 */

public class MindExportLibMPEWizardPage extends WizardPage implements PageUdapteStatus {
	
	static class MPEExptor extends MindPathEntryCustomImpl {
		boolean _useImport;
		String _libName;
		public MPEExptor(MindPathEntry clone) {
			super(clone);
			this.resolvedBy = clone.getResolvedBy();
			_useImport = true;
		}		
	}
	
	static class MPELabelProvider extends MindLabelProvider implements ITableLabelProvider {
		// We use icons
		// We use icons
		private static final Image CHECKED = Activator.getImageDescriptor(
				"icons/checked.gif").createImage();
		private static final Image UNCHECKED = Activator.getImageDescriptor(
						"icons/unchecked.gif").createImage();

		@Override
		public Image getColumnImage(Object element, int columnIndex) {
			// In case you don't like image just return null here
			if (columnIndex == 3) {
				if (((MPEExptor) element)._useImport) {
					return CHECKED;
				} else {
					return UNCHECKED;
				}
			}
			return null;
		}

		@Override
		public String getColumnText(Object element, int columnIndex) {
			MPEExptor mpe = (MPEExptor) element;
			switch (columnIndex) {
			case 0:
				return mpe.getName();
			case 1:
				return mpe._libName;
			case 2:
				return String.valueOf(mpe._useImport);
			default:
				throw new RuntimeException("Should not happen");
			}

		}

	}
	private ISelection _selection;
	//private ComposedAdapterFactory _adapterFactory;
	//private AdapterFactoryLabelProvider _renderer;
	private Text _nameText;
	private TableViewer _projectsTableViewer;
	private IPath _resultPath;
	private Object[] _projects;
	private BasicEList<MindPathEntry> mpesLib = new BasicEList<MindPathEntry>();
	private MindProject[] _mindProjects;

	public MindExportLibMPEWizardPage() {
		super("wizardPage"); //$NON-NLS-1$
		setTitle("Export resolve project dencencies");
		setDescription("Export resolve project dencencies");
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
	
	// This will create the columns for the table
	private void createColumns(TableViewer viewer) {

		String[] titles = { "Project name", "Lib name", "Transform into import package"};
		int[] bounds = { 100, 100, 100 };

		for (int i = 0; i < titles.length; i++) {
			TableViewerColumn column = new TableViewerColumn(viewer, SWT.NONE);
			column.getColumn().setText(titles[i]);
			column.getColumn().setWidth(bounds[i]);
			column.getColumn().setResizable(true);
			column.getColumn().setMoveable(true);
		}
		Table table = viewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
	}
	
	public void setMindProjects(MindProject ...mindProjects) {
		_mindProjects = mindProjects;
		Map<String, MindProject> mapsName = new HashMap<String, MindProject>();
		for (MindProject mp : _mindProjects) {
			mapsName.put(mp.getName(), mp);
		}
		mpesLib.clear() ;
		for (MindProject mp : _mindProjects) {
			EList<MindPathEntry> mpes = mp.getMindpathentries();
			for (MindPathEntry mpe : mpes) {
				MindObject resObj = mpe.getResolvedBy();
				if (resObj instanceof MindPackage) {
					resObj = ((MindPackage)resObj).getRootsrc().getProject();
				}
				if (mapsName.containsKey(resObj)) {
					continue;
				}
				if(mpe.getEntryKind() == MindPathKind.SOURCE)
					continue;
				
				MindPathEntryCustomImpl mpeClone = new MindPathEntryCustomImpl(mpe);
				mpesLib.add(mpeClone);
			}
		}
			
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

		
		Label label = new Label(container, SWT.NULL);
		label.setText("Mind path:");
		gd = new GridData(GridData.BEGINNING);
		gd.horizontalSpan = 3;
		label.setLayoutData(gd);
		
		Table table= new Table(container, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.FULL_SELECTION);
		gd = new GridData(GridData.FILL_BOTH);
		gd.horizontalSpan = 3;
		table.setLayoutData(gd);
		_projectsTableViewer= new TableViewer(table);
		createColumns(_projectsTableViewer);
		_projectsTableViewer.setContentProvider(new ArrayContentProvider());
		_projectsTableViewer.setLabelProvider(new MPELabelProvider());
		_projectsTableViewer.setInput(mpesLib);
		
		initialize();
		dialogChanged();
		setControl(container);
	}

	private void initialize() {}

	
	
	/**
	 * Ensures that all fields are valide.
	 */

	public void dialogChanged() {
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

	public EList<MindPathEntry> getMindPath() {
		return mpesLib;
	}

	
}