/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ow2.fractal.mind.ide.emf.mindide;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mind File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.fractal.mind.ide.emf.mindide.MindFile#getFullpath <em>Fullpath</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.ide.emf.mindide.MindFile#getPackage <em>Package</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.ide.emf.mindide.MindFile#getQualifiedName <em>Qualified Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.fractal.mind.ide.emf.mindide.MindidePackage#getMindFile()
 * @model
 * @generated
 */
public interface MindFile extends MindObject {
	/**
	 * Returns the value of the '<em><b>Fullpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fullpath</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fullpath</em>' attribute.
	 * @see #setFullpath(String)
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindidePackage#getMindFile_Fullpath()
	 * @model
	 * @generated
	 */
	String getFullpath();

	/**
	 * Sets the value of the '{@link org.ow2.fractal.mind.ide.emf.mindide.MindFile#getFullpath <em>Fullpath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fullpath</em>' attribute.
	 * @see #getFullpath()
	 * @generated
	 */
	void setFullpath(String value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.ow2.fractal.mind.ide.emf.mindide.MindPackage#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(MindPackage)
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindidePackage#getMindFile_Package()
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindPackage#getFiles
	 * @model opposite="files" required="true" transient="false"
	 * @generated
	 */
	MindPackage getPackage();

	/**
	 * Sets the value of the '{@link org.ow2.fractal.mind.ide.emf.mindide.MindFile#getPackage <em>Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' container reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(MindPackage value);

	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Name</em>' attribute.
	 * @see #setQualifiedName(String)
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindidePackage#getMindFile_QualifiedName()
	 * @model
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link org.ow2.fractal.mind.ide.emf.mindide.MindFile#getQualifiedName <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' attribute.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(String value);

} // MindFile
