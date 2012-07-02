/**
 * 
 */
package org.ow2.mindEd.ide.core.impl;

import java.io.Writer;

final class XMLWriter extends GenericXMLWriter {

	public XMLWriter(Writer writer, boolean printXmlVersion) {
		super(writer, System.getProperty("line.separator"), printXmlVersion);
	}
}