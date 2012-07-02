package org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards;

import java.util.ArrayList;

public class PrimitiveComponentInformation {

	public String getPrimitiveName() {
		return primitiveName;
	}
	public void setPrimitiveName(String primitiveName) {
		this.primitiveName = primitiveName;
	}
	public boolean isExtend() {
		return extend;
	}
	public void setExtend(boolean extend) {
		this.extend = extend;
	}
	public boolean isOverride() {
		return override;
	}
	public void setOverride(boolean override) {
		this.override = override;
	}
	public boolean isAnonymous() {
		return anonymous;
	}
	public void setAnonymous(boolean anonymous) {
		this.anonymous = anonymous;
	}
	public String getExtendPath() {
		return extendPath;
	}
	public void setExtendPath(String extendPath) {
		this.extendPath = extendPath;
	}
	public ArrayList<String> getListImplementation() {
		return listImplementation;
	}
	public void setListImplementation(ArrayList<String> listImplementation) {
		this.listImplementation = listImplementation;
	}
	
	public ArrayList<String> getListExtends() {
		return listExtends;
	}
	public void setListExtends(ArrayList<String> listExtends) {
		this.listExtends = listExtends;
	}
	
	protected String primitiveName = null;
	protected boolean extend = false;
	protected boolean override = false;
	protected boolean anonymous = false;
	protected String extendPath = null;
	protected ArrayList<String> listImplementation = null;
	protected ArrayList<String> listExtends = null;
	
	
	
	
}
