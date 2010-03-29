/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl.impl;

import adl.AdlPackage;
import adl.ArchitectureDefinition;
import adl.BindingDefinition;
import adl.InterfaceDefinition;

import adl.MergedObject;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adl.impl.BindingDefinitionImpl#isMerged <em>Merged</em>}</li>
 *   <li>{@link adl.impl.BindingDefinitionImpl#isOverride <em>Override</em>}</li>
 *   <li>{@link adl.impl.BindingDefinitionImpl#getInterfaceSourceParent <em>Interface Source Parent</em>}</li>
 *   <li>{@link adl.impl.BindingDefinitionImpl#getInterfaceSource <em>Interface Source</em>}</li>
 *   <li>{@link adl.impl.BindingDefinitionImpl#getInterfaceSourceIndex <em>Interface Source Index</em>}</li>
 *   <li>{@link adl.impl.BindingDefinitionImpl#getInterfaceTargetParent <em>Interface Target Parent</em>}</li>
 *   <li>{@link adl.impl.BindingDefinitionImpl#getInterfaceTarget <em>Interface Target</em>}</li>
 *   <li>{@link adl.impl.BindingDefinitionImpl#getInterfaceTargetIndex <em>Interface Target Index</em>}</li>
 *   <li>{@link adl.impl.BindingDefinitionImpl#getInterfaceSourceName <em>Interface Source Name</em>}</li>
 *   <li>{@link adl.impl.BindingDefinitionImpl#getInterfaceTargetName <em>Interface Target Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingDefinitionImpl extends CompositeDefinitionElementImpl implements BindingDefinition {
	/**
	 * The default value of the '{@link #isMerged() <em>Merged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMerged()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MERGED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMerged() <em>Merged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMerged()
	 * @generated
	 * @ordered
	 */
	protected boolean merged = MERGED_EDEFAULT;

	/**
	 * This is true if the Merged attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mergedESet;

	/**
	 * The default value of the '{@link #isOverride() <em>Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverride()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OVERRIDE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOverride() <em>Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverride()
	 * @generated
	 * @ordered
	 */
	protected boolean override = OVERRIDE_EDEFAULT;

	/**
	 * This is true if the Override attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean overrideESet;

	/**
	 * The cached value of the '{@link #getInterfaceSourceParent() <em>Interface Source Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceSourceParent()
	 * @generated
	 * @ordered
	 */
	protected ArchitectureDefinition interfaceSourceParent;

	/**
	 * The cached value of the '{@link #getInterfaceSource() <em>Interface Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceSource()
	 * @generated
	 * @ordered
	 */
	protected InterfaceDefinition interfaceSource;

	/**
	 * The default value of the '{@link #getInterfaceSourceIndex() <em>Interface Source Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceSourceIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int INTERFACE_SOURCE_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInterfaceSourceIndex() <em>Interface Source Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceSourceIndex()
	 * @generated
	 * @ordered
	 */
	protected int interfaceSourceIndex = INTERFACE_SOURCE_INDEX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInterfaceTargetParent() <em>Interface Target Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceTargetParent()
	 * @generated
	 * @ordered
	 */
	protected ArchitectureDefinition interfaceTargetParent;

	/**
	 * The cached value of the '{@link #getInterfaceTarget() <em>Interface Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceTarget()
	 * @generated
	 * @ordered
	 */
	protected InterfaceDefinition interfaceTarget;

	/**
	 * The default value of the '{@link #getInterfaceTargetIndex() <em>Interface Target Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceTargetIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int INTERFACE_TARGET_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInterfaceTargetIndex() <em>Interface Target Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceTargetIndex()
	 * @generated
	 * @ordered
	 */
	protected int interfaceTargetIndex = INTERFACE_TARGET_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterfaceSourceName() <em>Interface Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceSourceName()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERFACE_SOURCE_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getInterfaceSourceName() <em>Interface Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceSourceName()
	 * @generated
	 * @ordered
	 */
	protected String interfaceSourceName = INTERFACE_SOURCE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterfaceTargetName() <em>Interface Target Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceTargetName()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERFACE_TARGET_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getInterfaceTargetName() <em>Interface Target Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceTargetName()
	 * @generated
	 * @ordered
	 */
	protected String interfaceTargetName = INTERFACE_TARGET_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdlPackage.Literals.BINDING_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMerged() {
		return merged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMerged(boolean newMerged) {
		boolean oldMerged = merged;
		merged = newMerged;
		boolean oldMergedESet = mergedESet;
		mergedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.BINDING_DEFINITION__MERGED, oldMerged, merged, !oldMergedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMerged() {
		boolean oldMerged = merged;
		boolean oldMergedESet = mergedESet;
		merged = MERGED_EDEFAULT;
		mergedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdlPackage.BINDING_DEFINITION__MERGED, oldMerged, MERGED_EDEFAULT, oldMergedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMerged() {
		return mergedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOverride() {
		return override;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverride(boolean newOverride) {
		boolean oldOverride = override;
		override = newOverride;
		boolean oldOverrideESet = overrideESet;
		overrideESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.BINDING_DEFINITION__OVERRIDE, oldOverride, override, !oldOverrideESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOverride() {
		boolean oldOverride = override;
		boolean oldOverrideESet = overrideESet;
		override = OVERRIDE_EDEFAULT;
		overrideESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdlPackage.BINDING_DEFINITION__OVERRIDE, oldOverride, OVERRIDE_EDEFAULT, oldOverrideESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOverride() {
		return overrideESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureDefinition getInterfaceSourceParent() {
		if (interfaceSourceParent != null && interfaceSourceParent.eIsProxy()) {
			InternalEObject oldInterfaceSourceParent = (InternalEObject)interfaceSourceParent;
			interfaceSourceParent = (ArchitectureDefinition)eResolveProxy(oldInterfaceSourceParent);
			if (interfaceSourceParent != oldInterfaceSourceParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdlPackage.BINDING_DEFINITION__INTERFACE_SOURCE_PARENT, oldInterfaceSourceParent, interfaceSourceParent));
			}
		}
		return interfaceSourceParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureDefinition basicGetInterfaceSourceParent() {
		return interfaceSourceParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceSourceParent(ArchitectureDefinition newInterfaceSourceParent) {
		ArchitectureDefinition oldInterfaceSourceParent = interfaceSourceParent;
		interfaceSourceParent = newInterfaceSourceParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.BINDING_DEFINITION__INTERFACE_SOURCE_PARENT, oldInterfaceSourceParent, interfaceSourceParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDefinition getInterfaceSource() {
		if (interfaceSource != null && interfaceSource.eIsProxy()) {
			InternalEObject oldInterfaceSource = (InternalEObject)interfaceSource;
			interfaceSource = (InterfaceDefinition)eResolveProxy(oldInterfaceSource);
			if (interfaceSource != oldInterfaceSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdlPackage.BINDING_DEFINITION__INTERFACE_SOURCE, oldInterfaceSource, interfaceSource));
			}
		}
		return interfaceSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDefinition basicGetInterfaceSource() {
		return interfaceSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceSource(InterfaceDefinition newInterfaceSource) {
		InterfaceDefinition oldInterfaceSource = interfaceSource;
		interfaceSource = newInterfaceSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.BINDING_DEFINITION__INTERFACE_SOURCE, oldInterfaceSource, interfaceSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInterfaceSourceIndex() {
		return interfaceSourceIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceSourceIndex(int newInterfaceSourceIndex) {
		int oldInterfaceSourceIndex = interfaceSourceIndex;
		interfaceSourceIndex = newInterfaceSourceIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.BINDING_DEFINITION__INTERFACE_SOURCE_INDEX, oldInterfaceSourceIndex, interfaceSourceIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureDefinition getInterfaceTargetParent() {
		if (interfaceTargetParent != null && interfaceTargetParent.eIsProxy()) {
			InternalEObject oldInterfaceTargetParent = (InternalEObject)interfaceTargetParent;
			interfaceTargetParent = (ArchitectureDefinition)eResolveProxy(oldInterfaceTargetParent);
			if (interfaceTargetParent != oldInterfaceTargetParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdlPackage.BINDING_DEFINITION__INTERFACE_TARGET_PARENT, oldInterfaceTargetParent, interfaceTargetParent));
			}
		}
		return interfaceTargetParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureDefinition basicGetInterfaceTargetParent() {
		return interfaceTargetParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceTargetParent(ArchitectureDefinition newInterfaceTargetParent) {
		ArchitectureDefinition oldInterfaceTargetParent = interfaceTargetParent;
		interfaceTargetParent = newInterfaceTargetParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.BINDING_DEFINITION__INTERFACE_TARGET_PARENT, oldInterfaceTargetParent, interfaceTargetParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDefinition getInterfaceTarget() {
		if (interfaceTarget != null && interfaceTarget.eIsProxy()) {
			InternalEObject oldInterfaceTarget = (InternalEObject)interfaceTarget;
			interfaceTarget = (InterfaceDefinition)eResolveProxy(oldInterfaceTarget);
			if (interfaceTarget != oldInterfaceTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdlPackage.BINDING_DEFINITION__INTERFACE_TARGET, oldInterfaceTarget, interfaceTarget));
			}
		}
		return interfaceTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDefinition basicGetInterfaceTarget() {
		return interfaceTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceTarget(InterfaceDefinition newInterfaceTarget) {
		InterfaceDefinition oldInterfaceTarget = interfaceTarget;
		interfaceTarget = newInterfaceTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.BINDING_DEFINITION__INTERFACE_TARGET, oldInterfaceTarget, interfaceTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInterfaceTargetIndex() {
		return interfaceTargetIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceTargetIndex(int newInterfaceTargetIndex) {
		int oldInterfaceTargetIndex = interfaceTargetIndex;
		interfaceTargetIndex = newInterfaceTargetIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.BINDING_DEFINITION__INTERFACE_TARGET_INDEX, oldInterfaceTargetIndex, interfaceTargetIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterfaceSourceName() {
		return interfaceSourceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceSourceName(String newInterfaceSourceName) {
		String oldInterfaceSourceName = interfaceSourceName;
		interfaceSourceName = newInterfaceSourceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.BINDING_DEFINITION__INTERFACE_SOURCE_NAME, oldInterfaceSourceName, interfaceSourceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterfaceTargetName() {
		return interfaceTargetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceTargetName(String newInterfaceTargetName) {
		String oldInterfaceTargetName = interfaceTargetName;
		interfaceTargetName = newInterfaceTargetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.BINDING_DEFINITION__INTERFACE_TARGET_NAME, oldInterfaceTargetName, interfaceTargetName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdlPackage.BINDING_DEFINITION__MERGED:
				return isMerged();
			case AdlPackage.BINDING_DEFINITION__OVERRIDE:
				return isOverride();
			case AdlPackage.BINDING_DEFINITION__INTERFACE_SOURCE_PARENT:
				if (resolve) return getInterfaceSourceParent();
				return basicGetInterfaceSourceParent();
			case AdlPackage.BINDING_DEFINITION__INTERFACE_SOURCE:
				if (resolve) return getInterfaceSource();
				return basicGetInterfaceSource();
			case AdlPackage.BINDING_DEFINITION__INTERFACE_SOURCE_INDEX:
				return getInterfaceSourceIndex();
			case AdlPackage.BINDING_DEFINITION__INTERFACE_TARGET_PARENT:
				if (resolve) return getInterfaceTargetParent();
				return basicGetInterfaceTargetParent();
			case AdlPackage.BINDING_DEFINITION__INTERFACE_TARGET:
				if (resolve) return getInterfaceTarget();
				return basicGetInterfaceTarget();
			case AdlPackage.BINDING_DEFINITION__INTERFACE_TARGET_INDEX:
				return getInterfaceTargetIndex();
			case AdlPackage.BINDING_DEFINITION__INTERFACE_SOURCE_NAME:
				return getInterfaceSourceName();
			case AdlPackage.BINDING_DEFINITION__INTERFACE_TARGET_NAME:
				return getInterfaceTargetName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AdlPackage.BINDING_DEFINITION__MERGED:
				setMerged((Boolean)newValue);
				return;
			case AdlPackage.BINDING_DEFINITION__OVERRIDE:
				setOverride((Boolean)newValue);
				return;
			case AdlPackage.BINDING_DEFINITION__INTERFACE_SOURCE_PARENT:
				setInterfaceSourceParent((ArchitectureDefinition)newValue);
				return;
			case AdlPackage.BINDING_DEFINITION__INTERFACE_SOURCE:
				setInterfaceSource((InterfaceDefinition)newValue);
				return;
			case AdlPackage.BINDING_DEFINITION__INTERFACE_SOURCE_INDEX:
				setInterfaceSourceIndex((Integer)newValue);
				return;
			case AdlPackage.BINDING_DEFINITION__INTERFACE_TARGET_PARENT:
				setInterfaceTargetParent((ArchitectureDefinition)newValue);
				return;
			case AdlPackage.BINDING_DEFINITION__INTERFACE_TARGET:
				setInterfaceTarget((InterfaceDefinition)newValue);
				return;
			case AdlPackage.BINDING_DEFINITION__INTERFACE_TARGET_INDEX:
				setInterfaceTargetIndex((Integer)newValue);
				return;
			case AdlPackage.BINDING_DEFINITION__INTERFACE_SOURCE_NAME:
				setInterfaceSourceName((String)newValue);
				return;
			case AdlPackage.BINDING_DEFINITION__INTERFACE_TARGET_NAME:
				setInterfaceTargetName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AdlPackage.BINDING_DEFINITION__MERGED:
				unsetMerged();
				return;
			case AdlPackage.BINDING_DEFINITION__OVERRIDE:
				unsetOverride();
				return;
			case AdlPackage.BINDING_DEFINITION__INTERFACE_SOURCE_PARENT:
				setInterfaceSourceParent((ArchitectureDefinition)null);
				return;
			case AdlPackage.BINDING_DEFINITION__INTERFACE_SOURCE:
				setInterfaceSource((InterfaceDefinition)null);
				return;
			case AdlPackage.BINDING_DEFINITION__INTERFACE_SOURCE_INDEX:
				setInterfaceSourceIndex(INTERFACE_SOURCE_INDEX_EDEFAULT);
				return;
			case AdlPackage.BINDING_DEFINITION__INTERFACE_TARGET_PARENT:
				setInterfaceTargetParent((ArchitectureDefinition)null);
				return;
			case AdlPackage.BINDING_DEFINITION__INTERFACE_TARGET:
				setInterfaceTarget((InterfaceDefinition)null);
				return;
			case AdlPackage.BINDING_DEFINITION__INTERFACE_TARGET_INDEX:
				setInterfaceTargetIndex(INTERFACE_TARGET_INDEX_EDEFAULT);
				return;
			case AdlPackage.BINDING_DEFINITION__INTERFACE_SOURCE_NAME:
				setInterfaceSourceName(INTERFACE_SOURCE_NAME_EDEFAULT);
				return;
			case AdlPackage.BINDING_DEFINITION__INTERFACE_TARGET_NAME:
				setInterfaceTargetName(INTERFACE_TARGET_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AdlPackage.BINDING_DEFINITION__MERGED:
				return isSetMerged();
			case AdlPackage.BINDING_DEFINITION__OVERRIDE:
				return isSetOverride();
			case AdlPackage.BINDING_DEFINITION__INTERFACE_SOURCE_PARENT:
				return interfaceSourceParent != null;
			case AdlPackage.BINDING_DEFINITION__INTERFACE_SOURCE:
				return interfaceSource != null;
			case AdlPackage.BINDING_DEFINITION__INTERFACE_SOURCE_INDEX:
				return interfaceSourceIndex != INTERFACE_SOURCE_INDEX_EDEFAULT;
			case AdlPackage.BINDING_DEFINITION__INTERFACE_TARGET_PARENT:
				return interfaceTargetParent != null;
			case AdlPackage.BINDING_DEFINITION__INTERFACE_TARGET:
				return interfaceTarget != null;
			case AdlPackage.BINDING_DEFINITION__INTERFACE_TARGET_INDEX:
				return interfaceTargetIndex != INTERFACE_TARGET_INDEX_EDEFAULT;
			case AdlPackage.BINDING_DEFINITION__INTERFACE_SOURCE_NAME:
				return INTERFACE_SOURCE_NAME_EDEFAULT == null ? interfaceSourceName != null : !INTERFACE_SOURCE_NAME_EDEFAULT.equals(interfaceSourceName);
			case AdlPackage.BINDING_DEFINITION__INTERFACE_TARGET_NAME:
				return INTERFACE_TARGET_NAME_EDEFAULT == null ? interfaceTargetName != null : !INTERFACE_TARGET_NAME_EDEFAULT.equals(interfaceTargetName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MergedObject.class) {
			switch (derivedFeatureID) {
				case AdlPackage.BINDING_DEFINITION__MERGED: return AdlPackage.MERGED_OBJECT__MERGED;
				case AdlPackage.BINDING_DEFINITION__OVERRIDE: return AdlPackage.MERGED_OBJECT__OVERRIDE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MergedObject.class) {
			switch (baseFeatureID) {
				case AdlPackage.MERGED_OBJECT__MERGED: return AdlPackage.BINDING_DEFINITION__MERGED;
				case AdlPackage.MERGED_OBJECT__OVERRIDE: return AdlPackage.BINDING_DEFINITION__OVERRIDE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (merged: ");
		if (mergedESet) result.append(merged); else result.append("<unset>");
		result.append(", override: ");
		if (overrideESet) result.append(override); else result.append("<unset>");
		result.append(", interfaceSourceIndex: ");
		result.append(interfaceSourceIndex);
		result.append(", interfaceTargetIndex: ");
		result.append(interfaceTargetIndex);
		result.append(", interfaceSourceName: ");
		result.append(interfaceSourceName);
		result.append(", interfaceTargetName: ");
		result.append(interfaceTargetName);
		result.append(')');
		return result.toString();
	}

} //BindingDefinitionImpl
