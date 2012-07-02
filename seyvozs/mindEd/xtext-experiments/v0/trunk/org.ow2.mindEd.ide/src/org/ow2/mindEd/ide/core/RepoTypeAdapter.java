package org.ow2.mindEd.ide.core;

/** interface to manage repository */

public interface RepoTypeAdapter {

	/**
	 * init the mind model from the repository
	 * @param mm the mind model
	 */
	void initRepo(MindModel mm);
	
}
