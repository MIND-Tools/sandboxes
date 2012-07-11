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
import org.ow2.mind.adl.AdlFactory;
import org.ow2.mind.adl.Interface;
import org.ow2.mind.adl.TypeInterface;

public class AddedInterfaceDescriptor {

  public static final String ADD_INTERFACE_ELEMENT     = "addInterface";
  public static final String NAME_ATTRIBUTE            = "name";
  public static final String ROLE_ATTRIBUTE            = "role";
  public static final String ROLE_CLIENT               = "client";
  public static final String ROLE_SERVER               = "server";
  public static final String SIGNATURE_ATTRIBUTE       = "signature";
  public static final String CARDINALITY_ATTRIBUTE     = "cardinality";
  public static final String CARDINALITY_SINGLETON     = "singleton";
  public static final String CARDINALITY_COLLECTION    = "collection";
  public static final String COLLECTION_SIZE_ATTRIBUTE = "collectionSize";

  private final String       name;
  private final boolean      isServer;
  private final String       signature;
  private final boolean      isCollection;
  private final int          collectionSize;

  public AddedInterfaceDescriptor(IConfigurationElement e) {
    if (!ADD_INTERFACE_ELEMENT.equals(e.getName()))
      throw new IllegalArgumentException();

    this.name = e.getAttribute(NAME_ATTRIBUTE);
    this.isServer = ROLE_SERVER.equals(e.getAttribute(ROLE_ATTRIBUTE));
    this.signature = e.getAttribute(SIGNATURE_ATTRIBUTE);
    this.isCollection = CARDINALITY_COLLECTION.equals(e
        .getAttribute(CARDINALITY_ATTRIBUTE));

    int i;
    try {
      String collectionSize = e.getAttribute(COLLECTION_SIZE_ATTRIBUTE);
      if (collectionSize == null) {
        i = -1;
      } else {
        i = Integer.parseInt(collectionSize);
      }
    } catch (NumberFormatException e1) {
      System.out
          .println("Warning invalid collection size in plugin configuration : "
              + e.getDeclaringExtension().getNamespaceIdentifier());
      i = -1;
    }
    this.collectionSize = i;
  }

  public TypeInterface createInterfaceModel() {
    TypeInterface itf;
    if (isServer) {
      itf = AdlFactory.eINSTANCE.createServerInterface();
    } else {
      itf = AdlFactory.eINSTANCE.createClientInterface();
    }
    itf.setName(name);
    itf.setSignature(signature);
    return itf;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @return the isServer
   */
  public boolean isServer() {
    return isServer;
  }

  /**
   * @return the signature
   */
  public String getSignature() {
    return signature;
  }

  /**
   * @return the isCollection
   */
  public boolean isCollection() {
    return isCollection;
  }

  /**
   * @return the collectionSize
   */
  public int getCollectionSize() {
    return collectionSize;
  }
}
