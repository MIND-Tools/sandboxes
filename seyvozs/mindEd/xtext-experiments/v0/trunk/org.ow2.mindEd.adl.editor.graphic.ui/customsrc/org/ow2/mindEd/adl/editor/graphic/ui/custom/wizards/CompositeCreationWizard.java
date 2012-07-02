package org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards;

import org.eclipse.swt.SWT;
import org.eclipse.ui.PlatformUI;
import org.ow2.mindEd.ide.model.ComponentKind;

public class CompositeCreationWizard extends CustomWizard{

	CompositeMainPage compositeMainPage; 
	boolean isSubComponent = false;
	
	CompositeComponentInformation compositeInformation;
	
	public CompositeComponentInformation getCompositeInformation() {
		return compositeInformation;
	}


	public CompositeCreationWizard(boolean subComponent)
	{
		super();
		
		isSubComponent = subComponent;
		
		compositeInformation = new CompositeComponentInformation();
		
	}
	
	
	@Override
	public boolean performFinish() {

		compositeInformation.setCompositeName(compositeMainPage.getCompositeComponentName());
		compositeInformation.setListExtends(compositeMainPage.getListExtends());
		if(isSubComponent)
			compositeInformation.setExtendPath(compositeMainPage.getExtendPath());
		
		
		if((compositeInformation.getCompositeName() == null)
				|| (compositeInformation.getCompositeName().length() == 0))
		{
			new MessageBoxWizard(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
					, ResourcesWizard.ERROR_WARNING
					, ResourcesWizard.ERROR_NAME
					, SWT.ICON_WARNING | SWT.OK)
			.open();
			return false;
		}
		if(!isSubComponent)
		{
			if((compositeInformation.getListExtends() != null)
				&& (compositeInformation.getListExtends().size() != 0))
			{
				boolean result = true;
				for(int i=0 ; i<compositeInformation.getListExtends().size() ; i++)
				{
					String extendPath = compositeInformation.getListExtends().get(i);
					result = result & CreationNewMindFile.TestAndCreate(extendPath, "adl", ComponentKind.COMPOSITE);
				}
				return result;
			}

			boolean result = true;
			for(String extendPath : compositeInformation.getListExtends())
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
				result = result & CreationNewMindFile.TestAndCreate(extendPath, "adl", ComponentKind.COMPOSITE);
			}
			return result;
		}
		else
		{
			if((compositeInformation.getExtendPath() != null) 
				&& (compositeInformation.getExtendPath().length() != 0))
			{
				if(!compositeInformation.getExtendPath().endsWith(".adl"))
				{
					new MessageBoxWizard(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
							, ResourcesWizard.ERROR_WARNING
							, String.format(ResourcesWizard.ERROR_EXTENSION, "'adl'")
							, SWT.ICON_WARNING | SWT.OK)
					.open();
					return false;
				}
				return CreationNewMindFile.TestAndCreate(compositeInformation.getExtendPath(), "adl", ComponentKind.COMPOSITE);
			}
			else return true;
		}
	}


	@Override
	public void addPages() {
		compositeMainPage = new CompositeMainPage("Main Page", isSubComponent);
		this.addPage(compositeMainPage);
	}

}
