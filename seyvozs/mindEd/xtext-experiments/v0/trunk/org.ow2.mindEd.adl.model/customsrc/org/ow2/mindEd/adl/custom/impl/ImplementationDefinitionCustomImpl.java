package org.ow2.mindEd.adl.custom.impl;

import org.eclipse.emf.common.util.EList;

import org.ow2.mindEd.adl.AnnotationsList;
import org.ow2.mindEd.adl.Body;
import org.ow2.mindEd.adl.Element;
import org.ow2.mindEd.adl.impl.ImplementationDefinitionImpl;

/**
 * <b>Class</b> <i>ImplementationDefinitionCustomImpl</i>
 * <p>
 * This class extends generated class ImplementationDefinitionImpl to provides custom functions.
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.ow2.mindEd.adl.custom.impl.ImplementationDefinitionCustomImpl#getLinkedAnnotationsList <em>getLinkedAnnotationsList</em>}</li>
 * <li>{@link org.ow2.mindEd.adl.custom.impl.ImplementationDefinitionCustomImpl#setLinkedAnnotationsList <em>setLinkedAnnotationsList</em>}</li>
 * </ul>
 * </p>
 * 
 * @author proustr
 * @model kind="custom implementation"
 * @extends ImplementationDefinitionImpl
 */
public class ImplementationDefinitionCustomImpl extends ImplementationDefinitionImpl {
	@Override
	public boolean isCanOverride() {
		return false;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.ElementImpl#getLinkedAnnotationsList()
	 */
	@Override
	public AnnotationsList getLinkedAnnotationsList() {
		Body parent = this.getParentBody();
		if (parent != null) {
			EList<Element> elements = parent.getElements();
			int index = elements.indexOf(this);
			if (index > 0 && elements.get(index - 1) instanceof AnnotationsList) linkedAnnotationsList = (AnnotationsList) elements
					.get(index - 1);
		}
		return linkedAnnotationsList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.ElementImpl#setLinkedAnnotationsList(adl.AnnotationsList)
	 */
	@Override
	public void setLinkedAnnotationsList(AnnotationsList newLinkedAnnotationsList) {
		Body parent = this.getParentBody();
		if (parent != null) {
			EList<Element> elements = parent.getElements();
			int index = elements.indexOf(this);
			if (index > 0 && elements.get(index - 1) instanceof AnnotationsList) linkedAnnotationsList = (AnnotationsList) elements
					.get(index - 1);
		}
	}

}
