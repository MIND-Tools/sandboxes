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
import org.objectweb.fractal.adl.interfaces.InterfaceContainer;
import org.objectweb.fractal.adl.types.TypeInterface;
import org.objectweb.fractal.adl.util.FractalADLLogManager;
import org.ow2.mind.CommonASTHelper;
import org.ow2.mind.InputResourcesHelper;
import org.ow2.mind.adl.annotation.ADLLoaderPhase;
import org.ow2.mind.adl.annotation.AbstractADLLoaderAnnotationProcessor;
import org.ow2.mind.adl.annotation.predefined.BeamFilter;
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

public class BeamFilterAnnotationProcessor
    extends
      AbstractADLLoaderAnnotationProcessor 
    implements
      Constants {

  protected static Logger logger = FractalADLLogManager
  .getLogger("beam-filter-annot");

  static List<Component> filters = new ArrayList<Component>();
  
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
  

  protected Source createSchedulerImplementation(){
    String inline_code = "int METH(main, main) (int argc, char *argv[]){\n" +
     "for(;;){\n" +
     "CALL(generator, act)(1);\n" +
     "CALL(maxfilter, act)(1);\n" +
     "CALL(dumper, act)(1);\n" +
     "}\n" +
     "return 0;\n" +
     "}\n";
    final Source src = CommonASTHelper.newNode(nodeFactoryItf, "source", Source.class);
    src.setCCode(inline_code);
    return src;
  }
  
  protected Component loadSchedulerComponent(Definition container_def, 
      final Map<Object,Object> context)
      throws ADLException{
    
    String def_name = "beam.generated." + BEAM_SCHEDULER_COMP_DEF_NAME;
    Definition new_sched_def = ASTHelper.newPrimitiveDefinitionNode(nodeFactoryItf, def_name, 
        (DefinitionReference[]) null);
    MindInterface iface = ASTHelper.newServerInterfaceNode(nodeFactoryItf,
        "main", "boot.Main");

    processItf(container_def, iface, container_def, context);

    assert(new_sched_def instanceof InterfaceContainer);
    assert(new_sched_def instanceof ImplementationContainer);
    
    ((InterfaceContainer)new_sched_def).addInterface(iface);
    
    Source implem = createSchedulerImplementation();
    
    DefinitionReference dr = ASTHelper.newDefinitionReference(nodeFactoryItf, 
        def_name);
    
    ASTHelper.setResolvedDefinition(dr, new_sched_def);
    ((ImplementationContainer)new_sched_def).addSource(implem);

    Component sched_comp = ASTHelper.newComponent(
        nodeFactoryItf, 
        BEAM_SCHEDULER_COMP_NAME, 
        dr);
    
    ASTHelper.setResolvedComponentDefinition(sched_comp, new_sched_def);

    assert(container_def instanceof ComponentContainer);
    ((ComponentContainer) container_def).addComponent(sched_comp);
    
    
    /*
     * bind it to the this.main interface
     */
    Binding sched_main_b = ASTHelper.newBinding(nodeFactoryItf);
    sched_main_b.setFromComponent("bootstrap");
    sched_main_b.setFromInterface("entryPoint");
    sched_main_b.setToComponent(BEAM_SCHEDULER_COMP_NAME);
    sched_main_b.setToInterface("main");

    assert(container_def instanceof BindingContainer);
    ((BindingContainer) container_def).addBinding(sched_main_b);
    
    return sched_comp;
  }
  // ---------------------------------------------------------------------------
  // Implementation of the ADLLoaderAnnotationProcessor interface
  // ---------------------------------------------------------------------------

  public Definition processAnnotation(final Annotation annotation,
      final Node node, final Definition definition, final ADLLoaderPhase phase,
      final Map<Object, Object> context) throws ADLException {
    assert annotation instanceof BeamFilter;
    
    assert node instanceof Component;

    Component c = (Component) node;
    if (phase == ADLLoaderPhase.AFTER_PARSING){
      filters.add(c);
      logger.log(Level.INFO, "Filter : " + c.getName() + "(#" + filters.size() + ")");

    } else if (phase == ADLLoaderPhase.AFTER_CHECKING){
      logger.log(Level.INFO, "Handling filter : " + c.getName());

      Definition def = ASTHelper.getResolvedComponentDefinition(c, loaderItf, context);
      assert(def != null);
      assert def instanceof InterfaceContainer;
      
      /*
       * Create Scheduler -> filter binding
       *  - add new client interface to scheduler
       *  - bind it to the filter
       */
      Component sched_comp = ASTHelper.getComponent(definition, BEAM_SCHEDULER_COMP_NAME);
      
      if (sched_comp == null){
        sched_comp = loadSchedulerComponent(definition, context);
      }
      
      assert(sched_comp != null);
      Definition sched_def = ASTHelper.getResolvedComponentDefinition(sched_comp, loaderItf, context);
      assert(sched_def != null);
      assert sched_def instanceof InterfaceContainer;
      
      MindInterface sched_client = ASTHelper.newClientInterfaceNode(nodeFactoryItf, 
          c.getName(),
          BEAM_FILTER_CTRL_IFACE_TYPE);
      processItf(definition, sched_client, definition, context);

      ((InterfaceContainer)sched_def).addInterface(sched_client);
      logger.log(Level.INFO, " - added client iface '" + sched_client.getName() 
          +"' on '" + sched_comp.getName() + "'");

      //      logger.log(Level.INFO, "Interfaces on " + sched_def.getName() + ":");
//      for (Interface i : ((InterfaceContainer)sched_def).getInterfaces()){
//        assert(i instanceof MindInterface);
//        MindInterface mi = (MindInterface)i;
//        logger.log(Level.INFO, " -" + mi.getName() + ", " + mi.getSignature() + " [" + mi.getRole() + "]");
//      }

      Binding sched_filter_b = ASTHelper.newBinding(nodeFactoryItf);
      sched_filter_b.setFromComponent(BEAM_SCHEDULER_COMP_NAME);
      sched_filter_b.setFromInterface(c.getName());
      sched_filter_b.setToComponent(c.getName());
      sched_filter_b.setToInterface(BEAM_FILTER_CTRL_IFACE_NAME);

      assert(definition instanceof BindingContainer);
      ((BindingContainer) definition).addBinding(sched_filter_b);
      
      logger.log(Level.INFO, " - added binding '" + 
          sched_filter_b.getFromComponent() + "." + sched_filter_b.getFromInterface() + " to " +
          sched_filter_b.getToComponent() + "." + sched_filter_b.getToInterface() + "'");
//    assert def instanceof ImplementationContainer;
//      ImplementationContainer ic = ((ImplementationContainer) def);
//
//      Source ns = MembraneASTHelper.newSourceNode(nodeFactoryItf, "/helloworld/toto.c");
//      ic.addSource(ns);
//      Source ss[] = ic.getSources();
//      for (Source s: ss){
//        logger.log(Level.INFO, " - source: " + s.getPath());
//      }
    }
    return null;
  }
}
