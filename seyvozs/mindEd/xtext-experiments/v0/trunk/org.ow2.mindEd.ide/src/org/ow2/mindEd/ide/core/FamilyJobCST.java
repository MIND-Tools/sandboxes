package org.ow2.mindEd.ide.core;


/**
 * Constant identifying the job family identifier for a background JOB.
 */
public class FamilyJobCST {
	/**
	 * Constant identifying the job family identifier for job which set make file var "MIND_SRC".
	 */
	public static final Object FAMILY_CHANGE_MAKEFILE_VAR_MIND_SRC = new Object();
	
	/**
	 * Constant identifying the job family identifier for all jobs.
	 */
	public static final Object FAMILY_ALL = new Object();
	
	/**
	 * Constant identifying the job family identifier for job which set make file var "MIND_COMPONENT".
	 */
	public static final Object FAMILY_CHANGE_MAKEFILE_VAR_MIND_COMPONENT = new Object();

	/**
	 * Constant identifying the job family identifier for job which remove csource folder".
	 */
	public static final Object FAMILY_REMOVE_CSOURCE_FOLDER = new Object();

	/**
	 * Constant identifying the job family identifier for job which remove project".
	 */
	public static final Object FAMILY_REMOVE_PROJECT = new Object();

	/**
	 * Constant identifying the job family identifier for job which create csource folder".
	 */
	public static final Object FAMILY_CREATE_CSOURCE_FOLDER =  new Object();

	/**
	 * Constant identifying the job family identifier for job which chnage the mindc location".
	 */
	public static final Object FAMILY_CHANGE_MINDC_LOCATION = new Object();

	/**
	 * Constant identifying the job family identifier for job which save the file '.mindpath'".
	 */
	public static final Object FAMILY_SAVE_MPE = new Object();
}
