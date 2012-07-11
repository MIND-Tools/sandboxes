/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mind.adl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mind.adl.Annotation#getName <em>Name</em>}</li>
 *   <li>{@link org.ow2.mind.adl.Annotation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.ow2.mind.adl.Annotation#getAddedContent <em>Added Content</em>}</li>
 *   <li>{@link org.ow2.mind.adl.Annotation#isAnnotationProcessed <em>Annotation Processed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mind.adl.AdlPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.ow2.mind.adl.AdlPackage#getAnnotation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.ow2.mind.adl.Annotation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mind.adl.AnnotationField}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.ow2.mind.adl.AdlPackage#getAnnotation_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<AnnotationField> getParameters();

  /**
   * Returns the value of the '<em><b>Added Content</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mind.adl.Content}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Added Content</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Added Content</em>' containment reference list.
   * @see org.ow2.mind.adl.AdlPackage#getAnnotation_AddedContent()
   * @model containment="true" transient="true"
   * @generated
   */
  EList<Content> getAddedContent();

  /**
   * Returns the value of the '<em><b>Annotation Processed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotation Processed</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation Processed</em>' attribute.
   * @see #setAnnotationProcessed(boolean)
   * @see org.ow2.mind.adl.AdlPackage#getAnnotation_AnnotationProcessed()
   * @model transient="true"
   * @generated
   */
  boolean isAnnotationProcessed();

  /**
   * Sets the value of the '{@link org.ow2.mind.adl.Annotation#isAnnotationProcessed <em>Annotation Processed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation Processed</em>' attribute.
   * @see #isAnnotationProcessed()
   * @generated
   */
  void setAnnotationProcessed(boolean value);

} // Annotation
