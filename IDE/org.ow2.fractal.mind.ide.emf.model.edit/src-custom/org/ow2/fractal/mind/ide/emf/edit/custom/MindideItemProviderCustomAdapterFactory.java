package org.ow2.fractal.mind.ide.emf.edit.custom;


import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc;
import org.ow2.fractal.mind.ide.emf.mindide.MindidePackage;
import org.ow2.fractal.mind.ide.emf.mindide.provider.MindAdlItemProvider;
import org.ow2.fractal.mind.ide.emf.mindide.provider.MindAllRepoItemProvider;
import org.ow2.fractal.mind.ide.emf.mindide.provider.MindCItemProvider;
import org.ow2.fractal.mind.ide.emf.mindide.provider.MindFileItemProvider;
import org.ow2.fractal.mind.ide.emf.mindide.provider.MindHItemProvider;
import org.ow2.fractal.mind.ide.emf.mindide.provider.MindIdfItemProvider;
import org.ow2.fractal.mind.ide.emf.mindide.provider.MindItfItemProvider;
import org.ow2.fractal.mind.ide.emf.mindide.provider.MindObjectItemProvider;
import org.ow2.fractal.mind.ide.emf.mindide.provider.MindRepoItemProvider;
import org.ow2.fractal.mind.ide.emf.mindide.provider.MindRootSrcItemProvider;
import org.ow2.fractal.mind.ide.emf.mindide.provider.MindideItemProviderAdapterFactory;

public class MindideItemProviderCustomAdapterFactory extends MindideItemProviderAdapterFactory{

	
	public MindideItemProviderCustomAdapterFactory() {
		super();
	}
	
	/**
	 * This creates an adapter for a {@link org.ow2.fractal.mind.ide.emf.mindide.MindRepo}.
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
						childrenFeatures.add(MindidePackage.Literals.MIND_REPO__MINDPROJECTS);
					}
					return childrenFeatures;
				}
			};
		}

		return mindRepoItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc}.
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
	 * This creates an adapter for a {@link org.ow2.fractal.mind.ide.emf.mindide.MindPackage}.
	 */
	@Override
	public Adapter createMindPackageAdapter() {
		if (mindPackageItemProvider == null) {
			mindPackageItemProvider = new MindPackageItemProviderCustom(this);
		}

		return mindPackageItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.ow2.fractal.mind.ide.emf.mindide.MindAdl}.
	 */
	@Override
	public Adapter createMindAdlAdapter() {
		if (mindAdlItemProvider == null) {
			mindAdlItemProvider = new MindAdlItemProvider(this);
		}

		return mindAdlItemProvider;
	}


	/**
	 * This creates an adapter for a {@link org.ow2.fractal.mind.ide.emf.mindide.MindC}.
	 */
	@Override
	public Adapter createMindCAdapter() {
		if (mindCItemProvider == null) {
			mindCItemProvider = new MindCItemProvider(this);
		}

		return mindCItemProvider;
	}


	/**
	 * This creates an adapter for a {@link org.ow2.fractal.mind.ide.emf.mindide.MindItf}.
	 */
	@Override
	public Adapter createMindItfAdapter() {
		if (mindItfItemProvider == null) {
			mindItfItemProvider = new MindItfItemProvider(this);
		}

		return mindItfItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.ow2.fractal.mind.ide.emf.mindide.MindH}.
	 */
	@Override
	public Adapter createMindHAdapter() {
		if (mindHItemProvider == null) {
			mindHItemProvider = new MindHItemProvider(this);
		}

		return mindHItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.ow2.fractal.mind.ide.emf.mindide.MindIdf}.
	 */
	@Override
	public Adapter createMindIdfAdapter() {
		if (mindIdfItemProvider == null) {
			mindIdfItemProvider = new MindIdfItemProvider(this);
		}

		return mindIdfItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.ow2.fractal.mind.ide.emf.mindide.MindFile}.
	 */
	@Override
	public Adapter createMindFileAdapter() {
		if (mindFileItemProvider == null) {
			mindFileItemProvider = new MindFileItemProvider(this);
		}

		return mindFileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ow2.fractal.mind.ide.emf.mindide.MindAllRepo} instances.

	/**
	 * This creates an adapter for a {@link org.ow2.fractal.mind.ide.emf.mindide.MindAllRepo}.
	 */
	@Override
	public Adapter createMindAllRepoAdapter() {
		if (mindAllRepoItemProvider == null) {
			mindAllRepoItemProvider = new MindAllRepoItemProvider(this);
		}

		return mindAllRepoItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.ow2.fractal.mind.ide.emf.mindide.MindObject}.
	 */
	@Override
	public Adapter createMindObjectAdapter() {
		if (mindObjectItemProvider == null) {
			mindObjectItemProvider = new MindObjectItemProvider(this);
		}

		return mindObjectItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.ow2.fractal.mind.ide.emf.mindide.MindProject}.
	 */
	@Override
	public Adapter createMindProjectAdapter() {
		if (mindProjectItemProvider == null) {
			mindProjectItemProvider = new MindProjectItemProviderCustom(this);
		}

		return mindProjectItemProvider;
	}


	/**
	 * This creates an adapter for a {@link org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry}.
	 */
	@Override
	public Adapter createMindPathEntryAdapter() {
		if (mindPathEntryItemProvider == null) {
			mindPathEntryItemProvider = new MindPathEntryItemProviderCustom(this);
		}

		return mindPathEntryItemProvider;
	}
	
}
