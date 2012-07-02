/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ow2.mindEd.ide.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.ow2.mindEd.ide.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.ow2.mindEd.ide.model.MindidePackage
 * @generated
 */
public class MindideSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MindidePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindideSwitch() {
		if (modelPackage == null) {
			modelPackage = MindidePackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MindidePackage.MIND_REPO: {
				MindRepo mindRepo = (MindRepo)theEObject;
				T result = caseMindRepo(mindRepo);
				if (result == null) result = caseMindObject(mindRepo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MindidePackage.MIND_ROOT_SRC: {
				MindRootSrc mindRootSrc = (MindRootSrc)theEObject;
				T result = caseMindRootSrc(mindRootSrc);
				if (result == null) result = caseMindObject(mindRootSrc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MindidePackage.MIND_PACKAGE: {
				MindPackage mindPackage = (MindPackage)theEObject;
				T result = caseMindPackage(mindPackage);
				if (result == null) result = caseMindObject(mindPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MindidePackage.MIND_ADL: {
				MindAdl mindAdl = (MindAdl)theEObject;
				T result = caseMindAdl(mindAdl);
				if (result == null) result = caseMindFile(mindAdl);
				if (result == null) result = caseMindObject(mindAdl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MindidePackage.MIND_C: {
				MindC mindC = (MindC)theEObject;
				T result = caseMindC(mindC);
				if (result == null) result = caseMindFile(mindC);
				if (result == null) result = caseMindObject(mindC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MindidePackage.MIND_ITF: {
				MindItf mindItf = (MindItf)theEObject;
				T result = caseMindItf(mindItf);
				if (result == null) result = caseMindFile(mindItf);
				if (result == null) result = caseMindObject(mindItf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MindidePackage.MIND_H: {
				MindH mindH = (MindH)theEObject;
				T result = caseMindH(mindH);
				if (result == null) result = caseMindFile(mindH);
				if (result == null) result = caseMindObject(mindH);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MindidePackage.MIND_IDF: {
				MindIdf mindIdf = (MindIdf)theEObject;
				T result = caseMindIdf(mindIdf);
				if (result == null) result = caseMindFile(mindIdf);
				if (result == null) result = caseMindObject(mindIdf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MindidePackage.MIND_FILE: {
				MindFile mindFile = (MindFile)theEObject;
				T result = caseMindFile(mindFile);
				if (result == null) result = caseMindObject(mindFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MindidePackage.MIND_ALL_REPO: {
				MindAllRepo mindAllRepo = (MindAllRepo)theEObject;
				T result = caseMindAllRepo(mindAllRepo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MindidePackage.MIND_OBJECT: {
				MindObject mindObject = (MindObject)theEObject;
				T result = caseMindObject(mindObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MindidePackage.MIND_PROJECT: {
				MindProject mindProject = (MindProject)theEObject;
				T result = caseMindProject(mindProject);
				if (result == null) result = caseMindLibOrProject(mindProject);
				if (result == null) result = caseMindObject(mindProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MindidePackage.MIND_PATH_ENTRY: {
				MindPathEntry mindPathEntry = (MindPathEntry)theEObject;
				T result = caseMindPathEntry(mindPathEntry);
				if (result == null) result = caseMindObject(mindPathEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MindidePackage.MIND_LIBRARY: {
				MindLibrary mindLibrary = (MindLibrary)theEObject;
				T result = caseMindLibrary(mindLibrary);
				if (result == null) result = caseMindLibOrProject(mindLibrary);
				if (result == null) result = caseMindRootSrc(mindLibrary);
				if (result == null) result = caseMindObject(mindLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MindidePackage.MIND_LIB_OR_PROJECT: {
				MindLibOrProject mindLibOrProject = (MindLibOrProject)theEObject;
				T result = caseMindLibOrProject(mindLibOrProject);
				if (result == null) result = caseMindObject(mindLibOrProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mind Repo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mind Repo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMindRepo(MindRepo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mind Root Src</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mind Root Src</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMindRootSrc(MindRootSrc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mind Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mind Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMindPackage(MindPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mind Adl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mind Adl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMindAdl(MindAdl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mind C</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mind C</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMindC(MindC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mind Itf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mind Itf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMindItf(MindItf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mind H</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mind H</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMindH(MindH object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mind Idf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mind Idf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMindIdf(MindIdf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mind File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mind File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMindFile(MindFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mind All Repo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mind All Repo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMindAllRepo(MindAllRepo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mind Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mind Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMindObject(MindObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mind Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mind Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMindProject(MindProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mind Path Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mind Path Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMindPathEntry(MindPathEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mind Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mind Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMindLibrary(MindLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mind Lib Or Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mind Lib Or Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMindLibOrProject(MindLibOrProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //MindideSwitch
