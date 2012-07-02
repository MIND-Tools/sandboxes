package org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.swt.SWT;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.WorkbenchPlugin;
import org.ow2.mindEd.ide.model.ComponentKind;

@SuppressWarnings("restriction")
public class AddElementWizard extends CustomWizard{
	
	static enum TYPES{
		IMPLEMENT,
		EXTENDS
	};
	
	ComponentKind kind;

	AddElementPage elementPage = null;
	ImplementationInformation implInformation = new ImplementationInformation();
	String modify = null;
	TYPES elementType;
	
	
	
	public AddElementWizard(String elementModify, TYPES Type){
		super();
		
		elementType = Type;
		kind = ComponentKind.UNKNOWN;
		
		IDialogSettings workbenchSettings = WorkbenchPlugin.getDefault().getDialogSettings();
		IDialogSettings wizardSettings = workbenchSettings.getSection("NewWizardAction"); //$NON-NLS-1$
		
		if (wizardSettings == null) {
			wizardSettings = workbenchSettings.addNewSection("NewWizardAction"); //$NON-NLS-1$
		}
		this.setDialogSettings(wizardSettings);
		this.setForcePreviousAndNextButtons(false);
		if(elementType == TYPES.IMPLEMENT)
			this.setWindowTitle(ResourcesWizard.ADD_ELEMENT_WIZARD_TITLE);
		if(elementType == TYPES.EXTENDS)
			this.setWindowTitle("Extends Title");
		this.setForcePreviousAndNextButtons(false);
		
		if(elementModify != null)
			modify = elementModify;
	}

	public AddElementWizard(String elementModify, TYPES Type, ComponentKind kindParam){
		super();
		
		elementType = Type;
		kind = kindParam;
		
		IDialogSettings workbenchSettings = WorkbenchPlugin.getDefault().getDialogSettings();
		IDialogSettings wizardSettings = workbenchSettings.getSection("NewWizardAction"); //$NON-NLS-1$
		
		if (wizardSettings == null) {
			wizardSettings = workbenchSettings.addNewSection("NewWizardAction"); //$NON-NLS-1$
		}
		this.setDialogSettings(wizardSettings);
		this.setForcePreviousAndNextButtons(false);
		if(elementType == TYPES.IMPLEMENT)
			this.setWindowTitle(ResourcesWizard.ADD_ELEMENT_WIZARD_TITLE);
		if(elementType == TYPES.EXTENDS)
			this.setWindowTitle("Extends Title");
		this.setForcePreviousAndNextButtons(false);
		
		if(elementModify != null)
			modify = elementModify;
	}
	
	public void addPages() {
		elementPage = new AddElementPage("temp", modify, elementType);
		addPage(elementPage);
	}
	
	
	@Override
	public boolean performFinish() {
		
		implInformation.setInline(elementPage.isInline());
		if(implInformation.isInline())
			implInformation.setInlineText(elementPage.getInlineText());
		
		implInformation.setFile(elementPage.isFile());
		if(implInformation.isFile())
			implInformation.setFilePath(elementPage.getFilePath());
		
		if(elementType == TYPES.IMPLEMENT)
			{
			if(implInformation.isFile())
			{
				if(!implInformation.getFilePath().endsWith(".c"))
				{
					new MessageBoxWizard(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
							, ResourcesWizard.ERROR_WARNING
							, ResourcesWizard.ADD_ELEMENT_FILE_ERROR
							, SWT.ICON_WARNING | SWT.OK)
					.open();
					return false;
				}
			}
			else if(implInformation.isInline())
			{
				if(!implInformation.getInlineText().isEmpty())
					if(!(implInformation.getInlineText().startsWith("{{")
							&& implInformation.getInlineText().endsWith("}}")))
					{
						new MessageBoxWizard(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
								, ResourcesWizard.ERROR_WARNING
								, ResourcesWizard.ADD_ELEMENT_INLINE_ERROR
								, SWT.ICON_WARNING | SWT.OK)
						.open();
						return false;
					}
			}
			
			CreationNewMindFile.TestAndCreate(implInformation.getFilePath(), "c", kind);
		}
		if(elementType == TYPES.EXTENDS)
		{
			CreationNewMindFile.TestAndCreate(implInformation.getFilePath(), "adl", kind);
		}
		
		return true;
	}
	
	public ImplementationInformation getImplementationInformation()
	{		
		return implInformation;
	}

}
