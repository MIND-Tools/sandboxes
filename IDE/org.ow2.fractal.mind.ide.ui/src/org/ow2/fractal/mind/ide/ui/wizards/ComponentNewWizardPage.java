package org.ow2.fractal.mind.ide.ui.wizards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.ow2.fractal.mind.ide.MindIdeCore;
import org.ow2.fractal.mind.ide.MindModel;
import org.ow2.fractal.mind.ide.emf.edit.custom.MindideItemProviderCustomAdapterFactory;
import org.ow2.fractal.mind.ide.emf.mindide.ComponentKind;
import org.ow2.fractal.mind.ide.emf.mindide.MindAdl;
import org.ow2.fractal.mind.ide.emf.mindide.MindObject;
import org.ow2.fractal.mind.ide.emf.mindide.MindPackage;
import org.ow2.fractal.mind.ide.emf.mindide.MindProject;
import org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc;
import org.ow2.fractal.mind.ide.emf.mindide.MindideFactory;


/**
 * The "Mind ADL Component" wizard page allows setting the container for the new adl as well
 * as the source folder, package name and component name.
 */

public class ComponentNewWizardPage extends WizardPage implements PageUdapteStatus {
	private SourceFolderField _sourceFolderField;
	private Text _packageText;
	private Text _componentNameText;
	
	private ISelection _selection;
	
	private ComposedAdapterFactory _adapterFactory;
	private AdapterFactoryLabelProvider _renderer;
	private MindModel _model;
	protected MindPackage _package;
	private ComboViewer _kind_viewer;
	
	public ComponentNewWizardPage(MindModel model, ISelection selection) {
		super("wizardPage");
		setTitle(Messages.ComponentNewWizardPage_title);
		setDescription(Messages.ComponentNewWizardPage_description);
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
		_packageText.setLayoutData(gd);
		_packageText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				String pn = _packageText.getText();
				if (_package != null && _packageText.equals(_package.getName()))
					return;
				_package = getOrCreatePackageFromString(_sourceFolderField.getSourceFolder(), pn);
				dialogChanged();
			}
		});

		Button button = new Button(container, SWT.PUSH);
		button.setText(Messages.ComponentNewWizardPage_package_field_browser);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				_package = handleSelect(getPackageFrom(_sourceFolderField.getSourceFolder()), Messages.ComponentNewWizardPage_package_field_package_title, _packageText);
			}
		});
		
		////
		label = new Label(container, SWT.NULL);
		label.setText(Messages.ComponentNewWizardPage_component_field_label);

		_componentNameText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		_componentNameText.setLayoutData(gd);
		_componentNameText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		_componentNameText.setLayoutData(gd);
		
		label = new Label(container, SWT.NULL);
		label.setText(Messages.ComponentNewWizardPage_kind_field_label);

		initialize();
		
		CCombo kindCombo = new CCombo(container, SWT.BORDER);
		_kind_viewer = new ComboViewer(kindCombo);
		_kind_viewer.setLabelProvider(_renderer);
		_kind_viewer.setContentProvider(ArrayContentProvider.getInstance());
		ArrayList<ComponentKind> qq = new ArrayList<ComponentKind>(ComponentKind.VALUES);
		qq.remove(0);
		_kind_viewer.setInput(qq);
		_kind_viewer.setSelection(new StructuredSelection(ComponentKind.PRIMITIVE), true);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		kindCombo.setLayoutData(gd);
		
		
		
		dialogChanged();
		setControl(container);
	}

	protected MindPackage getOrCreatePackageFromString(MindRootSrc srcFolder, String pn) {
		for (MindPackage mp : srcFolder.getPackages()) {
			if (mp.getName().equals(pn))
				return mp;
		}
		MindPackage subpnPackage = MindideFactory.eINSTANCE.createMindPackage();
		subpnPackage.setName(pn);
		return subpnPackage;
	}

	protected List<MindPackage> getPackageFrom(MindRootSrc srcFolder) {
		Map<String, MindPackage> ret = new HashMap<String, MindPackage>();
		MindPackage subpnPackage = MindideFactory.eINSTANCE.createMindPackage();
		subpnPackage.setName("");
		ret.put("", subpnPackage);
		
		for (MindPackage mp : srcFolder.getPackages()) {
			ret.put(mp.getName(), mp);
			String pn = mp.getName();
			int index =-1;
			while (true) {
				index = pn.indexOf('.', index+1);
				if (index == -1)
					break;
				
				String subpn = pn.substring(0, index);
				if (ret.containsKey(subpn)) continue;
				subpnPackage = MindideFactory.eINSTANCE.createMindPackage();
				subpnPackage.setName(subpn);
				ret.put(subpn, subpnPackage);
			}
		}
		return new ArrayList<MindPackage>(ret.values());
	}

	private void initialize() {
		_componentNameText.setText("");
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
			_package = (MindPackage) obj;
			_sourceFolderField.init( ((MindPackage)obj).getRootsrc());
			_packageText.setText(_package.getName());
			_componentNameText.setFocus();
			return true;
		}
		else if (obj instanceof MindProject) {
			MindProject mp = (MindProject) obj;
			if (mp.getRootsrcs().size() !=0) {
				MindRootSrc srcFolder = mp.getRootsrcs().get(0);
				_sourceFolderField.init( srcFolder );
				if (srcFolder != null && srcFolder.getPackages().size() != 0) {
					_package = srcFolder.getPackages().get(0);
					if (_package != null) {
						_packageText.setText(_package.getName());
						_componentNameText.setFocus();
					}
				}		
			}
			return true;
		}
		else if (obj instanceof MindRootSrc) {
			MindRootSrc rs = (MindRootSrc) obj;
			_sourceFolderField.init(rs);
			if (rs.getPackages().size() != 0) {
				_package = rs.getPackages().get(0);
				if (_package != null) {
					_packageText.setText(_package.getName());
					_componentNameText.setFocus();
				}
			}
			return true;
		}
		return false;
	}
	
	/**
	 * Ensures that all fields are valid.
	 */
	public void dialogChanged() {
		String componantName = getComponentName();
		
		if (_sourceFolderField.dialogChanged(this))
			return;
		
		if (componantName.length() == 0) {
			updateStatus(Messages.ComponentNewWizardPage_error_msg_component_name_must_be_specified);
			return;
		}
		if (componantName.replace('\\', '/').indexOf('/', 1) > 0) {
			updateStatus(Messages.ComponentNewWizardPage_error_msg_component_name_must_be_valid);
			return;
		}
		
		if (componantName.indexOf('.', 1) > 0) {
			updateStatus(Messages.ComponentNewWizardPage_20);
			return;
		}
		
		MindAdl adl = _model.getAdl(_sourceFolderField.getSourceFolder().getProject(),
				getPackageName(), componantName);
		if (adl != null) {
			updateStatus("Component allready exits");
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

	public String getComponentName() {
		return _componentNameText.getText();
	}

	public String getPackageName() {
		return _package.getName();
	}
	
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
	
	public ComponentKind getComponentKind() {
		return (ComponentKind) ((IStructuredSelection) _kind_viewer.getSelection()).getFirstElement();
	}

	public void updateErrorStatus(String msg) {
		updateStatus(msg);
	}

}