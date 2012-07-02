/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.IncludeDirective#getImportedURI <em>Imported URI</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.IncludeDirective#getIncludeID <em>Include ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getIncludeDirective()
 * @model
 * @generated
 */
public interface IncludeDirective extends EObject
{
  /**
   * Returns the value of the '<em><b>Imported URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imported URI</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported URI</em>' attribute.
   * @see #setImportedURI(String)
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getIncludeDirective_ImportedURI()
   * @model
   * @generated
   */
  String getImportedURI();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.IncludeDirective#getImportedURI <em>Imported URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imported URI</em>' attribute.
   * @see #getImportedURI()
   * @generated
   */
  void setImportedURI(String value);

  /**
   * Returns the value of the '<em><b>Include ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Include ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Include ID</em>' attribute.
   * @see #setIncludeID(String)
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getIncludeDirective_IncludeID()
   * @model
   * @generated
   */
  String getIncludeID();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.IncludeDirective#getIncludeID <em>Include ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Include ID</em>' attribute.
   * @see #getIncludeID()
   * @generated
   */
  void setIncludeID(String value);

} // IncludeDirective
