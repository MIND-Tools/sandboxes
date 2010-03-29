/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl.impl;

import adl.AdlPackage;
import adl.DataDefinition;
import adl.FileC;
import adl.InlineCodeC;

import adl.MergedObject;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adl.impl.DataDefinitionImpl#isMerged <em>Merged</em>}</li>
 *   <li>{@link adl.impl.DataDefinitionImpl#isOverride <em>Override</em>}</li>
 *   <li>{@link adl.impl.DataDefinitionImpl#getFileC <em>File C</em>}</li>
 *   <li>{@link adl.impl.DataDefinitionImpl#getInlineCcode <em>Inline Ccode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataDefinitionImpl extends PrimitiveDefinitionElementImpl implements DataDefinition {
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
	 * The cached value of the '{@link #getFileC() <em>File C</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileC()
	 * @generated
	 * @ordered
	 */
	protected FileC fileC;

	/**
	 * The cached value of the '{@link #getInlineCcode() <em>Inline Ccode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInlineCcode()
	 * @generated
	 * @ordered
	 */
	protected InlineCodeC inlineCcode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdlPackage.Literals.DATA_DEFINITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.DATA_DEFINITION__MERGED, oldMerged, merged, !oldMergedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdlPackage.DATA_DEFINITION__MERGED, oldMerged, MERGED_EDEFAULT, oldMergedESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.DATA_DEFINITION__OVERRIDE, oldOverride, override, !oldOverrideESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdlPackage.DATA_DEFINITION__OVERRIDE, oldOverride, OVERRIDE_EDEFAULT, oldOverrideESet));
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
	public FileC getFileC() {
		return fileC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileC(FileC newFileC, NotificationChain msgs) {
		FileC oldFileC = fileC;
		fileC = newFileC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdlPackage.DATA_DEFINITION__FILE_C, oldFileC, newFileC);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileC(FileC newFileC) {
		if (newFileC != fileC) {
			NotificationChain msgs = null;
			if (fileC != null)
				msgs = ((InternalEObject)fileC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdlPackage.DATA_DEFINITION__FILE_C, null, msgs);
			if (newFileC != null)
				msgs = ((InternalEObject)newFileC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdlPackage.DATA_DEFINITION__FILE_C, null, msgs);
			msgs = basicSetFileC(newFileC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.DATA_DEFINITION__FILE_C, newFileC, newFileC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InlineCodeC getInlineCcode() {
		return inlineCcode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInlineCcode(InlineCodeC newInlineCcode, NotificationChain msgs) {
		InlineCodeC oldInlineCcode = inlineCcode;
		inlineCcode = newInlineCcode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdlPackage.DATA_DEFINITION__INLINE_CCODE, oldInlineCcode, newInlineCcode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInlineCcode(InlineCodeC newInlineCcode) {
		if (newInlineCcode != inlineCcode) {
			NotificationChain msgs = null;
			if (inlineCcode != null)
				msgs = ((InternalEObject)inlineCcode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdlPackage.DATA_DEFINITION__INLINE_CCODE, null, msgs);
			if (newInlineCcode != null)
				msgs = ((InternalEObject)newInlineCcode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdlPackage.DATA_DEFINITION__INLINE_CCODE, null, msgs);
			msgs = basicSetInlineCcode(newInlineCcode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.DATA_DEFINITION__INLINE_CCODE, newInlineCcode, newInlineCcode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdlPackage.DATA_DEFINITION__FILE_C:
				return basicSetFileC(null, msgs);
			case AdlPackage.DATA_DEFINITION__INLINE_CCODE:
				return basicSetInlineCcode(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdlPackage.DATA_DEFINITION__MERGED:
				return isMerged();
			case AdlPackage.DATA_DEFINITION__OVERRIDE:
				return isOverride();
			case AdlPackage.DATA_DEFINITION__FILE_C:
				return getFileC();
			case AdlPackage.DATA_DEFINITION__INLINE_CCODE:
				return getInlineCcode();
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
			case AdlPackage.DATA_DEFINITION__MERGED:
				setMerged((Boolean)newValue);
				return;
			case AdlPackage.DATA_DEFINITION__OVERRIDE:
				setOverride((Boolean)newValue);
				return;
			case AdlPackage.DATA_DEFINITION__FILE_C:
				setFileC((FileC)newValue);
				return;
			case AdlPackage.DATA_DEFINITION__INLINE_CCODE:
				setInlineCcode((InlineCodeC)newValue);
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
			case AdlPackage.DATA_DEFINITION__MERGED:
				unsetMerged();
				return;
			case AdlPackage.DATA_DEFINITION__OVERRIDE:
				unsetOverride();
				return;
			case AdlPackage.DATA_DEFINITION__FILE_C:
				setFileC((FileC)null);
				return;
			case AdlPackage.DATA_DEFINITION__INLINE_CCODE:
				setInlineCcode((InlineCodeC)null);
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
			case AdlPackage.DATA_DEFINITION__MERGED:
				return isSetMerged();
			case AdlPackage.DATA_DEFINITION__OVERRIDE:
				return isSetOverride();
			case AdlPackage.DATA_DEFINITION__FILE_C:
				return fileC != null;
			case AdlPackage.DATA_DEFINITION__INLINE_CCODE:
				return inlineCcode != null;
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
				case AdlPackage.DATA_DEFINITION__MERGED: return AdlPackage.MERGED_OBJECT__MERGED;
				case AdlPackage.DATA_DEFINITION__OVERRIDE: return AdlPackage.MERGED_OBJECT__OVERRIDE;
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
				case AdlPackage.MERGED_OBJECT__MERGED: return AdlPackage.DATA_DEFINITION__MERGED;
				case AdlPackage.MERGED_OBJECT__OVERRIDE: return AdlPackage.DATA_DEFINITION__OVERRIDE;
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
		result.append(')');
		return result.toString();
	}

} //DataDefinitionImpl
