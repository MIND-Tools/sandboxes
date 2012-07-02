package org.ow2.mindEd.itf.editor.textual.validation;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.validation.Check;
import org.ow2.mindEd.adl.textual.util.FractalUtil;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.InterfaceDefinition;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ItfFileImpl;

public class FractalItfJavaValidator extends AbstractFractalItfJavaValidator {

	public final static String WRONG_NAME = "org.ow2.mindEd.itf.editor.textual.validation.wrong_name";

	@Check
	public void checkItfSimpleName(InterfaceDefinition interfaceDefinition) {

		
		String simpleName = interfaceDefinition.getFqn();
		
		String expectedName = FractalItfJavaValidator.getExpectedInterfaceName(interfaceDefinition); 
				
		if (! simpleName.equals(expectedName)) {
			warning("interface should be named : " + expectedName,
					// SSZ: Quick and dirty fix, added "interfaceDefinition.eContainingFeature(),"
					interfaceDefinition.eContainingFeature(),
					FractalIDLPackage.INTERFACE_DEFINITION,
					FractalItfJavaValidator.WRONG_NAME);
		}

	}	
	
	// Utils
	
	public static String getExpectedInterfaceName(InterfaceDefinition interfaceDefinition){
		
		ItfFileImpl itfFile = (ItfFileImpl) interfaceDefinition.eContainer();
		URI uri = itfFile.eDirectResource().getURI();
		
		String expectedName = FractalUtil.getFQNFromURI("src", ".itf", uri);
		return expectedName;
	}	

}
