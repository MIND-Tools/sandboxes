package org.ow2.mindEd.ide.core.impl;

import org.ow2.mindEd.ide.model.MindAdl;
import org.ow2.mindEd.ide.model.MindPathEntry;
import org.ow2.mindEd.ide.model.MindProject;
import org.ow2.mindEd.ide.model.impl.MindideFactoryImpl;

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
