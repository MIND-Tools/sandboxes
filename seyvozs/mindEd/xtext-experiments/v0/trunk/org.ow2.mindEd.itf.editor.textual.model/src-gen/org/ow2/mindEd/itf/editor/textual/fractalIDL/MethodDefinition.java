/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition#getQualifiedTypeSpec <em>Qualified Type Spec</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition#getPointerSpecification <em>Pointer Specification</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition#getId <em>Id</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition#getParameterList <em>Parameter List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getMethodDefinition()
 * @model
 * @generated
 */
public interface MethodDefinition extends EObject
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
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getMethodDefinition_Annotations()
   * @model containment="true"
   * @generated
   */
  Annotations getAnnotations();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition#getAnnotations <em>Annotations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotations</em>' containment reference.
   * @see #getAnnotations()
   * @generated
   */
  void setAnnotations(Annotations value);

  /**
   * Returns the value of the '<em><b>Qualified Type Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualified Type Spec</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualified Type Spec</em>' containment reference.
   * @see #setQualifiedTypeSpec(QualifiedTypeSpecification)
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getMethodDefinition_QualifiedTypeSpec()
   * @model containment="true"
   * @generated
   */
  QualifiedTypeSpecification getQualifiedTypeSpec();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition#getQualifiedTypeSpec <em>Qualified Type Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualified Type Spec</em>' containment reference.
   * @see #getQualifiedTypeSpec()
   * @generated
   */
  void setQualifiedTypeSpec(QualifiedTypeSpecification value);

  /**
   * Returns the value of the '<em><b>Pointer Specification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pointer Specification</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pointer Specification</em>' containment reference.
   * @see #setPointerSpecification(PointerSpecification)
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getMethodDefinition_PointerSpecification()
   * @model containment="true"
   * @generated
   */
  PointerSpecification getPointerSpecification();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition#getPointerSpecification <em>Pointer Specification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pointer Specification</em>' containment reference.
   * @see #getPointerSpecification()
   * @generated
   */
  void setPointerSpecification(PointerSpecification value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getMethodDefinition_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Parameter List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter List</em>' containment reference.
   * @see #setParameterList(ParameterList)
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getMethodDefinition_ParameterList()
   * @model containment="true"
   * @generated
   */
  ParameterList getParameterList();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition#getParameterList <em>Parameter List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter List</em>' containment reference.
   * @see #getParameterList()
   * @generated
   */
  void setParameterList(ParameterList value);

} // MethodDefinition
