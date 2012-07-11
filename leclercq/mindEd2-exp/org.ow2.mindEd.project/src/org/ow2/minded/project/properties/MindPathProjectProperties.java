/**
 * Copyright (C) 2010 STMicroelectronics
 *
 * This file is part of "Mind Compiler" is free software: you can redistribute 
 * it and/or modify it under the terms of the GNU Lesser General Public License 
 * as published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT 
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact: mind@ow2.org
 *
 * Authors: Matthieu Leclercq
 * Contributors: 
 */

package org.ow2.minded.project.properties;

import java.awt.event.WindowStateListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.LocalResourceManager;
import org.eclipse.jface.resource.ResourceManager;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.IFontProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.CheckedTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.ow2.minded.project.builder.MindNature;

public class MindPathProjectProperties extends Composite {


  private static final Logger log = Logger
  .getLogger(MindPathPropertyPage.class);

  private TreeViewer                     pathList     = null;
  private Button                         addSrcButton = null;
  private Button                         addExtButton = null;
  private Button                         removeButton = null;
  private Label                          label        = null;
  private Button                         addPrjButton = null;

  protected final MindPathPropertyPage mindPathPropertyPage;
  protected final MindProjectConfiguration config;
  protected final java.util.List<IFolder>  srcFolders;
  protected final java.util.List<File>     extFolders;
  protected final java.util.List<IProject> usedProjects;

  public MindPathProjectProperties(Composite parent, int style,
      MindProjectConfiguration config, MindPathPropertyPage mindPathPropertyPage) {
    super(parent, style);
    this.mindPathPropertyPage = mindPathPropertyPage;
    this.config = config;

    srcFolders = new ArrayList<IFolder>(config.getSourceFolders());
    extFolders = new ArrayList<File>(config.getExternalFolders());
    usedProjects = new ArrayList<IProject>(config.getUsedProjects());
    initialize();

  }

  private void initialize() {
    GridData gridData6 = new GridData();
    gridData6.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
    GridData gridData5 = new GridData();
    gridData5.horizontalSpan = 2;
    label = new Label(this, SWT.NONE);
    label.setText("Folders on build path:");
    label.setLayoutData(gridData5);
    GridData gridData3 = new GridData();
    gridData3.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
    gridData3.verticalAlignment = org.eclipse.swt.layout.GridData.BEGINNING;
    GridData gridData2 = new GridData();
    gridData2.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
    GridData gridData1 = new GridData();
    gridData1.verticalAlignment = org.eclipse.swt.layout.GridData.BEGINNING;
    gridData1.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
    GridLayout gridLayout = new GridLayout();
    gridLayout.numColumns = 2;
    GridData gridData = new GridData();
    gridData.grabExcessHorizontalSpace = true;
    gridData.verticalSpan = 4;
    gridData.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
    gridData.verticalAlignment = org.eclipse.swt.layout.GridData.FILL;
    gridData.grabExcessVerticalSpace = true;
    pathList = new TreeViewer(this);
    pathList.setAutoExpandLevel(2);
    pathList.setContentProvider(new MindConfigContentProvider());
    pathList.setLabelProvider(new MindConfigLabelProvider());
    pathList.getControl().setLayoutData(gridData);
    pathList.setInput(config);
    pathList.addSelectionChangedListener(new ISelectionChangedListener() {

      @Override
      public void selectionChanged(SelectionChangedEvent event) {
        removeButton.setEnabled(!pathList.getSelection().isEmpty());
      }
    });
    addSrcButton = new Button(this, SWT.NONE);
    addSrcButton.setText("Add Source Folder ...");
    addSrcButton.setLayoutData(gridData1);
    addSrcButton.addSelectionListener(new SelectionAdapter() {
      public void widgetSelected(SelectionEvent e) {
        addSrcButtonPressed();
      }
    });
    addExtButton = new Button(this, SWT.NONE);
    addExtButton.setText("Add External Folder ...");
    addExtButton.setLayoutData(gridData2);
    addExtButton.addSelectionListener(new SelectionAdapter() {
      public void widgetSelected(SelectionEvent e) {
        addExtButtonPressed();
      }
    });
    addPrjButton = new Button(this, SWT.NONE);
    addPrjButton.setText("Add Project ...");
    addPrjButton.setLayoutData(gridData6);
    addPrjButton.addSelectionListener(new SelectionAdapter() {
      public void widgetSelected(SelectionEvent e) {
        addPrjButtonPressed();
      }
    });
    removeButton = new Button(this, SWT.NONE);
    removeButton.setText("Remove");
    removeButton.setLayoutData(gridData3);
    removeButton.addSelectionListener(new SelectionAdapter() {
      public void widgetSelected(SelectionEvent e) {
        removeButtonPressed();
      }
    });
    this.setLayout(gridLayout);
    setSize(new Point(300, 200));
  }

  protected void addSrcButtonPressed() {
    CheckedTreeSelectionDialog dialog = new CheckedTreeSelectionDialog(
        getShell(), new WorkbenchLabelProvider(),
        new WorkbenchContentProvider() {
          @Override
          public Object[] getChildren(Object element) {
            java.util.List<Object> folders = new ArrayList();
            for (Object child : super.getChildren(element)) {
              if (child instanceof IFolder) folders.add(child);
            }
            return folders.toArray();
          }
        });
    dialog.setTitle("Source Folder Selection");
    dialog.setMessage("Select the source folder(s)");
    dialog.setInput(config.getProject());
    dialog.setInitialElementSelections(srcFolders);
    int r = dialog.open();
    if (r == Window.OK) {
      srcFolders.clear();
      for (Object result : dialog.getResult()) {
        srcFolders.add((IFolder) result);
      }
      pathList.refresh(config);
      pathList.setExpandedState(srcFolders, true);
      mindPathPropertyPage.isValid();
    }
  }

  protected void addExtButtonPressed() {
    DirectoryDialog dialog = new DirectoryDialog(getShell());
    String path = dialog.open();
    if (path != null) {
      extFolders.add(new File(path));
      pathList.refresh(config);
      pathList.setExpandedState(extFolders, true);
      mindPathPropertyPage.isValid();
    }
  }

  protected void addPrjButtonPressed() {
    CheckedTreeSelectionDialog dialog = new CheckedTreeSelectionDialog(
        getShell(), new WorkbenchLabelProvider(),
        new WorkbenchContentProvider() {
          @Override
          public Object[] getChildren(Object element) {
            if (!(element instanceof IWorkspace)) {
              return new Object[0];
            }

            // Collect all the projects in the workspace except the current
            // project
            IProject[] projects = ((IWorkspace) element).getRoot()
                .getProjects();
            java.util.List<IProject> otherProjects = new ArrayList<IProject>(
                projects.length - 1);
            for (IProject project : projects) {
              try {
                if (project != config.getProject() && project.hasNature(MindNature.NATURE_ID)) {
                  otherProjects.add(project);
                }
              } catch (CoreException e) {
                log.error(e.getMessage(), e);
              }
            }
            return otherProjects.toArray();
          }
        });
    dialog.setTitle("Used Project Selection");
    dialog.setMessage("Select the project(s) used by this one");
    dialog.setInput(ResourcesPlugin.getWorkspace());
    dialog.setInitialElementSelections(usedProjects);
    int r = dialog.open();
    if (r == Window.OK) {
      usedProjects.clear();
      for (Object result : dialog.getResult()) {
        usedProjects.add((IProject) result);
      }
      pathList.refresh(config);
      pathList.setExpandedState(usedProjects, true);
      mindPathPropertyPage.isValid();
    }
  }

  protected void removeButtonPressed() {
    ITreeSelection selection = (ITreeSelection) pathList.getSelection();
    for (TreePath path : selection.getPaths()) {
      Object object = path.getLastSegment();
      if (srcFolders.remove(object)) {
        pathList.refresh(config);
      } else if (extFolders.remove(object)) {
        pathList.refresh(config);
      } else if (usedProjects.remove(object)) {
        pathList.refresh(config);
      }
    }
    mindPathPropertyPage.isValid();
  }

  protected class MindConfigContentProvider implements ITreeContentProvider {

    public void dispose() {
      // nothing todo
    }

    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
      // nothing todo
    }

    public Object[] getElements(Object inputElement) {
      Assert.isTrue(inputElement == config);
      return new Object[]{srcFolders, extFolders, usedProjects};
    }

    public Object[] getChildren(Object parentElement) {
      if (parentElement instanceof List<?>) {
        return ((List<?>) parentElement).toArray();
      }
      return null;
    }

    public Object getParent(Object element) {
      if (element == srcFolders || element == extFolders
          || element == usedProjects) {
        return config;
      } else if (srcFolders.contains(element)) {
        return srcFolders;
      } else if (extFolders.contains(element)) {
        return extFolders;
      } else if (usedProjects.contains(element)) {
        return usedProjects;
      }
      return null;
    }

    public boolean hasChildren(Object element) {
      return element == config || element == srcFolders
          || element == extFolders || element == usedProjects;
    }
  }

  protected class MindConfigLabelProvider extends LabelProvider
      implements
        IColorProvider,
        IFontProvider {

    private WorkbenchLabelProvider delegate = new WorkbenchLabelProvider();
    private ResourceManager        resourceManager;

    @Override
    public String getText(Object element) {
      if (element == srcFolders) {
        return "Source folders";
      } else if (element == extFolders) {
        return "External folders";
      } else if (element == usedProjects) {
        return "Used projects";
      } else if (element instanceof File) {
        return ((File) element).getAbsolutePath();
      } else if (element instanceof IFolder) {
        IFolder srcFolder = (IFolder) element;
        
        return srcFolder.getProject().getName() + "/" + srcFolder.getProjectRelativePath().toString();
      }
      return delegate.getText(element);
    }

    @Override
    public Image getImage(Object element) {
      ImageDescriptor descriptor = null;
      if (element == srcFolders) {
        descriptor = PlatformUI.getWorkbench().getSharedImages()
            .getImageDescriptor(ISharedImages.IMG_OBJ_FOLDER);
      } else if (element == extFolders) {
        descriptor = PlatformUI.getWorkbench().getSharedImages()
            .getImageDescriptor(ISharedImages.IMG_OBJ_FOLDER);
      } else if (element == usedProjects) {
        descriptor = PlatformUI
            .getWorkbench()
            .getSharedImages()
            .getImageDescriptor(
                org.eclipse.ui.ide.IDE.SharedImages.IMG_OBJ_PROJECT);
      } else if (element instanceof File) {
        descriptor = PlatformUI.getWorkbench().getSharedImages()
            .getImageDescriptor(ISharedImages.IMG_OBJ_FOLDER);
      }

      if (descriptor == null) {
        return delegate.getImage(element);
      }

      return (Image) getResourceManager().get(descriptor);
    }

    @Override
    public Font getFont(Object element) {
      return delegate.getFont(element);
    }

    @Override
    public Color getForeground(Object element) {
      return delegate.getForeground(element);
    }

    @Override
    public Color getBackground(Object element) {
      return delegate.getBackground(element);
    }

    private ResourceManager getResourceManager() {
      if (resourceManager == null) {
        resourceManager = new LocalResourceManager(
            JFaceResources.getResources());
      }

      return resourceManager;
    }
  }
}
