package org.ow2.fractal.mind.ide.emf.edit.custom;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.DragAndDropCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.ow2.fractal.mind.ide.emf.provider.MindIDEEditPlugin;
import org.ow2.fratal.mind.ide.emf.mindide.MindProject;
import org.ow2.fratal.mind.ide.emf.mindide.MindidePackage;

public class MindPathItemProvider extends ItemProviderAdapter  implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource{

	public MindPathItemProvider(AdapterFactory adapterFactory, MindProject mp) {
		super(adapterFactory);
		mp.eAdapters().add(this);
	}

	
	@Override
	public Collection<?> getChildren(Object object) {
		return super.getChildren(target);
	}
	
	@Override
	public Object getParent(Object object) {
		return target;
	}
	
	
	@Override
	protected Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MindidePackage.Literals.MIND_PROJECT__MINDPATHENTRIES);
		}
		return super.getChildrenFeatures(object);
	}
	
	
	@Override
	public String getText(Object object) {
		return "Mind path";
	}


	public MindProject getMindProject() {
		return (MindProject) target;
	}
	
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MindPath"));
	}
	
	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MindIDEEditPlugin.INSTANCE;
	}
	
	@Override
	protected Command createDragAndDropCommand(EditingDomain domain,
			Object owner, float location, int operations, int operation,
			Collection<?> collection) {
		return new DragAndDropCommand(domain, owner, location, operations, operation, collection) {
			@Override
			protected Collection<?> getChildren(Object object) {
				return getMindProject().getMindpathentries();
			}
		};
	}
	
	@Override
	public boolean isAdapterForType(Object type) {
		return super.isAdapterForType(type) || type == MindPathItemProvider.class;
	}
	
}
