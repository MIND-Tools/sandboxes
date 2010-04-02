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
import org.ow2.mind.adl.annotation.ADLLoaderPhase;
import org.ow2.mind.adl.annotation.AbstractADLLoaderAnnotationProcessor;
import org.ow2.mind.adl.annotation.predefined.BeamFifo;
import org.ow2.mind.adl.ast.ASTHelper;
import org.ow2.mind.adl.ast.Binding;
import org.ow2.mind.adl.ast.BindingContainer;
import org.ow2.mind.adl.ast.Component;
import org.ow2.mind.adl.ast.ComponentContainer;
import org.ow2.mind.adl.ast.MindInterface;
import org.ow2.mind.annotation.Annotation;
import org.ow2.mind.beam.Constants;

public class BeamFifoAnnotationProcessor
    extends
      AbstractADLLoaderAnnotationProcessor 
    implements
      Constants {


  protected static Logger logger = FractalADLLogManager
  .getLogger("beam-binding-annot");
  
  static List<Binding> fifo_bindings = new ArrayList<Binding>();

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

    String newbuffer_name = "buffer";
    
    if (phase == ADLLoaderPhase.AFTER_CHECKING) {
      Component buffer_comp = ASTHelper.newComponent(
          nodeFactoryItf, 
          newbuffer_name, 
          "helloworld.TestBuffer");
      
      assert(buffer_comp != null);
      Definition buffer_def = defRefResolverItf.resolve(buffer_comp.getDefinitionReference(), definition, context);
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
        if (i.getName().equals("s")){
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
      filter_buffer_b.setToInterface("s");
      
      assert(definition instanceof BindingContainer);
      ((BindingContainer) definition).addBinding(filter_buffer_b);
      logger.log(Level.INFO, "Added binding " +
          filter_buffer_b.getFromComponent() + "." + filter_buffer_b.getFromInterface() + " to " +
          filter_buffer_b.getToComponent() + "." + filter_buffer_b.getToInterface());
      
      b.setToComponent(newbuffer_name);
      b.setToInterface("s");
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
