/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adl.ArchitectureDefinition#getName <em>Name</em>}</li>
 *   <li>{@link adl.ArchitectureDefinition#getParentAdlDefinition <em>Parent Adl Definition</em>}</li>
 *   <li>{@link adl.ArchitectureDefinition#getElements <em>Elements</em>}</li>
 *   <li>{@link adl.ArchitectureDefinition#getReferencesList <em>References List</em>}</li>
 * </ul>
 * </p>
 *
 * @see adl.AdlPackage#getArchitectureDefinition()
 * @model
 * @generated
 */
public interface ArchitectureDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"default_Name"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see adl.AdlPackage#getArchitectureDefinition_Name()
	 * @model default="default_Name"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link adl.ArchitectureDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent Adl Definition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link adl.AdlDefinition#getArchitecturedefinition <em>Architecturedefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Adl Definition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Adl Definition</em>' container reference.
	 * @see #setParentAdlDefinition(AdlDefinition)
	 * @see adl.AdlPackage#getArchitectureDefinition_ParentAdlDefinition()
	 * @see adl.AdlDefinition#getArchitecturedefinition
	 * @model opposite="architecturedefinition"
	 * @generated
	 */
	AdlDefinition getParentAdlDefinition();

	/**
	 * Sets the value of the '{@link adl.ArchitectureDefinition#getParentAdlDefinition <em>Parent Adl Definition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Adl Definition</em>' container reference.
	 * @see #getParentAdlDefinition()
	 * @generated
	 */
	void setParentAdlDefinition(AdlDefinition value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link adl.Element}.
	 * It is bidirectional and its opposite is '{@link adl.Element#getParentComponent <em>Parent Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see adl.AdlPackage#getArchitectureDefinition_Elements()
	 * @see adl.Element#getParentComponent
	 * @model opposite="parentComponent" containment="true"
	 * @generated
	 */
	EList<Element> getElements();

	/**
	 * Returns the value of the '<em><b>References List</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link adl.ReferencesList#getParentComponentDefinition <em>Parent Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References List</em>' containment reference.
	 * @see #setReferencesList(ReferencesList)
	 * @see adl.AdlPackage#getArchitectureDefinition_ReferencesList()
	 * @see adl.ReferencesList#getParentComponentDefinition
	 * @model opposite="parentComponentDefinition" containment="true"
	 * @generated
	 */
	ReferencesList getReferencesList();

	/**
	 * Sets the value of the '{@link adl.ArchitectureDefinition#getReferencesList <em>References List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>References List</em>' containment reference.
	 * @see #getReferencesList()
	 * @generated
	 */
	void setReferencesList(ReferencesList value);

} // ArchitectureDefinition
