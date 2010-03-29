package adl.custom.impl;

import java.util.ArrayList;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;

import adl.AnnotationsList;
import adl.ArchitectureDefinition;
import adl.Element;
import adl.custom.util.adapters.factory.AdlAdapterHelperFactory;
import adl.helpers.ArchitectureDefinitionHelper;
import adl.helpers.IHelper;
import adl.impl.PrimitiveSubComponentImpl;

public class PrimitiveSubComponentCustomImpl extends PrimitiveSubComponentImpl {
	private ArrayList<String> activeDefinitionCallsList=null;
	
	public Object getAdapter(Class adapter) {
		Object object = null;
		
		
		if(adapter == IHelper.class ||
			adapter == ArchitectureDefinitionHelper.class ){
			object = AdlAdapterHelperFactory.getInstance().adapt(this);
		}
		
		return object;
	}
	
	public ArchitectureDefinitionHelper getHelper(){
		ArchitectureDefinitionHelper result = null;
		Adapter helper = AdlAdapterHelperFactory.getInstance().adapt(this,ArchitectureDefinitionHelper.class);
		if(helper != null){
			result = (ArchitectureDefinitionHelper)helper;
		}
		return result;
	}

	public void setActiveDefinitionCallsList(
			ArrayList<String> activeDefinitionCallsList) {
		this.activeDefinitionCallsList = activeDefinitionCallsList;
	}

	public ArrayList<String> getActiveDefinitionCallsList() {
		return activeDefinitionCallsList;
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
