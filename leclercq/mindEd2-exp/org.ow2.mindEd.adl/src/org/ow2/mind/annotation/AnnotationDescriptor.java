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

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IConfigurationElement;

public class AnnotationDescriptor {

  public static final String ANNOTATION_ELEMENT    = "annotation";
  public static final String NAME_ATTRIBUTE        = "name";
  public static final String DESCRIPTION_ATTRIBUTE = "description";
  public static final String TARGET_SUB_ELEMENT    = "target";
  public static final String TARGET_TYPE_ATTRIBUTE = "type";

  public enum Target {
    DEFINITION, INTERFACE, IMPORT, SOURCE, SUB_COMPONENT, BINDING, ATTRIBUTE
  }

  private final String                                 name;
  private final String                                 description;
  private final String                                 fullDescription;
  private final Map<String, AnnotationFieldDescriptor> fields;
  private final Set<Target>                            targets;
  private final List<AddedInterfaceDescriptor>         addedInterfaces;

  protected AnnotationDescriptor(IConfigurationElement e) {
    if (!ANNOTATION_ELEMENT.equals(e.getName()))
      throw new IllegalArgumentException();
    this.name = e.getAttribute(NAME_ATTRIBUTE);
    this.description = e.getAttribute(DESCRIPTION_ATTRIBUTE);

    IConfigurationElement[] fields = e
        .getChildren(AnnotationFieldDescriptor.FIELD_ELEMENT);
    this.fields = new HashMap<String, AnnotationFieldDescriptor>(fields.length);
    for (int i = 0; i < fields.length; i++) {
      AnnotationFieldDescriptor field = new AnnotationFieldDescriptor(fields[i]);
      this.fields.put(field.getName(), field);
    }

    IConfigurationElement[] targets = e.getChildren(TARGET_SUB_ELEMENT);
    this.targets = new HashSet<AnnotationDescriptor.Target>(targets.length);
    for (int i = 0; i < targets.length; i++) {
      this.targets.add(Target.valueOf(targets[i]
          .getAttribute(TARGET_TYPE_ATTRIBUTE)));
    }

    IConfigurationElement[] addedInterfaces = e
        .getChildren(AddedInterfaceDescriptor.ADD_INTERFACE_ELEMENT);
    this.addedInterfaces = new ArrayList<AddedInterfaceDescriptor>(
        addedInterfaces.length);
    for (int i = 0; i < addedInterfaces.length; i++) {
      this.addedInterfaces
          .add(new AddedInterfaceDescriptor(addedInterfaces[i]));
    }

    // compute fullDescription.
    StringBuilder sb = new StringBuilder(description);
    sb.append("\n\n");
    if (this.fields.size() == 1
        && this.fields
            .containsKey(AnnotationFieldDescriptor.DEFAULT_FIELD_NAME)) {
      // annotation has only one field that is value
      AnnotationFieldDescriptor fieldDescriptor = this.fields
          .get(AnnotationFieldDescriptor.DEFAULT_FIELD_NAME);
      sb.append(this.name).append("(").append(fieldDescriptor.getType().getSample())
          .append(")\n\n");
      if (fieldDescriptor.getDescription() != null)
        sb.append("Field value is : ")
            .append(fieldDescriptor.getDescription()).append("\n\n");
    } else if (this.fields.size() > 0) {
      // annotation has named fields
      sb.append(this.name).append("(");
      Iterator<AnnotationFieldDescriptor> iter = this.fields.values()
          .iterator();
      while (iter.hasNext()) {
        AnnotationFieldDescriptor fieldDescriptor = iter.next();
        sb.append(fieldDescriptor.getName()).append("=")
            .append(fieldDescriptor.getType().getSample());
        if (iter.hasNext()) sb.append(", ");
      }
      sb.append(")\n\n");

      iter = this.fields.values().iterator();
      while (iter.hasNext()) {
        AnnotationFieldDescriptor fieldDescriptor = iter.next();
        if (fieldDescriptor.getDescription() != null)
          sb.append("  ").append(fieldDescriptor.getName()).append(" : ")
              .append(fieldDescriptor.getDescription()).append("\n");
      }
      sb.append("\n");
    }
    
    if(! this.addedInterfaces.isEmpty()) {
      sb.append("This annotation adds the following interface(s) to the definition to which\nit belongs:\n\n");
      for (AddedInterfaceDescriptor interfaceDescriptor : this.addedInterfaces) {
       sb.append(interfaceDescriptor.isServer()? "  provides " : "  requires ")
         .append(interfaceDescriptor.getSignature()).append(" as ").append(interfaceDescriptor.getName());
       if (interfaceDescriptor.isCollection()) {
         sb.append("[");
         if (interfaceDescriptor.getCollectionSize() != -1) {
           sb.append(interfaceDescriptor.getCollectionSize());
         }
         sb.append("]");
       }
       sb.append(";\n");
      }
      sb.append("\n");
    }
    
    sb.append("This annotation can be specified on: ");
    Iterator<Target> iter = this.targets.iterator();
    while (iter.hasNext()) {
      Target target = iter
          .next();
      sb.append(target);
      if (iter.hasNext()) sb.append(", ");
    }
    
    fullDescription = sb.toString();
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @return the description
   */
  public String getDescription() {
    return description;
  }
  
  /**
   * @return the fullDescription
   */
  public String getFullDescription() {
    return fullDescription;
  }

  /**
   * @return the fields
   */
  public Map<String, AnnotationFieldDescriptor> getFields() {
    return Collections.unmodifiableMap(fields);
  }

  /**
   * @return the fields
   */
  public Set<String> getFieldNames() {
    return Collections.unmodifiableSet(fields.keySet());
  }

  public AnnotationFieldDescriptor getField(String name) {
    return fields.get(name);
  }

  /**
   * @return the targets
   */
  public Set<Target> getTargets() {
    return Collections.unmodifiableSet(targets);
  }

  /**
   * @return the addedInterfaces
   */
  public List<AddedInterfaceDescriptor> getAddedInterfaces() {
    return Collections.unmodifiableList(addedInterfaces);
  }
}
