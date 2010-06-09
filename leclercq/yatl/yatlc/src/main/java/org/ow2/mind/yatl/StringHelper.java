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

package org.ow2.mind.yatl;

public final class StringHelper {

  private StringHelper() {
  }

  public static String escapeString(String s) {
    StringBuilder r = new StringBuilder((int) (s.length() * 1.1));
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == '\"' || c == '\'' || c == '\\') {
        r.append('\\').append(c);
      } else if (c == '\n') {
        r.append("\\n");
      } else if (c == '\t') {
        r.append("\\t");
      } else if (c == '\r') {
        r.append("\\r");
      } else if (c != '\\') {
        r.append(c);
      }
    }
    return r.toString();
  }

}
