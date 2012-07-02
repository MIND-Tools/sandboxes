package org.ow2.mindEd.ide.core.impl;

import java.util.HashMap;

import org.ow2.mindEd.ide.model.MindPathEntry;
import org.ow2.mindEd.ide.model.MindPathKind;
import org.ow2.mindEd.ide.model.MindideFactory;
import org.ow2.mindEd.ide.model.impl.MindPathEntryImpl;
import org.w3c.dom.DOMException;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class MindPathEntryCustomImpl extends MindPathEntryImpl {

static final	int PATH_KIND_WS = 1;
static final	int PATH_KIND_VAR = 2;
static final int PATH_KIND_ABS = 3;

	static final String TAG_MINDPATH = "mindpath"; //$NON-NLS-1$
	static final String TAG_MINDPATHENTRY = "mindpathentry"; //$NON-NLS-1$
	static final String TAG_KIND = "kind"; //$NON-NLS-1$
	static final String TAG_PATH_KIND = "path-kind"; //$NON-NLS-1$
	static final String TAG_PATH = "path"; //$NON-NLS-1$
	
	
	
	public MindPathEntryCustomImpl(MindPathEntry clone) {
		this.name = clone.getName();
		this.entryKind = clone.getEntryKind();
	}

	public MindPathEntryCustomImpl() {
	}

	private static String removeAttribute(String nodeName, NamedNodeMap nodeMap) {
		Node node = removeNode(nodeName, nodeMap);
		if (node == null)
			return ""; // //$NON-NLS-1$
		return node.getNodeValue();
	}

	private static Node removeNode(String nodeName, NamedNodeMap nodeMap) {
		try {
			return nodeMap.removeNamedItem(nodeName);
		} catch (DOMException e) {
			if (e.code != DOMException.NOT_FOUND_ERR)
				throw e;
			return null;
		}
	}
	
	@Override
	public String toString() {
		return toString(this);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) return true;
		if (obj instanceof MindPathEntry) {
			return equals(this, (MindPathEntry) obj);
		}
		return super.equals(obj);
	}
	
	 @Override
	public int hashCode() {
		if (getEntryKind() == null || getName() == null)
			return super.hashCode();
		return getEntryKind().hashCode() ^ getName().hashCode();
	}
	
	
	/**
	 * Returns true if the given object is a classpath entry
	 * with equivalent attributes.
	 */
	public static boolean equals(MindPathEntry e1, MindPathEntry e2) {
		if (e1 == e2)
			return true;
	
		if (e1.getEntryKind() != e2.getEntryKind())
			return false;

		if (!e1.getName().equals(e2.getName()))
			return false;
		
		return true;
	}
	
	static MindPathEntry	elementDecode(Element element) {
		NamedNodeMap attributes = element.getAttributes();
		String kindAttr = removeAttribute(TAG_KIND, attributes);
		String pathAttr = removeAttribute(TAG_PATH, attributes);
		if (kindAttr.equals("src"))
			kindAttr = MindPathKind.SOURCE.getLiteral();
		MindPathKind kind = MindPathKind.get(kindAttr);
		org.ow2.mindEd.ide.model.MindPathEntry ret = MindideFactory.eINSTANCE.createMindPathEntry();
		ret.setName(pathAttr);
		ret.setEntryKind(kind);
		
		return ret;
	}
	
	/**
	 * Returns the XML encoding of the class path.
	 */
	static void elementEncode(MindPathEntry e,
			XMLWriter writer, boolean indent, boolean newLine) {
		HashMap<String, String> parameters = new HashMap<String, String>();
		if (e.getEntryKind() != null)
			parameters.put(TAG_KIND, e.getEntryKind().getLiteral());
		parameters.put(TAG_PATH, e.getName());

		writer.printTag(
			TAG_MINDPATHENTRY,
			parameters,
			indent,
			newLine,
			true/*close tag */);
		
	}
	
	/**
	 * Returns a printable representation of this classpath entry.
	 */
	public static String toString(MindPathEntry e) {
		StringBuffer buffer = new StringBuffer();
		buffer.append(String.valueOf(e.getName()));
		buffer.append('[');
		if (e.getEntryKind() == null)
			buffer.append("?");
		else
			buffer.append(e.getEntryKind().getName());
		buffer.append("]");
		return buffer.toString();
	}

}
