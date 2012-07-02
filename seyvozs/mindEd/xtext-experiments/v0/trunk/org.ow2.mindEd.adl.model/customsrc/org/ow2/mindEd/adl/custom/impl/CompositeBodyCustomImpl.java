package org.ow2.mindEd.adl.custom.impl;

import org.ow2.mindEd.adl.Element;
import org.ow2.mindEd.adl.impl.CompositeBodyImpl;

public class CompositeBodyCustomImpl extends CompositeBodyImpl {

	@Override
	public boolean isMerged() {
		if(hasUnMergedElements() || this.getElements().isEmpty())
		{
			merged = false;
		}
		else
		{
			merged = true;
		}
		return super.isMerged();
	}

	private boolean hasUnMergedElements() {
		for(Element element : this.getElements())
		{
			if(!element.isMerged())
				return true;
		}
		return false;
	}

}
