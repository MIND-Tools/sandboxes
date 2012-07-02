/**
 * 
 */
package org.ow2.mindEd.ide.edit.custom;

import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.ow2.mindEd.ide.edit.provider.MindProjectItemProvider;
import org.ow2.mindEd.ide.model.MindProject;
import org.ow2.mindEd.ide.model.MindidePackage;


public final class MindProjectItemProviderCustom extends
		MindProjectItemProvider {
	

	
	public static MindPathItemProvider getOrCreateMindPathItemProvider(
			AdapterFactory adapterFactory, MindProject mp) {
		for (Adapter a : mp.eAdapters()) {
			if (a instanceof MindPathItemProvider && 
					((MindPathItemProvider) a).getAdapterFactory()  == adapterFactory)
				return (MindPathItemProvider) a;
		};
		return new MindPathItemProvider(adapterFactory, mp);
	}
	
	public MindProjectItemProviderCustom(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.remove(MindidePackage.Literals.MIND_LIB_OR_PROJECT__MINDPATHENTRIES);
			childrenFeatures.add(MindidePackage.Literals.MIND_LIB_OR_PROJECT__ROOTSRCS);
		}
		return childrenFeatures;
	}

	@Override
	public Collection<?> getChildren(Object object) {
		Collection<Object> ret = (Collection<Object>) super.getChildren(object);
		ret.add(getOrCreateMindPathItemProvider(adapterFactory, (MindProject)object));
		return ret;					
	}

	@Override
	public void notifyChanged(Notification notification) {
		switch (notification.getFeatureID(MindProject.class)) {
			case MindidePackage.MIND_PROJECT__PROJECT:
				updateChildren(notification);
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MindidePackage.MIND_PROJECT__MINDPATHENTRIES:
				// Do nothing --> Done in MindPathItemProvider
//				updateChildren(notification);
//				MindProject mp = (MindProject) notification.getNotifier();
//				MindPathItemProvider mindpath = adapt(mp, MindPathItemProvider.class);
//				fireNotifyChanged(new ViewerNotification(notification, mindpath == null ? notification.getNotifier(): mindpath, true, false));
				return;
			case MindidePackage.MIND_PROJECT__ROOTSRCS:
				updateChildren(notification);
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}
	
	

}