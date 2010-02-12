/**
 * 
 */
package org.ow2.fractal.mind.ide.ui.properties;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

final public class TypedViewerFilter extends ViewerFilter {

	private Class<?>[] fAcceptedTypes;
	private Object[] fRejectedElements;

	/**
	 * Creates a filter that only allows elements of gives types.
	 * @param acceptedTypes The types of accepted elements
	 */
	public TypedViewerFilter(Class<?>[] acceptedTypes) {
		this(acceptedTypes, null);
	}

	/**
	 * Creates a filter that only allows elements of gives types, but not from a
	 * list of rejected elements.
	 * @param acceptedTypes Accepted elements must be of this types
	 * @param rejectedElements Element equals to the rejected elements are
	 * filtered out
	 */	
	public TypedViewerFilter(Class<?>[] acceptedTypes, Object[] rejectedElements) {
		Assert.isNotNull(acceptedTypes);
		fAcceptedTypes= acceptedTypes;
		fRejectedElements= rejectedElements;
	}	

	/**
	 * @see ViewerFilter#select
	 */
	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		if (fRejectedElements != null) {
			for (int i= 0; i < fRejectedElements.length; i++) {
				if (element.equals(fRejectedElements[i])) {
					return false;
				}
			}
		}
		for (int i= 0; i < fAcceptedTypes.length; i++) {
			if (fAcceptedTypes[i].isInstance(element)) {
				return true;
			}
		}
		return false;
	}

}