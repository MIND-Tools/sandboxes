/**
 * 
 */
package org.ow2.mindEd.ide.ui.views;

import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;

/**
 * Manage list and array of input element.
 * 
 */
public final class ListAndAdapterFactoryContentProvider extends
		AdapterFactoryContentProvider {
	public ListAndAdapterFactoryContentProvider(
			AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object[] getElements(Object object) {
		if (object instanceof List) {
			return ((List)object).toArray();
		}
		if (object instanceof Object[]) {
			return (Object[]) object;
		}
		return super.getElements(object);
	}
}