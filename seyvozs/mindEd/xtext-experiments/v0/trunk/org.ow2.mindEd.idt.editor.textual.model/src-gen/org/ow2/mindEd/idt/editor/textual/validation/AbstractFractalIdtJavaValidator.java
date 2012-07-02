package org.ow2.mindEd.idt.editor.textual.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.ow2.mindEd.itf.editor.textual.validation.FractalItfJavaValidator;
import org.eclipse.xtext.validation.ComposedChecks;

@ComposedChecks(validators= {org.eclipse.xtext.validation.ImportUriValidator.class, org.eclipse.xtext.validation.NamesAreUniqueValidator.class})
public class AbstractFractalIdtJavaValidator extends FractalItfJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.ow2.mindEd.idt.editor.textual.fractalIdt.FractalIdtPackage.eINSTANCE);
		return result;
	}

}
