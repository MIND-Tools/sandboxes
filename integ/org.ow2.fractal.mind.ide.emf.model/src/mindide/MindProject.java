/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mindide;

import org.eclipse.core.resources.IProject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mind Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mindide.MindProject#getRootsrcs <em>Rootsrcs</em>}</li>
 *   <li>{@link mindide.MindProject#getRepo <em>Repo</em>}</li>
 *   <li>{@link mindide.MindProject#getUses <em>Uses</em>}</li>
 *   <li>{@link mindide.MindProject#getMindpathentries <em>Mindpathentries</em>}</li>
 *   <li>{@link mindide.MindProject#getProject <em>Project</em>}</li>
 *   <li>{@link mindide.MindProject#getAllsrc <em>Allsrc</em>}</li>
 * </ul>
 * </p>
 *
 * @see mindide.MindidePackage#getMindProject()
 * @model
 * @generated
 */
public interface MindProject extends MindObject {
	/**
	 * Returns the value of the '<em><b>Rootsrcs</b></em>' reference list.
	 * The list contents are of type {@link mindide.MindRootSrc}.
	 * It is bidirectional and its opposite is '{@link mindide.MindRootSrc#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rootsrcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rootsrcs</em>' reference list.
	 * @see mindide.MindidePackage#getMindProject_Rootsrcs()
	 * @see mindide.MindRootSrc#getProject
	 * @model opposite="project"
	 * @generated
	 */
	EList<MindRootSrc> getRootsrcs();

	/**
	 * Returns the value of the '<em><b>Repo</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mindide.MindRepo#getMindprojects <em>Mindprojects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repo</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repo</em>' container reference.
	 * @see #setRepo(MindRepo)
	 * @see mindide.MindidePackage#getMindProject_Repo()
	 * @see mindide.MindRepo#getMindprojects
	 * @model opposite="mindprojects" required="true" transient="false"
	 * @generated
	 */
	MindRepo getRepo();

	/**
	 * Sets the value of the '{@link mindide.MindProject#getRepo <em>Repo</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repo</em>' container reference.
	 * @see #getRepo()
	 * @generated
	 */
	void setRepo(MindRepo value);

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference list.
	 * The list contents are of type {@link mindide.MindProject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference list.
	 * @see mindide.MindidePackage#getMindProject_Uses()
	 * @model volatile="true"
	 * @generated
	 */
	EList<MindProject> getUses();

	/**
	 * Returns the value of the '<em><b>Mindpathentries</b></em>' containment reference list.
	 * The list contents are of type {@link mindide.MindPathEntry}.
	 * It is bidirectional and its opposite is '{@link mindide.MindPathEntry#getOwnerProject <em>Owner Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mindpathentries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mindpathentries</em>' containment reference list.
	 * @see mindide.MindidePackage#getMindProject_Mindpathentries()
	 * @see mindide.MindPathEntry#getOwnerProject
	 * @model opposite="ownerProject" containment="true"
	 * @generated
	 */
	EList<MindPathEntry> getMindpathentries();

	/**
	 * Returns the value of the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' attribute.
	 * @see #setProject(IProject)
	 * @see mindide.MindidePackage#getMindProject_Project()
	 * @model dataType="mindide.IProject" transient="true"
	 * @generated
	 */
	IProject getProject();

	/**
	 * Sets the value of the '{@link mindide.MindProject#getProject <em>Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' attribute.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(IProject value);

	/**
	 * Returns the value of the '<em><b>Allsrc</b></em>' reference list.
	 * The list contents are of type {@link mindide.MindRootSrc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allsrc</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allsrc</em>' reference list.
	 * @see mindide.MindidePackage#getMindProject_Allsrc()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<MindRootSrc> getAllsrc();

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
	 * change the mind path of this project
	 * <!-- end-model-doc -->
	 * @model mindpathMany="true"
	 * @generated
	 */
	void setMindpath(EList<MindPathEntry> mindpath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * La r�solution du nom d'une r�f�rence de d�finition suit les r�gles suivantes :
	 * - Si le nom contient au moins 2 identifiants, celui-ci est consid�r� comme un nom pleinement qualifi�. Ainsi la d�finition r�f�renc�e est la d�finition qui porte ce nom.- 
	 * - Si le nom ne contient qu'un seul identifiant ne correspondant pas � une param�tre g�n�rique de la d�finition englobante, chaque directive d'importation est �valu�e dans l'ordre de d�claration. 
	 * - Si la directive d'importation est une directive d'importation directe et que le nom simple de la directive correspond au nom � r�soudre, La d�finition r�f�renc�e est la d�finition qui porte le nom pleinement qualifi� de la directive d'importation.
	 * - Si la directive d'importation est une directive d'importation � la demande et si une d�finition dont le nom pleinement qualifi� est la concat�nation du nom de paquetage import� et du nom � r�soudre, existe, alors la d�finition r�f�renc�e est cette d�finition.
	 * - Si aucune des directives d'importation n'a permis de r�soudre la d�finition r�f�renc�e et si une d�finition dont le nom pleinement qualifi� est la concat�nation du nom de paquetage de la d�finition englobante et du nom � r�soudre, existe, alors la d�finition r�f�renc�e est cette d�finition.
	 * - En dernier recours, si une d�finition dont le nom pleinement qualifi� est le nom � r�soudre (d�finition sans nom de paquetage), existe, alors la d�finition r�f�renc�e est cette d�finition.
	 * - Enfin si aucune d�finition n'a pu �tre trouv�e, une erreur de compilation doit �tre relev�e par l'outillage.
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
	MindItf resolveIdl(String componentName, String defaultPackage, EList<String> imports);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<MindItf> resolvePossibleIdlInMindPath(String componentName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<MindItf> resolvePossibleIdlInPackage(String packageName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<MindItf> resolvePossibleIdlInWorkspace(String componentName);

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
	MindPathEntry addMindPathProjectReferenceFromFile(MindFile file);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	MindPathEntry addMindPathImportPackageFromFile(MindFile file);

} // MindProject
