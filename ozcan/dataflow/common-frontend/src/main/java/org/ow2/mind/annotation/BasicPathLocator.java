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

import static org.objectweb.fractal.adl.util.ClassLoaderHelper.getClassLoader;
import static org.ow2.mind.PathHelper.isRelative;
import static org.ow2.mind.PathHelper.isValid;

import java.net.URL;
import java.util.Map;

import org.objectweb.fractal.adl.Definition;
import org.ow2.mind.InputResource;
import org.ow2.mind.PathHelper;
import org.ow2.mind.PathHelper.InvalidRelativPathException;

public class BasicPathLocator implements PathLocator {

  public URL findResource(final String path, final Definition pathContext,
      final Map<Object, Object> context) {
    if (!isValid(path)) {
      throw new IllegalArgumentException("\"" + path + "\" is not a valid path");
    }
    String validPath = path;
    if (isRelative(path)) {
      try {
        validPath = PathHelper.fullyQualifiedNameToAbsolute(
            pathContext.getName(), path);
      } catch (final InvalidRelativPathException e) {
        throw new IllegalArgumentException("\"" + path
            + "\" is not a valid path");
      }
    }
    return getClassLoader(this, context).getResource(validPath.substring(1));
  }

  public InputResource toInputResource(final String path) {
    return new InputResource(PathLocator.PATH_RESOURCE_KIND, path);
  }

}
