/**
 * Copyright (C) 2009 STMicroelectronics
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
 * Authors: Ali Erdem Ozcan
 * Contributors: 
 */

package org.ow2.mind.annotation;

import java.net.URL;
import java.util.Map;

import javax.xml.transform.Source;

import org.objectweb.fractal.adl.Definition;
import org.ow2.mind.InputResource;

public interface PathLocator {
  /** Default name of this interface. */
  String ITF_NAME           = "path-locator";

  /**
   * The value of {@link InputResource#getKind() input-resource's kind} that is
   * used to reference a {@link Source}.
   */
  String PATH_RESOURCE_KIND = "path";

  public URL findResource(String path, Definition pathContext,
      final Map<Object, Object> context);

  InputResource toInputResource(String path);
}
