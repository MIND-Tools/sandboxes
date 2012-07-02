package org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards;


import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.SWT;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.WorkbenchPlugin;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.PrimitiveBodyEditPart;

@SuppressWarnings("restriction")
public class InterfaceCreationWizard extends Wizard{

	InterfaceMainPage mainPage;
	PrimitiveBodyEditPart bodyEditPart;
	
	protected InterfaceInformation newInterfaceInformation = new InterfaceInformation();
	

	public InterfaceInformation getNewInterfaceInformation() {
		return newInterfaceInformation;
	}
	public void setNewInterfaceInformation(
			InterfaceInformation newInterfaceInformation) {
		this.newInterfaceInformation = newInterfaceInformation;
	}

	public InterfaceCreationWizard(PrimitiveBodyEditPart bodyEP){
		super();
		
		bodyEditPart = bodyEP;
		
        IDialogSettings workbenchSettings = WorkbenchPlugin.getDefault()
        .getDialogSettings();
        IDialogSettings wizardSettings = workbenchSettings
                .getSection("NewWizardAction"); //$NON-NLS-1$
        if (wizardSettings == null) {
			wizardSettings = workbenchSettings.addNewSection("NewWizardAction"); //$NON-NLS-1$
		}
        this.setDialogSettings(wizardSettings);
        this.setForcePreviousAndNextButtons(false);
        this.setWindowTitle(ResourcesWizard.INTERFACE_WIZARD_TITLE);
	}
	
	
	public void addPages() {
		mainPage = new InterfaceMainPage("Main Page");
		addPage(mainPage);
	}
	
	@Override
	public boolean performFinish() {
		if((mainPage.getInterfaceName() == null) || (mainPage.getInterfaceName().length() == 0))
		{
			new MessageBoxWizard(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
					, ResourcesWizard.ERROR_WARNING
					, ResourcesWizard.ERROR_NAME
					, SWT.ICON_WARNING | SWT.OK)
			.open();
			return false;
		}
		else 
			newInterfaceInformation.setName(mainPage.getInterfaceName());
		
		
		if((mainPage.getSignature() == null) || (mainPage.getSignature().length() == 0))
		{
			new MessageBoxWizard(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
					, ResourcesWizard.ERROR_WARNING
					, ResourcesWizard.ERROR_PATH
					, SWT.ICON_WARNING | SWT.OK)
			.open();
			return false;
		}
		else 
		{
			newInterfaceInformation.setPath(mainPage.getSignature());
			if(!newInterfaceInformation.getPath().endsWith(".itf"))
			{
				new MessageBoxWizard(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
						, ResourcesWizard.ERROR_WARNING
						, String.format(ResourcesWizard.ERROR_EXTENSION, "'itf'")
						, SWT.ICON_WARNING | SWT.OK)
				.open();
				return false;
			}
		}
		newInterfaceInformation.setOptional(mainPage.getOptional());
		newInterfaceInformation.setCollection(mainPage.getCollection());
		newInterfaceInformation.setCollectionSize(mainPage.getCollectionSize());
		
		
		return CreationNewMindFile.TestAndCreate(newInterfaceInformation.getPath(), "itf");
		

	}
}
