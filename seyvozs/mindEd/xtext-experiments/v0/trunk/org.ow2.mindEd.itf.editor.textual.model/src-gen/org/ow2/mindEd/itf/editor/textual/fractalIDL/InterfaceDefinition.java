/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.InterfaceDefinition#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.InterfaceDefinition#getFqn <em>Fqn</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.InterfaceDefinition#getFqn2 <em>Fqn2</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.InterfaceDefinition#getMethodDef <em>Method Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getInterfaceDefinition()
 * @model
 * @generated
 */
public interface InterfaceDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotations</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotations</em>' containment reference.
   * @see #setAnnotations(Annotations)
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getInterfaceDefinition_Annotations()
   * @model containment="true"
   * @generated
   */
  Annotations getAnnotations();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.InterfaceDefinition#getAnnotations <em>Annotations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotations</em>' containment reference.
   * @see #getAnnotations()
   * @generated
   */
  void setAnnotations(Annotations value);

  /**
   * Returns the value of the '<em><b>Fqn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fqn</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fqn</em>' attribute.
   * @see #setFqn(String)
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getInterfaceDefinition_Fqn()
   * @model
   * @generated
   */
  String getFqn();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.InterfaceDefinition#getFqn <em>Fqn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fqn</em>' attribute.
   * @see #getFqn()
   * @generated
   */
  void setFqn(String value);

  /**
   * Returns the value of the '<em><b>Fqn2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fqn2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fqn2</em>' attribute.
   * @see #setFqn2(String)
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getInterfaceDefinition_Fqn2()
   * @model
   * @generated
   */
  String getFqn2();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.InterfaceDefinition#getFqn2 <em>Fqn2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fqn2</em>' attribute.
   * @see #getFqn2()
   * @generated
   */
  void setFqn2(String value);

  /**
   * Returns the value of the '<em><b>Method Def</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method Def</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method Def</em>' containment reference list.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getInterfaceDefinition_MethodDef()
   * @model containment="true"
   * @generated
   */
  EList<MethodDefinition> getMethodDef();

} // InterfaceDefinition
