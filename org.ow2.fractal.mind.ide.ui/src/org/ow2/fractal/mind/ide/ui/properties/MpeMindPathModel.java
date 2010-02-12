package org.ow2.fractal.mind.ide.ui.properties;

import java.util.List;

import org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry;
/**
 * manager mind path entries model.
 *
 */
public interface MpeMindPathModel {

	/**
	 * Change the mind path entry in the model.
	 * @param mpe the changed mind path entry.
	 */
	public abstract void mpeChanged(MindPathEntry mpe);

	/**
	 * Remove an mind path entry in the model.
	 * @param mpe the removed mind path entry.
	 */
	public abstract void mpeRemoved(MindPathEntry mpe);

	/**
	 * Insert an mind path entry in the model.
	 * @param mpe the added mind path entry.
	 */
	public abstract void mpeAdded(MindPathEntry mpe);

	/**
	 * @return mind path entries from the model.	
	 */
	public abstract List<MindPathEntry> getEntries();

}