package org.ow2.fractal.mind.ide.ui.properties;

import java.util.List;

import org.ow2.fratal.mind.ide.emf.mindide.MindPathEntry;

public interface MpeMindPathModel {

	public abstract void mpeChanged(MindPathEntry mpe);

	public abstract void mpeRemoved(MindPathEntry mpe);

	public abstract void mpeAdded(MindPathEntry mpe);

	public abstract List<MindPathEntry> getEntries();

}