package org.ow2.fractal.mind.ide.ui.properties;

import org.ow2.fratal.mind.ide.emf.mindide.MindPathEntry;


public interface MindPathEntryViewer {
	
	/**
	 * Update the view to reflect the fact that a mindPathEntry was added 
	 * to the mindPathEntry list
	 * 
	 * @param mpe
	 */
	public void addMindPathEntry(MindPathEntry mpe);
	
	/**
	 * Update the view to reflect the fact that a mindPathEntry was removed 
	 * from the mindPathEntry list
	 * 
	 * @param mpe
	 */
	public void removeMindPathEntry(MindPathEntry mpe);
	
	/**
	 * Update the view to reflect the fact that one of the mindPathEntries
	 * was modified 
	 * 
	 * @param mpe
	 */
	public void updateMindPathEntry(MindPathEntry mpe);
}
