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

public class NewTypeWizardPage extends NewDefinitionWizardPage {

  Button  singletonButton;
  Control ctrlButton;
  Button  lccButton;


  public NewTypeWizardPage() {
    super("New Type ADL");
    setTitle("Type ADL");
    setDescription("Create a new type ADL");
    setImageDescriptor(ImageDescriptor.createFromFile(this.getClass(),
    "/icons/new/TypeComponent.png"));
  }

  @Override
  protected void createModifierLine(Composite composite) {
    // nothing to add
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
    return def instanceof TypeDefinition;
  }
}
