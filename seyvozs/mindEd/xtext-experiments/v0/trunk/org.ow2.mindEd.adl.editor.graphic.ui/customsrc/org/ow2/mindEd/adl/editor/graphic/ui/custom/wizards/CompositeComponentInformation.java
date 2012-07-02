package org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards;

import java.util.ArrayList;

public class CompositeComponentInformation {
	
	
	
	protected String compositeName = null;
	protected ArrayList<String> listExtends = null;
	protected String extendPath = null;
	
	public String getCompositeName() {
		return compositeName;
	}
	public void setCompositeName(String compositeName) {
		this.compositeName = compositeName;
	}
	public ArrayList<String> getListExtends() {
		return listExtends;
	}
	public void setListExtends(ArrayList<String> listExtends) {
		this.listExtends = listExtends;
	}
	public String getExtendPath() {
		return extendPath;
	}
	public void setExtendPath(String extendPath) {
		this.extendPath = extendPath;
	}

}
