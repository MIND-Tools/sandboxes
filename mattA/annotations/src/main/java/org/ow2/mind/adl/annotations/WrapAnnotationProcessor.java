/**
 * Copyright (C) 2010 France Telecom
 *
 * This file is part of "Mind Compiler" is free software: you can redistribute 
 * it and/or modify it under the terms of the GNU Lesser General Public License 
 * as published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT 
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact: mind@ow2.org
 *
 * Authors: Matthieu ANNE
 * Contributors:
 */

package org.ow2.mind.adl.annotations;

import static org.ow2.mind.SourceFileWriter.writeToFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.antlr.stringtemplate.StringTemplate;
import org.objectweb.fractal.adl.ADLException;
import org.objectweb.fractal.adl.CompilerError;
import org.objectweb.fractal.adl.Definition;
import org.objectweb.fractal.adl.Node;
import org.objectweb.fractal.adl.interfaces.Interface;
import org.objectweb.fractal.adl.types.TypeInterface;
import org.objectweb.fractal.adl.types.TypeInterfaceUtil;
import org.ow2.mind.adl.annotation.ADLLoaderPhase;
import org.ow2.mind.adl.annotation.AbstractADLLoaderAnnotationProcessor;
import org.ow2.mind.adl.ast.ASTHelper;
import org.ow2.mind.adl.ast.ImplementationContainer;
import org.ow2.mind.adl.ast.Source;
import org.ow2.mind.adl.idl.InterfaceDefinitionDecorationHelper;
import org.ow2.mind.annotation.Annotation;
import org.ow2.mind.annotation.AnnotationHelper;
import org.ow2.mind.idl.annotations.VarArgsDual;
import org.ow2.mind.idl.ast.InterfaceDefinition;
import org.ow2.mind.idl.ast.Method;
import org.ow2.mind.io.IOErrors;

/**
 * @author Matthieu ANNE
 */
public class WrapAnnotationProcessor extends
	AbstractADLLoaderAnnotationProcessor {

    protected static final String IDL2CPLWRAPPER_TEMPLATE_NAME = "st.interfaceWrapping.IDL2CPLWRAPPER";

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.ow2.mind.adl.annotation.ADLLoaderAnnotationProcessor#processAnnotation
     * (org.ow2.mind.annotation.Annotation, org.objectweb.fractal.adl.Node,
     * org.objectweb.fractal.adl.Definition,
     * org.ow2.mind.adl.annotation.ADLLoaderPhase, java.util.Map)
     */
    public Definition processAnnotation(final Annotation annotation,
	    final Node node, final Definition definition,
	    final ADLLoaderPhase phase, final Map<Object, Object> context)
	    throws ADLException {
	assert annotation instanceof Wrap;

	if (ASTHelper.isPrimitive(definition)) {
	    Interface itf = (Interface) node;
	    if (TypeInterfaceUtil.isServer(itf)) {
		final InterfaceDefinition itfDef = InterfaceDefinitionDecorationHelper
			.getResolvedInterfaceDefinition((TypeInterface) itf,
				idlLoaderItf, context);

		Map<String, String> dualMeths = new HashMap<String, String>();

		for (final Method meth : itfDef.getMethods()) {
		    for (final Annotation methAnnotation : AnnotationHelper
			    .getAnnotations(meth)) {
			if (methAnnotation instanceof VarArgsDual) {
			    dualMeths.put(meth.getName(),
				    ((VarArgsDual) methAnnotation).dualMeth);
			}
		    }
		}

		// TODO might need a #line in generated file to find error in
		// source file
		// NodeErrorLocator sourceInfo = new NodeErrorLocator(node);

		// TODO generate file elsewhere
		final File cplFile = new File("src"
			+ File.separator
			+ "wrap_"
			+ itfDef.getName().substring(
				itfDef.getName().lastIndexOf('.') + 1) + ".c");
		final StringTemplate st = getTemplate(
			IDL2CPLWRAPPER_TEMPLATE_NAME, "cplFile");
		st.setAttribute("idl", itfDef);
		st.setAttribute("itfName", itf.getName());
		st.setAttribute("dualMeths", dualMeths);
		// st.setAttribute("sourceInfo", sourceInfo);
		try {
		    writeToFile(cplFile, st.toString());
		} catch (IOException e) {
		    throw new CompilerError(IOErrors.WRITE_ERROR, e, cplFile
			    .getAbsolutePath());
		}

		try {
		    Source source = (Source) nodeFactoryItf.newNode("source",
			    Source.class.getName());
		    source.setPath("/" + cplFile.getName());
		    ((ImplementationContainer) definition).addSource(source);
		} catch (ClassNotFoundException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
	    } else {
		// TODO exception has to be handle properly
		throw new ADLException(
			"Throw a proper adl exception to specify that the wrap annotation is only available on server interfaces");
	    }
	} else {
	    // TODO exception has to be handle properly
	    throw new ADLException(
		    "Throw a proper adl exception to specify that the wrap annotation is only available on primitive components");
	}
	return null;
    }
}
