/**
 * 
 */
package org.ow2.fractal.mind.ide.emf.edit.custom;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry;
import org.ow2.fractal.mind.ide.emf.mindide.MindidePackage;
import org.ow2.fractal.mind.ide.emf.mindide.provider.MindPathEntryItemProvider;

public final class MindPathEntryItemProviderCustom extends
		MindPathEntryItemProvider {
	public MindPathEntryItemProviderCustom(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		String label = ((MindPathEntry)object).getName();
		return label == null || label.length() == 0 ?
			"?" : label;
	}

	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MindidePackage.Literals.MIND_PATH_ENTRY__RESOLVED_BY);
		}
		return childrenFeatures;
	}

	@Override
	public Object getParent(Object object) {
		Object p = super.getParent(object);
		return p;
	//	IEditingDomainItemProvider pathEntryIP = (IEditingDomainItemProvider) adapterFactory.adapt(object, IEditingDomainItemProvider.class);
	//	MindPathItemProvider mindpath = (MindPathItemProvider) adapterFactory.adapt(p, IEditingDomainItemProvider.class);
	//	return mindpath == null ? null : mindpath.getMindProject();
	}

	@Override
	public Object getImage(Object object) {
		//return overlayImage(object, getResourceLocator().getImage("full/obj16/MindPathEntry"));
		MindPathEntry mpe = (MindPathEntry) object;
		switch (mpe.getEntryKind()) {
		case SOURCE:
			return overlayImage(object, getResourceLocator().getImage("full/obj16/MindRootSrc-mpe"));
		case IMPORT_PACKAGE:
			return overlayImage(object, getResourceLocator().getImage("full/obj16/MindPackage-mpe"));
		case APPLI:
			return overlayImage(object, getResourceLocator().getImage("full/obj16/MindApplication-mpe"));
		case PROJECT:
			return overlayImage(object, getResourceLocator().getImage("full/obj16/MindProject-mpe"));

		default:
			break;
		}
		return super.getImage(object);
	}
}