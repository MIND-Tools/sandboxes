package org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.internal.resources.Folder;
import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.internal.resources.Workspace;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.swt.SWT;
import org.eclipse.ui.PlatformUI;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.tools.CreateNewFile;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.tools.ExistingFolder;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.tools.ExistingProject;
import org.ow2.mindEd.ide.core.MindException;
import org.ow2.mindEd.ide.core.MindIdeCore;
import org.ow2.mindEd.ide.core.ModelToProjectUtil;
import org.ow2.mindEd.ide.model.ComponentKind;
import org.ow2.mindEd.ide.model.MindObject;

@SuppressWarnings("restriction")
public class CreationNewMindFile {
	
	public static boolean TestAndCreate(String pathString, String extensionFile)
	{
		return TestAndCreate(pathString, extensionFile, ComponentKind.UNKNOWN);
	}
	
	/**
	 * Test if a MindFile exist in pathString
	 * @param pathString path of file
	 * @param extensionFile extension of file to create (itf, c, adl)
	 * @return
	 */
	public static boolean TestAndCreate(String pathString, String extensionFile, ComponentKind kind){


		URI uri = URI.createPlatformResourceURI(pathString, true);
		IFile file = ModelToProjectUtil.INSTANCE.getIFile(uri);
		if(file == null)
		{
			MessageBoxWizard msgCreation = new MessageBoxWizard(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
						, ResourcesWizard.ERROR_WARNING
						, String.format(ResourcesWizard.ERROR_UNEXISTING_FILE, "'" + pathString + "'")
						, SWT.ICON_WARNING | SWT.YES | SWT.NO | SWT.CANCEL);
			int messageBoxResult = msgCreation.open();
			if(messageBoxResult == SWT.YES)
			{
				String path[] = uri.toPlatformString(false).split("/");
				for(int i = 1 ; i<path.length ; i++)
				{
					String partielPath = "";
					String containerPath = "";
					for(int j=1;j<=i;j++)
					{
						partielPath +="/"+path[j];
						if(i!=j)
							containerPath+="/"+path[j];
					}
					
					Path folderPath = new Path(partielPath);

					if(!partielPath.endsWith("." + extensionFile))
					{
						if(i==1)
						{
							Project project = new ExistingProject(folderPath, (Workspace) ResourcesPlugin.getWorkspace());
							MindObject mindProject = MindIdeCore.get(project);
							if(mindProject == null)
							{
								new MessageBoxWizard(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
										, ResourcesWizard.ERROR_ERROR
										, ResourcesWizard.ERROR_UNEXISTING_PROJECT
										, SWT.ICON_ERROR |SWT.CANCEL).open();
								return false;
							}
						}
						else
						{
							Folder folder = new ExistingFolder(folderPath, (Workspace) ResourcesPlugin.getWorkspace());
							MindObject mindFolder = MindIdeCore.get(folder);
							if(mindFolder == null)
							{
								try {
									MindIdeCore.createMindPackage(containerPath, path[i], null);
								} catch (CoreException e) {
									e.printStackTrace();
								}
							}	
						}
					}
					else
					{
						if(i==1)
						{
							new MessageBoxWizard(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
									, ResourcesWizard.ERROR_ERROR
									, ResourcesWizard.ERROR_UNEXISTING_PROJECT
									, SWT.ICON_ERROR |SWT.CANCEL).open();
							return false;
						}
						else if(i==2)
						{
							new MessageBoxWizard(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
									, ResourcesWizard.ERROR_ERROR
									, ResourcesWizard.ERROR_UNEXISTING_SOURCE_ENTRY
									, SWT.ICON_ERROR |SWT.CANCEL).open();
							return false;
						}
					}
				}
				
				Path newItfPath = new Path(uri.toPlatformString(false)); 
				
				File newMindFile = new CreateNewFile(newItfPath, (Workspace) ResourcesPlugin.getWorkspace());
				try {
					if(pathString.endsWith(".itf"))
						MindIdeCore.createITFTemplate(newMindFile,null);
					else if(pathString.endsWith(".c"))
						MindIdeCore.createCTemplate(newMindFile, null);
					else if(pathString.endsWith(".adl"))
					{
						MindIdeCore.createADL(newMindFile, null, kind);
					}

				} catch (MindException e) {
					e.printStackTrace();
				} catch (CoreException e) {
					e.printStackTrace();
				}
				return true;
			}
			else if(messageBoxResult == SWT.NO)
				return true;
			else
				return false;
		}
		
		
				
		return true;
	}

}
