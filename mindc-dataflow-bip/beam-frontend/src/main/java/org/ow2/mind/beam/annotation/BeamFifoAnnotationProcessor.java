/**
 * Copyright (C) 2010 STMicroelectronics
 * Copyright (C) 2010 VERIMAG

 * This file is part of "Mind Compiler"
 * The "Mind Compiler" is free software: you can redistribute 
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
 * Authors: Matthieu Leclercq, Marc Poulhiès
 * Contributors: 
 */

package org.ow2.mind.beam.annotation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.objectweb.fractal.adl.ADLException;
import org.objectweb.fractal.adl.Definition;
import org.objectweb.fractal.adl.Node;
import org.objectweb.fractal.adl.interfaces.Interface;
import org.objectweb.fractal.adl.interfaces.InterfaceContainer;
import org.objectweb.fractal.adl.types.TypeInterface;
import org.objectweb.fractal.adl.util.FractalADLLogManager;
import org.ow2.mind.CommonASTHelper;
import org.ow2.mind.InputResourcesHelper;
import org.ow2.mind.adl.annotation.ADLLoaderPhase;
import org.ow2.mind.adl.annotation.AbstractADLLoaderAnnotationProcessor;
import org.ow2.mind.adl.annotation.predefined.BeamFifo;
import org.ow2.mind.adl.ast.ASTHelper;
import org.ow2.mind.adl.ast.Binding;
import org.ow2.mind.adl.ast.BindingContainer;
import org.ow2.mind.adl.ast.Component;
import org.ow2.mind.adl.ast.ComponentContainer;
import org.ow2.mind.adl.ast.DefinitionReference;
import org.ow2.mind.adl.ast.ImplementationContainer;
import org.ow2.mind.adl.ast.MindInterface;
import org.ow2.mind.adl.ast.Source;
import org.ow2.mind.adl.idl.InterfaceDefinitionDecorationHelper;
import org.ow2.mind.annotation.Annotation;
import org.ow2.mind.beam.Constants;
import org.ow2.mind.idl.ast.InterfaceDefinition;
import org.ow2.mind.idl.ast.Method;
import org.ow2.mind.idl.ast.Parameter;
import org.ow2.mind.idl.ast.PrimitiveType;
import org.ow2.mind.idl.ast.Type;
import org.ow2.mind.idl.ast.TypeContainer;

public class BeamFifoAnnotationProcessor
    extends
      AbstractADLLoaderAnnotationProcessor 
    implements
      Constants {

  
  /*
   * Stolen from "InterfaceSignatureLoader"
   */
  protected void processItf(final Definition def, final TypeInterface itf,
      final Definition container, final Map<Object, Object> context)
      throws ADLException {
    InterfaceDefinition itfDef;
    try {
      itfDef = itfSignatureResolverItf.resolve(itf, container, context);
    } catch (final ADLException e) {
      throw e;
    }

    InterfaceDefinitionDecorationHelper.setResolvedInterfaceDefinition(itf, itfDef);
    InputResourcesHelper.addInputResources(def, InputResourcesHelper
        .getInputResources(itfDef));
  }
  
  protected static Logger logger = FractalADLLogManager
  .getLogger("beam-binding-annot");
  
  static List<Binding> fifo_bindings = new ArrayList<Binding>();

  static int buffer_uniq_id = 0;
  
  static PrimitiveType getPrimitiveType(Node n){
    assert(n instanceof TypeContainer);
    Type n_type = ((TypeContainer)n).getType();
    assert(n_type instanceof PrimitiveType);
    return (PrimitiveType) n_type;
  }
  
  protected void addCCode(StringBuffer stringbuf, String code){
    stringbuf.append(code+"\n");
  }
  
  protected Source createFifoBufferImplementation(String name, String ifacename, 
      String signature, Integer size, Definition comp_def,
      MindInterface iface, final Map<Object, Object> context) throws ADLException{

    
    InterfaceDefinition ifacedef = itfSignatureResolverItf.resolve(iface,
        comp_def, context);
    
    String returnType = null;
    String paramType = null;
    
    StringBuffer generated_code = new StringBuffer();
    
    for (Method m: ifacedef.getMethods()){
      PrimitiveType mpt = getPrimitiveType(m);

      if (m.getName().equals("get")){
        returnType = mpt.getName();
        assert(m.getParameters().length == 0);
        
      } else if (m.getName().equals("put")) {
        assert(m.getParameters().length == 1);
        
        for (Parameter p : m.getParameters()){
          assert(p instanceof TypeContainer);
          PrimitiveType ppt = getPrimitiveType(p);
          paramType = ppt.getName();
        }
      } else {
        assert(false);
      }
    }
    assert(returnType.equals(paramType));

    /*
     * We checked that only get/put methods are needed and that their types are
     * correct. We can generate code for both method
     */
    /*
     * Common part
     */
    addCCode(generated_code, "#include \"beam/template/buffer.h\"");
    addCCode(generated_code, "/* the fifo type */");
    addCCode(generated_code, "FIFO_TYPE(" + returnType + ", " + size + ", "+ buffer_uniq_id +")");
    addCCode(generated_code, "/*  Private Data  */");
    addCCode(generated_code, "TYPE_NAME(" + returnType + ", "+ buffer_uniq_id + ") myFifo;");

    addCCode(generated_code, "// use macro to create fifo's methods");
    addCCode(generated_code, "FIFO_SIZE(" + returnType + ", " + size + ", "+ buffer_uniq_id + ")");
    addCCode(generated_code, "FIFO_INIT(" + returnType + ", "+ buffer_uniq_id + ")");
    addCCode(generated_code, "FIFO_PUSH(" + returnType + ", " + size + ", "+ buffer_uniq_id + ")");
    addCCode(generated_code, "FIFO_POP(" + returnType + ", " + size + ", "+ buffer_uniq_id + ")");
    addCCode(generated_code, "FIFO_TOP(" + returnType + ", "+ buffer_uniq_id + ")");
    addCCode(generated_code, "FIFO_REQUEUE(" + returnType + ", "+ buffer_uniq_id + ")");

    /*
     * for GET
     */
    addCCode(generated_code, "/* Server method for GET*/");
    addCCode(generated_code, returnType + " METH(buffer,get) (void) {");
    addCCode(generated_code, "   return FIFO_POP_N(" + returnType + ", " + buffer_uniq_id + ")(&myFifo);");
    addCCode(generated_code, "}");

    /*
     * for PUT
     */
    addCCode(generated_code, "/* Server method for PUT */");
    addCCode(generated_code, "void METH(buffer, put)(" + returnType + " x) {");
    addCCode(generated_code, "   FIFO_PUSH_N(" + returnType + ", " + buffer_uniq_id + ")(x, &myFifo);");
    addCCode(generated_code, "}");
    
    final Source src = CommonASTHelper.newNode(nodeFactoryItf, "source", Source.class);
    src.setCCode(generated_code.toString());
    return src;
  }
  protected Component createFifoBufferComponent(String name, String ifacename, 
      String signature, Integer size, final Map<Object, Object> context, Definition container_def) 
      throws ADLException{

    buffer_uniq_id++;

    String def_name = "beam.generated.buffer" + name;
    Definition new_bufdef = ASTHelper.newPrimitiveDefinitionNode(nodeFactoryItf, def_name,
        (DefinitionReference[]) null);
    MindInterface iface = ASTHelper.newServerInterfaceNode(nodeFactoryItf,
        ifacename, signature);
    
    processItf(container_def, iface, container_def, context);
    
    assert(new_bufdef instanceof InterfaceContainer);
    assert(new_bufdef instanceof ImplementationContainer);
    
    ((InterfaceContainer)new_bufdef).addInterface(iface);
    Source implem = createFifoBufferImplementation(name, ifacename, signature, size,
        new_bufdef, iface, context);
    
    DefinitionReference dr = ASTHelper.newDefinitionReference(nodeFactoryItf, 
        def_name);
    ASTHelper.setResolvedDefinition(dr, new_bufdef);
    
    ((ImplementationContainer)new_bufdef).addSource(implem);
    
    Component buffer_comp = ASTHelper.newComponent(
        nodeFactoryItf, 
        name, 
        dr);
    
    
    return buffer_comp;
  }
  
  protected String getBufferMangledName(Binding b){
    String comp_from = b.getFromComponent();
    String comp_to = b.getToComponent();
    String iface_from = b.getFromInterface();
    String iface_to = b.getToInterface();
    
    String name = comp_from + "_" + iface_from + "__" + comp_to + "_" + iface_to;
    return name;
  }
  // ---------------------------------------------------------------------------
  // Implementation of the ADLLoaderAnnotationProcessor interface
  // ---------------------------------------------------------------------------

  public Definition processAnnotation(final Annotation annotation,
      final Node node, final Definition definition, final ADLLoaderPhase phase,
      final Map<Object, Object> context) throws ADLException {
    assert annotation instanceof BeamFifo;
    assert node instanceof Binding;

    BeamFifo bt = (BeamFifo) annotation;
    Binding b = (Binding) node;

    String newbuffer_name = getBufferMangledName(b);
    
    if (phase == ADLLoaderPhase.AFTER_CHECKING) {
      
      Component from_comp = ASTHelper.getComponent(definition, b.getFromComponent());
      assert(from_comp != null);
      Definition from_def = ASTHelper.getResolvedComponentDefinition(from_comp, loaderItf, context);
      Interface iface =ASTHelper.getInterface(from_def, b.getFromInterface());
      assert(iface instanceof MindInterface);
      String signature = ((MindInterface)iface).getSignature();
      
      Component buffer_comp = createFifoBufferComponent(newbuffer_name, "buffer", 
          signature, bt.fifosize, context, definition);
      
      assert(buffer_comp != null);
      Definition buffer_def = defRefResolverItf.resolve(buffer_comp.getDefinitionReference(), 
          definition, context);
      assert(buffer_def!=null);
      ASTHelper.setResolvedComponentDefinition(buffer_comp, buffer_def);

      assert(buffer_def != null);
      assert(buffer_def instanceof InterfaceContainer);
      
      assert(definition instanceof ComponentContainer);
      ((ComponentContainer) definition).addComponent(buffer_comp);
      logger.log(Level.INFO, "Added buffer comp: '" + newbuffer_name + "'");
      
      Component to_comp = ASTHelper.getComponent(definition, b.getToComponent());
      assert(to_comp != null);
      Definition to_def = ASTHelper.getResolvedComponentDefinition(to_comp, loaderItf, context);
      assert(to_def != null);
      assert(to_def instanceof InterfaceContainer);
      for (Interface i : ((InterfaceContainer)to_def).getInterfaces()){
        if (i.getName().equals(b.getToInterface())){
          assert(i instanceof MindInterface);
          MindInterface mi = (MindInterface)i;
          assert(mi.getRole().equals(TypeInterface.SERVER_ROLE));
          mi.setRole(TypeInterface.CLIENT_ROLE);
          logger.log(Level.INFO, "Changed role for " + b.getToComponent() + "." + b.getToInterface());
        }
      }
      
      Binding filter_buffer_b = ASTHelper.newBinding(nodeFactoryItf);
      filter_buffer_b.setFromComponent(b.getToComponent());
      filter_buffer_b.setFromInterface(b.getToInterface());
      filter_buffer_b.setToComponent(newbuffer_name);
      filter_buffer_b.setToInterface("buffer");
      
      assert(definition instanceof BindingContainer);
      ((BindingContainer) definition).addBinding(filter_buffer_b);
      logger.log(Level.INFO, "Added binding " +
          filter_buffer_b.getFromComponent() + "." + filter_buffer_b.getFromInterface() + " to " +
          filter_buffer_b.getToComponent() + "." + filter_buffer_b.getToInterface());
      
      b.setToComponent(newbuffer_name);
      b.setToInterface("buffer");
      logger.log(Level.INFO, "Retargeted binding to buffer.s");

    } else if (phase == ADLLoaderPhase.AFTER_PARSING) {
      fifo_bindings.add(b);
      logger.log(Level.INFO, "Binding found (s:" + bt.fifosize + ") : " + 
          b.getFromComponent() + "." + b.getFromInterface() + " to " +
          b.getToComponent() + "." + b.getToInterface() +
          " (#" + fifo_bindings.size() + ")");
      
    }
    return null;
  }
}
