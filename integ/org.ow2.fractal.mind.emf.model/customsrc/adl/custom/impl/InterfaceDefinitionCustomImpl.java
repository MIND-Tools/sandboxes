package adl.custom.impl;

import org.eclipse.emf.common.util.EList;

import adl.AnnotationsList;
import adl.ArchitectureDefinition;
import adl.Element;
import adl.impl.InterfaceDefinitionImpl;

public class InterfaceDefinitionCustomImpl extends InterfaceDefinitionImpl {
	@Override
	public int getCollectionsize() {
		if(collectionsize!=COLLECTIONSIZE_EDEFAULT)collection=true;
		return super.getCollectionsize();
	}

	@Override
	public void setCollectionsize(int newCollectionsize) {
		if(newCollectionsize!=COLLECTIONSIZE_EDEFAULT)collection=true;
		super.setCollectionsize(newCollectionsize);
	}

	@Override
	public boolean isCollection() {
		if(!collection)collectionsize=COLLECTIONSIZE_EDEFAULT;
		return super.isCollection();
	}

	@Override
	public void setCollection(boolean newCollection) {
		if(!newCollection)collectionsize=COLLECTIONSIZE_EDEFAULT;
		super.setCollection(newCollection);
	}
	
	@Override
	public AnnotationsList getLinkedAnnotationsList() {
		ArchitectureDefinition parent = this.getParentComponent();
		if(parent!=null)
		{		
			EList<Element> elements = this.getParentComponent().getElements();
			int index = elements.indexOf(this);
			if(index>0 && elements.get(index-1) instanceof AnnotationsList)
				linkedAnnotationsList = (AnnotationsList) elements.get(index-1);
		}
		return linkedAnnotationsList;
	}

	@Override
	public void setLinkedAnnotationsList(
			AnnotationsList newLinkedAnnotationsList) {
		ArchitectureDefinition parent = this.getParentComponent();
		if(parent!=null)
		{
			EList<Element> elements = parent.getElements();
			int index = elements.indexOf(this);
			if(index>0 && elements.get(index-1) instanceof AnnotationsList)
				linkedAnnotationsList = (AnnotationsList) elements.get(index-1);
		}
	}

}
