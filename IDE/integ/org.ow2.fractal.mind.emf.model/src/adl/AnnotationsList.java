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
 * A representation of the model object '<em><b>Annotations List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adl.AnnotationsList#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see adl.AdlPackage#getAnnotationsList()
 * @model
 * @generated
 */
public interface AnnotationsList extends Element {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link adl.Annotation}.
	 * It is bidirectional and its opposite is '{@link adl.Annotation#getParentAnnotationList <em>Parent Annotation List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see adl.AdlPackage#getAnnotationsList_Annotations()
	 * @see adl.Annotation#getParentAnnotationList
	 * @model opposite="parentAnnotationList" containment="true"
	 * @generated
	 */
	EList<Annotation> getAnnotations();

} // AnnotationsList
