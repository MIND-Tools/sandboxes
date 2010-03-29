/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl.provider;


import adl.AdlPackage;
import adl.BindingDefinition;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link adl.BindingDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BindingDefinitionItemProvider
	extends CompositeDefinitionElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingDefinitionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addMergedPropertyDescriptor(object);
			addOverridePropertyDescriptor(object);
			addInterfaceSourceParentPropertyDescriptor(object);
			addInterfaceSourcePropertyDescriptor(object);
			addInterfaceSourceIndexPropertyDescriptor(object);
			addInterfaceTargetParentPropertyDescriptor(object);
			addInterfaceTargetPropertyDescriptor(object);
			addInterfaceTargetIndexPropertyDescriptor(object);
			addInterfaceSourceNamePropertyDescriptor(object);
			addInterfaceTargetNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Merged feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMergedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MergedObject_merged_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MergedObject_merged_feature", "_UI_MergedObject_type"),
				 AdlPackage.Literals.MERGED_OBJECT__MERGED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Override feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverridePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MergedObject_override_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MergedObject_override_feature", "_UI_MergedObject_type"),
				 AdlPackage.Literals.MERGED_OBJECT__OVERRIDE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interface Source Parent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfaceSourceParentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BindingDefinition_interfaceSourceParent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BindingDefinition_interfaceSourceParent_feature", "_UI_BindingDefinition_type"),
				 AdlPackage.Literals.BINDING_DEFINITION__INTERFACE_SOURCE_PARENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interface Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfaceSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BindingDefinition_interfaceSource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BindingDefinition_interfaceSource_feature", "_UI_BindingDefinition_type"),
				 AdlPackage.Literals.BINDING_DEFINITION__INTERFACE_SOURCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interface Source Index feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfaceSourceIndexPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BindingDefinition_interfaceSourceIndex_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BindingDefinition_interfaceSourceIndex_feature", "_UI_BindingDefinition_type"),
				 AdlPackage.Literals.BINDING_DEFINITION__INTERFACE_SOURCE_INDEX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interface Target Parent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfaceTargetParentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BindingDefinition_interfaceTargetParent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BindingDefinition_interfaceTargetParent_feature", "_UI_BindingDefinition_type"),
				 AdlPackage.Literals.BINDING_DEFINITION__INTERFACE_TARGET_PARENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interface Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfaceTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BindingDefinition_interfaceTarget_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BindingDefinition_interfaceTarget_feature", "_UI_BindingDefinition_type"),
				 AdlPackage.Literals.BINDING_DEFINITION__INTERFACE_TARGET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interface Target Index feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfaceTargetIndexPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BindingDefinition_interfaceTargetIndex_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BindingDefinition_interfaceTargetIndex_feature", "_UI_BindingDefinition_type"),
				 AdlPackage.Literals.BINDING_DEFINITION__INTERFACE_TARGET_INDEX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interface Source Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfaceSourceNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BindingDefinition_interfaceSourceName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BindingDefinition_interfaceSourceName_feature", "_UI_BindingDefinition_type"),
				 AdlPackage.Literals.BINDING_DEFINITION__INTERFACE_SOURCE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interface Target Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfaceTargetNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BindingDefinition_interfaceTargetName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BindingDefinition_interfaceTargetName_feature", "_UI_BindingDefinition_type"),
				 AdlPackage.Literals.BINDING_DEFINITION__INTERFACE_TARGET_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns BindingDefinition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BindingDefinition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BindingDefinition)object).getInterfaceSourceName();
		return label == null || label.length() == 0 ?
			getString("_UI_BindingDefinition_type") :
			getString("_UI_BindingDefinition_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(BindingDefinition.class)) {
			case AdlPackage.BINDING_DEFINITION__MERGED:
			case AdlPackage.BINDING_DEFINITION__OVERRIDE:
			case AdlPackage.BINDING_DEFINITION__INTERFACE_SOURCE_INDEX:
			case AdlPackage.BINDING_DEFINITION__INTERFACE_TARGET_INDEX:
			case AdlPackage.BINDING_DEFINITION__INTERFACE_SOURCE_NAME:
			case AdlPackage.BINDING_DEFINITION__INTERFACE_TARGET_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
