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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ParseException extends Exception {

  final List<String> messages;
  
  public ParseException(String message, Throwable cause) {
    super(message, cause);
    messages = new ArrayList<String>();
    messages.add(message);
  }

  public ParseException(String message) {
    this(message, null);
  }

  public ParseException(List<String> messages) {
    super(formatMessages(messages));
    this.messages = messages;
  }
  
  public List<String> getMessages() {
    return messages;
  }

  private static String formatMessages(List<String> messages) {
    String s = "";
    Iterator<String> iter = messages.iterator();
    while (iter.hasNext()) {
      String message = iter.next();
      s+=message;
      if (iter.hasNext()) s+="\n";
    }
    return s;
  }
}
