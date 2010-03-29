package org.ow2.fractal.mind.ide.ui.emf.field;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

public interface FieldResource {

	EList<EObject> findObject(EClass eclass, boolean includeSubEClass);
}
