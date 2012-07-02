package org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards;



import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.WorkbenchPlugin;
import org.ow2.mindEd.ide.model.ComponentKind;

@SuppressWarnings("restriction")
public class PrimitiveCreationWizard extends CustomWizard {


	PrimitiveMainPage primitiveMainPage;
	PrimitiveSecondPage primitiveSecondPage;
	
	boolean isSubComponent = false;
	
	WizardDialog wizardDialog;
	
	PrimitiveComponentInformation primitiveInformation = new PrimitiveComponentInformation();

	public PrimitiveComponentInformation getPrimitiveComponentInformation() {
		return primitiveInformation;
	}

	public PrimitiveCreationWizard(boolean subComponent)
	{
		super();
		
		isSubComponent = subComponent;
		
		IDialogSettings workbenchSettings = WorkbenchPlugin.getDefault()
	        .getDialogSettings();
        IDialogSettings wizardSettings = workbenchSettings
                .getSection("NewWizardAction"); //$NON-NLS-1$
        if (wizardSettings == null) {
			wizardSettings = workbenchSettings.addNewSection("NewWizardAction"); //$NON-NLS-1$
		}
        this.setDialogSettings(wizardSettings);
        this.setWindowTitle(ResourcesWizard.PRIMITIVE_WIZARD_TITLE);
        
        this.setForcePreviousAndNextButtons(true);

        

	}
	
	public void addPages() {
		primitiveMainPage = new PrimitiveMainPage("Main Page", this, isSubComponent);
		addPage(primitiveMainPage);
	}
	
	@Override
	public boolean performFinish() {
		primitiveInformation.setPrimitiveName(primitiveMainPage.getPrimitiveName());
		primitiveInformation.setExtend(primitiveMainPage.isExtend());
		primitiveInformation.setOverride(primitiveMainPage.isOverride());
		primitiveInformation.setAnonymous(primitiveMainPage.isAnonymous());
		primitiveInformation.setListExtends(primitiveMainPage.getListExtends());
		if(isSubComponent)
			primitiveInformation.setExtendPath(primitiveMainPage.getExtendPath());
		if(primitiveSecondPage!=null)
			primitiveInformation.setListImplementation(primitiveSecondPage.getListImplementation());
		
		if((primitiveInformation.getPrimitiveName() == null)
				|| (primitiveInformation.getPrimitiveName().length() == 0))
		{
			new MessageBoxWizard(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
					, ResourcesWizard.ERROR_WARNING
					, ResourcesWizard.ERROR_NAME
					, SWT.ICON_WARNING | SWT.OK)
			.open();
			return false;
		}
		if(!primitiveInformation.isAnonymous())
		{
			if(!isSubComponent)
			{
				if((primitiveInformation.getListExtends() == null)
					|| (primitiveInformation.getListExtends().size() == 0))
				{
					new MessageBoxWizard(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
							, ResourcesWizard.ERROR_WARNING
							, ResourcesWizard.ERROR_PATH
							, SWT.ICON_WARNING | SWT.OK)
					.open();
					return false;
				}
				boolean result = true;
				for(String extendPath : primitiveInformation.getListExtends())
				{
					
					if(!extendPath.endsWith(".adl"))
					{
						new MessageBoxWizard(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
								, ResourcesWizard.ERROR_WARNING
								, String.format(ResourcesWizard.ERROR_EXTENSION, "'adl'")
								, SWT.ICON_WARNING | SWT.OK)
						.open();
						return false;
					}
					result = result & CreationNewMindFile.TestAndCreate(extendPath, "adl", ComponentKind.PRIMITIVE);
				}
				return result;
			}
			else
			{
				if((primitiveInformation.getExtendPath() == null) 
					|| (primitiveInformation.getExtendPath().length() == 0))
				{
					new MessageBoxWizard(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
							, ResourcesWizard.ERROR_WARNING
							, ResourcesWizard.ERROR_PATH
							, SWT.ICON_WARNING | SWT.OK)
					.open();
					return false;
				}
				if(!primitiveInformation.getExtendPath().endsWith(".adl"))
				{
					new MessageBoxWizard(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
							, ResourcesWizard.ERROR_WARNING
							, String.format(ResourcesWizard.ERROR_EXTENSION, "'adl'")
							, SWT.ICON_WARNING | SWT.OK)
					.open();
					return false;
				}
				return CreationNewMindFile.TestAndCreate(primitiveInformation.getExtendPath(), "adl", ComponentKind.PRIMITIVE);
			}
		}
		else
		{
			return true;
		}
	}
	
	public void enableSecondPage()
	{
		this.setForcePreviousAndNextButtons(true);
		if(primitiveSecondPage==null)
		{
			primitiveSecondPage = new PrimitiveSecondPage("Second Page");
			addPage(primitiveSecondPage);
		}
		wizardDialog.updateButtons();
	}
	
	public void disableSecondPage()
	{
		this.setForcePreviousAndNextButtons(false);
		if(primitiveSecondPage!=null)
		{
			removePage(primitiveSecondPage);
			primitiveSecondPage=null;
		}
		wizardDialog.updateButtons();
	}

	public void setWizardDialog(WizardDialog wizDialog) {
		wizardDialog = wizDialog;
		
	}
	
}
