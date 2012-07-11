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

package org.ow2.mind.ui;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.ui.containers.AbstractAllContainersState;
import org.ow2.minded.project.builder.MindNature;
import org.ow2.minded.project.properties.IMindProjectChangeListener;
import org.ow2.minded.project.properties.MindProjectConfiguration;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class MindProjectsState extends AbstractAllContainersState implements IMindProjectChangeListener {

  @Inject
  private MindProjectsStateHelper helper;

  public MindProjectsState() {
    super();
    MindNature.addMindProjectChangeListener(this);
  }

  @Override
  protected String doInitHandle(URI uri) {
    return helper.initHandle(uri);
  }

  @Override
  protected Collection<URI> doInitContainedURIs(String containerHandle) {
    return helper.initContainedURIs(containerHandle);
  }

  @Override
  protected List<String> doInitVisibleHandles(String handle) {
    return helper.initVisibleHandles(handle);
  }

  public MindProjectsStateHelper getHelper() {
    return helper;
  }

  public void setHelper(MindProjectsStateHelper helper) {
    this.helper = helper;
  }

  public void configurationChanged(MindProjectConfiguration newConfiguration) {
    initialize();
  }

}
