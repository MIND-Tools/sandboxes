package org.ow2.mindEd.adl.custom.adapters;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.ow2.mindEd.adl.AdlDefinition;
import org.ow2.mindEd.adl.AdlPackage;
import org.ow2.mindEd.adl.ReferencesList;
import org.ow2.mindEd.adl.custom.util.AbstractReferencesTreatment;


public class ArchitectureDefinitionAdapter extends AbstractReferencesTreatment {
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.util.EContentAdapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	
	
	@Override
	public void notifyChanged(Notification notification) {
		if(notification.getNotifier() instanceof ReferencesList)
		{
			EObject root = EcoreUtil.getRootContainer((EObject) notification.getNotifier());
			if(root instanceof AdlDefinition)
			{
				root.eNotify(new ENotificationImpl((InternalEObject) root, Notification.SET, AdlPackage.COMPONENT_REFERENCE, notification.getOldValue(), notification.getNewValue()));
			}
		}
		super.notifyChanged(notification);
	}

	/**
	 * <b>Class</b> <i>SingletonHolder</i>
	 * <p>
	 * Static access to class
	 * 
	 * @author proustr
	 * @model kind="custom implementation"
	 */
	private static class SingletonHolder {
		private static ArchitectureDefinitionAdapter instance = new ArchitectureDefinitionAdapter();
	}

	public static ArchitectureDefinitionAdapter getInstance() {
		return SingletonHolder.instance;
	}

}
