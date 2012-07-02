package org.ow2.mindEd.ide.core;

import org.eclipse.osgi.util.NLS;
/**
 * Messages for wizard page.
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.ow2.mindEd.ide.core.ide"; //$NON-NLS-1$
	public static String error_cannot_find_or_create_source_folder;
	public static String error_container_does_not_exists;
	public static String error_cannot_find_or_create_package;
	public static String MindPackageWizard_task;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
