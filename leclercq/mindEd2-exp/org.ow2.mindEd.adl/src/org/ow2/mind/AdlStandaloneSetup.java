
package org.ow2.mind;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class AdlStandaloneSetup extends AdlStandaloneSetupGenerated{

	public static void doSetup() {
		new AdlStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

