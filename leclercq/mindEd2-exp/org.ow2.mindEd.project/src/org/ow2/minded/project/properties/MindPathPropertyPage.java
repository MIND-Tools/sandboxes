
package org.ow2.minded.project.properties;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.PropertyPage;
import org.eclipse.ui.progress.IProgressService;
import org.osgi.service.prefs.BackingStoreException;
import org.ow2.minded.project.builder.MindNature;

public class MindPathPropertyPage extends PropertyPage {

  private static final Logger log = Logger
  .getLogger(MindPathPropertyPage.class);


  private MindPathProjectProperties mindPathProjectProperties;
  private MindProjectConfiguration config;

  protected IProject getProject() {
    return (IProject) getElement().getAdapter(IProject.class);
  }

  protected Control createContents(Composite parent) {
    MindNature nature = null;
    try {
      nature = MindNature.getNature(getProject());
      config = nature.getConfiguration();
      mindPathProjectProperties = new MindPathProjectProperties(parent, 0,
          config, this);
    } catch (CoreException e) {
      log.error(e.getMessage(), e);
    }
    return mindPathProjectProperties;
  }

  @Override
  public boolean isValid() {
    List<IFolder> srcFolders = mindPathProjectProperties.srcFolders;
    if (srcFolders.isEmpty()) {
      setErrorMessage("At least one source folder must be defined.");
      return false;
    }
    for (IFolder srcFolder : srcFolders) {
      if (!srcFolder.exists()) {
        setErrorMessage("'" + srcFolder.getFullPath() + "' does not exist.");
        return false;
      }
    }
    
    List<File> extFolders = mindPathProjectProperties.extFolders;
    for (File extFolder : extFolders) {
      if (! extFolder.exists()) {
        setErrorMessage("'" + extFolder.getAbsolutePath() + "' does not exist.");
        return false;
      }
    }
    
    List<IProject> usedProjects = mindPathProjectProperties.usedProjects;
    for (IProject usedProject : usedProjects) {
      if (! usedProject.exists()) {
        setErrorMessage("Project '" + usedProject.getName() + "' does not exist.");
        return false;
      }
      try {
        if (! usedProject.hasNature(MindNature.NATURE_ID)) {
          setErrorMessage("Project '" + usedProject.getName() + "' is not a Mind project.");
          return false;
        }
      } catch (CoreException e) {
        log.error(e.getMessage(), e);
      }
    }
    setErrorMessage(null);
    return true;
  }

  public boolean performOk() {
    IProgressService progressService = PlatformUI.getWorkbench().getProgressService();
    try {
      progressService.busyCursorWhile(new IRunnableWithProgress(){
         public void run(IProgressMonitor monitor) {
            try {
              config.updateConfig(mindPathProjectProperties.srcFolders, mindPathProjectProperties.extFolders, mindPathProjectProperties.usedProjects, monitor);
            } catch (CoreException e) {
              log.error(e.getMessage(), e);
            } catch (BackingStoreException e) {
              log.error(e.getMessage(), e);
            }
         }
      });
    } catch (InvocationTargetException e) {
      log.error(e.getMessage(), e);
      return false;
    } catch (InterruptedException e) {
      log.error(e.getMessage(), e);
      return false;
    }
    return true;
  }

}