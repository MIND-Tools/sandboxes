/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ow2.fractal.mind.ide.emf.mindide;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mind Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.fractal.mind.ide.emf.mindide.MindPackage#getFiles <em>Files</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.ide.emf.mindide.MindPackage#getRootsrc <em>Rootsrc</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.ide.emf.mindide.MindPackage#getFullpath <em>Fullpath</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.fractal.mind.ide.emf.mindide.MindidePackage#getMindPackage()
 * @model
 * @generated
 */
public interface MindPackage extends MindObject {
	/**
	 * Returns the value of the '<em><b>Files</b></em>' containment reference list.
	 * The list contents are of type {@link org.ow2.fractal.mind.ide.emf.mindide.MindFile}.
	 * It is bidirectional and its opposite is '{@link org.ow2.fractal.mind.ide.emf.mindide.MindFile#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' containment reference list.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindidePackage#getMindPackage_Files()
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindFile#getPackage
	 * @model opposite="package" containment="true"
	 * @generated
	 */
	EList<MindFile> getFiles();

	/**
	 * Returns the value of the '<em><b>Rootsrc</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rootsrc</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rootsrc</em>' container reference.
	 * @see #setRootsrc(MindRootSrc)
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindidePackage#getMindPackage_Rootsrc()
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc#getPackages
	 * @model opposite="packages" required="true" transient="false"
	 * @generated
	 */
	MindRootSrc getRootsrc();

	/**
	 * Sets the value of the '{@link org.ow2.fractal.mind.ide.emf.mindide.MindPackage#getRootsrc <em>Rootsrc</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rootsrc</em>' container reference.
	 * @see #getRootsrc()
	 * @generated
	 */
	void setRootsrc(MindRootSrc value);

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
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindidePackage#getMindPackage_Fullpath()
	 * @model
	 * @generated
	 */
	String getFullpath();

	/**
	 * Sets the value of the '{@link org.ow2.fractal.mind.ide.emf.mindide.MindPackage#getFullpath <em>Fullpath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fullpath</em>' attribute.
	 * @see #getFullpath()
	 * @generated
	 */
	void setFullpath(String value);

} // MindPackage
