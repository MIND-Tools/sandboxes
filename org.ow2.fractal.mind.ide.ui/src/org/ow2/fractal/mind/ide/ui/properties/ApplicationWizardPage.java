package org.ow2.fractal.mind.ide.ui.properties;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.ow2.fractal.mind.ide.emf.mindide.MindAdl;
import org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry;
import org.ow2.fractal.mind.ide.emf.mindide.MindProject;
import org.ow2.fractal.mind.ide.impl.UtilMindIde;

/**
 * It's a dialog for create an mind path entry of kind 'application'
 */
public class ApplicationWizardPage extends ElementListSelectionDialog implements
		ModifyListener {

	MindPathEntry _mpe;
	private Text _applicationNameText;
	String _nextApplicationName = null;
	private MindProject _mindproject;

	public ApplicationWizardPage(MindProject p, MindPathEntry mpe, Shell parent) {
		super(parent, new MindMPELabelProvider());
		this._mpe = mpe;
		this._mindproject = p;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		if (_mpe != null) {
			try {
				String[] appliInfo = UtilMindIde.appliInfo(_mpe.getName());
				MindAdl a = _mindproject.findQualifiedComponent(appliInfo[0]);
				if (a != null)
					setInitialSelections(new Object[] { a });
				_nextApplicationName = appliInfo[1];
			} catch (CoreException e) {
			}
			
		}
		
		Composite contents = (Composite) super.createDialogArea(parent);
		
		addApplicationNameSection(contents);
		return contents;
	}

	private void addApplicationNameSection(Composite parent) {
		
		// Label for path field
		Label pathLabel = new Label(parent, SWT.NONE);
		pathLabel.setText("Application name:");

		// Path text field
		_applicationNameText = new Text(parent, SWT.BORDER);
		if (_mpe != null) {
			_applicationNameText.setText(_nextApplicationName);
		}
		_applicationNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		_applicationNameText.addModifyListener(this);
		
		
	}

	public void modifyText(ModifyEvent e) {
		_nextApplicationName = _applicationNameText.getText();
		validateApplicationName();
	}

	@Override
	protected boolean validateCurrentSelection() {
		if (super.validateCurrentSelection())
			return validateApplicationName();
		return true;
	}

	private boolean validateApplicationName() {
		Assert.isNotNull(fFilteredList);

		IStatus status;

		if (_nextApplicationName == null || _nextApplicationName.length() == 0
				|| _nextApplicationName.contains("/")) {
			status = new Status(IStatus.ERROR, PlatformUI.PLUGIN_ID,
					IStatus.ERROR, "Invalid appication name", null);
		} else {
			status = Status.OK_STATUS;
		}

		updateStatus(status);

		return status.isOK();
	}

	public String getApplicationName() {
		return _nextApplicationName;
	}

}
