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

import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.util.Triple;
import org.eclipse.xtext.util.Tuples;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

public class EObjectResolver
    implements
      IUnitOfWork<Triple<EObject, IEObjectDescription, IResourceDescription>, XtextResource> {
  private final ITextSelection  selection;
  private IResourceDescriptions resourceDescriptions;

  public EObjectResolver(ITextSelection selection,
      IResourceDescriptions resourceDescriptions) {
    this.selection = selection;
    this.resourceDescriptions = resourceDescriptions;
  }

  public Triple<EObject, IEObjectDescription, IResourceDescription> exec(
      XtextResource state) throws Exception {
    EObject element = EObjectAtOffsetHelper.resolveElementAt(state,
        selection.getOffset(), null);
    if (element != null) {
      final URI eObjectURI = EcoreUtil.getURI(element);
      IResourceDescription resourceDescription = resourceDescriptions
          .getResourceDescription(eObjectURI.trimFragment());
      if (resourceDescription != null) {
        Iterator<IEObjectDescription> eObjectDescriptions = Iterables.filter(
            resourceDescription.getExportedObjects(),
            new Predicate<IEObjectDescription>() {
              public boolean apply(IEObjectDescription input) {
                return input.getEObjectURI().equals(eObjectURI);
              }
            }).iterator();
        if (eObjectDescriptions.hasNext()) {
          return Tuples.create(element, eObjectDescriptions.next(),
              resourceDescription);
        }
      }
    }
    return null;
  }
}
