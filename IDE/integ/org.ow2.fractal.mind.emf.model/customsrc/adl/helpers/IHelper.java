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
package adl.helpers;

import org.eclipse.emf.ecore.EObject;

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
	
	
}
