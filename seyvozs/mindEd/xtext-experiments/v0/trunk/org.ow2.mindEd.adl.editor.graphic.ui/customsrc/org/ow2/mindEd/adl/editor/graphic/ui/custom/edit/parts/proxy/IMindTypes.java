package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy;

public interface IMindTypes {

	public static final int TYPE_UNDEFINED = 0;
	public static final int TYPE_COMPONENT = 1;
	public static final int TYPE_LIST = 2;
	public static final int TYPE_REFERENCES_LIST = 21;
	public static final int TYPE_BODY = 3;
	public static final int TYPE_INTERFACE = 4;
	public static final int TYPE_REFERENCE = 5;
	public static final int TYPE_SUB_REFERENCE = 51;
	public static final int TYPE_ITEM = 6;
	public static final int TYPE_ROOT = 7;
	public static final int TYPE_COMPARTMENT = 8;
	public static final int TYPE_COMPARTMENT_LIST = 81;
	public static final int TYPE_COMPARTMENT_BODY = 82;
	public static final int TYPE_BINDING = 9;
	public static final int TYPE_LABEL = 10;
	
	public static final int COMPONENT_UNDEFINED = 100;
	public static final int COMPONENT_SUB_UNDEFINED = 101;
	public static final int COMPONENT_COMPOSITE = 110;
	public static final int COMPONENT_SUB_COMPOSITE = 111;
	public static final int COMPONENT_PRIMITIVE = 120;
	public static final int COMPONENT_SUB_PRIMITIVE = 121;
	public static final int COMPONENT_TYPE = 130;
	
	
	public static final int CREATION_MODE_NORMAL = 0;
	public static final int CREATION_MODE_PARENT = 1;
	public static final int CREATION_MODE_CHILD = 2;
}
