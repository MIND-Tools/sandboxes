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
 * A representation of the model object '<em><b>Template Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adl.TemplateDefinition#getTemplateName <em>Template Name</em>}</li>
 *   <li>{@link adl.TemplateDefinition#getTemplateValue <em>Template Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see adl.AdlPackage#getTemplateDefinition()
 * @model
 * @generated
 */
public interface TemplateDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Template Name</b></em>' attribute.
	 * The default value is <code>"template_Name"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Name</em>' attribute.
	 * @see #setTemplateName(String)
	 * @see adl.AdlPackage#getTemplateDefinition_TemplateName()
	 * @model default="template_Name"
	 * @generated
	 */
	String getTemplateName();

	/**
	 * Sets the value of the '{@link adl.TemplateDefinition#getTemplateName <em>Template Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Name</em>' attribute.
	 * @see #getTemplateName()
	 * @generated
	 */
	void setTemplateName(String value);

	/**
	 * Returns the value of the '<em><b>Template Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Value</em>' attribute.
	 * @see #setTemplateValue(String)
	 * @see adl.AdlPackage#getTemplateDefinition_TemplateValue()
	 * @model
	 * @generated
	 */
	String getTemplateValue();

	/**
	 * Sets the value of the '{@link adl.TemplateDefinition#getTemplateValue <em>Template Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Value</em>' attribute.
	 * @see #getTemplateValue()
	 * @generated
	 */
	void setTemplateValue(String value);

} // TemplateDefinition
