package adl.custom.impl;

import org.eclipse.emf.common.util.EList;

import adl.AnnotationsList;
import adl.ArchitectureDefinition;
import adl.Element;
import adl.impl.ImplementationDefinitionImpl;

public class ImplementationDefinitionCustomImpl extends
		ImplementationDefinitionImpl {
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
