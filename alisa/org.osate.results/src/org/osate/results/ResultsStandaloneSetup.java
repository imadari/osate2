/*
* generated by Xtext
*/
package org.osate.results;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ResultsStandaloneSetup extends ResultsStandaloneSetupGenerated{

	public static void doSetup() {
		new ResultsStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

