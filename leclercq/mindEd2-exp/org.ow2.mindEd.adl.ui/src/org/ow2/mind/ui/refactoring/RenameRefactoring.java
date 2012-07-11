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

import org.eclipse.ltk.core.refactoring.participants.ProcessorBasedRefactoring;

public class RenameRefactoring extends ProcessorBasedRefactoring {

  private final String initialName;
  private String       newName;
  private boolean      updateReferences;

  public RenameRefactoring(final RenameRefactoringProcessor processor) {
    super(processor);
    this.initialName = processor.getInitialName();
    this.newName = initialName;
  }

  /**
   * @return the initialName
   */
  public String getInitialName() {
    return initialName;
  }

  /**
   * @return the newName
   */
  public String getNewName() {
    return newName;
  }

  /**
   * @param newName the newName to set
   */
  public void setNewName(final String newName) {
    this.newName = newName;
  }

  /**
   * @return the updateReferences
   */
  public boolean isUpdateReferences() {
    return updateReferences;
  }

  /**
   * @param updateReferences the updateReferences to set
   */
  public void setUpdateReferences(final boolean updateReferences) {
    this.updateReferences = updateReferences;
  }

  @Override
  public RenameRefactoringProcessor getProcessor() {
    return (RenameRefactoringProcessor) super.getProcessor();
  }
}
