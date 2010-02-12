/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl.impl;

import adl.AdlPackage;
import adl.AnnotationsList;
import adl.ArchitectureDefinition;
import adl.CompositeDefinitionElement;
import adl.Element;
import adl.MergedObject;
import adl.PrimitiveAnonymousSubComponent;

import adl.PrimitiveReferenceDefinition;
import adl.SubComponentDefinition;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Anonymous Sub Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adl.impl.PrimitiveAnonymousSubComponentImpl#getLinkedAnnotationsList <em>Linked Annotations List</em>}</li>
 *   <li>{@link adl.impl.PrimitiveAnonymousSubComponentImpl#getParentComponent <em>Parent Component</em>}</li>
 *   <li>{@link adl.impl.PrimitiveAnonymousSubComponentImpl#isMerged <em>Merged</em>}</li>
 *   <li>{@link adl.impl.PrimitiveAnonymousSubComponentImpl#isOverride <em>Override</em>}</li>
 *   <li>{@link adl.impl.PrimitiveAnonymousSubComponentImpl#getReferenceDefinition <em>Reference Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimitiveAnonymousSubComponentImpl extends PrimitiveComponentDefinitionImpl implements PrimitiveAnonymousSubComponent {
	/**
	 * The cached value of the '{@link #getLinkedAnnotationsList() <em>Linked Annotations List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedAnnotationsList()
	 * @generated
	 * @ordered
	 */
	protected AnnotationsList linkedAnnotationsList;
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
	 * The cached value of the '{@link #getReferenceDefinition() <em>Reference Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceDefinition()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveReferenceDefinition referenceDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveAnonymousSubComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdlPackage.Literals.PRIMITIVE_ANONYMOUS_SUB_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsList getLinkedAnnotationsList() {
		if (linkedAnnotationsList != null && linkedAnnotationsList.eIsProxy()) {
			InternalEObject oldLinkedAnnotationsList = (InternalEObject)linkedAnnotationsList;
			linkedAnnotationsList = (AnnotationsList)eResolveProxy(oldLinkedAnnotationsList);
			if (linkedAnnotationsList != oldLinkedAnnotationsList) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__LINKED_ANNOTATIONS_LIST, oldLinkedAnnotationsList, linkedAnnotationsList));
			}
		}
		return linkedAnnotationsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsList basicGetLinkedAnnotationsList() {
		return linkedAnnotationsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkedAnnotationsList(AnnotationsList newLinkedAnnotationsList) {
		AnnotationsList oldLinkedAnnotationsList = linkedAnnotationsList;
		linkedAnnotationsList = newLinkedAnnotationsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__LINKED_ANNOTATIONS_LIST, oldLinkedAnnotationsList, linkedAnnotationsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureDefinition getParentComponent() {
		if (eContainerFeatureID() != AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__PARENT_COMPONENT) return null;
		return (ArchitectureDefinition)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentComponent(ArchitectureDefinition newParentComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentComponent, AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__PARENT_COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentComponent(ArchitectureDefinition newParentComponent) {
		if (newParentComponent != eInternalContainer() || (eContainerFeatureID() != AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__PARENT_COMPONENT && newParentComponent != null)) {
			if (EcoreUtil.isAncestor(this, newParentComponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentComponent != null)
				msgs = ((InternalEObject)newParentComponent).eInverseAdd(this, AdlPackage.ARCHITECTURE_DEFINITION__ELEMENTS, ArchitectureDefinition.class, msgs);
			msgs = basicSetParentComponent(newParentComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__PARENT_COMPONENT, newParentComponent, newParentComponent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__MERGED, oldMerged, merged, !oldMergedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__MERGED, oldMerged, MERGED_EDEFAULT, oldMergedESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__OVERRIDE, oldOverride, override, !oldOverrideESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__OVERRIDE, oldOverride, OVERRIDE_EDEFAULT, oldOverrideESet));
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
	public PrimitiveReferenceDefinition getReferenceDefinition() {
		return referenceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceDefinition(PrimitiveReferenceDefinition newReferenceDefinition, NotificationChain msgs) {
		PrimitiveReferenceDefinition oldReferenceDefinition = referenceDefinition;
		referenceDefinition = newReferenceDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__REFERENCE_DEFINITION, oldReferenceDefinition, newReferenceDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceDefinition(PrimitiveReferenceDefinition newReferenceDefinition) {
		if (newReferenceDefinition != referenceDefinition) {
			NotificationChain msgs = null;
			if (referenceDefinition != null)
				msgs = ((InternalEObject)referenceDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__REFERENCE_DEFINITION, null, msgs);
			if (newReferenceDefinition != null)
				msgs = ((InternalEObject)newReferenceDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__REFERENCE_DEFINITION, null, msgs);
			msgs = basicSetReferenceDefinition(newReferenceDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__REFERENCE_DEFINITION, newReferenceDefinition, newReferenceDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__PARENT_COMPONENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentComponent((ArchitectureDefinition)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__PARENT_COMPONENT:
				return basicSetParentComponent(null, msgs);
			case AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__REFERENCE_DEFINITION:
				return basicSetReferenceDefinition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__PARENT_COMPONENT:
				return eInternalContainer().eInverseRemove(this, AdlPackage.ARCHITECTURE_DEFINITION__ELEMENTS, ArchitectureDefinition.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__LINKED_ANNOTATIONS_LIST:
				if (resolve) return getLinkedAnnotationsList();
				return basicGetLinkedAnnotationsList();
			case AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__PARENT_COMPONENT:
				return getParentComponent();
			case AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__MERGED:
				return isMerged();
			case AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__OVERRIDE:
				return isOverride();
			case AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__REFERENCE_DEFINITION:
				return getReferenceDefinition();
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
			case AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__LINKED_ANNOTATIONS_LIST:
				setLinkedAnnotationsList((AnnotationsList)newValue);
				return;
			case AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__PARENT_COMPONENT:
				setParentComponent((ArchitectureDefinition)newValue);
				return;
			case AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__MERGED:
				setMerged((Boolean)newValue);
				return;
			case AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__OVERRIDE:
				setOverride((Boolean)newValue);
				return;
			case AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__REFERENCE_DEFINITION:
				setReferenceDefinition((PrimitiveReferenceDefinition)newValue);
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
			case AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__LINKED_ANNOTATIONS_LIST:
				setLinkedAnnotationsList((AnnotationsList)null);
				return;
			case AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__PARENT_COMPONENT:
				setParentComponent((ArchitectureDefinition)null);
				return;
			case AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__MERGED:
				unsetMerged();
				return;
			case AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__OVERRIDE:
				unsetOverride();
				return;
			case AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__REFERENCE_DEFINITION:
				setReferenceDefinition((PrimitiveReferenceDefinition)null);
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
			case AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__LINKED_ANNOTATIONS_LIST:
				return linkedAnnotationsList != null;
			case AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__PARENT_COMPONENT:
				return getParentComponent() != null;
			case AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__MERGED:
				return isSetMerged();
			case AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__OVERRIDE:
				return isSetOverride();
			case AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__REFERENCE_DEFINITION:
				return referenceDefinition != null;
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
		if (baseClass == Element.class) {
			switch (derivedFeatureID) {
				case AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__LINKED_ANNOTATIONS_LIST: return AdlPackage.ELEMENT__LINKED_ANNOTATIONS_LIST;
				case AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__PARENT_COMPONENT: return AdlPackage.ELEMENT__PARENT_COMPONENT;
				default: return -1;
			}
		}
		if (baseClass == CompositeDefinitionElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SubComponentDefinition.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == MergedObject.class) {
			switch (derivedFeatureID) {
				case AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__MERGED: return AdlPackage.MERGED_OBJECT__MERGED;
				case AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__OVERRIDE: return AdlPackage.MERGED_OBJECT__OVERRIDE;
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
		if (baseClass == Element.class) {
			switch (baseFeatureID) {
				case AdlPackage.ELEMENT__LINKED_ANNOTATIONS_LIST: return AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__LINKED_ANNOTATIONS_LIST;
				case AdlPackage.ELEMENT__PARENT_COMPONENT: return AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__PARENT_COMPONENT;
				default: return -1;
			}
		}
		if (baseClass == CompositeDefinitionElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SubComponentDefinition.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == MergedObject.class) {
			switch (baseFeatureID) {
				case AdlPackage.MERGED_OBJECT__MERGED: return AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__MERGED;
				case AdlPackage.MERGED_OBJECT__OVERRIDE: return AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT__OVERRIDE;
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

} //PrimitiveAnonymousSubComponentImpl
