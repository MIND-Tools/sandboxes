package org.ow2.fractal.mind.ide.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.junit.Test;
import org.ow2.fractal.mind.ide.FamilyJobCST;
import org.ow2.fractal.mind.ide.MindIdeCore;
import org.ow2.fractal.mind.ide.emf.mindide.MindProject;
import org.ow2.fractal.mind.ide.impl.CDTUtil;
import org.ow2.fractal.mind.ide.impl.MindMakefile;
import org.eclipse.cdt.make.core.makefile.ITargetRule;
import org.eclipse.cdt.make.core.makefile.gnu.IVariableDefinition;

public class CDTUtilTest {
	
	private void waitJob(long timeout, long sleep, String message, Object family) {
		long end = System.currentTimeMillis() + timeout;
		while (System.currentTimeMillis() < end) {
			try {
				Thread.sleep(sleep);
			} catch (InterruptedException e) {
				fail(message);
			}
			if (Job.getJobManager().find(family).length == 0)
				return;
		}
		fail(message);
	}
	
	@Test
	public void testCreateCSourceFolder() {
//		fail("Not yet implemented");
	}

	@Test
	public void testRemoveCSourceFolder() {
//		fail("Not yet implemented");
	}

	@Test
	public void testChangeMINDCLocation() {
//		fail("Not yet implemented");
		assertNull(CDTUtil.getMINDCLocation());
		CDTUtil.changeMINDCLocation("/home/chomats/bin/mind");
		waitJob(1000, 10, "Cannot change mindc location", FamilyJobCST.FAMILY_CHANGE_MINDC_LOCATION);
		assertEquals("/home/chomats/bin/mind", CDTUtil.getMINDCLocation());
		CDTUtil.changeMINDCLocation("/home/chomats/bin/mindc");
		waitJob(1000, 10, "Cannot change mindc location", FamilyJobCST.FAMILY_CHANGE_MINDC_LOCATION);
		assertEquals("/home/chomats/bin/mindc", CDTUtil.getMINDCLocation());
		CDTUtil.changeMINDCLocation("/home/chomats/bin/mind");
		waitJob(1000, 10, "Cannot change mindc location", FamilyJobCST.FAMILY_CHANGE_MINDC_LOCATION);
		assertEquals("/home/chomats/bin/mind", CDTUtil.getMINDCLocation());
	}

	@Test
	public void testChangeSRC() throws CoreException, IOException {
		String name;
		name = "P2_"+System.currentTimeMillis();
		MindProject mp2 = MindIdeCore.createMINDProject(name, new NullProgressMonitor());
		assertNotNull(mp2);
		
		MindMakefile mmf = new MindMakefile(mp2.getProject());
		mmf.setMIND_SRC("stat");
		mmf.write();
		assertEquals("stat", mmf.getMIND_SRC());
		
		mmf.setMIND_SRC("stat:stat:../sa/sr:");
		mmf.write();
		assertEquals("stat:stat:../sa/sr:", mmf.getMIND_SRC());
		
		mmf.setMIND_SRC("stat:stat:\\\n../sa/sr:");
		mmf.write();
		assertEquals("stat:stat: ../sa/sr:", mmf.getMIND_SRC());

		mmf.setMIND_SRC("stat:../sa/sr:");
		mmf.write();
		assertEquals("stat:../sa/sr:", mmf.getMIND_SRC());
		
		
		IVariableDefinition v = mmf.setMakefileVariable("TEST", "true");
		assertNull(v);
		ITargetRule t = mmf.findTarget("all");
		assertNotNull(t);
		mmf.addExt(t.getStartLine(), "TEST = true");
		mmf.write();
		
		assertEquals("true", mmf.getMakefileVariable("TEST"));
		t = mmf.findTarget("all");
		assertNotNull(t);	
		
	}
}
