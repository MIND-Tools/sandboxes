/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ow2.fractal.mind.ide.emf.mindide.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.ow2.fractal.mind.ide.emf.mindide.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ow2.fractal.mind.ide.emf.mindide.MindidePackage
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
	 * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.ide.emf.mindide.MindRepo <em>Mind Repo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindRepo
	 * @generated
	 */
	public Adapter createMindRepoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc <em>Mind Root Src</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc
	 * @generated
	 */
	public Adapter createMindRootSrcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.ide.emf.mindide.MindPackage <em>Mind Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindPackage
	 * @generated
	 */
	public Adapter createMindPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.ide.emf.mindide.MindAdl <em>Mind Adl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindAdl
	 * @generated
	 */
	public Adapter createMindAdlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.ide.emf.mindide.MindC <em>Mind C</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindC
	 * @generated
	 */
	public Adapter createMindCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.ide.emf.mindide.MindItf <em>Mind Itf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindItf
	 * @generated
	 */
	public Adapter createMindItfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.ide.emf.mindide.MindH <em>Mind H</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindH
	 * @generated
	 */
	public Adapter createMindHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.ide.emf.mindide.MindIdf <em>Mind Idf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindIdf
	 * @generated
	 */
	public Adapter createMindIdfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.ide.emf.mindide.MindFile <em>Mind File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindFile
	 * @generated
	 */
	public Adapter createMindFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.ide.emf.mindide.MindAllRepo <em>Mind All Repo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindAllRepo
	 * @generated
	 */
	public Adapter createMindAllRepoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.ide.emf.mindide.MindObject <em>Mind Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindObject
	 * @generated
	 */
	public Adapter createMindObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.ide.emf.mindide.MindProject <em>Mind Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindProject
	 * @generated
	 */
	public Adapter createMindProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry <em>Mind Path Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry
	 * @generated
	 */
	public Adapter createMindPathEntryAdapter() {
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

} //MindwsAdapterFactory
