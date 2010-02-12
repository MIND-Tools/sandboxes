/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adl.ElementValue#getParentAnnotationElement <em>Parent Annotation Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see adl.AdlPackage#getElementValue()
 * @model
 * @generated
 */
public interface ElementValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Annotation Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link adl.AnnotationElement#getElementValue <em>Element Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Annotation Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Annotation Element</em>' container reference.
	 * @see #setParentAnnotationElement(AnnotationElement)
	 * @see adl.AdlPackage#getElementValue_ParentAnnotationElement()
	 * @see adl.AnnotationElement#getElementValue
	 * @model opposite="elementValue"
	 * @generated
	 */
	AnnotationElement getParentAnnotationElement();

	/**
	 * Sets the value of the '{@link adl.ElementValue#getParentAnnotationElement <em>Parent Annotation Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Annotation Element</em>' container reference.
	 * @see #getParentAnnotationElement()
	 * @generated
	 */
	void setParentAnnotationElement(AnnotationElement value);

} // ElementValue
