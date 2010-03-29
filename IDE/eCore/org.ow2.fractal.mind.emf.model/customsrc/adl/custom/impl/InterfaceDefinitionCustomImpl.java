package adl.custom.impl;

import org.eclipse.emf.common.util.EList;

import adl.AnnotationsList;
import adl.Body;
import adl.Element;
import adl.impl.InterfaceDefinitionImpl;

/**
 * <b>Class</b> <i>InterfaceDefinitionCustomImpl</i>
 * <p>
 * This class extends generated class InterfaceDefinitionImpl to provides custom functions.
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link adl.custom.impl.InterfaceDefinitionCustomImpl#getCollectionsize <em>getCollectionsize</em>}</li>
 * <li>{@link adl.custom.impl.InterfaceDefinitionCustomImpl#getLinkedAnnotationsList <em>getLinkedAnnotationsList</em>}</li>
 * <li>{@link adl.custom.impl.InterfaceDefinitionCustomImpl#isCollection <em>isCollection</em>}</li>
 * <li>{@link adl.custom.impl.InterfaceDefinitionCustomImpl#setCollection <em>setCollection</em>}</li>
 * <li>{@link adl.custom.impl.InterfaceDefinitionCustomImpl#setCollectionsize <em>setCollectionsize</em>}</li>
 * <li>{@link adl.custom.impl.InterfaceDefinitionCustomImpl#setLinkedAnnotationsList <em>setLinkedAnnotationsList</em>}</li>
 * </ul>
 * </p>
 * 
 * @author proustr
 * @model kind="custom implementation"
 * @extends InterfaceDefinitionImpl
 */
public class InterfaceDefinitionCustomImpl extends InterfaceDefinitionImpl {
	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.InterfaceDefinitionImpl#getCollectionsize()
	 */
	@Override
	public int getCollectionsize() {
		if (collectionsize != COLLECTIONSIZE_EDEFAULT) collection = true;
		return super.getCollectionsize();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.InterfaceDefinitionImpl#setCollectionsize(int)
	 */
	@Override
	public void setCollectionsize(int newCollectionsize) {
		if (newCollectionsize != COLLECTIONSIZE_EDEFAULT) collection = true;
		super.setCollectionsize(newCollectionsize);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.InterfaceDefinitionImpl#isCollection()
	 */
	@Override
	public boolean isCollection() {
		if (!collection) collectionsize = COLLECTIONSIZE_EDEFAULT;
		return super.isCollection();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.InterfaceDefinitionImpl#setCollection(boolean)
	 */
	@Override
	public void setCollection(boolean newCollection) {
		if (!newCollection) collectionsize = COLLECTIONSIZE_EDEFAULT;
		super.setCollection(newCollection);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.InterfaceDefinitionImpl#getLinkedAnnotationsList()
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
	 * @see adl.impl.InterfaceDefinitionImpl#setLinkedAnnotationsList(adl.AnnotationsList)
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
