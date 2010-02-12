/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl.impl;

import adl.AdlPackage;
import adl.MergedObject;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merged Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adl.impl.MergedObjectImpl#isMerged <em>Merged</em>}</li>
 *   <li>{@link adl.impl.MergedObjectImpl#isOverride <em>Override</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MergedObjectImpl extends EObjectImpl implements MergedObject {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MergedObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdlPackage.Literals.MERGED_OBJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.MERGED_OBJECT__MERGED, oldMerged, merged, !oldMergedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdlPackage.MERGED_OBJECT__MERGED, oldMerged, MERGED_EDEFAULT, oldMergedESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.MERGED_OBJECT__OVERRIDE, oldOverride, override, !oldOverrideESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdlPackage.MERGED_OBJECT__OVERRIDE, oldOverride, OVERRIDE_EDEFAULT, oldOverrideESet));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdlPackage.MERGED_OBJECT__MERGED:
				return isMerged();
			case AdlPackage.MERGED_OBJECT__OVERRIDE:
				return isOverride();
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
			case AdlPackage.MERGED_OBJECT__MERGED:
				setMerged((Boolean)newValue);
				return;
			case AdlPackage.MERGED_OBJECT__OVERRIDE:
				setOverride((Boolean)newValue);
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
			case AdlPackage.MERGED_OBJECT__MERGED:
				unsetMerged();
				return;
			case AdlPackage.MERGED_OBJECT__OVERRIDE:
				unsetOverride();
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
			case AdlPackage.MERGED_OBJECT__MERGED:
				return isSetMerged();
			case AdlPackage.MERGED_OBJECT__OVERRIDE:
				return isSetOverride();
		}
		return super.eIsSet(featureID);
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
		result.append(')');
		return result.toString();
	}

} //MergedObjectImpl
