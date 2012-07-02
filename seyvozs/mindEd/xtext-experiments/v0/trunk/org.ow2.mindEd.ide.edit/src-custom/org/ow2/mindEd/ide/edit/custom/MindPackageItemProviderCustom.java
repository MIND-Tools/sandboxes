/**
 * 
 */
package org.ow2.mindEd.ide.edit.custom;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.ow2.mindEd.ide.edit.provider.MindPackageItemProvider;
import org.ow2.mindEd.ide.model.MindPackage;

public final class MindPackageItemProviderCustom extends
		MindPackageItemProvider {
	public MindPackageItemProviderCustom(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		String label = ((MindPackage)object).getName();
		return label == null || label.length() == 0 ?
			"(Default package)" :
			label;
	}
}