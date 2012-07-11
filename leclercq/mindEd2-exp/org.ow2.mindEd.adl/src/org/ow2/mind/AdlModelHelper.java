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

package org.ow2.mind;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.ow2.mind.adl.AbstractDefinition;
import org.ow2.mind.adl.AdlPackage;
import org.ow2.mind.adl.Annotation;
import org.ow2.mind.adl.AnonymousDefinition;
import org.ow2.mind.adl.Binding;
import org.ow2.mind.adl.ClientInterface;
import org.ow2.mind.adl.CompositeAnonymousDefinition;
import org.ow2.mind.adl.Content;
import org.ow2.mind.adl.Data;
import org.ow2.mind.adl.Definition;
import org.ow2.mind.adl.DefinitionReference;
import org.ow2.mind.adl.Implementation;
import org.ow2.mind.adl.InputInterface;
import org.ow2.mind.adl.Interface;
import org.ow2.mind.adl.OutputInterface;
import org.ow2.mind.adl.ParameterDecl;
import org.ow2.mind.adl.ParametricDefinition;
import org.ow2.mind.adl.PrimitiveAnonymousDefinition;
import org.ow2.mind.adl.ServerInterface;
import org.ow2.mind.adl.Source;
import org.ow2.mind.adl.SubComponent;
import org.ow2.mind.adl.TemplateParameterDecl;
import org.ow2.mind.adl.TypeDefinition;
import org.ow2.mind.annotation.AddedInterfaceDescriptor;
import org.ow2.mind.annotation.AnnotationDescriptor;
import org.ow2.mind.annotation.AnnotationRegistry;

public class AdlModelHelper {

  public static boolean equalsOrNulls(final Object o1, final Object o2) {
    if (o1 == null) {
      return o2 == null;
    } else {
      return o2 != null && o1.equals(o2);
    }
  }

  public static final Pattern FQN_PATTERN = Pattern
                                              .compile("([a-zA-Z_]\\w*)(\\.[a-zA-Z_]\\w*)*");

  public static final boolean isValidFQN(final String name) {
    return FQN_PATTERN.matcher(name).matches();
  }

  public static final Pattern IMPORT_PATTERN = Pattern
                                              .compile("([a-zA-Z_]\\w*)(\\.[a-zA-Z_]\\w*)*(\\.\\*)?");

  public static final boolean isValidImport(final String name) {
    return IMPORT_PATTERN.matcher(name).matches();
  }

  public static final String getPackageName(final String name) {
    Assert.isTrue(isValidImport(name));
    final int i = name.lastIndexOf('.');
    return i == -1 ? null : name.substring(0, i);
  }

  public static final String getSimpleName(final String name) {
    Assert.isTrue(isValidImport(name));
    final int i = name.lastIndexOf('.');
    return i == -1 ? name : name.substring(i + 1);
  }

  public static final Pattern ID_PATTERN = Pattern
                                             .compile("[a-zA-Z_]([a-zA-Z_0-9])*");

  public static boolean isValidIdentifier(final String id) {
    return ID_PATTERN.matcher(id).matches();
  }

  public static List<? extends Content> getContent(
      final AbstractDefinition definition) {

    if (definition instanceof TypeDefinition) {
      return ((TypeDefinition) definition).getContent();
    } else if (definition instanceof ParametricDefinition) {
      return ((ParametricDefinition) definition).getContent();
    } else if (definition instanceof AnonymousDefinition) {
      return ((AnonymousDefinition) definition).getContent();
    } else {
      return Collections.emptyList();
    }
  }

  public static EList<ParameterDecl> getParameters(final Definition definition) {
    if (definition instanceof ParametricDefinition) {
      return ((ParametricDefinition) definition).getParameters();
    } else {
      return null;
    }
  }

  public static Definition getDefinition(final DefinitionReference defRef,
      final boolean resolveProxies) {
    if (defRef == null) return null;
    if (defRef.getDefinition() instanceof Definition) {
      Definition d = (Definition) defRef.getDefinition();
      if (d.eIsProxy() && resolveProxies) {
        d = (Definition) EcoreUtil.resolve(d, defRef);
      }
      return d;
    } else if (defRef.getDefinition() instanceof TemplateParameterDecl) {
      return getDefinition(
          ((TemplateParameterDecl) defRef.getDefinition()).getType(),
          resolveProxies);
    } else {
      return null;
    }
  }

  public static List<Definition> getExtendedDefinitions(
      final AbstractDefinition definition, final boolean resolveProxies) {

    if (definition instanceof Definition) {
      return getExtendedDefinitions((Definition) definition, resolveProxies);
    } else if (definition instanceof AnonymousDefinition) {
      return getExtendedDefinitions((AnonymousDefinition) definition,
          resolveProxies);
    } else {
      return Collections.emptyList();
    }
  }

  public static List<Definition> getExtendedDefinitions(
      final Definition definition, final boolean resolveProxies) {

    final EList<DefinitionReference> extendeds = definition.getExtends();
    final List<Definition> extendedDefs = new ArrayList<Definition>(
        extendeds.size());
    for (final DefinitionReference definitionReference : extendeds) {
      extendedDefs.add(getDefinition(definitionReference, resolveProxies));
    }
    return extendedDefs;
  }

  public static List<Definition> getExtendedDefinitions(
      final AnonymousDefinition definition, final boolean resolveProxies) {

    final List<Definition> extendedDefs = new ArrayList<Definition>(1);
    final EObject eContainer = definition.eContainer();
    if ((eContainer instanceof SubComponent)
        && ((SubComponent) eContainer).getType() != null) {
      extendedDefs.add(getDefinition(((SubComponent) eContainer).getType(),
          resolveProxies));
    }
    return extendedDefs;
  }

  protected static final ContentFilter<Interface>       INTERFACE_FILTER        = new ClassBasedContentFilter<Interface>(
                                                                                    Interface.class);

  protected static final ContentFilter<ClientInterface> CLIENT_INTERFACE_FILTER = new ClassBasedContentFilter<ClientInterface>(
                                                                                    ClientInterface.class);
  protected static final ContentFilter<ServerInterface> SERVER_INTERFACE_FILTER = new ClassBasedContentFilter<ServerInterface>(
                                                                                    ServerInterface.class);
  protected static final ContentFilter<OutputInterface> OUTPUT_INTERFACE_FILTER = new ClassBasedContentFilter<OutputInterface>(
                                                                                    OutputInterface.class);
  protected static final ContentFilter<InputInterface>  INPUT_INTERFACE_FILTER  = new ClassBasedContentFilter<InputInterface>(
                                                                                    InputInterface.class);

  public static List<Interface> getLocalInterfaces(
      final AbstractDefinition definition) {
    return filterContent(definition, INTERFACE_FILTER);
  }

  public static List<ClientInterface> getLocalClientInterfaces(
      final AbstractDefinition definition) {
    return filterContent(definition, CLIENT_INTERFACE_FILTER);
  }

  public static List<ServerInterface> getLocalServerInterfaces(
      final AbstractDefinition definition) {
    return filterContent(definition, SERVER_INTERFACE_FILTER);
  }

  public static List<InputInterface> getLocalInputInterfaces(
      final AbstractDefinition definition) {
    return filterContent(definition, INPUT_INTERFACE_FILTER);
  }

  public static List<OutputInterface> getLocalOutputInterfaces(
      final AbstractDefinition definition) {
    return filterContent(definition, OUTPUT_INTERFACE_FILTER);
  }

  protected static final Identifier<Interface> INTERFACE_IDENTIFIER = new FeatureBasedIdentifier<Interface>(
                                                                        AdlPackage.eINSTANCE
                                                                            .getInterface_Name());

  public static List<Interface> getAllInterfaces(
      final AbstractDefinition definition, final boolean resolveProxies) {
    return filterInheritedContent(definition, resolveProxies, INTERFACE_FILTER,
        INTERFACE_IDENTIFIER);
  }

  public static List<ClientInterface> getAllClientInterfaces(
      final AbstractDefinition definition, final boolean resolveProxies) {
    return filterInheritedContent(definition, resolveProxies,
        CLIENT_INTERFACE_FILTER, INTERFACE_IDENTIFIER);
  }

  public static List<ServerInterface> getAllServerInterfaces(
      final AbstractDefinition definition, final boolean resolveProxies) {
    return filterInheritedContent(definition, resolveProxies,
        SERVER_INTERFACE_FILTER, INTERFACE_IDENTIFIER);
  }

  public static List<InputInterface> getAllInputInterfaces(
      final AbstractDefinition definition, final boolean resolveProxies) {
    return filterInheritedContent(definition, resolveProxies,
        INPUT_INTERFACE_FILTER, INTERFACE_IDENTIFIER);
  }

  public static List<OutputInterface> getAllOutputInterfaces(
      final AbstractDefinition definition, final boolean resolveProxies) {
    return filterInheritedContent(definition, resolveProxies,
        OUTPUT_INTERFACE_FILTER, INTERFACE_IDENTIFIER);
  }

  public static List<Interface> getAllInterfaces(
      final SubComponent subComponent, final boolean resolveProxies) {
    return filterInheritedContent(subComponent, resolveProxies,
        INTERFACE_FILTER, INTERFACE_IDENTIFIER);
  }

  public static List<ClientInterface> getAllClientInterfaces(
      final SubComponent subComponent, final boolean resolveProxies) {
    return filterInheritedContent(subComponent, resolveProxies,
        CLIENT_INTERFACE_FILTER, INTERFACE_IDENTIFIER);
  }

  public static List<ServerInterface> getAllServerInterfaces(
      final SubComponent subComponent, final boolean resolveProxies) {
    return filterInheritedContent(subComponent, resolveProxies,
        SERVER_INTERFACE_FILTER, INTERFACE_IDENTIFIER);
  }

  public static List<InputInterface> getAllInputInterfaces(
      final SubComponent subComponent, final boolean resolveProxies) {
    return filterInheritedContent(subComponent, resolveProxies,
        INPUT_INTERFACE_FILTER, INTERFACE_IDENTIFIER);
  }

  public static List<OutputInterface> getAllOutputInterfaces(
      final SubComponent subComponent, final boolean resolveProxies) {
    return filterInheritedContent(subComponent, resolveProxies,
        OUTPUT_INTERFACE_FILTER, INTERFACE_IDENTIFIER);
  }

  protected static final ContentFilter<SubComponent> SUB_COMPONENT_FILTER = new ClassBasedContentFilter<SubComponent>(
                                                                              SubComponent.class);

  public static List<SubComponent> getLocalSubComponents(
      final AbstractDefinition definition) {
    return filterContent(definition, SUB_COMPONENT_FILTER);
  }

  protected static final Identifier<SubComponent> SUB_COMPONENT_IDENTIFIER = new FeatureBasedIdentifier<SubComponent>(
                                                                               AdlPackage.eINSTANCE
                                                                                   .getSubComponent_Name());

  public static List<SubComponent> getAllSubComponents(
      final AbstractDefinition definition, final boolean resolveProxies) {
    return filterInheritedContent(definition, resolveProxies,
        SUB_COMPONENT_FILTER, SUB_COMPONENT_IDENTIFIER);
  }

  protected static final ClassBasedContentFilter<Binding> BINDING_FILTER = new ClassBasedContentFilter<Binding>(
                                                                             Binding.class);

  public static List<Binding> getLocalBindings(
      final AbstractDefinition definition) {
    return filterContent(definition, BINDING_FILTER);
  }

  protected static final Identifier<Binding> BINDING_IDENTIFIER = new BindingIdentifier();

  public static List<Binding> getAllBindings(
      final AbstractDefinition definition, final boolean resolveProxies) {
    return filterInheritedContent(definition, resolveProxies, BINDING_FILTER,
        BINDING_IDENTIFIER);
  }

  protected static final ClassBasedContentFilter<Source> SOURCE_FILTER = new ClassBasedContentFilter<Source>(
                                                                           Source.class);

  public static List<Source> getLocalSources(final AbstractDefinition definition) {
    return filterContent(definition, SOURCE_FILTER);
  }

  public static List<Source> getAllSources(final AbstractDefinition definition,
      final boolean resolveProxies) {
    return filterInheritedContent(definition, resolveProxies, SOURCE_FILTER,
        null);
  }

  protected static final ClassBasedContentFilter<Data> DATA_FILTER = new ClassBasedContentFilter<Data>(
                                                                       Data.class);

  public static List<Data> getLocalDatas(final AbstractDefinition definition) {
    return filterContent(definition, DATA_FILTER);
  }

  public static List<Data> getAllDatas(final AbstractDefinition definition,
      final boolean resolveProxies) {
    return filterInheritedContent(definition, resolveProxies, DATA_FILTER, null);
  }

  protected static final ClassBasedContentFilter<Implementation> IMPLEMENTATION_FILTER = new ClassBasedContentFilter<Implementation>(
                                                                                           Implementation.class);

  public static List<Implementation> getLocalImplementations(
      final AbstractDefinition definition) {
    return filterContent(definition, IMPLEMENTATION_FILTER);
  }

  public static List<Implementation> getAllImplementations(
      final AbstractDefinition definition, final boolean resolveProxies) {
    return filterInheritedContent(definition, resolveProxies,
        IMPLEMENTATION_FILTER, null);
  }

  protected static <T extends Content> List<T> filterInheritedContent(
      final AbstractDefinition definition, final boolean resolveProxies,
      final ContentFilter<T> filter, final Identifier<? super T> identifier) {
    final List<T> content = filterContent(definition, filter);

    final List<Definition> extendedDefinitions = getExtendedDefinitions(
        definition, resolveProxies);
    final List<List<T>> extendedContents = new ArrayList<List<T>>(
        extendedDefinitions.size());
    for (final Definition extendedDefinition : extendedDefinitions) {
      extendedContents.add(filterInheritedContent(extendedDefinition,
          resolveProxies, filter, identifier));
    }
    return mergeContent(content, extendedContents, identifier);
  }

  protected static <T extends Content> List<T> filterInheritedContent(
      final SubComponent subComponent, final boolean resolvePRoxies,
      final ContentFilter<T> filter, final Identifier<? super T> identifier) {
    // First get content of subComponent.getType()
    final Definition subComponentDefinition = getDefinition(
        subComponent.getType(), resolvePRoxies);
    if (subComponentDefinition == null) return null;
    final List<T> extendedContent = filterInheritedContent(
        subComponentDefinition, resolvePRoxies, filter, identifier);

    // Second checks if subComponent defines an anonymous definition
    final AnonymousDefinition anonymousDef = subComponent.getAnonymousDef();
    if (anonymousDef == null) {
      return extendedContent;
    } else {
      final List<List<T>> extendedContents = new ArrayList<List<T>>(1);
      extendedContents.add(extendedContent);
      return mergeContent(filterContent(anonymousDef, filter),
          extendedContents, identifier);
    }
  }

  protected static <T extends EObject> List<T> filterContent(
      final AbstractDefinition definition, final ContentFilter<T> filter) {
    return filterContent(getAllContent(definition), filter);
  }

  protected static <T extends EObject> List<T> filterContent(
      final AnonymousDefinition definition, final ContentFilter<T> filter) {
    return filterContent(getAllContent(definition), filter);
  }

  protected static <T extends EObject> List<T> filterContent(
      final List<? extends Content> content, final ContentFilter<T> filter) {
    final List<T> filteredContent = new ArrayList<T>();
    for (final Content c : content) {
      final T f = filter.filter(c);
      if (f != null) {
        filteredContent.add(f);
      }
    }
    return filteredContent;
  }

  private static <T extends Content> List<T> mergeContent(
      final List<T> content, final List<List<T>> extendedContents,
      final Identifier<? super T> identifier) {
    if (identifier == null) {
      final List<T> mergedContent = new ArrayList<T>();
      for (final List<T> extendedContent : extendedContents) {
        for (final T c : extendedContent) {
          mergedContent.add(c);
        }
      }
      for (final T c : content) {
        mergedContent.add(c);
      }
      return mergedContent;
    }

    final LinkedHashMap<Object, T> mergedContent = new LinkedHashMap<Object, T>();

    for (final List<T> extendedContent : extendedContents) {
      for (final T c : extendedContent) {
        final Object id = identifier.getIdentifier(c);
        if (id != null) mergedContent.put(id, c);
      }
    }
    for (final T c : content) {
      final Object id = identifier.getIdentifier(c);
      if (id != null) mergedContent.put(id, c);
    }
    return new ArrayList<T>(mergedContent.values());
  }

  protected static List<Content> getAllContent(
      final AbstractDefinition definition) {
    if (definition instanceof Definition) {
      return getAllContent((Definition) definition);
    } else if (definition instanceof AnonymousDefinition) {
      return getAllContent((AnonymousDefinition) definition);
    } else {
      return Collections.emptyList();
    }
  }

  protected static List<Content> getAllContent(final Definition definition) {
    final List<Content> content = new ArrayList<Content>(getContent(definition));

    for (final Annotation annotation : definition.getAnnotations()) {
      content.addAll(getContent(annotation));
    }
    return content;
  }

  protected static List<Content> getAllContent(
      final AnonymousDefinition definition) {
    final List<Content> content = new ArrayList<Content>(getContent(definition));

    for (final Annotation annotation : definition.getAnnotations()) {
      content.addAll(getContent(annotation));
    }
    return content;
  }

  protected static List<? extends Content> getContent(
      final AnonymousDefinition definition) {
    if (definition instanceof PrimitiveAnonymousDefinition) {
      return ((PrimitiveAnonymousDefinition) definition).getContent();
    } else if (definition instanceof CompositeAnonymousDefinition) {
      return ((CompositeAnonymousDefinition) definition).getContent();
    } else {
      return Collections.emptyList();
    }
  }

  protected static List<Content> getContent(final Annotation annotation) {
    synchronized (annotation) {
      final EList<Content> addedContent = annotation.getAddedContent();
      if (!annotation.isAnnotationProcessed()) {
        annotation.setAnnotationProcessed(true);

        final AnnotationDescriptor descriptor = AnnotationRegistry
            .getAnnotationDescriptor(annotation.getName());
        if (descriptor == null) {
          return addedContent;
        }

        for (final AddedInterfaceDescriptor addedInterface : descriptor
            .getAddedInterfaces()) {
          addedContent.add(addedInterface.createInterfaceModel());
        }
      }
      return addedContent;
    }
  }

  protected static interface ContentFilter<T extends EObject> {
    T filter(Object content);
  }

  protected static class ClassBasedContentFilter<T extends EObject>
      implements
        ContentFilter<T> {

    final Class<? extends T> filteredClass;

    public ClassBasedContentFilter(final Class<? extends T> filteredClass) {
      this.filteredClass = filteredClass;
    }

    public T filter(final Object content) {
      return (filteredClass.isInstance(content))
          ? filteredClass.cast(content)
          : null;
    }
  }

  protected static interface Identifier<T extends EObject> {
    Object getIdentifier(T object);
  }

  protected static class FeatureBasedIdentifier<T extends EObject>
      implements
        Identifier<T> {

    final EStructuralFeature feature;

    public FeatureBasedIdentifier(final EStructuralFeature feature) {
      this.feature = feature;
    }

    public Object getIdentifier(final T object) {
      return object.eGet(feature);
    }

  }

  protected static class BindingIdentifier implements Identifier<Binding> {
    public Object getIdentifier(final Binding object) {
      final SubComponent fromSubComp = object.getFromSubComp();
      String fromSubCompName;
      if (fromSubComp == null)
        fromSubCompName = "this";
      else
        fromSubCompName = fromSubComp.getName();
      return fromSubCompName + "$" + object.getFromItf();
    }
  }

}
