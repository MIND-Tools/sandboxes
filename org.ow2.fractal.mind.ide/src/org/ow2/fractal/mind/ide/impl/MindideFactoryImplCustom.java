package org.ow2.fractal.mind.ide.impl;

import org.ow2.fractal.mind.ide.emf.mindide.MindAdl;
import org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry;
import org.ow2.fractal.mind.ide.emf.mindide.MindProject;
import org.ow2.fractal.mind.ide.emf.mindide.impl.MindideFactoryImpl;

public class MindideFactoryImplCustom extends MindideFactoryImpl {
	
	@Override
	public MindPathEntry createMindPathEntry() {
		return new MindPathEntryCustomImpl();
	}
	
	@Override
	public MindProject createMindProject() {
		throw new UnsupportedOperationException("use MindPathCore.get(IProject)");
	}
	
	@Override
	public MindAdl createMindAdl() {
		return new MindAdlCustomImpl();
	}

}
