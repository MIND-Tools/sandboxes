
package org.ow2.mindEd.adl.textual;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class FractalStandaloneSetup extends FractalStandaloneSetupGenerated{

	public static void doSetup() {
		new FractalStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

