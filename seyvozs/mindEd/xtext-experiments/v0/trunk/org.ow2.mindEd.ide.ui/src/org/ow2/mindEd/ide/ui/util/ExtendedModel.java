package org.ow2.mindEd.ide.ui.util;

import org.eclipse.emf.ecore.EObject;

public interface ExtendedModel {

	void remove(EObject obj);
	
	void add(EObject obj);
	
	void update(EObject obj);
}
