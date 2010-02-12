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
 * A representation of the model object '<em><b>Primitive Component Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adl.PrimitiveComponentDefinition#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link adl.PrimitiveComponentDefinition#getPrimitiveFormalArgumentsList <em>Primitive Formal Arguments List</em>}</li>
 * </ul>
 * </p>
 *
 * @see adl.AdlPackage#getPrimitiveComponentDefinition()
 * @model
 * @generated
 */
public interface PrimitiveComponentDefinition extends ArchitectureDefinition {
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see adl.AdlPackage#getPrimitiveComponentDefinition_Abstract()
	 * @model
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link adl.PrimitiveComponentDefinition#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Primitive Formal Arguments List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive Formal Arguments List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Formal Arguments List</em>' containment reference.
	 * @see #setPrimitiveFormalArgumentsList(FormalArgumentsList)
	 * @see adl.AdlPackage#getPrimitiveComponentDefinition_PrimitiveFormalArgumentsList()
	 * @model containment="true"
	 * @generated
	 */
	FormalArgumentsList getPrimitiveFormalArgumentsList();

	/**
	 * Sets the value of the '{@link adl.PrimitiveComponentDefinition#getPrimitiveFormalArgumentsList <em>Primitive Formal Arguments List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Formal Arguments List</em>' containment reference.
	 * @see #getPrimitiveFormalArgumentsList()
	 * @generated
	 */
	void setPrimitiveFormalArgumentsList(FormalArgumentsList value);

} // PrimitiveComponentDefinition
