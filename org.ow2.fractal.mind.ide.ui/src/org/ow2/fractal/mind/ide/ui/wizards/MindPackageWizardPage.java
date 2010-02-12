package org.ow2.fractal.mind.ide.ui.wizards;

import java.util.List;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.ow2.fractal.mind.ide.MindIdeCore;
import org.ow2.fractal.mind.ide.MindModel;
import org.ow2.fractal.mind.ide.emf.edit.custom.MindideItemProviderCustomAdapterFactory;
import org.ow2.fractal.mind.ide.emf.mindide.MindObject;
import org.ow2.fractal.mind.ide.emf.mindide.MindPackage;
import org.ow2.fractal.mind.ide.emf.mindide.MindProject;
import org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc;


/**
 * The "Mind package" wizard page allows setting the container for the new package as well
 * as the source folder, package name.
 */

public class MindPackageWizardPage extends WizardPage implements PageUdapteStatus {
	private ISelection _selection;
	private ComposedAdapterFactory _adapterFactory;
	private AdapterFactoryLabelProvider _renderer;
	private MindModel _model;
	private SourceFolderField _sourceFolderField;
	private Text _packageText;
	
	public MindPackageWizardPage(MindModel model, ISelection selection) {
		super("wizardPage"); //$NON-NLS-1$
		setTitle(Messages.MindPackageWizardPage_title);
		setDescription(Messages.MindPackageWizardPage_description);
		this._selection = selection;
		_model = model;
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		
		GridData gd;
		initializeEditingDomain();
		_sourceFolderField = new SourceFolderField(_model, _adapterFactory, _renderer);
		_sourceFolderField.createControl(container, this);
		//// package
		
		Label label = new Label(container, SWT.NULL);
		label.setText(Messages.ComponentNewWizardPage_package_field_label);

		_packageText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		_packageText.setLayoutData(gd);
		_packageText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
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
			_sourceFolderField.init( ((MindPackage)obj).getRootsrc());
			_packageText.setText(mindpackage.getName());
			_packageText.setFocus();
			return true;
		}
		else if (obj instanceof MindProject) {
			MindProject mp = (MindProject) obj;
			if (mp.getRootsrcs().size() !=0) {
				MindRootSrc srcFolder = mp.getRootsrcs().get(0);
				_sourceFolderField.init( srcFolder );
				if (srcFolder != null && srcFolder.getPackages().size() != 0) {
					MindPackage mindpackage = srcFolder.getPackages().get(0);
					if (mindpackage != null)
						_packageText.setText(mindpackage.getName());
				}
				_packageText.setFocus();
			}
			return true;
		}
		else if (obj instanceof MindRootSrc) {
			MindRootSrc rs = (MindRootSrc) obj;
			_sourceFolderField.init(rs);
			if (rs.getPackages().size() != 0) {
				MindPackage mindpackage = rs.getPackages().get(0);
				if (mindpackage != null)
					_packageText.setText(mindpackage.getName());
			}
			_packageText.setFocus();
			return true;
			
		}
		return false;		
	}

	
	/**
	 * Ensures that all fields are valide.
	 */

	public void dialogChanged() {
		String packageName = getPackageName();
		if (_sourceFolderField.dialogChanged(this))
			return;
		
		if (packageName.length() == 0) {
			updateStatus(Messages.MindPackageWizardPage_error_package_must_be_specified);
			return;
		}
		if (packageName.indexOf("..") > 0) { //$NON-NLS-1$
			updateStatus(Messages.MindPackageWizardPage_error_package_must_be_valid_contains_dot_dot);
			return;
		}
		if (packageName.indexOf(" ") > 0) { //$NON-NLS-1$
			updateStatus(Messages.MindPackageWizardPage_error_package_must_be_valid_contains_space);
			return;
		}
		if (packageName.startsWith(".")) { //$NON-NLS-1$
			updateStatus(Messages.MindPackageWizardPage_error_package_must_be_valid_starts_with_dot);
			return;
		}
		if (packageName.endsWith(".")) { //$NON-NLS-1$
			updateStatus(Messages.MindPackageWizardPage_error_package_must_be_valid_ends_with_dot);
			return;
		}
		
		updateStatus(null);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	public String getSourceFolderName() {
		return _sourceFolderField.getSourceFolderName();
	}

	public String getPackageName() {
		return _packageText.getText();
	}
	/**
	 * This sets up the editing domain for the model editor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void initializeEditingDomain() {
		// Create an adapter factory that yields item providers.
		//
		_adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		_adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		_adapterFactory.addAdapterFactory(new MindideItemProviderCustomAdapterFactory());
		_adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
		_renderer = new AdapterFactoryLabelProvider(_adapterFactory);
	}
	
	protected MindPackage handleSelect(List<MindPackage> input, String message, Text control) {
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(this._packageText.getShell(), _renderer);
		dialog.setElements(input.toArray());
		dialog.setMultipleSelection(false);
		dialog.setEmptyListMessage(message);
		if (dialog.open() == Window.OK) {
			MindPackage v = (MindPackage) dialog.getFirstResult();
			control.setText(_renderer.getText(v));
			return v;
		}
		return null;
	}
	
	public void updateErrorStatus(String msg) {
		updateStatus(msg);
	}

}