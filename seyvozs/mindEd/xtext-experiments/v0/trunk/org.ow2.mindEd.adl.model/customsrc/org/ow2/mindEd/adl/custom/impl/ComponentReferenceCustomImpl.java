package org.ow2.mindEd.adl.custom.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.ow2.mindEd.adl.AdlPackage;
import org.ow2.mindEd.adl.impl.ComponentReferenceImpl;

public class ComponentReferenceCustomImpl extends ComponentReferenceImpl {

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.ComponentReferenceImpl#getNameFQN()
	 */
	@Override
	public String getNameFQN() {
		if (nameFQN == null || !nameFQN.contains(".")) {
			nameFQN = getHelper().getNameFQN();
		}
		return super.getNameFQN();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.ComponentReferenceImpl#setReferenceName(java.lang.String)
	 */
	@Override
	public void setReferenceName(String newReferenceName) {
		String oldReferenceName = referenceName;
		referenceName = newReferenceName;
		if (newReferenceName != null && !referenceName.equals(oldReferenceName)) {
			nameFQN = getHelper().getNameFQN();
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.COMPONENT_REFERENCE__REFERENCE_NAME, oldReferenceName, referenceName));

	}

}
