package org.ow2.fractal.mind.ide.ui.util;

import org.eclipse.emf.ecore.EObject;

public interface ExtendedModel {

	void remove(EObject obj);
	
	void add(EObject obj);
	
	void update(EObject obj);
}
