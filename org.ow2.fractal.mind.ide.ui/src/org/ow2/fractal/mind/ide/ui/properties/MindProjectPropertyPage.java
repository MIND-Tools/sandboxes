package org.ow2.fractal.mind.ide.ui.properties;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.PropertyPage;
import org.ow2.fractal.mind.ide.MindIdeCore;
import org.ow2.fractal.mind.ide.MindModelManager;
import org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry;
import org.ow2.fractal.mind.ide.emf.mindide.MindProject;

/**
 * Property page for mind project to manage mind path entries.
 *
 */
public class MindProjectPropertyPage extends PropertyPage implements MindPathEntryViewer {
	
	

	
	private static final String NAME_TITLE = "Name:";
	private static final String MIND_PATH = "&Mind path:";


	
	
	private MindMPETreeViewer _mindMPETreeViever;
	MindProject _mindproject;
	/**
	 * Constructor for SamplePropertyPage.
	 */
	public MindProjectPropertyPage() {
		super();
	}
	
	@Override
	public void setElement(IAdaptable element) {
		super.setElement(element);
		MindIdeCore.get(null);
		_mindproject = (MindProject) element.getAdapter(MindProject.class );
		
	}

	private void addFirstSection(Composite parent) {
		Composite composite = createDefaultComposite(parent,3);

		//Label for path field
		Label pathLabel = new Label(composite, SWT.NONE);
		pathLabel.setText(NAME_TITLE);

		// Path text field
		Text pathValueText = new Text(composite, SWT.WRAP | SWT.READ_ONLY);
		pathValueText.setText(((IResource) getElement()).getName());
	}

	private void addSeparator(Composite parent) {
		Label separator = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData gridData = new GridData();
		gridData.horizontalAlignment = GridData.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalSpan = 3;
		separator.setLayoutData(gridData);
	}

	private void addSecondSection(Composite parent) {
		Composite composite = createDefaultComposite(parent,3);

		// Label for owner field
		Label ownerLabel = new Label(composite, SWT.NONE);
		ownerLabel.setText(MIND_PATH);
		GridData gridData = new GridData();
		gridData.horizontalAlignment = GridData.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalSpan = 3;
		ownerLabel.setLayoutData(gridData);
		// Owner text field
		_mindMPETreeViever = new MindMPETreeViewer(parent, _mindproject, _mindproject == null ? null : _mindproject.getRawMinpath());
		_mindMPETreeViever.addListener(this);
	}

	/**
	 * @see PreferencePage#createContents(Composite)
	 */
	@Override
	protected Control createContents(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		composite.setLayout(layout);
		GridData data = new GridData(GridData.FILL);
		data.grabExcessHorizontalSpace = true;
		composite.setLayoutData(data);

		addFirstSection(composite);
		if (_mindproject != null) {
			addSeparator(composite);
			addSecondSection(composite);
		}
		return composite;
	}

	public static Composite createDefaultComposite(Composite parent, int col) {
		Composite composite = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		layout.numColumns = col;
		composite.setLayout(layout);

		GridData data = new GridData();
		data.verticalAlignment = GridData.FILL;
		data.horizontalAlignment = GridData.FILL;
		composite.setLayoutData(data);

		return composite;
	}

	@Override
	protected void performDefaults() {
		
	}
	
	@Override
	protected void performApply() {
		super.performApply();
		validate();
	}
	
	@Override
	public boolean performOk() {
		if (_mindproject != null)
			_mindproject.setMindpath(this._mindMPETreeViever.getModel());
		return true;
	}

	public void addMindPathEntry(MindPathEntry mpe) {
		validate();
	}

	private void validate() {
		IStatus status = MindModelManager.getMindModelManager().getMindModel().validate(this._mindproject, this._mindMPETreeViever.getModel());
		setMessage(status);
	}

	public void removeMindPathEntry(MindPathEntry mpe) {
		validate();
	}

	public void updateMindPathEntry(MindPathEntry mpe) {
		validate();
	}

	private void setMessage(IStatus status) {
		if (status == Status.OK_STATUS) {
			setMessage(null, ERROR);
			setErrorMessage(null);
			return;
		}
		if (status == null)
			return;
		if (status.isMultiStatus()) {
			IStatus w = null;
			for (IStatus s : status.getChildren()) {
				if (s.getSeverity() == IStatus.ERROR) {
					setMessage(s);
					return;
				}
				s = w;
			}
			if (w != null)
				setMessage(w);
			return;
		}
		if (status.getSeverity() == IStatus.ERROR)
			setErrorMessage(status.getMessage());
		else 
			setMessage(status.getMessage(), WARNING);
	}

}