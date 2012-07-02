package org.ow2.mindEd.adl.custom.impl;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;


import org.ow2.mindEd.adl.AdlPackage;
import org.ow2.mindEd.adl.custom.adapters.factory.AdlAdapterHelperFactory;
import org.ow2.mindEd.adl.custom.helpers.ComponentReferenceHelper;
import org.ow2.mindEd.adl.impl.CompositeReferenceDefinitionImpl;

/**
 * <b>Class</b> <i>CompositeReferenceDefinitionCustomImpl</i>
 * <p>
 * This class extends generated class CompositeReferenceDefinitionImpl to provides custom functions.
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.ow2.mindEd.adl.custom.impl.CompositeReferenceDefinitionCustomImpl#getHelper <em>getHelper</em>}</li>
 * <li>{@link org.ow2.mindEd.adl.custom.impl.CompositeReferenceDefinitionCustomImpl#getNameFQN <em>getNameFQN</em>}</li>
 * <li>{@link org.ow2.mindEd.adl.custom.impl.CompositeReferenceDefinitionCustomImpl#setReferenceName <em>setReferenceName</em>}</li>
 * </ul>
 * </p>
 * 
 * @author proustr
 * @model kind="custom implementation"
 * @extends CompositeReferenceDefinitionImpl
 */
public class CompositeReferenceDefinitionCustomImpl extends CompositeReferenceDefinitionImpl {

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
	

	/**
	 * <b>Method</b> <i>getHelper</i>
	 * <p>
	 * This methods use the AdlAdapterHelperFactory to recover the correct associated Helper for this class and the returns it.
	 * 
	 * @return ComponentReferenceHelper
	 * 
	 * @author proustr
	 */
	public ComponentReferenceHelper getHelper() {
		ComponentReferenceHelper result = null;
		Adapter helper = AdlAdapterHelperFactory.getInstance().adapt(this, ComponentReferenceHelper.class);
		if (helper != null) {
			result = (ComponentReferenceHelper) helper;
		}
		return result;
	}

}
