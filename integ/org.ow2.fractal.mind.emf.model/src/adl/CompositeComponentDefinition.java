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
 * A representation of the model object '<em><b>Composite Component Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adl.CompositeComponentDefinition#getTemplateSpecifiersList <em>Template Specifiers List</em>}</li>
 *   <li>{@link adl.CompositeComponentDefinition#getCompositeFormalArgumentsList <em>Composite Formal Arguments List</em>}</li>
 * </ul>
 * </p>
 *
 * @see adl.AdlPackage#getCompositeComponentDefinition()
 * @model
 * @generated
 */
public interface CompositeComponentDefinition extends ArchitectureDefinition {
	/**
	 * Returns the value of the '<em><b>Template Specifiers List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Specifiers List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Specifiers List</em>' containment reference.
	 * @see #setTemplateSpecifiersList(TemplateSpecifiersList)
	 * @see adl.AdlPackage#getCompositeComponentDefinition_TemplateSpecifiersList()
	 * @model containment="true"
	 * @generated
	 */
	TemplateSpecifiersList getTemplateSpecifiersList();

	/**
	 * Sets the value of the '{@link adl.CompositeComponentDefinition#getTemplateSpecifiersList <em>Template Specifiers List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Specifiers List</em>' containment reference.
	 * @see #getTemplateSpecifiersList()
	 * @generated
	 */
	void setTemplateSpecifiersList(TemplateSpecifiersList value);

	/**
	 * Returns the value of the '<em><b>Composite Formal Arguments List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Formal Arguments List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Formal Arguments List</em>' containment reference.
	 * @see #setCompositeFormalArgumentsList(FormalArgumentsList)
	 * @see adl.AdlPackage#getCompositeComponentDefinition_CompositeFormalArgumentsList()
	 * @model containment="true"
	 * @generated
	 */
	FormalArgumentsList getCompositeFormalArgumentsList();

	/**
	 * Sets the value of the '{@link adl.CompositeComponentDefinition#getCompositeFormalArgumentsList <em>Composite Formal Arguments List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Formal Arguments List</em>' containment reference.
	 * @see #getCompositeFormalArgumentsList()
	 * @generated
	 */
	void setCompositeFormalArgumentsList(FormalArgumentsList value);

} // CompositeComponentDefinition
