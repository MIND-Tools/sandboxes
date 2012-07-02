package org.ow2.mindEd.adl.custom.helpers;

import java.util.List;

/**
 * @model
 */
public interface IHelperComments {
	/**
	 * @model default=""
	 */
	public List<String> getComments();

	/**
	 * @model default=""
	 */
	public void setComments(List<String> comments);
}
