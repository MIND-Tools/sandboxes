package org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards;

public class InterfaceInformation {

	public String name;
	public String path;
	public boolean creation;
	public boolean optional;
	public boolean collection;
	public int collectionSize;
	
	public boolean isOptional() {
		return optional;
	}
	public void setOptional(boolean optional) {
		this.optional = optional;
	}

	public boolean isCollection() {
		return collection;
	}
	public void setCollection(boolean collection) {
		this.collection = collection;
	}

	public int getCollectionSize() {
		return collectionSize;
	}
	public void setCollectionSize(int collectionSize) {
		this.collectionSize = collectionSize;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}

	public boolean isCreation() {
		return creation;
	}
	public void setCreation(boolean creation) {
		this.creation = creation;
	}
}
