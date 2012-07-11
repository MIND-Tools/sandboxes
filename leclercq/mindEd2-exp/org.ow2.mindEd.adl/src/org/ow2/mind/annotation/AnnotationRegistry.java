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

package org.ow2.mind.annotation;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;

public class AnnotationRegistry {

  public static final String                         EXTENSION_POINT_ID = "org.ow2.mindEd.adl.AdlAnnotation";
  protected static Map<String, AnnotationDescriptor> registry;
  protected static String[]                          cachedAnnotationNames;

  public static String[] getAnnotationNames() {
    return getCachedAnnotationNames();
  }

  public static Collection<AnnotationDescriptor> getAnnotationDescriptors() {
    initRegistry();
    return Collections.unmodifiableCollection(registry.values());
  }

  public static AnnotationDescriptor getAnnotationDescriptor(String name) {
    initRegistry();
    return registry.get(name);
  }

  public static synchronized void registerAnnotationDescriptor(
      AnnotationDescriptor descriptor) {
    initRegistry();
    registry.put(descriptor.getName(), descriptor);
  }

  protected static synchronized String[] getCachedAnnotationNames() {
    if (cachedAnnotationNames == null) {
      initRegistry();
      cachedAnnotationNames = registry.keySet().toArray(
          new String[registry.size()]);
    }
    return cachedAnnotationNames;
  }

  protected static synchronized void initRegistry() {
    if (registry != null) return;

    registry = new HashMap<String, AnnotationDescriptor>();
    IExtensionPoint extensionPoint = Platform.getExtensionRegistry()
        .getExtensionPoint(EXTENSION_POINT_ID);
    if (extensionPoint == null) return;
    IExtension[] extensions = extensionPoint.getExtensions();
    for (IExtension extension : extensions) {
      System.out.println("Annotation registry : evalute extention "
          + extension.getUniqueIdentifier());
      IConfigurationElement[] configurationElements = extension
          .getConfigurationElements();
      for (int i = 0; i < configurationElements.length; i++) {
        AnnotationDescriptor annotationDescriptor = new AnnotationDescriptor(
            configurationElements[i]);
        registry.put(annotationDescriptor.getName(), annotationDescriptor);
      }
    }
  }

}
