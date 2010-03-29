/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adl.Annotation#getName <em>Name</em>}</li>
 *   <li>{@link adl.Annotation#getAnnotationElements <em>Annotation Elements</em>}</li>
 *   <li>{@link adl.Annotation#getParentAnnotationList <em>Parent Annotation List</em>}</li>
 * </ul>
 * </p>
 *
 * @see adl.AdlPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends ElementValue {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"annotationt_Name"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see adl.AdlPackage#getAnnotation_Name()
	 * @model default="annotationt_Name"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link adl.Annotation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Annotation Elements</b></em>' containment reference list.
	 * The list contents are of type {@link adl.AnnotationElement}.
	 * It is bidirectional and its opposite is '{@link adl.AnnotationElement#getParentAnnotation <em>Parent Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Elements</em>' containment reference list.
	 * @see adl.AdlPackage#getAnnotation_AnnotationElements()
	 * @see adl.AnnotationElement#getParentAnnotation
	 * @model opposite="parentAnnotation" containment="true"
	 * @generated
	 */
	EList<AnnotationElement> getAnnotationElements();

	/**
	 * Returns the value of the '<em><b>Parent Annotation List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link adl.AnnotationsList#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Annotation List</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Annotation List</em>' container reference.
	 * @see #setParentAnnotationList(AnnotationsList)
	 * @see adl.AdlPackage#getAnnotation_ParentAnnotationList()
	 * @see adl.AnnotationsList#getAnnotations
	 * @model opposite="annotations"
	 * @generated
	 */
	AnnotationsList getParentAnnotationList();

	/**
	 * Sets the value of the '{@link adl.Annotation#getParentAnnotationList <em>Parent Annotation List</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Annotation List</em>' container reference.
	 * @see #getParentAnnotationList()
	 * @generated
	 */
	void setParentAnnotationList(AnnotationsList value);

} // Annotation
