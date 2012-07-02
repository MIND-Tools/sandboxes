package org.ow2.build;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.objectweb.fractal.adl.arguments.ArgumentErrors;
import org.objectweb.fractal.adl.attributes.AttributeErrors;
import org.objectweb.fractal.adl.bindings.BindingErrors;
import org.objectweb.fractal.adl.components.ComponentErrors;
import org.objectweb.fractal.adl.error.ErrorTemplate;
import org.objectweb.fractal.adl.error.GenericErrors;
import org.objectweb.fractal.adl.implementations.ImplementationErrors;
import org.objectweb.fractal.adl.interfaces.InterfaceErrors;
import org.objectweb.fractal.adl.types.TypeErrors;
import org.objectweb.fractal.adl.xml.XMLErrors;

public class MakeCSTError {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, Object> cst = new HashMap<String, Object>();
		
		make(org.objectweb.fractal.adl.ADLErrors.class, cst);
		//make(org.ow2.mind.adl.ADLErrors.class, cst);
		make(ArgumentErrors.class, cst);
		make(AttributeErrors.class, cst);
		make(BindingErrors.class, cst);
		make(ComponentErrors.class, cst);
		make(GenericErrors.class, cst);
		make(ImplementationErrors.class, cst);
		make(InterfaceErrors.class, cst);
		make(TypeErrors.class, cst);
		make(XMLErrors.class, cst);

		print(cst);
	}

	private static void print(Map<String, Object> cst) {
		Object[] cstNames = cst.keySet().toArray();
		Arrays.sort(cstNames);
		for (Object k : cstNames) {
			Object v = cst.get(k);
			System.out.print("\tpublic static final ");
			System.out.print(v instanceof Integer? "int ": "String ");
			System.out.print(k);
			System.out.print(" = ");
			System.out.print(v instanceof Integer? v: "\""+v+"\"");
			System.out.println(";");
		}
	}

	private static void make(Class<? extends ErrorTemplate> class1, Map<String, Object> cst) {
		ErrorTemplate[] cstEnums=class1.getEnumConstants();
		for (ErrorTemplate et : cstEnums) {
			cst.put(et.getGroupId()+"_"+((Enum)et).name(), et.getErrorId());
			cst.put("GROUP_ID_"+et.getGroupId(), et.getGroupId());
			cst.put("CODE_KEY_"+et.getGroupId()+"_"+et.getErrorId(), et.getGroupId()+"-"+et.getErrorId());
			
		}
	}

}
