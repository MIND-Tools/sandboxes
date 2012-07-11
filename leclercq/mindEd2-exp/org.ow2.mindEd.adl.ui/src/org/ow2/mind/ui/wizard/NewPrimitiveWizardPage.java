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

package org.ow2.mind.ui.wizard;

import org.eclipse.jface.resource.ImageDescriptor;
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
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.ow2.mind.adl.CompositeDefinition;
import org.ow2.mind.adl.Definition;
import org.ow2.mind.adl.TypeDefinition;

public class NewPrimitiveWizardPage extends NewDefinitionWizardPage {

  Button singletonButton;
  Button ctrlButton;
  Button lccButton;
  Button genDataButton;

  Label  inlineDataLabel;
  Button inlineDataButton;
  Label  autoDataNameLabel;
  Button autoDataNameButton;
  Label  dataNameLabel;
  Text   dataNameText;
  Button genSrcButton;
  Label  autoSrcNameLabel;
  Button autoSrcNameButton;
  Label  srcNameLabel;
  Text   srcNameText;

  public NewPrimitiveWizardPage() {
    super("New Primitive ADL");
    setTitle("Primitive ADL");
    setDescription("Create a new primitive ADL");
    setImageDescriptor(ImageDescriptor.createFromFile(this.getClass(),
    "/icons/new/PrimitiveComponent.png"));
  }

  @Override
  protected void createModifierLine(Composite composite) {

    Label annotationLabel = new Label(composite, SWT.NONE);
    annotationLabel.setLayoutData(new GridData(GridData.FILL, GridData.FILL,
        false, false));
    annotationLabel.setText("Annotations:");

    Composite annotationGroup = new Composite(composite, SWT.BORDER);
    annotationGroup.setLayoutData(new GridData(GridData.FILL,
        GridData.BEGINNING, true, false));
    GridLayout layout = new GridLayout();
    layout.numColumns = 4;
    layout.marginHeight = 0;
    layout.marginWidth = 0;
    layout.marginLeft = 5;
    annotationGroup.setLayout(layout);

    Label singletonLabel = new Label(annotationGroup, SWT.NONE);
    singletonLabel.setLayoutData(new GridData(GridData.BEGINNING,
        GridData.CENTER, false, false));
    singletonLabel.setText("Singleton:");

    singletonButton = new Button(annotationGroup, SWT.CHECK);
    singletonButton.setLayoutData(new GridData(GridData.BEGINNING,
        GridData.CENTER, false, false, 3, 1));
    singletonButton
        .setToolTipText("Add the '@Singleton' annotation to the new ADL");

    Label ctrlLabel = new Label(annotationGroup, SWT.NONE);
    ctrlLabel.setLayoutData(new GridData(GridData.BEGINNING, GridData.CENTER,
        false, false));
    ctrlLabel.setText("Default controllers:");

    ctrlButton = new Button(annotationGroup, SWT.CHECK);
    ctrlButton.setLayoutData(new GridData(GridData.BEGINNING, GridData.CENTER,
        false, false));
    ctrlButton
        .setToolTipText("Add the '@controller.StdControllers' annotation to the new ADL");

    Label lccLabel = new Label(annotationGroup, SWT.NONE);
    lccLabel.setLayoutData(new GridData(GridData.BEGINNING, GridData.CENTER,
        false, false));
    lccLabel.setText("Life-Cycle controller:");

    lccButton = new Button(annotationGroup, SWT.CHECK);
    lccButton.setLayoutData(new GridData(GridData.BEGINNING, GridData.CENTER,
        false, false));
    lccButton
        .setToolTipText("Add the '@controller.LifeCycleController' annotation to the new ADL");

    Label padding = new Label(composite, SWT.NONE);
    padding.setLayoutData(new GridData(GridData.FILL, GridData.FILL, false,
        false));
  }

  @Override
  protected void createEndLine(Composite composite) {

    Label dataLabel = new Label(composite, SWT.NONE);
    dataLabel.setLayoutData(new GridData(GridData.FILL, GridData.FILL, false,
        false));
    dataLabel.setText("Data:");

    Composite dataGroup = new Composite(composite, SWT.BORDER);
    dataGroup.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING,
        true, false));
    GridLayout layout = new GridLayout();
    layout.numColumns = 4;
    layout.marginHeight = 0;
    layout.marginBottom = 5;
    dataGroup.setLayout(layout);

    Label genDataLabel = new Label(dataGroup, SWT.NONE);
    genDataLabel.setLayoutData(new GridData(GridData.BEGINNING,
        GridData.CENTER, false, false));
    genDataLabel.setText("Generate data:");

    genDataButton = new Button(dataGroup, SWT.CHECK);
    genDataButton.setLayoutData(new GridData(GridData.BEGINNING,
        GridData.CENTER, false, false));
    genDataButton.setSelection(true);
    genDataButton.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {
        validate();
      }
    });

    inlineDataLabel = new Label(dataGroup, SWT.NONE);
    inlineDataLabel.setLayoutData(new GridData(GridData.BEGINNING,
        GridData.CENTER, false, false));
    inlineDataLabel.setText("Inline data in ADL file:");

    inlineDataButton = new Button(dataGroup, SWT.CHECK);
    inlineDataButton.setLayoutData(new GridData(GridData.BEGINNING,
        GridData.CENTER, false, false));
    inlineDataButton.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {
        validate();
      }
    });

    autoDataNameLabel = new Label(dataGroup, SWT.NONE);
    autoDataNameLabel.setLayoutData(new GridData(GridData.BEGINNING,
        GridData.CENTER, false, false));
    autoDataNameLabel.setText("Automatic file name:");

    autoDataNameButton = new Button(dataGroup, SWT.CHECK);
    autoDataNameButton.setLayoutData(new GridData(GridData.BEGINNING,
        GridData.CENTER, false, false, 3, 1));
    autoDataNameButton.setSelection(true);
    autoDataNameButton.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {
        validate();
      }
    });

    dataNameLabel = new Label(dataGroup, SWT.NONE);
    dataNameLabel.setLayoutData(new GridData(GridData.BEGINNING,
        GridData.CENTER, false, false));
    dataNameLabel.setText("File name:");

    dataNameText = new Text(dataGroup, SWT.BORDER);
    dataNameText.setLayoutData(new GridData(GridData.FILL, GridData.CENTER,
        true, false, 3, 1));
    dataNameText.addModifyListener(new ModifyListener() {
      public void modifyText(final ModifyEvent e) {
        // validateData();
      }
    });

    Label padding = new Label(composite, SWT.NONE);
    padding.setLayoutData(new GridData(GridData.FILL, GridData.FILL, false,
        false));

    // -------------------------------------------------------------------------
    // Source line

    Label sourceLabel = new Label(composite, SWT.NONE);
    sourceLabel.setLayoutData(new GridData(GridData.FILL, GridData.FILL, false,
        false));
    sourceLabel.setText("Source:");

    Composite sourceGroup = new Composite(composite, SWT.BORDER);
    sourceGroup.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING,
        true, false));
    layout = new GridLayout();
    layout.numColumns = 2;
    layout.marginHeight = 0;
    layout.marginBottom = 5;
    sourceGroup.setLayout(layout);

    Label genSrcLabel = new Label(sourceGroup, SWT.NONE);
    genSrcLabel.setLayoutData(new GridData(GridData.BEGINNING, GridData.CENTER,
        false, false));
    genSrcLabel.setText("Generate source:");

    genSrcButton = new Button(sourceGroup, SWT.CHECK);
    genSrcButton.setLayoutData(new GridData(GridData.BEGINNING,
        GridData.CENTER, false, false));
    genSrcButton.setSelection(true);
    genSrcButton.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {
        validate();
      }
    });

    autoSrcNameLabel = new Label(sourceGroup, SWT.NONE);
    autoSrcNameLabel.setLayoutData(new GridData(GridData.BEGINNING,
        GridData.CENTER, false, false));
    autoSrcNameLabel.setText("Automatic file name:");

    autoSrcNameButton = new Button(sourceGroup, SWT.CHECK);
    autoSrcNameButton.setLayoutData(new GridData(GridData.BEGINNING,
        GridData.CENTER, false, false));
    autoSrcNameButton.setSelection(true);
    autoSrcNameButton.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {
        validate();
      }
    });

    srcNameLabel = new Label(sourceGroup, SWT.NONE);
    srcNameLabel.setLayoutData(new GridData(GridData.BEGINNING,
        GridData.CENTER, false, false));
    srcNameLabel.setText("File name:");

    srcNameText = new Text(sourceGroup, SWT.BORDER);
    srcNameText.setLayoutData(new GridData(GridData.FILL, GridData.CENTER,
        true, false));
    srcNameText.addModifyListener(new ModifyListener() {
      public void modifyText(final ModifyEvent e) {
        // validateSrc();
      }
    });
  }

  @Override
  protected void validate() {

    boolean genData = genDataButton.getSelection();
    boolean inlineData = inlineDataButton.getSelection();
    boolean autoDataName = autoDataNameButton.getSelection();

    inlineDataLabel.setEnabled(genData);
    inlineDataButton.setEnabled(genData);
    autoDataNameLabel.setEnabled(genData && !inlineData);
    autoDataNameButton.setEnabled(genData && !inlineData);
    dataNameLabel.setEnabled(genData && !inlineData && !autoDataName);
    dataNameText.setEnabled(genData && !inlineData && !autoDataName);

    boolean genSrc = genSrcButton.getSelection();
    boolean autoSrcName = autoSrcNameButton.getSelection();

    autoSrcNameLabel.setEnabled(genSrc);
    autoSrcNameButton.setEnabled(genSrc);
    srcNameLabel.setEnabled(genSrc && !autoSrcName);
    srcNameText.setEnabled(genSrc && !autoSrcName);

    super.validate();
  }

  @Override
  protected void validateComplement() {
    if (genDataButton.getSelection() && !inlineDataButton.getSelection()) {
      if (autoDataNameButton.getSelection()) {
        dataNameText.setText(toDataFileName(nameText.getText()));
      } else {
        // TODO validate path
      }
    }

    if (genSrcButton.getSelection()) {
      if (autoSrcNameButton.getSelection()) {
        srcNameText.setText(toSrcFileName(nameText.getText()));
      } else {
        // TODO validate path
      }
    }

  }

  @Override
  protected boolean isValidSuperDefinition(Definition def) {
    return def instanceof TypeDefinition || def instanceof CompositeDefinition;
  }

  protected String toDataFileName(String defName) {
    String s = defName.substring(0, 1).toLowerCase() + defName.substring(1);
    return s + "_data.h";
  }

  protected String toSrcFileName(String defName) {
    String s = defName.substring(0, 1).toLowerCase() + defName.substring(1);
    return s + ".c";
  }
}
