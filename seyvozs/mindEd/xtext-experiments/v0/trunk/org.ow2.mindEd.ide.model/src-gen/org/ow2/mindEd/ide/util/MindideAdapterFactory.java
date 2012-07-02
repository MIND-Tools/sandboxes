/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ow2.mindEd.ide.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.ow2.mindEd.ide.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ow2.mindEd.ide.model.MindidePackage
 * @generated
 */
public class MindideAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MindidePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindideAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MindidePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MindideSwitch<Adapter> modelSwitch =
		new MindideSwitch<Adapter>() {
			@Override
			public Adapter caseMindRepo(MindRepo object) {
				return createMindRepoAdapter();
			}
			@Override
			public Adapter caseMindRootSrc(MindRootSrc object) {
				return createMindRootSrcAdapter();
			}
			@Override
			public Adapter caseMindPackage(MindPackage object) {
				return createMindPackageAdapter();
			}
			@Override
			public Adapter caseMindAdl(MindAdl object) {
				return createMindAdlAdapter();
			}
			@Override
			public Adapter caseMindC(MindC object) {
				return createMindCAdapter();
			}
			@Override
			public Adapter caseMindItf(MindItf object) {
				return createMindItfAdapter();
			}
			@Override
			public Adapter caseMindH(MindH object) {
				return createMindHAdapter();
			}
			@Override
			public Adapter caseMindIdf(MindIdf object) {
				return createMindIdfAdapter();
			}
			@Override
			public Adapter caseMindFile(MindFile object) {
				return createMindFileAdapter();
			}
			@Override
			public Adapter caseMindAllRepo(MindAllRepo object) {
				return createMindAllRepoAdapter();
			}
			@Override
			public Adapter caseMindObject(MindObject object) {
				return createMindObjectAdapter();
			}
			@Override
			public Adapter caseMindProject(MindProject object) {
				return createMindProjectAdapter();
			}
			@Override
			public Adapter caseMindPathEntry(MindPathEntry object) {
				return createMindPathEntryAdapter();
			}
			@Override
			public Adapter caseMindLibrary(MindLibrary object) {
				return createMindLibraryAdapter();
			}
			@Override
			public Adapter caseMindLibOrProject(MindLibOrProject object) {
				return createMindLibOrProjectAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.ow2.mindEd.ide.model.MindRepo <em>Mind Repo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ow2.mindEd.ide.model.MindRepo
	 * @generated
	 */
	public Adapter createMindRepoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ow2.mindEd.ide.model.MindRootSrc <em>Mind Root Src</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ow2.mindEd.ide.model.MindRootSrc
	 * @generated
	 */
	public Adapter createMindRootSrcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ow2.mindEd.ide.model.MindPackage <em>Mind Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ow2.mindEd.ide.model.MindPackage
	 * @generated
	 */
	public Adapter createMindPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ow2.mindEd.ide.model.MindAdl <em>Mind Adl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ow2.mindEd.ide.model.MindAdl
	 * @generated
	 */
	public Adapter createMindAdlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ow2.mindEd.ide.model.MindC <em>Mind C</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ow2.mindEd.ide.model.MindC
	 * @generated
	 */
	public Adapter createMindCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ow2.mindEd.ide.model.MindItf <em>Mind Itf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ow2.mindEd.ide.model.MindItf
	 * @generated
	 */
	public Adapter createMindItfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ow2.mindEd.ide.model.MindH <em>Mind H</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ow2.mindEd.ide.model.MindH
	 * @generated
	 */
	public Adapter createMindHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ow2.mindEd.ide.model.MindIdf <em>Mind Idf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ow2.mindEd.ide.model.MindIdf
	 * @generated
	 */
	public Adapter createMindIdfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ow2.mindEd.ide.model.MindFile <em>Mind File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ow2.mindEd.ide.model.MindFile
	 * @generated
	 */
	public Adapter createMindFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ow2.mindEd.ide.model.MindAllRepo <em>Mind All Repo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ow2.mindEd.ide.model.MindAllRepo
	 * @generated
	 */
	public Adapter createMindAllRepoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ow2.mindEd.ide.model.MindObject <em>Mind Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ow2.mindEd.ide.model.MindObject
	 * @generated
	 */
	public Adapter createMindObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ow2.mindEd.ide.model.MindProject <em>Mind Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ow2.mindEd.ide.model.MindProject
	 * @generated
	 */
	public Adapter createMindProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ow2.mindEd.ide.model.MindPathEntry <em>Mind Path Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ow2.mindEd.ide.model.MindPathEntry
	 * @generated
	 */
	public Adapter createMindPathEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ow2.mindEd.ide.model.MindLibrary <em>Mind Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ow2.mindEd.ide.model.MindLibrary
	 * @generated
	 */
	public Adapter createMindLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ow2.mindEd.ide.model.MindLibOrProject <em>Mind Lib Or Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ow2.mindEd.ide.model.MindLibOrProject
	 * @generated
	 */
	public Adapter createMindLibOrProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MindideAdapterFactory
