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
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.ow2.mind.adl.CompositeDefinition;
import org.ow2.mind.adl.Definition;
import org.ow2.mind.adl.TypeDefinition;

public class NewCompositeWizardPage extends NewDefinitionWizardPage {

  Button singletonButton;
  Button ctrlButton;

  public NewCompositeWizardPage() {
    super("New Composite ADL");
    setTitle("Composite ADL");
    setDescription("Create a new composite ADL");
    setImageDescriptor(ImageDescriptor.createFromFile(this.getClass(),
        "/icons/new/CompositeComponent.png"));
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
    layout.numColumns = 2;
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
        GridData.CENTER, false, false));
    singletonButton
        .setToolTipText("Add the '@Singleton' annotation to the new ADL");

    Label ctrlLabel = new Label(annotationGroup, SWT.NONE);
    ctrlLabel.setLayoutData(new GridData(GridData.BEGINNING, GridData.CENTER,
        false, false));
    ctrlLabel.setText("Standard controllers:");

    ctrlButton = new Button(annotationGroup, SWT.CHECK);
    ctrlButton.setLayoutData(new GridData(GridData.BEGINNING, GridData.CENTER,
        false, false));
    ctrlButton
        .setToolTipText("Add the '@controller.StdControllers' annotation to the new ADL");

    Label padding = new Label(composite, SWT.NONE);
    padding.setLayoutData(new GridData(GridData.FILL, GridData.FILL, false,
        false));
  }

  @Override
  protected void createEndLine(Composite composite) {
    // nothing to add
  }

  @Override
  protected void validateComplement() {
    // nothing to validate
  }

  @Override
  protected boolean isValidSuperDefinition(Definition def) {
    return def instanceof TypeDefinition || def instanceof CompositeDefinition;
  }
}
