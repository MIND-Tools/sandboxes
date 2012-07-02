package org.ow2.mindEd.adl.custom.impl;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.ow2.mindEd.adl.AnnotationsList;
import org.ow2.mindEd.adl.custom.MindObject;
import org.ow2.mindEd.adl.custom.adapters.factory.AdlAdapterHelperFactory;
import org.ow2.mindEd.adl.custom.helpers.IHelper;


/**
 * <b>Class</b> <i>MindObjectImpl</i>
 * <p>
 * This class implement common methods for all Mind EObjects
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.ow2.mindEd.adl.custom.impl.MindObjectImpl#getAdapter <em>getAdapter</em>}</li>
 * </ul>
 * </p>
 * 
 * @author proustr
 * @model kind="implementation"
 * @extends EObject
 */

public class MindObjectImpl extends EObjectImpl implements MindObject {
	protected IHelper<?> helper = getHelper();
	
	String MindObjectStaticID = getHelper().calculateID();
	
	public IHelper<?> getHelper() {
		if(helper!=null)return helper;
		IHelper<?> object = AdlAdapterHelperFactory.getInstance().adapt(this);
		return object;
	}

	/**
	 * The cached value of the '{@link #getLinkedAnnotationsList() <em>Linked Annotations List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedAnnotationsList()
	 * @generated
	 * @ordered
	 */
	protected AnnotationsList linkedAnnotationsList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MindObjectImpl() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.ElementImpl#getLinkedAnnotationsList()
	 */
	public AnnotationsList getLinkedAnnotationsList() {
		return linkedAnnotationsList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.ElementImpl#setLinkedAnnotationsList(adl.AnnotationsList)
	 */
	public void setLinkedAnnotationsList(AnnotationsList newLinkedAnnotationsList) {
		linkedAnnotationsList = newLinkedAnnotationsList;
	}

	public AnnotationsList getAnnotationsList() {
		return null;
	}

	public void setAnnotationsList(AnnotationsList value) {
	}

	public String getID() {
		String tmpID = getHelper().calculateID();
		if (tmpID != null)
		{
			MindObjectStaticID = tmpID;
		}
		return MindObjectStaticID;
	}

}
