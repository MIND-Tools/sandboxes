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
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adl.AdlDefinition#getImports <em>Imports</em>}</li>
 *   <li>{@link adl.AdlDefinition#getDefinitionAnnotationsList <em>Definition Annotations List</em>}</li>
 *   <li>{@link adl.AdlDefinition#getArchitecturedefinition <em>Architecturedefinition</em>}</li>
 * </ul>
 * </p>
 *
 * @see adl.AdlPackage#getAdlDefinition()
 * @model
 * @generated
 */
public interface AdlDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' reference list.
	 * The list contents are of type {@link adl.ImportDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' reference list.
	 * @see adl.AdlPackage#getAdlDefinition_Imports()
	 * @model
	 * @generated
	 */
	EList<ImportDefinition> getImports();

	/**
	 * Returns the value of the '<em><b>Definition Annotations List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition Annotations List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition Annotations List</em>' containment reference.
	 * @see #setDefinitionAnnotationsList(AnnotationsList)
	 * @see adl.AdlPackage#getAdlDefinition_DefinitionAnnotationsList()
	 * @model containment="true"
	 * @generated
	 */
	AnnotationsList getDefinitionAnnotationsList();

	/**
	 * Sets the value of the '{@link adl.AdlDefinition#getDefinitionAnnotationsList <em>Definition Annotations List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Annotations List</em>' containment reference.
	 * @see #getDefinitionAnnotationsList()
	 * @generated
	 */
	void setDefinitionAnnotationsList(AnnotationsList value);

	/**
	 * Returns the value of the '<em><b>Architecturedefinition</b></em>' containment reference list.
	 * The list contents are of type {@link adl.ArchitectureDefinition}.
	 * It is bidirectional and its opposite is '{@link adl.ArchitectureDefinition#getParentAdlDefinition <em>Parent Adl Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architecturedefinition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecturedefinition</em>' containment reference list.
	 * @see adl.AdlPackage#getAdlDefinition_Architecturedefinition()
	 * @see adl.ArchitectureDefinition#getParentAdlDefinition
	 * @model opposite="parentAdlDefinition" containment="true"
	 * @generated
	 */
	EList<ArchitectureDefinition> getArchitecturedefinition();

} // AdlDefinition
