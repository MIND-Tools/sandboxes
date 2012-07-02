package org.ow2.mindEd.adl.custom.impl;

import org.eclipse.emf.common.util.EList;

import org.ow2.mindEd.adl.AnnotationsList;
import org.ow2.mindEd.adl.Body;
import org.ow2.mindEd.adl.Element;
import org.ow2.mindEd.adl.impl.AttributeDefinitionImpl;

/**
 * <b>Class</b> <i>AttributeDefinitionCustomImpl</i>
 * <p>
 * This class extends generated class AttributeDefinitionImpl to provides custom functions.
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.ow2.mindEd.adl.custom.impl.AttributeDefinitionCustomImpl#getLinkedAnnotationsList <em>getLinkedAnnotationsList</em>}</li>
 * <li>
 * {@link org.ow2.mindEd.adl.custom.impl.AttributeDefinitionCustomImpl#setLinkedAnnotationsList <em>setLinkedAnnotationsList</em>}</li>
 * </ul>
 * </p>
 * 
 * @author proustr
 * @model kind="custom implementation"
 * @extends AttributeDefinitionImpl
 */
public class AttributeDefinitionCustomImpl extends AttributeDefinitionImpl {

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.ElementImpl#getLinkedAnnotationsList()
	 */
	@Override
	public AnnotationsList getLinkedAnnotationsList() {
		Body body = this.getParentBody();
		if(body!=null)
		{
				EList<Element> elements = body.getElements();
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
