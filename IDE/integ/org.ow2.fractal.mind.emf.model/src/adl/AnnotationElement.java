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
 * A representation of the model object '<em><b>Annotation Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adl.AnnotationElement#getElementName <em>Element Name</em>}</li>
 *   <li>{@link adl.AnnotationElement#getElementValue <em>Element Value</em>}</li>
 *   <li>{@link adl.AnnotationElement#getParentAnnotation <em>Parent Annotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see adl.AdlPackage#getAnnotationElement()
 * @model
 * @generated
 */
public interface AnnotationElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Element Name</b></em>' attribute.
	 * The default value is <code>"element_Name"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Name</em>' attribute.
	 * @see #setElementName(String)
	 * @see adl.AdlPackage#getAnnotationElement_ElementName()
	 * @model default="element_Name"
	 * @generated
	 */
	String getElementName();

	/**
	 * Sets the value of the '{@link adl.AnnotationElement#getElementName <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Name</em>' attribute.
	 * @see #getElementName()
	 * @generated
	 */
	void setElementName(String value);

	/**
	 * Returns the value of the '<em><b>Element Value</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link adl.ElementValue#getParentAnnotationElement <em>Parent Annotation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Value</em>' containment reference.
	 * @see #setElementValue(ElementValue)
	 * @see adl.AdlPackage#getAnnotationElement_ElementValue()
	 * @see adl.ElementValue#getParentAnnotationElement
	 * @model opposite="parentAnnotationElement" containment="true"
	 * @generated
	 */
	ElementValue getElementValue();

	/**
	 * Sets the value of the '{@link adl.AnnotationElement#getElementValue <em>Element Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Value</em>' containment reference.
	 * @see #getElementValue()
	 * @generated
	 */
	void setElementValue(ElementValue value);

	/**
	 * Returns the value of the '<em><b>Parent Annotation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link adl.Annotation#getAnnotationElements <em>Annotation Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Annotation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Annotation</em>' container reference.
	 * @see #setParentAnnotation(Annotation)
	 * @see adl.AdlPackage#getAnnotationElement_ParentAnnotation()
	 * @see adl.Annotation#getAnnotationElements
	 * @model opposite="annotationElements"
	 * @generated
	 */
	Annotation getParentAnnotation();

	/**
	 * Sets the value of the '{@link adl.AnnotationElement#getParentAnnotation <em>Parent Annotation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Annotation</em>' container reference.
	 * @see #getParentAnnotation()
	 * @generated
	 */
	void setParentAnnotation(Annotation value);

} // AnnotationElement
