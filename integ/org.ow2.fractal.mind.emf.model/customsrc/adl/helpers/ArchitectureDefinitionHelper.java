package adl.helpers;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import adl.ArchitectureDefinition;
import adl.custom.util.AdlMergeUtil;

public class ArchitectureDefinitionHelper extends HelperAdapter<ArchitectureDefinition>{
	private AdlMergeUtil mergeUtil;

	public ArchitectureDefinitionHelper(ArchitectureDefinition t) {
		super(t);
		mergeUtil = new AdlMergeUtil(getObject());
	}

	public void refreshMerge()
	{
		mergeUtil.merge(getObject(),getDefinitionCallsList(),true);
	}
	
	public void merge(ArrayList<String> referencesList)
	{
		mergeUtil.merge(getObject(),referencesList,true);
	}
	
	public void unMerge(ArrayList<String> referencesList)
	{
	}

	@Override
	public ArchitectureDefinition getObject() {
		return (ArchitectureDefinition) super.getObject();
	}

	public ArrayList<String> getDefinitionCallsList()
	{
		return mergeUtil.getReferencesList(getObject());
	}
	
	public void cleanMerge(boolean fullClean)
	{
		mergeUtil.cleanMerge(getObject(),fullClean);
		if(fullClean)mergeUtil.updateSubComponentReferences(getObject());
	}
	
	public ArrayList<String> replaceReference(ArrayList<String> definitionCallsList,String definitionCallToReplace, String definitionCallToReplaceWith)
	{
		if(definitionCallsList!=null && definitionCallToReplace!=null && definitionCallToReplaceWith!=null)
		{
			for(String definitionCallValue : definitionCallsList)
			{
				if(definitionCallValue.equalsIgnoreCase(definitionCallToReplace))
				{
					definitionCallValue = definitionCallToReplaceWith;
				}
			}
		}
		return definitionCallsList;
	}
	
	public boolean isValidDefinitionCallForMerge(String definitionCall)
	{
		return mergeUtil.isValidDefinitionForMerge(getObject(), definitionCall);
	}

}