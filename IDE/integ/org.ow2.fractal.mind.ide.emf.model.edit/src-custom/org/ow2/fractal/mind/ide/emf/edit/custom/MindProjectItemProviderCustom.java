/**
 * 
 */
package org.ow2.fractal.mind.ide.emf.edit.custom;

import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.ow2.fratal.mind.ide.emf.mindide.MindProject;
import org.ow2.fratal.mind.ide.emf.mindide.MindidePackage;
import org.ow2.fratal.mind.ide.emf.mindide.provider.MindProjectItemProvider;

public final class MindProjectItemProviderCustom extends
		MindProjectItemProvider {
	public MindProjectItemProviderCustom(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.remove(MindidePackage.Literals.MIND_PROJECT__MINDPATHENTRIES);
			childrenFeatures.add(MindidePackage.Literals.MIND_PROJECT__ROOTSRCS);
		}
		return childrenFeatures;
	}

	@Override
	public Collection<?> getChildren(Object object) {
		Collection<Object> ret = (Collection<Object>) super.getChildren(object);
		MindPathItemProvider _mindpaht = new MindPathItemProvider(adapterFactory, (MindProject)object);
		ret.add(_mindpaht);
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
				updateChildren(notification);
				MindProject mp = (MindProject) notification.getNotifier();
				MindPathItemProvider mindpath = adapt(mp, MindPathItemProvider.class);
				fireNotifyChanged(new ViewerNotification(notification, mindpath == null ? notification.getNotifier(): mindpath, true, false));
				return;
			case MindidePackage.MIND_PROJECT__ROOTSRCS:
				updateChildren(notification);
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}
	
	static public <T extends Adapter> T adapt(Notifier notifiertarget, Class<T> type)
	  {
	    for (Adapter adapter : notifiertarget.eAdapters())
	    {
	      if (adapter.isAdapterForType(type))
	      {
	        return (T) adapter;
	      }
	    }
	    return null;
	  }
}