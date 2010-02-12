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
 * A representation of the model object '<em><b>Template Specifiers List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adl.TemplateSpecifiersList#getTemplateSpecifiers <em>Template Specifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @see adl.AdlPackage#getTemplateSpecifiersList()
 * @model
 * @generated
 */
public interface TemplateSpecifiersList extends EObject {
	/**
	 * Returns the value of the '<em><b>Template Specifiers</b></em>' containment reference list.
	 * The list contents are of type {@link adl.TemplateSpecifier}.
	 * It is bidirectional and its opposite is '{@link adl.TemplateSpecifier#getParentTemplateSpecifierList <em>Parent Template Specifier List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Specifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Specifiers</em>' containment reference list.
	 * @see adl.AdlPackage#getTemplateSpecifiersList_TemplateSpecifiers()
	 * @see adl.TemplateSpecifier#getParentTemplateSpecifierList
	 * @model opposite="parentTemplateSpecifierList" containment="true"
	 * @generated
	 */
	EList<TemplateSpecifier> getTemplateSpecifiers();

} // TemplateSpecifiersList
