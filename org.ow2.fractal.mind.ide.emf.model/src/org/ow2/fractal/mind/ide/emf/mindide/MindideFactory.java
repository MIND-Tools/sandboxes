/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ow2.fractal.mind.ide.emf.mindide;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ow2.fractal.mind.ide.emf.mindide.MindidePackage
 * @generated
 */
public interface MindideFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MindideFactory eINSTANCE = org.ow2.fractal.mind.ide.emf.mindide.impl.MindideFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Mind Repo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mind Repo</em>'.
	 * @generated
	 */
	MindRepo createMindRepo();

	/**
	 * Returns a new object of class '<em>Mind Root Src</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mind Root Src</em>'.
	 * @generated
	 */
	MindRootSrc createMindRootSrc();

	/**
	 * Returns a new object of class '<em>Mind Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mind Package</em>'.
	 * @generated
	 */
	MindPackage createMindPackage();

	/**
	 * Returns a new object of class '<em>Mind Adl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mind Adl</em>'.
	 * @generated
	 */
	MindAdl createMindAdl();

	/**
	 * Returns a new object of class '<em>Mind C</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mind C</em>'.
	 * @generated
	 */
	MindC createMindC();

	/**
	 * Returns a new object of class '<em>Mind Itf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mind Itf</em>'.
	 * @generated
	 */
	MindItf createMindItf();

	/**
	 * Returns a new object of class '<em>Mind H</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mind H</em>'.
	 * @generated
	 */
	MindH createMindH();

	/**
	 * Returns a new object of class '<em>Mind Idf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mind Idf</em>'.
	 * @generated
	 */
	MindIdf createMindIdf();

	/**
	 * Returns a new object of class '<em>Mind File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mind File</em>'.
	 * @generated
	 */
	MindFile createMindFile();

	/**
	 * Returns a new object of class '<em>Mind All Repo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mind All Repo</em>'.
	 * @generated
	 */
	MindAllRepo createMindAllRepo();

	/**
	 * Returns a new object of class '<em>Mind Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mind Object</em>'.
	 * @generated
	 */
	MindObject createMindObject();

	/**
	 * Returns a new object of class '<em>Mind Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mind Project</em>'.
	 * @generated
	 */
	MindProject createMindProject();

	/**
	 * Returns a new object of class '<em>Mind Path Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mind Path Entry</em>'.
	 * @generated
	 */
	MindPathEntry createMindPathEntry();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MindidePackage getMindidePackage();

} //MindwsFactory
