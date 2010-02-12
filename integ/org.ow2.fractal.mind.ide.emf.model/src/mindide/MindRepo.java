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
 * A representation of the model object '<em><b>Mind Repo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mindide.MindRepo#getRootsrcs <em>Rootsrcs</em>}</li>
 *   <li>{@link mindide.MindRepo#getMindprojects <em>Mindprojects</em>}</li>
 * </ul>
 * </p>
 *
 * @see mindide.MindidePackage#getMindRepo()
 * @model
 * @generated
 */
public interface MindRepo extends MindObject {
	/**
	 * Returns the value of the '<em><b>Rootsrcs</b></em>' containment reference list.
	 * The list contents are of type {@link mindide.MindRootSrc}.
	 * It is bidirectional and its opposite is '{@link mindide.MindRootSrc#getRepo <em>Repo</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rootsrcs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rootsrcs</em>' containment reference list.
	 * @see mindide.MindidePackage#getMindRepo_Rootsrcs()
	 * @see mindide.MindRootSrc#getRepo
	 * @model opposite="repo" containment="true"
	 * @generated
	 */
	EList<MindRootSrc> getRootsrcs();

	/**
	 * Returns the value of the '<em><b>Mindprojects</b></em>' containment reference list.
	 * The list contents are of type {@link mindide.MindProject}.
	 * It is bidirectional and its opposite is '{@link mindide.MindProject#getRepo <em>Repo</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mindprojects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mindprojects</em>' containment reference list.
	 * @see mindide.MindidePackage#getMindRepo_Mindprojects()
	 * @see mindide.MindProject#getRepo
	 * @model opposite="repo" containment="true"
	 * @generated
	 */
	EList<MindProject> getMindprojects();

} // MindRepo
