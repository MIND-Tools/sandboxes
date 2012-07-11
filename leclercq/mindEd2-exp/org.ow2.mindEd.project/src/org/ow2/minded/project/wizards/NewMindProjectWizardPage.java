
package org.ow2.minded.project.wizards;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.ow2.minded.project.properties.MindPathPropertyPage;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (adl).
 */

public class NewMindProjectWizardPage extends WizardPage {
  private Text projectName;

  /**
   * Constructor for SampleNewWizardPage.
   * 
   * @param pageName
   */
  public NewMindProjectWizardPage() {
    super("mindProjectPage");
    setTitle("New Mind project");
    setDescription("This wizard creates a new Mind project");
  }

  /**
   * @see IDialogPage#createControl(Composite)
   */
  public void createControl(Composite parent) {
    Composite container = new Composite(parent, SWT.NULL);
    GridLayout layout = new GridLayout();
    container.setLayout(layout);
    layout.numColumns = 2;
    layout.verticalSpacing = 9;
    Label label = new Label(container, SWT.NULL);
    label.setText("&Project Name:");

    projectName = new Text(container, SWT.BORDER | SWT.SINGLE);
    GridData gd = new GridData(GridData.FILL_HORIZONTAL);
    projectName.setLayoutData(gd);
    projectName.addModifyListener(new ModifyListener() {
      public void modifyText(ModifyEvent e) {
        dialogChanged();
      }
    });
    dialogChanged();
    setControl(container);
  }

  /**
   * Ensures that both text fields are set.
   */
  private void dialogChanged() {

    if (getProjectName().length() == 0) {
      updateStatus("Project name must be specified");
      return;
    }
    IProject project = ResourcesPlugin.getWorkspace().getRoot()
        .getProject(getProjectName());

    if (project.exists()) {
      updateStatus("A project with the same name already exists");
      return;
    }
    if (!ResourcesPlugin.getWorkspace()
        .validateName(getProjectName(), IResource.PROJECT).isOK()) {
      updateStatus("Project name is invalid");
      return;
    }
    updateStatus(null);
  }

  private void updateStatus(String message) {
    setErrorMessage(message);
    setPageComplete(message == null);
  }

  public String getProjectName() {
    return projectName.getText();
  }
}