package org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.internal.resources.Folder;
import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;


@SuppressWarnings("restriction")
public class CreationTreeViewer {

	
public static Text createTreeComposite(Composite subLevel, int style, int height, String extensionFilter) {
		
		
		TreeViewer treeViewer = new TreeViewer (new Tree (subLevel, style));
        treeViewer.setContentProvider(new WorkbenchContentProvider());
        treeViewer.setLabelProvider(new WorkbenchLabelProvider());

        Tree treeWidget = treeViewer.getTree();
        treeWidget.setFont(subLevel.getFont());
        {
		    GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		    data.heightHint = height;
		    treeWidget.setLayoutData(data);
		}
        
        treeViewer.setInput(ResourcesPlugin.getWorkspace().getRoot());
        Text filePath = new Text(subLevel, SWT.BORDER);
        filePath.setFont(subLevel.getFont());
        {
			GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
        	filePath.setLayoutData(data);
        }
        
        createTreeListener(treeViewer, filePath);
        
        TreeFilterExtension treeFilter = new TreeFilterExtension(extensionFilter); 
        treeViewer.addFilter(treeFilter);
        treeViewer.addFilter(new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parentElement,
					Object element) {
				String name = null;
				if(element instanceof Project)
				{
					 name = ((Project) element).getName();
					 if(name.startsWith("."))
						 return false;
				}
				if(element instanceof Folder)
				{
					 name = ((Folder) element).getName();
					 if(name.startsWith("."))
						 return false;
				}
				if(element instanceof File)
				{
					 name = ((File) element).getName();
					 if(name.startsWith("."))
						 return false;
				}
				return true;
			}});
        return filePath;
	}

	private static void createTreeListener(final TreeViewer treeViewer, final Text filePath) {
        treeViewer.addPostSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				
				TreeSelection treeSelection= (TreeSelection) event.getSelection();
				TreePath treePath = treeSelection.getPaths()[0];
				if(treePath.getLastSegment() instanceof Project)
				{
					Project selectedItem = (Project)treePath.getLastSegment();
					filePath.setText(selectedItem.getFullPath().toString());
				}
				else if(treePath.getLastSegment() instanceof Folder)
				{
					Folder selectedItem = (Folder)treePath.getLastSegment();
					filePath.setText(selectedItem.getFullPath().toString());
				}
				else if (treePath.getLastSegment() instanceof File)
				{
					File selectedItem = (File)treePath.getLastSegment();
					
					filePath.setText(selectedItem.getFullPath().toString());
				}
			}
		});
        
        treeViewer.addDoubleClickListener(new IDoubleClickListener() {
            public void doubleClick(DoubleClickEvent event) {

	            ISelection selection = event.getSelection();
	            if (selection instanceof IStructuredSelection) {
	                Object item = ((IStructuredSelection) selection)
	                        .getFirstElement();
	                if (treeViewer.getExpandedState(item)) {
	                	treeViewer.collapseToLevel(item, 1);
					} else {
						treeViewer.expandToLevel(item, 1);
					}
	            }

            }
        });
	}
	
	
}
