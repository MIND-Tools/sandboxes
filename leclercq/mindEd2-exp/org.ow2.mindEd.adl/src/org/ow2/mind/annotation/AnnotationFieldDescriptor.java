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

import org.eclipse.core.runtime.IConfigurationElement;

public class AnnotationFieldDescriptor {

  public static final String DEFAULT_FIELD_NAME = "value";

  public static final String FIELD_ELEMENT      = "field";
  public static final String NAME_ATTRIBUTE     = "name";
  public static final String DESCRIPTION_ATTRIBUTE = "description";
  public static final String TYPE_ATTRIBUTE     = "type";
  public static final String OPTIONAL_ATTRIBUTE = "optional";
  public static final String OPTIONAL_TRUE      = "true";
  public static final String OPTIONAL_FALSE     = "false";

  public enum Type {
    INTEGER("1"), STRING("\"...\""), BOOLEAN("true/false"), ANNOTATION("@..."), ARRAY(
        "{...}"), PATH("*.*");

    final String sample;

    private Type(String sample) {
      this.sample = sample;
    }

    public String getSample() {
      return sample;
    }
  }

  private final String  name;
  private final String description;
  private final Type    type;
  private final boolean optional;

  protected AnnotationFieldDescriptor(IConfigurationElement e) {
    if (!FIELD_ELEMENT.equals(e.getName()))
      throw new IllegalArgumentException();
    this.name = e.getAttribute(NAME_ATTRIBUTE);
    this.description = e.getAttribute(DESCRIPTION_ATTRIBUTE);
    this.type = Type.valueOf(e.getAttribute(TYPE_ATTRIBUTE));
    this.optional = OPTIONAL_TRUE.equals(e.getAttribute(OPTIONAL_ATTRIBUTE));
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
   * @return the type
   */
  public Type getType() {
    return type;
  }

  /**
   * @return the optional
   */
  public boolean isOptional() {
    return optional;
  }
}
