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

package org.ow2.mind.ui.refactoring;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.ltk.ui.refactoring.RefactoringWizard;
import org.eclipse.ltk.ui.refactoring.UserInputWizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class RenameRefactoringWizard extends RefactoringWizard {

  public RenameRefactoringWizard(final RenameRefactoring refactoring,
      final int flags) {
    super(refactoring, flags);
  }

  @Override
  protected void addUserInputPages() {
    addPage(createPage());
  }

  protected RenameInputWizardPage createPage() {
    return new RenameInputWizardPage();
  }

  protected class RenameInputWizardPage extends UserInputWizardPage {

    protected Text      renameText;
    protected Button    updateReferences;
    protected Composite composite;

    public RenameInputWizardPage() {
      super("Refactoring");
      setTitle("Rename Refactoring");
      setDescription("Automated Refactoring to rename elements with "
          + "automatically update references");
    }

    @Override
    protected RenameRefactoring getRefactoring() {
      return (RenameRefactoring) super.getRefactoring();
    }

    public void createControl(final Composite parent) {
      final Composite page = new Composite(parent, SWT.NONE);
      final GridLayout gridLayout = new GridLayout();
      page.setLayout(gridLayout);

      composite = new Composite(page, SWT.NONE);
      composite.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING,
          true, false));

      final GridLayout gridLayout_1 = new GridLayout();
      gridLayout_1.numColumns = 2;
      composite.setLayout(gridLayout_1);

      final Label renameLabel = new Label(composite, SWT.NONE);
      renameLabel.setLayoutData(new GridData(GridData.BEGINNING,
          GridData.CENTER, false, false));
      renameLabel.setText("New Name:");

      renameText = new Text(composite, SWT.BORDER);
      renameText.setLayoutData(new GridData(GridData.FILL, GridData.CENTER,
          true, false));
      renameText.setText(getRefactoring().getInitialName());
      renameText.selectAll();
      renameText.setFocus();
      renameText.addModifyListener(new ModifyListener() {

        public void modifyText(final ModifyEvent e) {
          validate();
        }
      });

      final Label updateRefLabel = new Label(composite, SWT.NONE);
      updateRefLabel.setLayoutData(new GridData(GridData.BEGINNING,
          GridData.CENTER, false, false));
      updateRefLabel.setText("Update references:");

      updateReferences = new Button(composite, SWT.CHECK);
      updateReferences.setLayoutData(new GridData(GridData.BEGINNING,
          GridData.CENTER, true, false));
      updateReferences.setSelection(true);
      setControl(page);
      validate();
      // do not show error message when the dialog appears.
      setErrorMessage(null);
    }

    protected void validate() {
      if (!getRefactoring().getProcessor().getNamePattern()
          .matcher(renameText.getText()).matches()) {
        setErrorMessage("'" + renameText.getText() + "' is not a valid name.");
        setPageComplete(false);
      } else if (renameText.getText().equals(getRefactoring().getInitialName())) {
        setErrorMessage("Unchanged name");
        setPageComplete(false);
      } else {
        setErrorMessage(null);
        setPageComplete(true);
      }
    }

    public String getRenameText() {
      return renameText.getText();
    }

    public boolean isUpdateReferences() {
      return updateReferences.getSelection();
    }

    @Override
    public IWizardPage getNextPage() {
      final RenameRefactoring refactoring = getRefactoring();
      refactoring.setNewName(getRenameText());
      refactoring.setUpdateReferences(isUpdateReferences());
      return super.getNextPage();
    }

    @Override
    protected boolean performFinish() {
      final RenameRefactoring refactoring = getRefactoring();
      refactoring.setNewName(getRenameText());
      refactoring.setUpdateReferences(isUpdateReferences());

      return super.performFinish();
    }
  }

}
