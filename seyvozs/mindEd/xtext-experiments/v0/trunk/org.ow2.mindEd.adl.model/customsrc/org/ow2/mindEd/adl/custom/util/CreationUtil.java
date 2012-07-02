package org.ow2.mindEd.adl.custom.util;

import org.ow2.mindEd.adl.AdlFactory;
import org.ow2.mindEd.adl.Body;
import org.ow2.mindEd.adl.InterfaceDefinition;
import org.ow2.mindEd.adl.Role;

public class CreationUtil {

	public static InterfaceDefinition createInterface(Body body, Role role,
			String name) {

		if (body == null)
			return null;
		
		InterfaceDefinition newInterface = AdlFactory.eINSTANCE.createInterfaceDefinition();
		
		if (role == null)
			role = Role.PROVIDES;
		newInterface.setRole(role);
		
		if (name == null)
			name = "newInterface";
		newInterface.setName(name);
		
		newInterface.setParentBody(body);
		body.getElements().add(newInterface);

		
		return newInterface;
	}
	
	public static InterfaceDefinition createInterface(Body body, Role role
			, String name, String signature, boolean optional
			, boolean collection, int collectionSize) {
		
		InterfaceDefinition newInterface = createInterface(body, role, name);
		
		if(newInterface == null)
		{
			return null;
		}
		if(signature != null)
		{
			String result = null;
			String signatureFQN = signature.split(".itf")[0];
			String[] itemsSignature = signatureFQN.split("/");
			for(int i = 3; i<itemsSignature.length ; i++)
			{
				if(result == null)
					result = itemsSignature[i];
				else
					result = result+itemsSignature[i];
				
				if(i!=itemsSignature.length-1)
				{
					result = result + ".";
				}
			}
			newInterface.setSignature(result);
		}
		newInterface.setOptional(optional);
		newInterface.setCollection(collection);
		if(collection == true)
		{
			newInterface.setCollectionsize(collectionSize);
		}
		return newInterface;
		
	}
	

}
