package org.ow2.mindEd.adl.custom.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.ow2.mindEd.adl.AdlPackage;
import org.ow2.mindEd.adl.impl.PrimitiveReferenceDefinitionImpl;

/**
 * <b>Class</b> <i>PrimitiveReferenceDefinitionCustomImpl</i>
 * <p>
 * This class extends generated class PrimitiveReferenceDefinitionImpl to provides custom functions.
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.ow2.mindEd.adl.custom.impl.PrimitiveReferenceDefinitionCustomImpl#getNameFQN <em>getNameFQN</em>}</li>
 * <li>{@link org.ow2.mindEd.adl.custom.impl.PrimitiveReferenceDefinitionCustomImpl#setReferenceName <em>setReferenceName</em>}</li>
 * <li>{@link org.ow2.mindEd.adl.custom.impl.PrimitiveReferenceDefinitionCustomImpl#getHelper <em>getHelper</em>}</li>
 * </ul>
 * </p>
 * 
 * @author proustr
 * @model kind="custom implementation"
 * @extends PrimitiveReferenceDefinitionImpl
 */
public class PrimitiveReferenceDefinitionCustomImpl extends PrimitiveReferenceDefinitionImpl {

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
