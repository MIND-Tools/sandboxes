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

import java.util.List;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.ow2.mind.ui.refactoring.RenameDefinitionRefactoring.SourceRename;

public class RenameDefinitionRefactoringWizard extends RenameRefactoringWizard {

  public RenameDefinitionRefactoringWizard(
      final RenameDefinitionRefactoring refactoring, final int flags) {
    super(refactoring, flags);
  }

  @Override
  protected RenameInputWizardPage createPage() {
    return new RenameDefinitionInputPage();
  }

  protected class RenameDefinitionInputPage extends RenameInputWizardPage {

    protected Button             moveSourceFiles;

    protected TableViewer        renameTable;
    protected List<SourceRename> renameTableInput;
    protected Group              renameTableGroup;

    @Override
    protected RenameDefinitionRefactoring getRefactoring() {
      return (RenameDefinitionRefactoring) super.getRefactoring();
    }

    @Override
    public void createControl(final Composite parent) {
      super.createControl(parent);

      composite.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true,
          true));

      final Label moveSourceFilesLabel = new Label(composite, SWT.NONE);
      moveSourceFilesLabel.setLayoutData(new GridData(GridData.BEGINNING,
          GridData.CENTER, false, false));
      moveSourceFilesLabel.setText("Move source files (force preview):");

      moveSourceFiles = new Button(composite, SWT.CHECK);
      moveSourceFiles.setLayoutData(new GridData(GridData.BEGINNING,
          GridData.CENTER, true, false));
      moveSourceFiles.addSelectionListener(new SelectionAdapter() {
        @Override
        public void widgetSelected(final SelectionEvent e) {
          final boolean moveSources = moveSourceFiles.getSelection();
          setForcePreviewReview(moveSources);
          renameTableGroup.setEnabled(moveSources);
          for (final Control c : renameTableGroup.getChildren()) {
            c.setEnabled(moveSources);
          }
          if (moveSources && renameTableInput == null) {
            renameTableInput = getRefactoring().initializeSourceRenames(
                renameText.getText());
            renameTable.setInput(renameTableInput);
          }
        }
      });

      renameText.addModifyListener(new ModifyListener() {

        public void modifyText(final ModifyEvent e) {
          if (moveSourceFiles.getSelection()) {
            renameTableInput = getRefactoring().initializeSourceRenames(
                renameText.getText());
            renameTable.setInput(renameTableInput);
          }
        }
      });

      renameTableGroup = new Group(composite, SWT.SHADOW_ETCHED_IN);
      renameTableGroup.setText("Rename implementations");
      renameTableGroup.setLayoutData(new GridData(GridData.FILL, GridData.FILL,
          true, true, 2, 1));
      renameTableGroup.setEnabled(false);

      final GridLayout gridLayout_1 = new GridLayout();
      gridLayout_1.numColumns = 1;
      renameTableGroup.setLayout(gridLayout_1);

      final Label srcRenameTableLabel = new Label(renameTableGroup, SWT.NONE);
      srcRenameTableLabel.setLayoutData(new GridData(GridData.BEGINNING,
          GridData.CENTER, false, false));
      srcRenameTableLabel.setText("Source renaming:");

      renameTable = new TableViewer(renameTableGroup, SWT.FULL_SELECTION
          | SWT.BORDER);
      renameTable.setContentProvider(new ArrayContentProvider());
      final TableViewerColumn initialPathColumn = new TableViewerColumn(
          renameTable, SWT.NONE);
      initialPathColumn.setLabelProvider(new ColumnLabelProvider() {
        @Override
        public String getText(final Object element) {
          return ((SourceRename) element).source.getPath();
        }
      });
      TableColumn column = initialPathColumn.getColumn();
      column.setText("Initial Path");
      column.setWidth(150);
      column.setResizable(true);

      final TableViewerColumn newPathColumn = new TableViewerColumn(
          renameTable, SWT.FILL);
      newPathColumn.setLabelProvider(new ColumnLabelProvider() {
        @Override
        public String getText(final Object element) {
          return ((SourceRename) element).newName;
        }
      });
      column = newPathColumn.getColumn();
      column.setText("New Path");
      column.setWidth(150);
      column.setResizable(true);
      newPathColumn.setEditingSupport(new NewPathEditor());

      final Table table = renameTable.getTable();
      table
          .setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));
      table.setHeaderVisible(true);
      table.setLinesVisible(true);

      renameTableGroup.setEnabled(false);
      for (final Control c : renameTableGroup.getChildren()) {
        c.setEnabled(false);
      }
    }

    @Override
    public IWizardPage getNextPage() {
      getRefactoring().setSourceRenames(
          moveSourceFiles.getSelection() ? renameTableInput : null);
      return super.getNextPage();
    }

    @Override
    protected boolean performFinish() {
      getRefactoring().setSourceRenames(
          moveSourceFiles.getSelection() ? renameTableInput : null);
      return super.performFinish();
    }

    protected class NewPathEditor extends EditingSupport {

      public NewPathEditor() {
        super(renameTable);
      }

      @Override
      protected CellEditor getCellEditor(final Object element) {
        return new TextCellEditor(renameTable.getTable());
      }

      @Override
      protected boolean canEdit(final Object element) {
        return true;
      }

      @Override
      protected Object getValue(final Object element) {
        return ((SourceRename) element).newName.toString();
      }

      @Override
      protected void setValue(final Object element, final Object value) {
        ((SourceRename) element).newName = String.valueOf(value);
        renameTable.refresh(element);
      }

    }

  }
}
