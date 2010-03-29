package org.ow2.fractal.mind.ide.property;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.runtime.Assert;
import org.ow2.fractal.mind.ide.emf.mindide.MindProject;
import org.ow2.fractal.mind.ide.emf.mindide.MindRepo;

public class MindPropertyTester extends PropertyTester {

	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		if (receiver instanceof MindProject) {
			MindProject mp = (MindProject) receiver;
			if ("open".equals(property)) {
				return expectedValue == null ? mp.getProject().isOpen() : mp
						.getProject().isOpen() == ((Boolean) expectedValue)
						.booleanValue();
			}
			Assert.isTrue(false);
			return false;
		}
		if (receiver instanceof MindRepo) {
			if ("open".equals(property)) {
				return true;
			}
			return false;
		}
		return false;
	}

}
