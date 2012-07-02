package org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.internal.resources.Folder;
import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


@SuppressWarnings("restriction")
public class TreeFilterExtension extends ViewerFilter{

	protected String extensionFilter;
	
	public TreeFilterExtension(String extension)
	{
		super ();
		extensionFilter = extension;
		
	}
	
	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {

		if(element instanceof Project)
		{
			return true;
		}
		else 
			{
				if(element instanceof Folder)
				{
					Folder file = (Folder)element;
					Path path = (Path) file.getFullPath();
					String name = path.lastSegment();
					if(name.startsWith("."))
					{
						return false;
					}
					else
						return true;
				}
				else
				{
					if(element instanceof File)
					{
						File file = (File)element;
						Path path = (Path) file.getFullPath();
						String name = path.lastSegment();
						if(name.startsWith("."))
						{
							return false;
						}
						else
						{
							if(name.endsWith(extensionFilter))
								return true;
							else
								return false;
						}
					}
				}
			}


		return false;
	}

}
