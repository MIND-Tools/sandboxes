
package org.ow2.minded.project.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.core.runtime.*;
import org.eclipse.jface.operation.*;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.CoreException;
import java.io.*;
import org.eclipse.ui.*;
import org.eclipse.ui.ide.IDE;
import org.osgi.service.prefs.BackingStoreException;
import org.ow2.minded.project.builder.MindNature;
import org.ow2.minded.project.properties.MindProjectConfiguration;

public class NewMindProjectWizard extends Wizard implements INewWizard {
  private NewMindProjectWizardPage page;

  /**
   * Constructor for NewAdlWizard.
   */
  public NewMindProjectWizard() {
    super();
    setNeedsProgressMonitor(true);
  }

  public void addPages() {
    page = new NewMindProjectWizardPage();
    addPage(page);
  }

  public boolean performFinish() {
    final String projectName = page.getProjectName();
    try {
      getContainer().run(true, false, new IRunnableWithProgress() {
        public void run(IProgressMonitor monitor)
            throws InvocationTargetException {
          try {
            doFinish(projectName, monitor);
          } catch (CoreException e) {
            throw new InvocationTargetException(e);
          } finally {
            monitor.done();
          }
        }
      });
    } catch (InterruptedException e) {
      return false;
    } catch (InvocationTargetException e) {
      Throwable realException = e.getTargetException();
      MessageDialog.openError(getShell(), "Error", realException.getMessage());
      return false;
    }
    return true;
  }

  private void doFinish(String projectName, IProgressMonitor monitor)
      throws CoreException {
    // create a sample file
    monitor.beginTask("Creating " + projectName, 3);
    IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
    IProject project = root.getProject(projectName);
    if (project.exists()) {
      throwCoreException("Project \"" + projectName + "\" already exist.", null);
    }
    project.create(monitor);
    project.open(monitor);
    monitor.worked(1);
    addMindNature(project);
    monitor.worked(2);
    IFolder srcFolder = project.getFolder("src");
    if (srcFolder.exists()) {
      throwCoreException("folder \"" + srcFolder.getName() + "\" in project \""
          + project.getName() + "\" already exist.", null);
    }
    srcFolder.create(true, true, monitor);
    IFolder sourceFolder = srcFolder;
    monitor.worked(3);

    MindNature nature = MindNature.getNature(project);
    MindProjectConfiguration configuration = nature.getConfiguration();
    List<IFolder> srcFolders = new ArrayList<IFolder>();
    srcFolders.add(sourceFolder);
    List<File> exFiles = new ArrayList<File>();
    List<IProject> usedProjects = new ArrayList<IProject>();
    try {
      configuration.updateConfig(srcFolders, exFiles, usedProjects, monitor);
    } catch (BackingStoreException e) {
      throwCoreException(
          "Failed to configure project \"" + projectName + "\".", e);
    }
  }

  private void addMindNature(IProject project) throws CoreException {
    IProjectDescription description = project.getDescription();
    String[] natures = description.getNatureIds();

    // Add the nature
    String[] newNatures = new String[natures.length + 1];
    System.arraycopy(natures, 0, newNatures, 0, natures.length);
    newNatures[natures.length] = MindNature.NATURE_ID;
    description.setNatureIds(newNatures);
    project.setDescription(description, null);
  }

  /**
   * We will initialize file contents with a sample text.
   */

  private InputStream openContentStream() {
    String contents = "This is the initial file contents for *.adl file that should be word-sorted in the Preview page of the multi-page editor";
    return new ByteArrayInputStream(contents.getBytes());
  }

  private void throwCoreException(String message, Throwable t)
      throws CoreException {
    IStatus status = new Status(IStatus.ERROR, "org.ow2.mindEd.adl.ui",
        IStatus.OK, message, t);
    throw new CoreException(status);
  }

  public void init(IWorkbench workbench, IStructuredSelection selection) {
  }
}