package org.ow2.mindEd.adl.custom.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.ow2.mindEd.adl.AdlPackage;
import org.ow2.mindEd.adl.impl.TypeReferenceDefinitionImpl;

/**
 * <b>Class</b> <i>TypeReferenceDefinitionCustomImpl</i>
 * <p>
 * This class extends generated class TypeReferenceDefinitionImpl to provides custom functions.
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.ow2.mindEd.adl.custom.impl.TypeReferenceDefinitionCustomImpl#getNameFQN <em>getNameFQN</em>}</li>
 * <li>{@link org.ow2.mindEd.adl.custom.impl.TypeReferenceDefinitionCustomImpl#setReferenceName <em>setReferenceName</em>}</li>
 * <li>{@link org.ow2.mindEd.adl.custom.impl.TypeReferenceDefinitionCustomImpl#getHelper <em>getHelper</em>}</li>
 * </ul>
 * </p>
 * 
 * @author proustr
 * @model kind="custom implementation"
 * @extends TypeReferenceDefinitionImpl
 */
public class TypeReferenceDefinitionCustomImpl extends TypeReferenceDefinitionImpl {

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
		resolved = false;
		if (newReferenceName != null && !referenceName.equals(oldReferenceName)) {
			nameFQN = getHelper().getNameFQN();
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.COMPONENT_REFERENCE__REFERENCE_NAME, oldReferenceName, referenceName));

	}


}
