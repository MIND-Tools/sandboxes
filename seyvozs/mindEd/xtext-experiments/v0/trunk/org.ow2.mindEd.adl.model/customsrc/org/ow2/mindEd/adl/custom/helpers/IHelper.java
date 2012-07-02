/***
 * eFrac
 * Copyright (C) 2007 INRIA, France Telecom, USTL
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * Contact: yann.davin@gmail.com
 *
 * Author: Yann Davin
 */
package org.ow2.mindEd.adl.custom.helpers;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.ow2.mindEd.adl.ArchitectureDefinition;
import org.ow2.mindEd.adl.InterfaceDefinition;
import org.ow2.mindEd.adl.ComponentKind; 
import org.ow2.mindEd.adl.custom.impl.AdlDefinitionCustomImpl;

// TODO: Auto-generated Javadoc
/**
 * The Interface Helper.
 * @model
 */
public interface IHelper<T extends EObject> extends IHelperComments{
	
	/**
	 * 
	 * Gets the object.
	 * 
	 * @return the object
	 * @model default=""
	 */
	public T getObject();
	
	String getSimpleName(ArchitectureDefinition definition);
	
	ArchitectureDefinition getMainDefinition();
	
	void setComments(List<String> comments);
	
	List<String> getComments();
	
	boolean isAdapterForType(Object type);
	
	InterfaceDefinition getInterfaceByName(String interfaceName, String interfaceParentName);
	
	ArchitectureDefinition getComponentByName(String componentName);
	
	ComponentKind getComponentKind();
	
	String getNameFQN();
	
	AdlDefinitionCustomImpl getAdlDefinition();
	
	ArchitectureDefinitionHelper getParentComponentHelper();
	
	ArchitectureDefinition getParentComponent();
	
	String getAttributeName();
	
	Object getAttributeContainingName(String featureName);
	
	String calculateID();
	
	String getIndex();
}
