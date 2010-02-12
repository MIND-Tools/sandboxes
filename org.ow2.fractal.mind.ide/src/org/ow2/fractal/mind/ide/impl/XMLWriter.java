/**
 * 
 */
package org.ow2.fractal.mind.ide.impl;

import java.io.Writer;

final class XMLWriter extends GenericXMLWriter {

	public XMLWriter(Writer writer, boolean printXmlVersion) {
		super(writer, System.getProperty("line.separator"), printXmlVersion);
	}
}