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

package org.ow2.mind.ui.hyperlinking;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hyperlinking.HyperlinkHelper;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkAcceptor;
import org.eclipse.xtext.util.TextLocation;
import org.ow2.mind.adl.AdlPackage;
import org.ow2.mind.adl.Implementation;
import org.ow2.mind.ui.AdlUIHelper;

import com.google.inject.Inject;

public class AdlHyperlinkHelper extends HyperlinkHelper {

  private final static Logger log = Logger.getLogger(AdlHyperlinkHelper.class);

  @Inject
  private AdlUIHelper         helper;

  @Override
  public void createHyperlinksByOffset(final XtextResource resource,
      final int offset, final IHyperlinkAcceptor acceptor) {
    final TextLocation textLocation = new TextLocation();
    final EObject object = EObjectAtOffsetHelper.resolveElementAt(resource,
        offset, textLocation);

    IFile source = null;
    List<AbstractNode> nodes = null;
    if (object instanceof Implementation) {
      source = helper.resolveImplementation((Implementation) object);
      nodes = NodeUtil.findNodesForFeature(object,
          AdlPackage.eINSTANCE.getImplementation_Path());
    }
    if (source != null && source.exists()) {
      final Region region;
      if (nodes != null && nodes.size() > 0) {
        region = new Region(nodes.get(0).getOffset(), nodes.get(0).getLength());
      } else {
        region = new Region(textLocation.getOffset(), textLocation.getLength());
      }

      final IFile srcFile = source;
      acceptor.accept(new IHyperlink() {
        public void open() {
          try {
            IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                .getActivePage(), srcFile);
          } catch (final PartInitException e) {
            log.error(e.getMessage(), e);
          }
        }

        public String getTypeLabel() {
          return null;
        }

        public String getHyperlinkText() {
          return null;
        }

        public IRegion getHyperlinkRegion() {
          return region;
        }
      });
    }

    super.createHyperlinksByOffset(resource, offset, acceptor);
  }

}
