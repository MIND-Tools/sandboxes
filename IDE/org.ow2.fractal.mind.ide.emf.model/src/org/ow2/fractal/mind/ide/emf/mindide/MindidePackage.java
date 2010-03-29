/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ow2.fractal.mind.ide.emf.mindide;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.ow2.fractal.mind.ide.emf.mindide.MindideFactory
 * @model kind="package"
 * @generated
 */
public interface MindidePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mindide";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.ow2.fractal/mindide/mind.ide.ecore/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mind.ide.ecore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MindidePackage eINSTANCE = org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindObjectImpl <em>Mind Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindObjectImpl
	 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getMindObject()
	 * @generated
	 */
	int MIND_OBJECT = 10;

	/**
	 * The feature id for the '<em><b>Mind Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_OBJECT__MIND_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_OBJECT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Resolved Mind Path Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_OBJECT__RESOLVED_MIND_PATH_ENTRIES = 2;

	/**
	 * The number of structural features of the '<em>Mind Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_OBJECT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindRepoImpl <em>Mind Repo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindRepoImpl
	 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getMindRepo()
	 * @generated
	 */
	int MIND_REPO = 0;

	/**
	 * The feature id for the '<em><b>Mind Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_REPO__MIND_ID = MIND_OBJECT__MIND_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_REPO__NAME = MIND_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Resolved Mind Path Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_REPO__RESOLVED_MIND_PATH_ENTRIES = MIND_OBJECT__RESOLVED_MIND_PATH_ENTRIES;

	/**
	 * The feature id for the '<em><b>Rootsrcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_REPO__ROOTSRCS = MIND_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mindprojects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_REPO__MINDPROJECTS = MIND_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mind Repo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_REPO_FEATURE_COUNT = MIND_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindRootSrcImpl <em>Mind Root Src</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindRootSrcImpl
	 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getMindRootSrc()
	 * @generated
	 */
	int MIND_ROOT_SRC = 1;

	/**
	 * The feature id for the '<em><b>Mind Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_ROOT_SRC__MIND_ID = MIND_OBJECT__MIND_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_ROOT_SRC__NAME = MIND_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Resolved Mind Path Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_ROOT_SRC__RESOLVED_MIND_PATH_ENTRIES = MIND_OBJECT__RESOLVED_MIND_PATH_ENTRIES;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_ROOT_SRC__PACKAGES = MIND_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_ROOT_SRC__PROJECT = MIND_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Repo</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_ROOT_SRC__REPO = MIND_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fullpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_ROOT_SRC__FULLPATH = MIND_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_ROOT_SRC__FOLDER = MIND_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_ROOT_SRC__DEPENDENCIES = MIND_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Mind Root Src</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_ROOT_SRC_FEATURE_COUNT = MIND_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindPackageImpl <em>Mind Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindPackageImpl
	 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getMindPackage()
	 * @generated
	 */
	int MIND_PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Mind Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_PACKAGE__MIND_ID = MIND_OBJECT__MIND_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_PACKAGE__NAME = MIND_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Resolved Mind Path Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_PACKAGE__RESOLVED_MIND_PATH_ENTRIES = MIND_OBJECT__RESOLVED_MIND_PATH_ENTRIES;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_PACKAGE__FILES = MIND_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rootsrc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_PACKAGE__ROOTSRC = MIND_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fullpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_PACKAGE__FULLPATH = MIND_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mind Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_PACKAGE_FEATURE_COUNT = MIND_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindFileImpl <em>Mind File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindFileImpl
	 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getMindFile()
	 * @generated
	 */
	int MIND_FILE = 8;

	/**
	 * The feature id for the '<em><b>Mind Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_FILE__MIND_ID = MIND_OBJECT__MIND_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_FILE__NAME = MIND_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Resolved Mind Path Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_FILE__RESOLVED_MIND_PATH_ENTRIES = MIND_OBJECT__RESOLVED_MIND_PATH_ENTRIES;

	/**
	 * The feature id for the '<em><b>Fullpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_FILE__FULLPATH = MIND_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_FILE__PACKAGE = MIND_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_FILE__QUALIFIED_NAME = MIND_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mind File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_FILE_FEATURE_COUNT = MIND_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindAdlImpl <em>Mind Adl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindAdlImpl
	 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getMindAdl()
	 * @generated
	 */
	int MIND_ADL = 3;

	/**
	 * The feature id for the '<em><b>Mind Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_ADL__MIND_ID = MIND_FILE__MIND_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_ADL__NAME = MIND_FILE__NAME;

	/**
	 * The feature id for the '<em><b>Resolved Mind Path Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_ADL__RESOLVED_MIND_PATH_ENTRIES = MIND_FILE__RESOLVED_MIND_PATH_ENTRIES;

	/**
	 * The feature id for the '<em><b>Fullpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_ADL__FULLPATH = MIND_FILE__FULLPATH;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_ADL__PACKAGE = MIND_FILE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_ADL__QUALIFIED_NAME = MIND_FILE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_ADL__KIND = MIND_FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mind Adl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_ADL_FEATURE_COUNT = MIND_FILE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindCImpl <em>Mind C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindCImpl
	 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getMindC()
	 * @generated
	 */
	int MIND_C = 4;

	/**
	 * The feature id for the '<em><b>Mind Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_C__MIND_ID = MIND_FILE__MIND_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_C__NAME = MIND_FILE__NAME;

	/**
	 * The feature id for the '<em><b>Resolved Mind Path Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_C__RESOLVED_MIND_PATH_ENTRIES = MIND_FILE__RESOLVED_MIND_PATH_ENTRIES;

	/**
	 * The feature id for the '<em><b>Fullpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_C__FULLPATH = MIND_FILE__FULLPATH;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_C__PACKAGE = MIND_FILE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_C__QUALIFIED_NAME = MIND_FILE__QUALIFIED_NAME;

	/**
	 * The number of structural features of the '<em>Mind C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_C_FEATURE_COUNT = MIND_FILE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindItfImpl <em>Mind Itf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindItfImpl
	 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getMindItf()
	 * @generated
	 */
	int MIND_ITF = 5;

	/**
	 * The feature id for the '<em><b>Mind Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_ITF__MIND_ID = MIND_FILE__MIND_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_ITF__NAME = MIND_FILE__NAME;

	/**
	 * The feature id for the '<em><b>Resolved Mind Path Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_ITF__RESOLVED_MIND_PATH_ENTRIES = MIND_FILE__RESOLVED_MIND_PATH_ENTRIES;

	/**
	 * The feature id for the '<em><b>Fullpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_ITF__FULLPATH = MIND_FILE__FULLPATH;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_ITF__PACKAGE = MIND_FILE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_ITF__QUALIFIED_NAME = MIND_FILE__QUALIFIED_NAME;

	/**
	 * The number of structural features of the '<em>Mind Itf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_ITF_FEATURE_COUNT = MIND_FILE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindHImpl <em>Mind H</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindHImpl
	 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getMindH()
	 * @generated
	 */
	int MIND_H = 6;

	/**
	 * The feature id for the '<em><b>Mind Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_H__MIND_ID = MIND_FILE__MIND_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_H__NAME = MIND_FILE__NAME;

	/**
	 * The feature id for the '<em><b>Resolved Mind Path Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_H__RESOLVED_MIND_PATH_ENTRIES = MIND_FILE__RESOLVED_MIND_PATH_ENTRIES;

	/**
	 * The feature id for the '<em><b>Fullpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_H__FULLPATH = MIND_FILE__FULLPATH;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_H__PACKAGE = MIND_FILE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_H__QUALIFIED_NAME = MIND_FILE__QUALIFIED_NAME;

	/**
	 * The number of structural features of the '<em>Mind H</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_H_FEATURE_COUNT = MIND_FILE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindIdfImpl <em>Mind Idf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindIdfImpl
	 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getMindIdf()
	 * @generated
	 */
	int MIND_IDF = 7;

	/**
	 * The feature id for the '<em><b>Mind Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_IDF__MIND_ID = MIND_FILE__MIND_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_IDF__NAME = MIND_FILE__NAME;

	/**
	 * The feature id for the '<em><b>Resolved Mind Path Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_IDF__RESOLVED_MIND_PATH_ENTRIES = MIND_FILE__RESOLVED_MIND_PATH_ENTRIES;

	/**
	 * The feature id for the '<em><b>Fullpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_IDF__FULLPATH = MIND_FILE__FULLPATH;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_IDF__PACKAGE = MIND_FILE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_IDF__QUALIFIED_NAME = MIND_FILE__QUALIFIED_NAME;

	/**
	 * The number of structural features of the '<em>Mind Idf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_IDF_FEATURE_COUNT = MIND_FILE_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindAllRepoImpl <em>Mind All Repo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindAllRepoImpl
	 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getMindAllRepo()
	 * @generated
	 */
	int MIND_ALL_REPO = 9;

	/**
	 * The feature id for the '<em><b>Repos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_ALL_REPO__REPOS = 0;

	/**
	 * The number of structural features of the '<em>Mind All Repo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_ALL_REPO_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindProjectImpl <em>Mind Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindProjectImpl
	 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getMindProject()
	 * @generated
	 */
	int MIND_PROJECT = 11;

	/**
	 * The feature id for the '<em><b>Mind Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_PROJECT__MIND_ID = MIND_OBJECT__MIND_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_PROJECT__NAME = MIND_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Resolved Mind Path Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_PROJECT__RESOLVED_MIND_PATH_ENTRIES = MIND_OBJECT__RESOLVED_MIND_PATH_ENTRIES;

	/**
	 * The feature id for the '<em><b>Rootsrcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_PROJECT__ROOTSRCS = MIND_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repo</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_PROJECT__REPO = MIND_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_PROJECT__USES = MIND_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mindpathentries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_PROJECT__MINDPATHENTRIES = MIND_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_PROJECT__PROJECT = MIND_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Allsrc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_PROJECT__ALLSRC = MIND_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Mind Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_PROJECT_FEATURE_COUNT = MIND_OBJECT_FEATURE_COUNT + 6;


	/**
	 * The meta object id for the '{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindPathEntryImpl <em>Mind Path Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindPathEntryImpl
	 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getMindPathEntry()
	 * @generated
	 */
	int MIND_PATH_ENTRY = 12;

	/**
	 * The feature id for the '<em><b>Mind Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_PATH_ENTRY__MIND_ID = MIND_OBJECT__MIND_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_PATH_ENTRY__NAME = MIND_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Resolved Mind Path Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_PATH_ENTRY__RESOLVED_MIND_PATH_ENTRIES = MIND_OBJECT__RESOLVED_MIND_PATH_ENTRIES;

	/**
	 * The feature id for the '<em><b>Owner Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_PATH_ENTRY__OWNER_PROJECT = MIND_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_PATH_ENTRY__RESOLVED_BY = MIND_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entry Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_PATH_ENTRY__ENTRY_KIND = MIND_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mind Path Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_PATH_ENTRY_FEATURE_COUNT = MIND_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.ow2.fractal.mind.ide.emf.mindide.MindPathKind <em>Mind Path Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindPathKind
	 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getMindPathKind()
	 * @generated
	 */
	int MIND_PATH_KIND = 13;


	/**
	 * The meta object id for the '{@link org.ow2.fractal.mind.ide.emf.mindide.ComponentKind <em>Component Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ow2.fractal.mind.ide.emf.mindide.ComponentKind
	 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getComponentKind()
	 * @generated
	 */
	int COMPONENT_KIND = 14;

	/**
	 * The meta object id for the '<em>IProject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IProject
	 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getIProject()
	 * @generated
	 */
	int IPROJECT = 15;

	/**
	 * The meta object id for the '<em>IResource</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IResource
	 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getIResource()
	 * @generated
	 */
	int IRESOURCE = 16;

	/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URI
	 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getURI()
	 * @generated
	 */
	int URI = 17;

	/**
	 * Returns the meta object for class '{@link org.ow2.fractal.mind.ide.emf.mindide.MindRepo <em>Mind Repo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mind Repo</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindRepo
	 * @generated
	 */
	EClass getMindRepo();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ow2.fractal.mind.ide.emf.mindide.MindRepo#getRootsrcs <em>Rootsrcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rootsrcs</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindRepo#getRootsrcs()
	 * @see #getMindRepo()
	 * @generated
	 */
	EReference getMindRepo_Rootsrcs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ow2.fractal.mind.ide.emf.mindide.MindRepo#getMindprojects <em>Mindprojects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mindprojects</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindRepo#getMindprojects()
	 * @see #getMindRepo()
	 * @generated
	 */
	EReference getMindRepo_Mindprojects();

	/**
	 * Returns the meta object for class '{@link org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc <em>Mind Root Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mind Root Src</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc
	 * @generated
	 */
	EClass getMindRootSrc();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc#getPackages()
	 * @see #getMindRootSrc()
	 * @generated
	 */
	EReference getMindRootSrc_Packages();

	/**
	 * Returns the meta object for the reference '{@link org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Project</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc#getProject()
	 * @see #getMindRootSrc()
	 * @generated
	 */
	EReference getMindRootSrc_Project();

	/**
	 * Returns the meta object for the container reference '{@link org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc#getRepo <em>Repo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repo</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc#getRepo()
	 * @see #getMindRootSrc()
	 * @generated
	 */
	EReference getMindRootSrc_Repo();

	/**
	 * Returns the meta object for the attribute '{@link org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc#getFullpath <em>Fullpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fullpath</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc#getFullpath()
	 * @see #getMindRootSrc()
	 * @generated
	 */
	EAttribute getMindRootSrc_Fullpath();

	/**
	 * Returns the meta object for the attribute '{@link org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc#getFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Folder</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc#getFolder()
	 * @see #getMindRootSrc()
	 * @generated
	 */
	EAttribute getMindRootSrc_Folder();

	/**
	 * Returns the meta object for the reference list '{@link org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependencies</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc#getDependencies()
	 * @see #getMindRootSrc()
	 * @generated
	 */
	EReference getMindRootSrc_Dependencies();

	/**
	 * Returns the meta object for class '{@link org.ow2.fractal.mind.ide.emf.mindide.MindPackage <em>Mind Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mind Package</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindPackage
	 * @generated
	 */
	EClass getMindPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ow2.fractal.mind.ide.emf.mindide.MindPackage#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindPackage#getFiles()
	 * @see #getMindPackage()
	 * @generated
	 */
	EReference getMindPackage_Files();

	/**
	 * Returns the meta object for the container reference '{@link org.ow2.fractal.mind.ide.emf.mindide.MindPackage#getRootsrc <em>Rootsrc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rootsrc</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindPackage#getRootsrc()
	 * @see #getMindPackage()
	 * @generated
	 */
	EReference getMindPackage_Rootsrc();

	/**
	 * Returns the meta object for the attribute '{@link org.ow2.fractal.mind.ide.emf.mindide.MindPackage#getFullpath <em>Fullpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fullpath</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindPackage#getFullpath()
	 * @see #getMindPackage()
	 * @generated
	 */
	EAttribute getMindPackage_Fullpath();

	/**
	 * Returns the meta object for class '{@link org.ow2.fractal.mind.ide.emf.mindide.MindAdl <em>Mind Adl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mind Adl</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindAdl
	 * @generated
	 */
	EClass getMindAdl();

	/**
	 * Returns the meta object for the attribute '{@link org.ow2.fractal.mind.ide.emf.mindide.MindAdl#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindAdl#getKind()
	 * @see #getMindAdl()
	 * @generated
	 */
	EAttribute getMindAdl_Kind();

	/**
	 * Returns the meta object for class '{@link org.ow2.fractal.mind.ide.emf.mindide.MindC <em>Mind C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mind C</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindC
	 * @generated
	 */
	EClass getMindC();

	/**
	 * Returns the meta object for class '{@link org.ow2.fractal.mind.ide.emf.mindide.MindItf <em>Mind Itf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mind Itf</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindItf
	 * @generated
	 */
	EClass getMindItf();

	/**
	 * Returns the meta object for class '{@link org.ow2.fractal.mind.ide.emf.mindide.MindH <em>Mind H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mind H</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindH
	 * @generated
	 */
	EClass getMindH();

	/**
	 * Returns the meta object for class '{@link org.ow2.fractal.mind.ide.emf.mindide.MindIdf <em>Mind Idf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mind Idf</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindIdf
	 * @generated
	 */
	EClass getMindIdf();

	/**
	 * Returns the meta object for class '{@link org.ow2.fractal.mind.ide.emf.mindide.MindFile <em>Mind File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mind File</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindFile
	 * @generated
	 */
	EClass getMindFile();

	/**
	 * Returns the meta object for the attribute '{@link org.ow2.fractal.mind.ide.emf.mindide.MindFile#getFullpath <em>Fullpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fullpath</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindFile#getFullpath()
	 * @see #getMindFile()
	 * @generated
	 */
	EAttribute getMindFile_Fullpath();

	/**
	 * Returns the meta object for the container reference '{@link org.ow2.fractal.mind.ide.emf.mindide.MindFile#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindFile#getPackage()
	 * @see #getMindFile()
	 * @generated
	 */
	EReference getMindFile_Package();

	/**
	 * Returns the meta object for the attribute '{@link org.ow2.fractal.mind.ide.emf.mindide.MindFile#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindFile#getQualifiedName()
	 * @see #getMindFile()
	 * @generated
	 */
	EAttribute getMindFile_QualifiedName();

	/**
	 * Returns the meta object for class '{@link org.ow2.fractal.mind.ide.emf.mindide.MindAllRepo <em>Mind All Repo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mind All Repo</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindAllRepo
	 * @generated
	 */
	EClass getMindAllRepo();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ow2.fractal.mind.ide.emf.mindide.MindAllRepo#getRepos <em>Repos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repos</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindAllRepo#getRepos()
	 * @see #getMindAllRepo()
	 * @generated
	 */
	EReference getMindAllRepo_Repos();

	/**
	 * Returns the meta object for class '{@link org.ow2.fractal.mind.ide.emf.mindide.MindObject <em>Mind Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mind Object</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindObject
	 * @generated
	 */
	EClass getMindObject();

	/**
	 * Returns the meta object for the attribute '{@link org.ow2.fractal.mind.ide.emf.mindide.MindObject#getMindId <em>Mind Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mind Id</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindObject#getMindId()
	 * @see #getMindObject()
	 * @generated
	 */
	EAttribute getMindObject_MindId();

	/**
	 * Returns the meta object for the attribute '{@link org.ow2.fractal.mind.ide.emf.mindide.MindObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindObject#getName()
	 * @see #getMindObject()
	 * @generated
	 */
	EAttribute getMindObject_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.ow2.fractal.mind.ide.emf.mindide.MindObject#getResolvedMindPathEntries <em>Resolved Mind Path Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resolved Mind Path Entries</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindObject#getResolvedMindPathEntries()
	 * @see #getMindObject()
	 * @generated
	 */
	EReference getMindObject_ResolvedMindPathEntries();

	/**
	 * Returns the meta object for class '{@link org.ow2.fractal.mind.ide.emf.mindide.MindProject <em>Mind Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mind Project</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindProject
	 * @generated
	 */
	EClass getMindProject();

	/**
	 * Returns the meta object for the reference list '{@link org.ow2.fractal.mind.ide.emf.mindide.MindProject#getRootsrcs <em>Rootsrcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rootsrcs</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindProject#getRootsrcs()
	 * @see #getMindProject()
	 * @generated
	 */
	EReference getMindProject_Rootsrcs();

	/**
	 * Returns the meta object for the container reference '{@link org.ow2.fractal.mind.ide.emf.mindide.MindProject#getRepo <em>Repo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repo</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindProject#getRepo()
	 * @see #getMindProject()
	 * @generated
	 */
	EReference getMindProject_Repo();

	/**
	 * Returns the meta object for the reference list '{@link org.ow2.fractal.mind.ide.emf.mindide.MindProject#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindProject#getUses()
	 * @see #getMindProject()
	 * @generated
	 */
	EReference getMindProject_Uses();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ow2.fractal.mind.ide.emf.mindide.MindProject#getMindpathentries <em>Mindpathentries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mindpathentries</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindProject#getMindpathentries()
	 * @see #getMindProject()
	 * @generated
	 */
	EReference getMindProject_Mindpathentries();

	/**
	 * Returns the meta object for the attribute '{@link org.ow2.fractal.mind.ide.emf.mindide.MindProject#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindProject#getProject()
	 * @see #getMindProject()
	 * @generated
	 */
	EAttribute getMindProject_Project();

	/**
	 * Returns the meta object for the reference list '{@link org.ow2.fractal.mind.ide.emf.mindide.MindProject#getAllsrc <em>Allsrc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allsrc</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindProject#getAllsrc()
	 * @see #getMindProject()
	 * @generated
	 */
	EReference getMindProject_Allsrc();

	/**
	 * Returns the meta object for class '{@link org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry <em>Mind Path Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mind Path Entry</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry
	 * @generated
	 */
	EClass getMindPathEntry();

	/**
	 * Returns the meta object for the container reference '{@link org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry#getOwnerProject <em>Owner Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner Project</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry#getOwnerProject()
	 * @see #getMindPathEntry()
	 * @generated
	 */
	EReference getMindPathEntry_OwnerProject();

	/**
	 * Returns the meta object for the attribute '{@link org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry#getEntryKind <em>Entry Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Kind</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry#getEntryKind()
	 * @see #getMindPathEntry()
	 * @generated
	 */
	EAttribute getMindPathEntry_EntryKind();

	/**
	 * Returns the meta object for the reference '{@link org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry#getResolvedBy <em>Resolved By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resolved By</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry#getResolvedBy()
	 * @see #getMindPathEntry()
	 * @generated
	 */
	EReference getMindPathEntry_ResolvedBy();

	/**
	 * Returns the meta object for enum '{@link org.ow2.fractal.mind.ide.emf.mindide.MindPathKind <em>Mind Path Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mind Path Kind</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindPathKind
	 * @generated
	 */
	EEnum getMindPathKind();

	/**
	 * Returns the meta object for enum '{@link org.ow2.fractal.mind.ide.emf.mindide.ComponentKind <em>Component Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Component Kind</em>'.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.ComponentKind
	 * @generated
	 */
	EEnum getComponentKind();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.IProject <em>IProject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IProject</em>'.
	 * @see org.eclipse.core.resources.IProject
	 * @model instanceClass="org.eclipse.core.resources.IProject"
	 * @generated
	 */
	EDataType getIProject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.IResource <em>IResource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IResource</em>'.
	 * @see org.eclipse.core.resources.IResource
	 * @model instanceClass="org.eclipse.core.resources.IResource"
	 * @generated
	 */
	EDataType getIResource();

	/**
	 * Returns the meta object for data type '{@link java.net.URI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URI</em>'.
	 * @see java.net.URI
	 * @model instanceClass="java.net.URI"
	 * @generated
	 */
	EDataType getURI();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MindideFactory getMindideFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindRepoImpl <em>Mind Repo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindRepoImpl
		 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getMindRepo()
		 * @generated
		 */
		EClass MIND_REPO = eINSTANCE.getMindRepo();

		/**
		 * The meta object literal for the '<em><b>Rootsrcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIND_REPO__ROOTSRCS = eINSTANCE.getMindRepo_Rootsrcs();

		/**
		 * The meta object literal for the '<em><b>Mindprojects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIND_REPO__MINDPROJECTS = eINSTANCE.getMindRepo_Mindprojects();

		/**
		 * The meta object literal for the '{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindRootSrcImpl <em>Mind Root Src</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindRootSrcImpl
		 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getMindRootSrc()
		 * @generated
		 */
		EClass MIND_ROOT_SRC = eINSTANCE.getMindRootSrc();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIND_ROOT_SRC__PACKAGES = eINSTANCE.getMindRootSrc_Packages();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIND_ROOT_SRC__PROJECT = eINSTANCE.getMindRootSrc_Project();

		/**
		 * The meta object literal for the '<em><b>Repo</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIND_ROOT_SRC__REPO = eINSTANCE.getMindRootSrc_Repo();

		/**
		 * The meta object literal for the '<em><b>Fullpath</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIND_ROOT_SRC__FULLPATH = eINSTANCE.getMindRootSrc_Fullpath();

		/**
		 * The meta object literal for the '<em><b>Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIND_ROOT_SRC__FOLDER = eINSTANCE.getMindRootSrc_Folder();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIND_ROOT_SRC__DEPENDENCIES = eINSTANCE.getMindRootSrc_Dependencies();

		/**
		 * The meta object literal for the '{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindPackageImpl <em>Mind Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindPackageImpl
		 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getMindPackage()
		 * @generated
		 */
		EClass MIND_PACKAGE = eINSTANCE.getMindPackage();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIND_PACKAGE__FILES = eINSTANCE.getMindPackage_Files();

		/**
		 * The meta object literal for the '<em><b>Rootsrc</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIND_PACKAGE__ROOTSRC = eINSTANCE.getMindPackage_Rootsrc();

		/**
		 * The meta object literal for the '<em><b>Fullpath</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIND_PACKAGE__FULLPATH = eINSTANCE.getMindPackage_Fullpath();

		/**
		 * The meta object literal for the '{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindAdlImpl <em>Mind Adl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindAdlImpl
		 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getMindAdl()
		 * @generated
		 */
		EClass MIND_ADL = eINSTANCE.getMindAdl();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIND_ADL__KIND = eINSTANCE.getMindAdl_Kind();

		/**
		 * The meta object literal for the '{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindCImpl <em>Mind C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindCImpl
		 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getMindC()
		 * @generated
		 */
		EClass MIND_C = eINSTANCE.getMindC();

		/**
		 * The meta object literal for the '{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindItfImpl <em>Mind Itf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindItfImpl
		 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getMindItf()
		 * @generated
		 */
		EClass MIND_ITF = eINSTANCE.getMindItf();

		/**
		 * The meta object literal for the '{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindHImpl <em>Mind H</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindHImpl
		 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getMindH()
		 * @generated
		 */
		EClass MIND_H = eINSTANCE.getMindH();

		/**
		 * The meta object literal for the '{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindIdfImpl <em>Mind Idf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindIdfImpl
		 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getMindIdf()
		 * @generated
		 */
		EClass MIND_IDF = eINSTANCE.getMindIdf();

		/**
		 * The meta object literal for the '{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindFileImpl <em>Mind File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindFileImpl
		 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getMindFile()
		 * @generated
		 */
		EClass MIND_FILE = eINSTANCE.getMindFile();

		/**
		 * The meta object literal for the '<em><b>Fullpath</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIND_FILE__FULLPATH = eINSTANCE.getMindFile_Fullpath();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIND_FILE__PACKAGE = eINSTANCE.getMindFile_Package();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIND_FILE__QUALIFIED_NAME = eINSTANCE.getMindFile_QualifiedName();

		/**
		 * The meta object literal for the '{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindAllRepoImpl <em>Mind All Repo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindAllRepoImpl
		 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getMindAllRepo()
		 * @generated
		 */
		EClass MIND_ALL_REPO = eINSTANCE.getMindAllRepo();

		/**
		 * The meta object literal for the '<em><b>Repos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIND_ALL_REPO__REPOS = eINSTANCE.getMindAllRepo_Repos();

		/**
		 * The meta object literal for the '{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindObjectImpl <em>Mind Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindObjectImpl
		 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getMindObject()
		 * @generated
		 */
		EClass MIND_OBJECT = eINSTANCE.getMindObject();

		/**
		 * The meta object literal for the '<em><b>Mind Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIND_OBJECT__MIND_ID = eINSTANCE.getMindObject_MindId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIND_OBJECT__NAME = eINSTANCE.getMindObject_Name();

		/**
		 * The meta object literal for the '<em><b>Resolved Mind Path Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIND_OBJECT__RESOLVED_MIND_PATH_ENTRIES = eINSTANCE.getMindObject_ResolvedMindPathEntries();

		/**
		 * The meta object literal for the '{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindProjectImpl <em>Mind Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindProjectImpl
		 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getMindProject()
		 * @generated
		 */
		EClass MIND_PROJECT = eINSTANCE.getMindProject();

		/**
		 * The meta object literal for the '<em><b>Rootsrcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIND_PROJECT__ROOTSRCS = eINSTANCE.getMindProject_Rootsrcs();

		/**
		 * The meta object literal for the '<em><b>Repo</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIND_PROJECT__REPO = eINSTANCE.getMindProject_Repo();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIND_PROJECT__USES = eINSTANCE.getMindProject_Uses();

		/**
		 * The meta object literal for the '<em><b>Mindpathentries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIND_PROJECT__MINDPATHENTRIES = eINSTANCE.getMindProject_Mindpathentries();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIND_PROJECT__PROJECT = eINSTANCE.getMindProject_Project();

		/**
		 * The meta object literal for the '<em><b>Allsrc</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIND_PROJECT__ALLSRC = eINSTANCE.getMindProject_Allsrc();

		/**
		 * The meta object literal for the '{@link org.ow2.fractal.mind.ide.emf.mindide.impl.MindPathEntryImpl <em>Mind Path Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindPathEntryImpl
		 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getMindPathEntry()
		 * @generated
		 */
		EClass MIND_PATH_ENTRY = eINSTANCE.getMindPathEntry();

		/**
		 * The meta object literal for the '<em><b>Owner Project</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIND_PATH_ENTRY__OWNER_PROJECT = eINSTANCE.getMindPathEntry_OwnerProject();

		/**
		 * The meta object literal for the '<em><b>Entry Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIND_PATH_ENTRY__ENTRY_KIND = eINSTANCE.getMindPathEntry_EntryKind();

		/**
		 * The meta object literal for the '<em><b>Resolved By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIND_PATH_ENTRY__RESOLVED_BY = eINSTANCE.getMindPathEntry_ResolvedBy();

		/**
		 * The meta object literal for the '{@link org.ow2.fractal.mind.ide.emf.mindide.MindPathKind <em>Mind Path Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ow2.fractal.mind.ide.emf.mindide.MindPathKind
		 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getMindPathKind()
		 * @generated
		 */
		EEnum MIND_PATH_KIND = eINSTANCE.getMindPathKind();

		/**
		 * The meta object literal for the '{@link org.ow2.fractal.mind.ide.emf.mindide.ComponentKind <em>Component Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ow2.fractal.mind.ide.emf.mindide.ComponentKind
		 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getComponentKind()
		 * @generated
		 */
		EEnum COMPONENT_KIND = eINSTANCE.getComponentKind();

		/**
		 * The meta object literal for the '<em>IProject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IProject
		 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getIProject()
		 * @generated
		 */
		EDataType IPROJECT = eINSTANCE.getIProject();

		/**
		 * The meta object literal for the '<em>IResource</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IResource
		 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getIResource()
		 * @generated
		 */
		EDataType IRESOURCE = eINSTANCE.getIResource();

		/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URI
		 * @see org.ow2.fractal.mind.ide.emf.mindide.impl.MindidePackageImpl#getURI()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getURI();

	}

} //MindwsPackage
