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
import org.ow2.mind.adl.ast.ASTHelper;
import org.ow2.mind.adl.ast.Binding;
import org.ow2.mind.adl.ast.BindingContainer;
import org.ow2.mind.adl.ast.Component;
import org.ow2.mind.adl.ast.ComponentContainer;
import org.ow2.mind.adl.ast.Data;
import org.ow2.mind.adl.ast.DefinitionReference;
import org.ow2.mind.adl.ast.ImplementationContainer;
import org.ow2.mind.adl.ast.MindInterface;
import org.ow2.mind.adl.ast.Source;
import org.ow2.mind.adl.idl.InterfaceDefinitionDecorationHelper;
import org.ow2.mind.annotation.Annotation;
import org.ow2.mind.beam.CommandLineHandler;
import org.ow2.mind.beam.Constants;
import org.ow2.mind.idl.ast.InterfaceDefinition;
import org.ow2.mind.idl.ast.Method;
import org.ow2.mind.idl.ast.Parameter;
import org.ow2.mind.idl.ast.PrimitiveType;
import org.ow2.mind.idl.ast.Type;
import org.ow2.mind.idl.ast.TypeContainer;
import org.ow2.mind.idl.ast.TypeDefReference;

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
  
  static String getTypeName(Node n){
    assert(n instanceof TypeContainer);
    Type n_type = ((TypeContainer)n).getType();

      if (n_type instanceof PrimitiveType)
        return ((PrimitiveType)n_type).getName();
      else if (n_type instanceof TypeDefReference){
        return ((TypeDefReference)n_type).getName();
      } else {
        assert(false);
        return null;
      }
    
  }
  
  @SuppressWarnings("unchecked")
  protected void addFifoToContext(Component fifo, Map<Object,Object> context){
    List<Component> ctx_filters;
    
    if (context.containsKey(BEAM_CONTEXT_FIFO_COMP)){
      ctx_filters = (List<Component>) context.get(BEAM_CONTEXT_FIFO_COMP);
    } else {
      ctx_filters = new ArrayList<Component>();
      context.put(BEAM_CONTEXT_FIFO_COMP, ctx_filters);
    }
    ctx_filters.add(fifo);
  }
  
  protected void addCCode(StringBuffer stringbuf, String code){
    stringbuf.append(code+"\n");
  }
  
  protected void createFifoBufferImplementation(String name, String ifacename, 
      String signature, Integer size, Definition comp_def,
      MindInterface iface, final Map<Object, Object> context) throws ADLException{
    
    InterfaceDefinition ifacedef = itfSignatureResolverItf.resolve(iface,
        comp_def, context);
    
    String returnType = null;
    String paramType = null;
    
    StringBuffer generated_code = new StringBuffer();
    
    for (Method m: ifacedef.getMethods()){
      if (m.getName().equals("get")){
        returnType = getTypeName(m);
        assert(m.getParameters().length == 0);
        
      } else if (m.getName().equals("put")) {
        assert(m.getParameters().length == 1);
        
        for (Parameter p : m.getParameters()){
          assert(p instanceof TypeContainer);
          paramType = getTypeName(p);
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
    addCCode(generated_code, "#include <beam/template/buffer.h>");
    addCCode(generated_code, "/* the fifo type */");


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
    addCCode(generated_code, "   return FIFO_POP_N(" + returnType + ", " + buffer_uniq_id + ")(&(PRIVATE.myFifo));");
    addCCode(generated_code, "}");

    /*
     * for PUT
     */
    addCCode(generated_code, "/* Server method for PUT */");
    addCCode(generated_code, "void METH(buffer, put)(" + returnType + " x) {");
    addCCode(generated_code, "   FIFO_PUSH_N(" + returnType + ", " + buffer_uniq_id + ")(x, &(PRIVATE.myFifo));");
    addCCode(generated_code, "}");
    
    /*
     * Control interface implementation follows.
     */
    
    // create code for control::init
    
    addCCode(generated_code, "/* Server Method for control::init */");
    addCCode(generated_code, "void METH(" + BEAM_FIFO_CTRL_IFACE_NAME + ",init)(void) {");
    addCCode(generated_code, " FIFO_INIT_N(" + returnType + ", " + buffer_uniq_id + ")(&(PRIVATE.myFifo));");
    addCCode(generated_code, "}");
    
    
    // create code for control::max_size method
    addCCode(generated_code, "/* Server Method for control::max_size */ ");
    addCCode(generated_code, "int METH(" + BEAM_FIFO_CTRL_IFACE_NAME + ", max_size)(void) {");
    addCCode(generated_code, " return " + size +";");
    addCCode(generated_code, "}");
    
    // create code for control::current_size method
    addCCode(generated_code, "/* Server Method for control::current_size */");
    addCCode(generated_code, "int METH(" + BEAM_FIFO_CTRL_IFACE_NAME + ", current_size)(void) {");
    addCCode(generated_code, " FIFO_SIZE_N(" + returnType + ", " + buffer_uniq_id + ")(&(PRIVATE.myFifo));");
    addCCode(generated_code, "}");
    
    final Source src = CommonASTHelper.newNode(nodeFactoryItf, "source", Source.class);
    src.setCCode(generated_code.toString());
    
    ((ImplementationContainer)comp_def).addSource(src);
  
    final Data data = CommonASTHelper.newNode(nodeFactoryItf, "data", Data.class);

    StringBuffer pdata = new StringBuffer();
    addCCode(pdata, "#define TYPE_NAME(ptype,id) fifo_##ptype##id##_t");
    addCCode(pdata, "#define FIFO_TYPE(ptype, size, id)      \\");
    addCCode(pdata, "typedef struct { \\");
    addCCode(pdata, "ptype data[size];\\");
    addCCode(pdata, "int s;\\");
    addCCode(pdata, "int e;\\");
    addCCode(pdata, "} TYPE_NAME(ptype,id);");
    addCCode(pdata, "FIFO_TYPE(" + returnType + ", " + size + ", "+ buffer_uniq_id +")");

    addCCode(pdata, "struct { TYPE_NAME(" + returnType + ", "+ buffer_uniq_id + ") myFifo;} PRIVATE;");

    data.setCCode(pdata.toString());
    ((ImplementationContainer)comp_def).setData(data);
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
    
    MindInterface iface_ctrl = ASTHelper.newServerInterfaceNode(nodeFactoryItf,
        BEAM_FIFO_CTRL_IFACE_NAME, BEAM_FIFO_CTRL_IFACE_TYPE);
    
    processItf(container_def, iface, container_def, context);
    processItf(container_def, iface_ctrl, container_def, context);

    assert(new_bufdef instanceof InterfaceContainer);
    assert(new_bufdef instanceof ImplementationContainer);
    
    ((InterfaceContainer)new_bufdef).addInterface(iface);
    ((InterfaceContainer)new_bufdef).addInterface(iface_ctrl);

    createFifoBufferImplementation(name, ifacename, signature, size,
        new_bufdef, iface, context);
    
    DefinitionReference dr = ASTHelper.newDefinitionReference(nodeFactoryItf, 
        def_name);
    ASTHelper.setResolvedDefinition(dr, new_bufdef);
    
//    ((ImplementationContainer)new_bufdef).addSource(implem);
    
    Component buffer_comp = ASTHelper.newComponent(
        nodeFactoryItf, 
        name, 
        dr);
    
    
    /*
     * Create scheduler -> fifo links
     */
    /*
     * Create Scheduler -> filter binding
     *  - add new client interface to scheduler
     *  - bind it to the filter
     */
    Component sched_comp = ASTHelper.getComponent(container_def, BEAM_SCHEDULER_COMP_NAME);
    
    assert(sched_comp != null);
    Definition sched_def = ASTHelper.getResolvedComponentDefinition(sched_comp, loaderItf, context);
    assert(sched_def != null);
    assert sched_def instanceof InterfaceContainer;
    
    MindInterface sched_client = ASTHelper.newClientInterfaceNode(nodeFactoryItf, 
        buffer_comp.getName(),
        BEAM_FIFO_CTRL_IFACE_TYPE);
    processItf(container_def, sched_client, container_def, context);

    ((InterfaceContainer)sched_def).addInterface(sched_client);

    Binding sched_buffer_b = ASTHelper.newBinding(nodeFactoryItf);
    sched_buffer_b.setFromComponent(BEAM_SCHEDULER_COMP_NAME);
    sched_buffer_b.setFromInterface(buffer_comp.getName());
    sched_buffer_b.setToComponent(buffer_comp.getName());
    sched_buffer_b.setToInterface(BEAM_FIFO_CTRL_IFACE_NAME);

    assert(container_def instanceof BindingContainer);
    ((BindingContainer) container_def).addBinding(sched_buffer_b);
    
    return buffer_comp;
  }
  
  protected String getBufferMangledName(Binding b){
    String comp_from = b.getFromComponent();
    String comp_to = b.getToComponent();
    String iface_from = b.getFromInterface();
    String iface_to = b.getToInterface();
    
    String name = BEAM_BUFFER_COMP_PREFIX_NAME + comp_from + "_" +
        iface_from + "__" + comp_to + "_" + iface_to;
    
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
    
    if (context.containsKey(CommandLineHandler.BEAM_CLI_GEN_BIP)){
      logger.log(Level.INFO, "not doing anything as --beam-bip used");
      return null;
    }
    
    if (phase == ADLLoaderPhase.AFTER_EXTENDS) {
      
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
      
      // add FIFO component to context to make it available to other part
      // scheduler generation in particular
      addFifoToContext(buffer_comp, context);
      
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
          logger.log(Level.INFO, "Changed role for " + b.getToComponent() + "." + b.getToInterface() +
              " in def " + to_def.getName());
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
      logger.log(Level.INFO, "Retargeted binding to " + newbuffer_name + ".buffer");

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
