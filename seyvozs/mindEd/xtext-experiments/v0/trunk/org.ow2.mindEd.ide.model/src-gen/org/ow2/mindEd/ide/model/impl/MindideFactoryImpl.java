/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ow2.mindEd.ide.model.impl;

import java.net.URI;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ow2.mindEd.ide.model.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MindideFactoryImpl extends EFactoryImpl implements MindideFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MindideFactory init() {
		try {
			MindideFactory theMindideFactory = (MindideFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.ow2.mindEd/ide.ecore/0.2.0"); 
			if (theMindideFactory != null) {
				return theMindideFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MindideFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindideFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MindidePackage.MIND_REPO: return createMindRepo();
			case MindidePackage.MIND_ROOT_SRC: return createMindRootSrc();
			case MindidePackage.MIND_PACKAGE: return createMindPackage();
			case MindidePackage.MIND_ADL: return createMindAdl();
			case MindidePackage.MIND_C: return createMindC();
			case MindidePackage.MIND_ITF: return createMindItf();
			case MindidePackage.MIND_H: return createMindH();
			case MindidePackage.MIND_IDF: return createMindIdf();
			case MindidePackage.MIND_FILE: return createMindFile();
			case MindidePackage.MIND_ALL_REPO: return createMindAllRepo();
			case MindidePackage.MIND_PROJECT: return createMindProject();
			case MindidePackage.MIND_PATH_ENTRY: return createMindPathEntry();
			case MindidePackage.MIND_LIBRARY: return createMindLibrary();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MindidePackage.MIND_PATH_KIND:
				return createMindPathKindFromString(eDataType, initialValue);
			case MindidePackage.COMPONENT_KIND:
				return createComponentKindFromString(eDataType, initialValue);
			case MindidePackage.IPROJECT:
				return createIProjectFromString(eDataType, initialValue);
			case MindidePackage.IRESOURCE:
				return createIResourceFromString(eDataType, initialValue);
			case MindidePackage.URI:
				return createURIFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MindidePackage.MIND_PATH_KIND:
				return convertMindPathKindToString(eDataType, instanceValue);
			case MindidePackage.COMPONENT_KIND:
				return convertComponentKindToString(eDataType, instanceValue);
			case MindidePackage.IPROJECT:
				return convertIProjectToString(eDataType, instanceValue);
			case MindidePackage.IRESOURCE:
				return convertIResourceToString(eDataType, instanceValue);
			case MindidePackage.URI:
				return convertURIToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindRepo createMindRepo() {
		MindRepoImpl mindRepo = new MindRepoImpl();
		return mindRepo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindRootSrc createMindRootSrc() {
		MindRootSrcImpl mindRootSrc = new MindRootSrcImpl();
		return mindRootSrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindPackage createMindPackage() {
		MindPackageImpl mindPackage = new MindPackageImpl();
		return mindPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindAdl createMindAdl() {
		MindAdlImpl mindAdl = new MindAdlImpl();
		return mindAdl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindC createMindC() {
		MindCImpl mindC = new MindCImpl();
		return mindC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindItf createMindItf() {
		MindItfImpl mindItf = new MindItfImpl();
		return mindItf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindH createMindH() {
		MindHImpl mindH = new MindHImpl();
		return mindH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindIdf createMindIdf() {
		MindIdfImpl mindIdf = new MindIdfImpl();
		return mindIdf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindFile createMindFile() {
		MindFileImpl mindFile = new MindFileImpl();
		return mindFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindAllRepo createMindAllRepo() {
		MindAllRepoImpl mindAllRepo = new MindAllRepoImpl();
		return mindAllRepo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindProject createMindProject() {
		MindProjectImpl mindProject = new MindProjectImpl();
		return mindProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindPathEntry createMindPathEntry() {
		MindPathEntryImpl mindPathEntry = new MindPathEntryImpl();
		return mindPathEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindLibrary createMindLibrary() {
		MindLibraryImpl mindLibrary = new MindLibraryImpl();
		return mindLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindPathKind createMindPathKindFromString(EDataType eDataType, String initialValue) {
		MindPathKind result = MindPathKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMindPathKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentKind createComponentKindFromString(EDataType eDataType, String initialValue) {
		ComponentKind result = ComponentKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComponentKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProject createIProjectFromString(EDataType eDataType, String initialValue) {
		return (IProject)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIProjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IResource createIResourceFromString(EDataType eDataType, String initialValue) {
		return (IResource)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIResourceToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI createURIFromString(EDataType eDataType, String initialValue) {
		return (URI)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertURIToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindidePackage getMindidePackage() {
		return (MindidePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MindidePackage getPackage() {
		return MindidePackage.eINSTANCE;
	}

} //MindideFactoryImpl
