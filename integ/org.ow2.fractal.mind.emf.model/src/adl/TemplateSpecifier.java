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
 * A representation of the model object '<em><b>Template Specifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adl.TemplateSpecifier#getParentTemplateSpecifierList <em>Parent Template Specifier List</em>}</li>
 *   <li>{@link adl.TemplateSpecifier#getComponentTypeName <em>Component Type Name</em>}</li>
 *   <li>{@link adl.TemplateSpecifier#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see adl.AdlPackage#getTemplateSpecifier()
 * @model
 * @generated
 */
public interface TemplateSpecifier extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Template Specifier List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link adl.TemplateSpecifiersList#getTemplateSpecifiers <em>Template Specifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Template Specifier List</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Template Specifier List</em>' container reference.
	 * @see #setParentTemplateSpecifierList(TemplateSpecifiersList)
	 * @see adl.AdlPackage#getTemplateSpecifier_ParentTemplateSpecifierList()
	 * @see adl.TemplateSpecifiersList#getTemplateSpecifiers
	 * @model opposite="templateSpecifiers"
	 * @generated
	 */
	TemplateSpecifiersList getParentTemplateSpecifierList();

	/**
	 * Sets the value of the '{@link adl.TemplateSpecifier#getParentTemplateSpecifierList <em>Parent Template Specifier List</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Template Specifier List</em>' container reference.
	 * @see #getParentTemplateSpecifierList()
	 * @generated
	 */
	void setParentTemplateSpecifierList(TemplateSpecifiersList value);

	/**
	 * Returns the value of the '<em><b>Component Type Name</b></em>' attribute.
	 * The default value is <code>"component_Type_Name"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Type Name</em>' attribute.
	 * @see #setComponentTypeName(String)
	 * @see adl.AdlPackage#getTemplateSpecifier_ComponentTypeName()
	 * @model default="component_Type_Name"
	 * @generated
	 */
	String getComponentTypeName();

	/**
	 * Sets the value of the '{@link adl.TemplateSpecifier#getComponentTypeName <em>Component Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type Name</em>' attribute.
	 * @see #getComponentTypeName()
	 * @generated
	 */
	void setComponentTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"template_name"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see adl.AdlPackage#getTemplateSpecifier_Name()
	 * @model default="template_name"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link adl.TemplateSpecifier#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TemplateSpecifier
