/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ow2.mindEd.ide.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mind Lib Or Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.ide.model.MindLibOrProject#getMindpathentries <em>Mindpathentries</em>}</li>
 *   <li>{@link org.ow2.mindEd.ide.model.MindLibOrProject#getRepoFromLibOrProject <em>Repo From Lib Or Project</em>}</li>
 *   <li>{@link org.ow2.mindEd.ide.model.MindLibOrProject#getUses <em>Uses</em>}</li>
 *   <li>{@link org.ow2.mindEd.ide.model.MindLibOrProject#getRootsrcs <em>Rootsrcs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.ide.model.MindidePackage#getMindLibOrProject()
 * @model abstract="true"
 * @generated
 */
public interface MindLibOrProject extends MindObject {
	/**
	 * Returns the value of the '<em><b>Mindpathentries</b></em>' containment reference list.
	 * The list contents are of type {@link org.ow2.mindEd.ide.model.MindPathEntry}.
	 * It is bidirectional and its opposite is '{@link org.ow2.mindEd.ide.model.MindPathEntry#getOwnerProject <em>Owner Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mindpathentries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mindpathentries</em>' containment reference list.
	 * @see org.ow2.mindEd.ide.model.MindidePackage#getMindLibOrProject_Mindpathentries()
	 * @see org.ow2.mindEd.ide.model.MindPathEntry#getOwnerProject
	 * @model opposite="ownerProject" containment="true"
	 * @generated
	 */
	EList<MindPathEntry> getMindpathentries();

	/**
	 * Returns the value of the '<em><b>Repo From Lib Or Project</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.ow2.mindEd.ide.model.MindRepo#getMindLibOrProjects <em>Mind Lib Or Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repo From Lib Or Project</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repo From Lib Or Project</em>' container reference.
	 * @see #setRepoFromLibOrProject(MindRepo)
	 * @see org.ow2.mindEd.ide.model.MindidePackage#getMindLibOrProject_RepoFromLibOrProject()
	 * @see org.ow2.mindEd.ide.model.MindRepo#getMindLibOrProjects
	 * @model opposite="mindLibOrProjects" required="true" transient="false"
	 * @generated
	 */
	MindRepo getRepoFromLibOrProject();

	/**
	 * Sets the value of the '{@link org.ow2.mindEd.ide.model.MindLibOrProject#getRepoFromLibOrProject <em>Repo From Lib Or Project</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repo From Lib Or Project</em>' container reference.
	 * @see #getRepoFromLibOrProject()
	 * @generated
	 */
	void setRepoFromLibOrProject(MindRepo value);

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference list.
	 * The list contents are of type {@link org.ow2.mindEd.ide.model.MindLibOrProject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference list.
	 * @see org.ow2.mindEd.ide.model.MindidePackage#getMindLibOrProject_Uses()
	 * @model volatile="true"
	 * @generated
	 */
	EList<MindLibOrProject> getUses();

	/**
	 * Returns the value of the '<em><b>Rootsrcs</b></em>' reference list.
	 * The list contents are of type {@link org.ow2.mindEd.ide.model.MindRootSrc}.
	 * It is bidirectional and its opposite is '{@link org.ow2.mindEd.ide.model.MindRootSrc#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rootsrcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rootsrcs</em>' reference list.
	 * @see org.ow2.mindEd.ide.model.MindidePackage#getMindLibOrProject_Rootsrcs()
	 * @see org.ow2.mindEd.ide.model.MindRootSrc#getProject
	 * @model opposite="project"
	 * @generated
	 */
	EList<MindRootSrc> getRootsrcs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return a copy of the mind path of this project
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<MindPathEntry> getRawMinpath();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<MindPathEntry> getResolvedMindpath(boolean ignoreUnresolvedEntry);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * La résolution du nom d'une référence de définition suit les règles suivantes :
	 * - Si le nom contient au moins 2 identifiants, celui-ci est considéré comme un nom pleinement qualifié. Ainsi la définition référencée est la définition qui porte ce nom.- 
	 * - Si le nom ne contient qu'un seul identifiant ne correspondant pas à une paramètre générique de la définition englobante, chaque directive d'importation est évaluée dans l'ordre de déclaration. 
	 * - Si la directive d'importation est une directive d'importation directe et que le nom simple de la directive correspond au nom à résoudre, La définition référencée est la définition qui porte le nom pleinement qualifié de la directive d'importation.
	 * - Si la directive d'importation est une directive d'importation à la demande et si une définition dont le nom pleinement qualifié est la concaténation du nom de paquetage importé et du nom à résoudre, existe, alors la définition référencée est cette définition.
	 * - Si aucune des directives d'importation n'a permis de résoudre la définition référencée et si une définition dont le nom pleinement qualifié est la concaténation du nom de paquetage de la définition englobante et du nom à résoudre, existe, alors la définition référencée est cette définition.
	 * - En dernier recours, si une définition dont le nom pleinement qualifié est le nom à résoudre (définition sans nom de paquetage), existe, alors la définition référencée est cette définition.
	 * - Enfin si aucune définition n'a pu être trouvée, une erreur de compilation doit être relevée par l'outillage.
	 * <!-- end-model-doc -->
	 * @model importsMany="true"
	 * @generated
	 */
	MindAdl resolveAdl(String componentName, String defaultPackage, EList<String> imports);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * return a list of possible mindAdl object correstponding of the simple name.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	EList<MindAdl> resolvePossibleAdlInMindPath(String componentName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * return a list of possible mindAdl object correstponding in the package.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	EList<MindAdl> resolvePossibleAdlInPackage(String packageName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<MindAdl> resolvePossibleAdlInWorkspace(String componentName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model importsMany="true"
	 * @generated
	 */
	MindItf resolveItf(String componentName, String defaultPackage, EList<String> imports);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<MindItf> resolvePossibleItfInMindPath(String componentName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<MindItf> resolvePossibleItfInPackage(String packageName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<MindItf> resolvePossibleItfInWorkspace(String componentName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Find the qualified component in the project's mind path. Retrun null if not found.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	MindAdl findQualifiedComponent(String cn);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<MindFile> getAllFiles();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	MindFile findMindFile(String qualifiedName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean exists(MindFile obj);

} // MindLibOrProject
