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

import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.DefaultTemplateLexer;
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
import org.ow2.mind.adl.annotation.predefined.BeamScheduler;
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

public class BeamSchedulerAnnotationProcessor
    extends
      AbstractADLLoaderAnnotationProcessor 
    implements
      Constants {

  protected static Logger logger = FractalADLLogManager
  .getLogger("beam-scheduler-annot");

  static Definition scheduler_definition = null;
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

  
  /**
   * Creates implementation from an existing one.
   * @param filters The list of all filters in the system
   * @param kindarg The arguments for the generation
   * @return
   */
  protected Source createFromExistingImplementation(List<Component> filters, String[] kindarg){
    
    StringTemplate sched_st =  getTemplate("st.beam.scheduler.Templates", kindarg[0]);
    
    sched_st.setAttribute("filters", filters);

    final Source src = CommonASTHelper.newNode(nodeFactoryItf, "source", Source.class);
    src.setCCode(sched_st.toString());
    return src;
  }
  
  /**
   * Creates implementation for an automatic scheduler
   * @param filters The list of all filters in the system
   * @param kindarg The arguments for the automatic generation
   * @return
   */
  protected Source createAutomaticSchedulerImplementation(List<Component> filters, 
      String[] kindarg){
    
    String kindarg0 = kindarg[0];

    if (kindarg0.equals("roundrobin")){
      StringBuffer inline_code = new StringBuffer();
      inline_code.append("int METH(main, main) (int argc, char *argv[]){\n");
      inline_code.append("for(;;){\n");

      for (Component filter : filters){
        inline_code.append("CALL(" + filter.getName()+ ", act)(1);\n");
      }

      inline_code.append("}\n");

      inline_code.append("return 0;\n}\n");

      final Source src = CommonASTHelper.newNode(nodeFactoryItf, "source", Source.class);
      src.setCCode(inline_code.toString());
      return src;
    } else {
      assert(false) : "unable to create automatic schedule for " + kindarg0;
      return null;
    }
  }
  
  /**
   * Creates the scheduler component. The ADL definition is generated. The implementation
   * can be entirely synthesized or only partly synthesized
   * @param container_def the definition in which to add the scheduler component
   * @param context the compiler context
   * @return the scheduler component
   * @throws ADLException
   */
  protected Component loadSchedulerComponent(Definition container_def, 
      final Map<Object,Object> context)
      throws ADLException{
    
    assert(scheduler_definition == null);
    logger.log(Level.INFO, "Creating scheduler component");
    
    String def_name = "beam.generated." + BEAM_SCHEDULER_COMP_DEF_NAME;
    Definition new_sched_def = ASTHelper.newPrimitiveDefinitionNode(nodeFactoryItf, def_name, 
        (DefinitionReference[]) null);
    MindInterface iface = ASTHelper.newServerInterfaceNode(nodeFactoryItf,
        "main", "boot.Main");

    processItf(container_def, iface, container_def, context);

    assert(new_sched_def instanceof InterfaceContainer);
    assert(new_sched_def instanceof ImplementationContainer);
    
    ((InterfaceContainer)new_sched_def).addInterface(iface);

    DefinitionReference dr = ASTHelper.newDefinitionReference(nodeFactoryItf, 
        def_name);
    
    ASTHelper.setResolvedDefinition(dr, new_sched_def);

    Component sched_comp = ASTHelper.newComponent(
        nodeFactoryItf, 
        BEAM_SCHEDULER_COMP_NAME, 
        dr);
    
    ASTHelper.setResolvedComponentDefinition(sched_comp, new_sched_def);

    logger.log(Level.INFO, "  - Adding scheduler in container component definition '" +
        container_def.getName() + "'");
    
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
    
    scheduler_definition = new_sched_def;
    return sched_comp;
  }
  // ---------------------------------------------------------------------------
  // Implementation of the ADLLoaderAnnotationProcessor interface
  // ---------------------------------------------------------------------------

  public Definition processAnnotation(final Annotation annotation,
      final Node node, final Definition definition, final ADLLoaderPhase phase,
      final Map<Object, Object> context) throws ADLException {
    assert annotation instanceof BeamScheduler;
    
    BeamScheduler beam_sched_annot = (BeamScheduler) annotation;
    
    assert node instanceof Definition;

    Definition def = (Definition) node;
    
    if (phase == ADLLoaderPhase.AFTER_EXTENDS){
      logger.log(Level.INFO, "Handling (adding scheduler comp) definition : " + def.getName());
      
      /*
       * Create Scheduler -> filter binding
       *  - add new client interface to scheduler
       *  - bind it to the filter
       */
      Component sched_comp;
      
      sched_comp = loadSchedulerComponent(def, context);
      
      assert(sched_comp != null);
      
    } else if (phase == ADLLoaderPhase.AFTER_CHECKING){
      assert(context.containsKey(BEAM_CONTEXT_FILTERS_COMP));
      
      List<Component> filters = (List<Component>) context.get(BEAM_CONTEXT_FILTERS_COMP);
      String kind = beam_sched_annot.kind;
      String args = "";
      for (String i: beam_sched_annot.arg){
        args += i + ",";
      }
      if (kind.equals("automatic")){
        logger.log(Level.INFO, "  - using automatic implementation, with arg: " + args);
        Source implem = createAutomaticSchedulerImplementation(filters, beam_sched_annot.arg);
        logger.log(Level.INFO, "  - Adding implementation code in scheduler");
        ((ImplementationContainer)scheduler_definition).addSource(implem);
      } else if (kind.equals("existing")){
        logger.log(Level.INFO, "  - creating implementation from existing, with arg: " + args);
        Source implem = createFromExistingImplementation(filters, beam_sched_annot.arg);
        logger.log(Level.INFO, "  - Adding implementation code in scheduler");
        ((ImplementationContainer)scheduler_definition).addSource(implem);
      } else {
        // FIXME: use a real error handling mechanism
        assert(false): "unknown kind";
      }

    }
    return null;
  }
}
