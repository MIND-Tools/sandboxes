package org.ow2.fractal.mind.ide;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.jobs.IJobManager;
import org.eclipse.core.runtime.jobs.Job;

/**
 * Constant identifying the job family identifier for a background JOB.
 */
public class FamilyJobCST {
	/**
	 * Constant identifying the job family identifier for a background set make file var "MIND_SRC".
	 * 
	 * @see IJobManager#join(Object, IProgressMonitor)
	 * @see Job#belongsTo(Object)
	 * @since 3.0
	 */
	public static final Object FAMILY_CHANGE_MAKEFILE_VAR_MIND_SRC = new Object();
	
	public static final Object FAMILY_ALL = new Object();
	
	
	public static final Object FAMILY_CHANGE_MAKEFILE_VAR_MIND_COMPONENT = new Object();

	public static final Object FAMILY_REMOVE_CSOURCE_FOLDER = new Object();

	public static final Object FAMILY_CREATE_CSOURCE_FOLDER =  new Object();

	public static final Object FAMILY_CHANGE_MINDC_LOCATION = new Object();

	public static final Object FAMILY_SAVE_MPE = new Object();
}
