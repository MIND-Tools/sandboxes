/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mindide;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mind Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mindide.MindPackage#getFiles <em>Files</em>}</li>
 *   <li>{@link mindide.MindPackage#getRootsrc <em>Rootsrc</em>}</li>
 *   <li>{@link mindide.MindPackage#getFullpath <em>Fullpath</em>}</li>
 * </ul>
 * </p>
 *
 * @see mindide.MindidePackage#getMindPackage()
 * @model
 * @generated
 */
public interface MindPackage extends MindObject {
	/**
	 * Returns the value of the '<em><b>Files</b></em>' containment reference list.
	 * The list contents are of type {@link mindide.MindFile}.
	 * It is bidirectional and its opposite is '{@link mindide.MindFile#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' containment reference list.
	 * @see mindide.MindidePackage#getMindPackage_Files()
	 * @see mindide.MindFile#getPackage
	 * @model opposite="package" containment="true"
	 * @generated
	 */
	EList<MindFile> getFiles();

	/**
	 * Returns the value of the '<em><b>Rootsrc</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mindide.MindRootSrc#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rootsrc</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rootsrc</em>' container reference.
	 * @see #setRootsrc(MindRootSrc)
	 * @see mindide.MindidePackage#getMindPackage_Rootsrc()
	 * @see mindide.MindRootSrc#getPackages
	 * @model opposite="packages" required="true" transient="false"
	 * @generated
	 */
	MindRootSrc getRootsrc();

	/**
	 * Sets the value of the '{@link mindide.MindPackage#getRootsrc <em>Rootsrc</em>}' container reference.
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
	 * @see mindide.MindidePackage#getMindPackage_Fullpath()
	 * @model
	 * @generated
	 */
	String getFullpath();

	/**
	 * Sets the value of the '{@link mindide.MindPackage#getFullpath <em>Fullpath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fullpath</em>' attribute.
	 * @see #getFullpath()
	 * @generated
	 */
	void setFullpath(String value);

} // MindPackage
