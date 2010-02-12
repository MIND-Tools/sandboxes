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
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adl.Element#getLinkedAnnotationsList <em>Linked Annotations List</em>}</li>
 *   <li>{@link adl.Element#getParentComponent <em>Parent Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see adl.AdlPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {
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
	 * @see adl.AdlPackage#getElement_LinkedAnnotationsList()
	 * @model transient="true"
	 * @generated
	 */
	AnnotationsList getLinkedAnnotationsList();

	/**
	 * Sets the value of the '{@link adl.Element#getLinkedAnnotationsList <em>Linked Annotations List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linked Annotations List</em>' reference.
	 * @see #getLinkedAnnotationsList()
	 * @generated
	 */
	void setLinkedAnnotationsList(AnnotationsList value);

	/**
	 * Returns the value of the '<em><b>Parent Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link adl.ArchitectureDefinition#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Component</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Component</em>' container reference.
	 * @see #setParentComponent(ArchitectureDefinition)
	 * @see adl.AdlPackage#getElement_ParentComponent()
	 * @see adl.ArchitectureDefinition#getElements
	 * @model opposite="elements"
	 * @generated
	 */
	ArchitectureDefinition getParentComponent();

	/**
	 * Sets the value of the '{@link adl.Element#getParentComponent <em>Parent Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Component</em>' container reference.
	 * @see #getParentComponent()
	 * @generated
	 */
	void setParentComponent(ArchitectureDefinition value);

} // Element
