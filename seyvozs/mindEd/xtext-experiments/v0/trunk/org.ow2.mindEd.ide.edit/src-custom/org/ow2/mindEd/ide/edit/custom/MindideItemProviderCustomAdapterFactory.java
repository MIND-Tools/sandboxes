package org.ow2.mindEd.ide.edit.custom;


import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.ow2.mindEd.ide.edit.provider.MindAdlItemProvider;
import org.ow2.mindEd.ide.edit.provider.MindAllRepoItemProvider;
import org.ow2.mindEd.ide.edit.provider.MindCItemProvider;
import org.ow2.mindEd.ide.edit.provider.MindFileItemProvider;
import org.ow2.mindEd.ide.edit.provider.MindHItemProvider;
import org.ow2.mindEd.ide.edit.provider.MindIdfItemProvider;
import org.ow2.mindEd.ide.edit.provider.MindItfItemProvider;
import org.ow2.mindEd.ide.edit.provider.MindObjectItemProvider;
import org.ow2.mindEd.ide.edit.provider.MindRepoItemProvider;
import org.ow2.mindEd.ide.edit.provider.MindRootSrcItemProvider;
import org.ow2.mindEd.ide.edit.provider.MindideItemProviderAdapterFactory;
import org.ow2.mindEd.ide.model.MindRootSrc;
import org.ow2.mindEd.ide.model.MindidePackage;

public class MindideItemProviderCustomAdapterFactory extends MindideItemProviderAdapterFactory{

	
	public MindideItemProviderCustomAdapterFactory() {
		super();
	}
	
	/**
	 * This creates an adapter for a {@link org.ow2.mindEd.ide.edit.MindRepo}.
	 */
	@Override
	public Adapter createMindRepoAdapter() {
		if (mindRepoItemProvider == null) {
			mindRepoItemProvider = new MindRepoItemProvider(this) {
				@Override
				public Collection<? extends EStructuralFeature> getChildrenFeatures(
						Object object) {
					if (childrenFeatures == null) {
						childrenFeatures = new ArrayList<EStructuralFeature>();
						 //TODO if ! object is ws root
						 //TODO childrenFeatures.add(MindidePackage.Literals.MIND_REPO__ROOTSRCS);
						childrenFeatures.add(MindidePackage.Literals.MIND_REPO__MIND_LIB_OR_PROJECTS);
					}
					return childrenFeatures;
				}
			};
		}

		return mindRepoItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.ow2.mindEd.ide.edit.MindRootSrc}.
	 */
	@Override
	public Adapter createMindRootSrcAdapter() {
		if (mindRootSrcItemProvider == null) {
			mindRootSrcItemProvider = new MindRootSrcItemProvider(this) {
				@Override
				public String getText(Object object) {
					String fullpath = ((MindRootSrc)object).getFullpath();
					
					return fullpath == null || fullpath.length() == 0 ?
						"?" :
							fullpath;
				}
			};
		}

		return mindRootSrcItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.ow2.mindEd.ide.edit.MindPackage}.
	 */
	@Override
	public Adapter createMindPackageAdapter() {
		if (mindPackageItemProvider == null) {
			mindPackageItemProvider = new MindPackageItemProviderCustom(this);
		}

		return mindPackageItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.ow2.mindEd.ide.edit.MindAdl}.
	 */
	@Override
	public Adapter createMindAdlAdapter() {
		if (mindAdlItemProvider == null) {
			mindAdlItemProvider = new MindAdlItemProvider(this);
		}

		return mindAdlItemProvider;
	}


	/**
	 * This creates an adapter for a {@link org.ow2.mindEd.ide.edit.MindC}.
	 */
	@Override
	public Adapter createMindCAdapter() {
		if (mindCItemProvider == null) {
			mindCItemProvider = new MindCItemProvider(this);
		}

		return mindCItemProvider;
	}


	/**
	 * This creates an adapter for a {@link org.ow2.mindEd.ide.edit.MindItf}.
	 */
	@Override
	public Adapter createMindItfAdapter() {
		if (mindItfItemProvider == null) {
			mindItfItemProvider = new MindItfItemProvider(this);
		}

		return mindItfItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.ow2.mindEd.ide.edit.MindH}.
	 */
	@Override
	public Adapter createMindHAdapter() {
		if (mindHItemProvider == null) {
			mindHItemProvider = new MindHItemProvider(this);
		}

		return mindHItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.ow2.mindEd.ide.edit.MindIdf}.
	 */
	@Override
	public Adapter createMindIdfAdapter() {
		if (mindIdfItemProvider == null) {
			mindIdfItemProvider = new MindIdfItemProvider(this);
		}

		return mindIdfItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.ow2.mindEd.ide.edit.MindFile}.
	 */
	@Override
	public Adapter createMindFileAdapter() {
		if (mindFileItemProvider == null) {
			mindFileItemProvider = new MindFileItemProvider(this);
		}

		return mindFileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ow2.mindEd.ide.edit.MindAllRepo} instances.

	/**
	 * This creates an adapter for a {@link org.ow2.mindEd.ide.edit.MindAllRepo}.
	 */
	@Override
	public Adapter createMindAllRepoAdapter() {
		if (mindAllRepoItemProvider == null) {
			mindAllRepoItemProvider = new MindAllRepoItemProvider(this);
		}

		return mindAllRepoItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.ow2.mindEd.ide.edit.MindProject}.
	 */
	@Override
	public Adapter createMindProjectAdapter() {
		if (mindProjectItemProvider == null) {
			mindProjectItemProvider = new MindProjectItemProviderCustom(this);
		}

		return mindProjectItemProvider;
	}


	/**
	 * This creates an adapter for a {@link org.ow2.mindEd.ide.edit.MindPathEntry}.
	 */
	@Override
	public Adapter createMindPathEntryAdapter() {
		if (mindPathEntryItemProvider == null) {
			mindPathEntryItemProvider = new MindPathEntryItemProviderCustom(this);
		}

		return mindPathEntryItemProvider;
	}
	
}
