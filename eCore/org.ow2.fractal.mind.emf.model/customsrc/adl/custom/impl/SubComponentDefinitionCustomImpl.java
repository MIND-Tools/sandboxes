package adl.custom.impl;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;

import adl.AnnotationsList;
import adl.Body;
import adl.ComponentReference;
import adl.Element;
import adl.custom.util.adapters.factory.AdlAdapterHelperFactory;
import adl.helpers.ArchitectureDefinitionHelper;
import adl.impl.SubComponentDefinitionImpl;

/**
 * <b>Class</b> <i>TemplateSubComponentCustomImpl</i>
 * <p>
 * This class extends generated class PrimitiveSubComponentImpl to provides custom functions.
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link adl.custom.impl.SubComponentDefinitionCustomImpl#getReferenceDefinition <em>getReferenceDefinition</em>}</li>
 * <li>{@link adl.custom.impl.SubComponentDefinitionCustomImpl#setReferenceDefinition <em>setReferenceDefinition</em>}</li>
 * <li>{@link adl.custom.impl.SubComponentDefinitionCustomImpl#getTemplateReference <em>getTemplateReference</em>}</li>
 * <li>{@link adl.custom.impl.SubComponentDefinitionCustomImpl#getHelper <em>getHelper</em>}</li>
 * <li>{@link adl.custom.impl.SubComponentDefinitionCustomImpl#getActiveDefinitionCallsList <em>getActiveDefinitionCallsList</em>}</li>
 * <li>{@link adl.custom.impl.SubComponentDefinitionCustomImpl#setActiveDefinitionCallsList <em>setActiveDefinitionCallsList</em>}</li>
 * <li>{@link adl.custom.impl.SubComponentDefinitionCustomImpl#getLinkedAnnotationsList <em>getLinkedAnnotationsList</em>}</li>
 * <li>{@link adl.custom.impl.SubComponentDefinitionCustomImpl#setLinkedAnnotationsList <em>setLinkedAnnotationsList</em>}</li>
 * </ul>
 * </p>
 * 
 * @author proustr
 * @model kind="custom implementation"
 * @extends
 */
public class SubComponentDefinitionCustomImpl extends SubComponentDefinitionImpl {
	/**
	 * EList<ComponentReference> activeDefinitionCallsList : Local variable containing the list of references that have already been treated.
	 */
	private EList<ComponentReference> activeDefinitionCallsList = null;


	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.ArchitectureDefinitionImpl#setReferenceDefinition(adl.ComponentReference)
	 */
	@Override
	public void setReferenceDefinition(ComponentReference newReferenceDefinition) {
		super.setReferenceDefinition(newReferenceDefinition);
	}

	/**
	 * <b>Method</b> <i>getHelper</i>
	 * <p>
	 * This methods use the AdlAdapterHelperFactory to recover the correct associated Helper for this class and the returns it.
	 * 
	 * @return ArchitectureDefinitionHelper
	 * 
	 * @author proustr
	 */
	public ArchitectureDefinitionHelper getHelper() {
		ArchitectureDefinitionHelper result = null;
		Adapter helper = AdlAdapterHelperFactory.getInstance().adapt(this, ArchitectureDefinitionHelper.class);
		if (helper != null) {
			result = (ArchitectureDefinitionHelper) helper;
		}
		return result;
	}

	/**
	 * <b>Method</b> <i>setActiveDefinitionCallsList</i>
	 * <p>
	 * This setter updates the local variable activeDefinitionCallsList
	 * 
	 * @param references
	 *            : EList of ComponentReference that must contain treated references.
	 * 
	 * @author proustr
	 */
	public void setActiveDefinitionCallsList(EList<ComponentReference> references) {
		this.activeDefinitionCallsList = references;
	}

	/**
	 * <b>Method</b> <i>getActiveDefinitionCallsList</i>
	 * <p>
	 * This getter allows to recover the local variable activeDefinitionCallsList
	 * 
	 * @return references that have already been treated in an EList of ComponentReference.
	 * 
	 * @author proustr
	 */
	public EList<ComponentReference> getActiveDefinitionCallsList() {
		return activeDefinitionCallsList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.TemplateSubComponentImpl#getLinkedAnnotationsList()
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
	 * @see adl.impl.TemplateSubComponentImpl#setLinkedAnnotationsList(adl.AnnotationsList)
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
