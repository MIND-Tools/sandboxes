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
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.LeafNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.IReferenceDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.Triple;
import org.eclipse.xtext.util.Tuples;
import org.ow2.mind.adl.AbstractDefinition;
import org.ow2.mind.adl.AdlPackage;
import org.ow2.mind.adl.Definition;
import org.ow2.mind.adl.DefinitionReference;
import org.ow2.mind.adl.Implementation;
import org.ow2.mind.adl.SubComponent;

import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
import com.google.inject.Inject;

public class AdlUIHelper {

  @Inject
  private MindProjectsStateHelper projectHelper;

  @Inject
  private IWorkspace              workspace;

  @Inject
  private IResourceDescriptions   resourceDescriptions;

  @Inject
  private XtextResourceSet        resourceSet;

  public EObject resolveObjectURI(final URI uri) {
    final Resource resource = resourceSet.getResource(uri.trimFragment(), true);
    if (resource == null) return null;
    return resource.getEObject(uri.fragment());
  }

  public IFile resolveImplementation(final Implementation impl) {
    final String p = impl.getPath();
    final Resource adlResource = impl.eResource();
    if (p == null) return null;
    final Path path = new Path(p);

    return resolvePath(path, adlResource);
  }

  public IFile resolvePath(final Path path, final Resource adlResource) {
    final URI uri = adlResource.getURI();

    if (path.isAbsolute()) {
      final IContainer sourceFolder = projectHelper.getSourceFolder(uri);
      return sourceFolder.getFile(path);
    } else {
      final IFile adlFile = workspace.getRoot().getFile(
          new Path(uri.toPlatformString(true)));
      return adlFile.getParent().getFile(path);
    }
  }

  public IFile resolvePath(final Path path, final IFile adlFile) {

    if (path.isAbsolute()) {
      final IContainer sourceFolder = projectHelper.getSourceFolder(adlFile);
      return sourceFolder.getFile(path);
    } else {
      return adlFile.getParent().getFile(path);
    }
  }

  public Set<AbstractDefinition> getDirectSubDefinitions(
      final AbstractDefinition definition) {
    final URI defURI = EcoreUtil.getURI(definition);
    final Set<AbstractDefinition> directSubDefs = new HashSet<AbstractDefinition>();
    for (final IResourceDescription resourceDescription : resourceDescriptions
        .getAllResourceDescriptions()) {
      for (final IReferenceDescription refDesc : resourceDescription
          .getReferenceDescriptions()) {
        if (!defURI.equals(refDesc.getTargetEObjectUri())) continue;

        if (AdlPackage.eINSTANCE.getDefinitionReference_Definition().equals(
            refDesc.getEReference())) {
          // refDesc is a cross-reference for the definition pointed by a
          // definition reference.
          // So refDesc.getTargetEObjectUri() points to an extended definition
          // if the definition reference correspond to an extends or a type of
          // a sub-component with an anonymous definition.
          final EObject eObject = resolveObjectURI(refDesc
              .getSourceEObjectUri());
          if (eObject != null) {
            final DefinitionReference defRef = (DefinitionReference) eObject;
            if (defRef.eContainer() instanceof Definition) {
              // defRef is contained by a definition, it is an extends.
              directSubDefs.add((Definition) defRef.eContainer());
            } else if (defRef.eContainer() instanceof SubComponent) {
              final SubComponent subComponent = (SubComponent) defRef
                  .eContainer();
              if (subComponent.getAnonymousDef() != null) {
                // defRef is contained by a sub-component that defines an
                // anonymous definition.
                directSubDefs.add(subComponent.getAnonymousDef());
              }
            }
          }
        }
      }
    }
    return directSubDefs;
  }

  public Set<AbstractDefinition> getAllSubDefinitions(
      final AbstractDefinition defURI) {
    // Map associating definition URI to the list of the URIs of the definitions
    // that extend it directly
    final Multimap<URI, AbstractDefinition> directSubDefMap = Multimaps
        .newHashMultimap();

    for (final IResourceDescription resourceDescription : resourceDescriptions
        .getAllResourceDescriptions()) {
      for (final IReferenceDescription refDesc : resourceDescription
          .getReferenceDescriptions()) {
        if (AdlPackage.eINSTANCE.getDefinitionReference_Definition().equals(
            refDesc.getEReference())) {
          // refDesc is a cross-reference for the definition pointed by a
          // definition reference.
          // So refDesc.getTargetEObjectUri() points to an extended definition
          // if the definition reference correspond to an extends or a type of
          // a sub-component with an anonymous definition.
          final URI extendedDef = refDesc.getTargetEObjectUri();
          // and refDesc.getSourceEObjectUri() points to the sub-definition
          final EObject eObject = resolveObjectURI(refDesc
              .getSourceEObjectUri());
          if (eObject != null) {
            final DefinitionReference defRef = (DefinitionReference) eObject;
            if (defRef.eContainer() instanceof Definition) {
              // defRef is contained by a definition, it is an extends.
              directSubDefMap
                  .put(extendedDef, (Definition) defRef.eContainer());
            } else if (defRef.eContainer() instanceof SubComponent) {
              final SubComponent subComponent = (SubComponent) defRef
                  .eContainer();
              if (subComponent.getAnonymousDef() != null) {
                // defRef is contained by a sub-component that defines an
                // anonymous definition.
                directSubDefMap
                    .put(extendedDef, subComponent.getAnonymousDef());
              }
            }
          }
        }
      }
    }

    final Set<AbstractDefinition> transitiveClosure = new HashSet<AbstractDefinition>();
    transitiveClosure(defURI, directSubDefMap, transitiveClosure);
    return transitiveClosure;
  }

  protected static void transitiveClosure(final AbstractDefinition elem,
      final Multimap<URI, AbstractDefinition> graph,
      final Set<AbstractDefinition> result) {
    final Collection<AbstractDefinition> values = graph.get(EcoreUtil
        .getURI(elem));
    if (values.isEmpty()) return;

    for (final AbstractDefinition value : values) {
      if (result.add(value)) {
        // if the value was not already in the result set, visit it
        transitiveClosure(value, graph, result);
      }
    }
  }

  public static Triple<String, Integer, Integer> findDefinitionReferenceName(
      final DefinitionReference defRef) {
    final List<AbstractNode> nodes = NodeUtil.findNodesForFeature(defRef,
        AdlPackage.eINSTANCE.getDefinitionReference_Definition());
    if (nodes.size() != 1) return null;

    final AbstractNode nameNode = nodes.get(0);
    final EList<LeafNode> leafNodes = nameNode.getLeafNodes();
    final Iterator<LeafNode> iter1 = leafNodes.iterator();
    // pass hidden leafNodes.
    LeafNode leafNode = null;
    while (iter1.hasNext()) {
      leafNode = iter1.next();
      if (!leafNode.isHidden()) break;
    }
    if (leafNode == null) return null;

    String name = leafNode.getText();
    final int offset = leafNode.getOffset();
    int length = leafNode.getLength();
    while (iter1.hasNext()) {
      leafNode = iter1.next();
      if (!leafNode.isHidden()) {
        name += leafNode.getText();
        length = leafNode.getOffset() + leafNode.getLength() - offset;
      }
    }
    return Tuples.create(name, offset, length);
  }

  protected IWorkspaceRoot getWorkspaceRoot() {
    return workspace.getRoot();
  }

  public void setWorkspace(final IWorkspace workspace) {
    this.workspace = workspace;
  }
}
