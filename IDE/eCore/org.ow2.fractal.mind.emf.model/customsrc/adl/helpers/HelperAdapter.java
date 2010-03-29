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

import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;

import adl.AdlDefinition;
import adl.ArchitectureDefinition;

/**
 * The Class HelperAdapter.
 * 
 * @param <T>  * 
 * @author Yann Davin
 */
public abstract class HelperAdapter<T extends EObject> extends AdapterImpl 
implements IHelper<T>{
	/** The t. */
	protected T t;
	protected ArchitectureDefinition ParentComponent;

	protected HashMap<Integer, List<EObject>> usedResources = new HashMap<Integer, List<EObject>>();
	
	/** In the Fractal ADL we can add xml comments. 'comments' is the list of xml comments attached
	 * to the target model element. 
	 */
	protected List<String> comments;
	
	/**
	 * Instantiates a new helper adapter.
	 * 
	 * @param t the t
	 */
	public HelperAdapter(T t){
		this.t = t;
		findParentComponent();
	}
	
	/* (non-Javadoc)
	 * @see org.ow2.fractal.adl.extended.fractalextended.adapter.helper.Helper#getObject()
	 */
	public T getObject(){
		return this.t;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.notify.impl.AdapterImpl#isAdapterForType(java.lang.Object)
	 */
	public boolean isAdapterForType(Object type) {
		return type == IHelper.class;
	}

	/**
	 * Return the list of xml comments attached to the target model element.
	 */
	public List<String> getComments() {
		return comments;
	}

	/**
	 * Attach xml comments to the target model element.
	 */
	public void setComments(List<String> comments) {
		this.comments = comments;
	}	

	public void findParentComponent()
	{
		ParentComponent = null;
		EObject object=getObject();
		while(object!=null && !(object instanceof AdlDefinition))
		{
			object=object.eContainer();
		}
		if(object!=null)
		{
			ParentComponent = ((AdlDefinition) object).getArchitecturedefinition();
		}
	}

	public ArchitectureDefinition getParentComponent() {
		findParentComponent();
		return ParentComponent;
	}
}
