package org.ow2.mindEd.adl.custom;

import org.eclipse.emf.ecore.EObject;

import org.ow2.mindEd.adl.AnnotationsList;
import org.ow2.mindEd.adl.custom.helpers.IHelper;

/** <b>Interface</b> <i>MindObject</i><p>
 * This interface describe common specific Mind objects. 
 * All contained features are available for Mind Object from root AdlDefinition.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.custom.MindObject#getAdapter <em>getAdapter</em>}</li>
 * </ul>
 * </p>
 * @author proustr
 * @model kind="interface"
 * @extends EObject
 */

public interface MindObject extends EObject {
	
	IHelper<?> getHelper();
	
	/**
	 * Returns the value of the '<em><b>Linked Annotations List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked Annotations List</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Annotations List</em>' reference.
	 * @see #setLinkedAnnotationsList(AnnotationsList)
	 * @see adl.AdlPackage#getMindObject_LinkedAnnotationsList()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	AnnotationsList getLinkedAnnotationsList();

	/**
	 * Sets the value of the '{@link adl.MindObject#getLinkedAnnotationsList <em>Linked Annotations List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linked Annotations List</em>' reference.
	 * @see #getLinkedAnnotationsList()
	 * @generated
	 */
	void setLinkedAnnotationsList(AnnotationsList value);
	
	String getID();
}
