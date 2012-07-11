/**
 * Copyright (C) 2010 STMicroelectronics
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
 * Authors: Matthieu Leclercq
 * Contributors: 
 */

package org.ow2.mind.ui.syntaxcoloring;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.LeafNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.ow2.mind.AdlModelHelper;
import org.ow2.mind.adl.AdlPackage;
import org.ow2.mind.adl.Annotation;
import org.ow2.mind.adl.AnnotationContainer;
import org.ow2.mind.adl.AnonymousDefinition;
import org.ow2.mind.adl.Binding;
import org.ow2.mind.adl.CompositeDefinition;
import org.ow2.mind.adl.Content;
import org.ow2.mind.adl.Definition;
import org.ow2.mind.adl.DefinitionReference;
import org.ow2.mind.adl.Interface;
import org.ow2.mind.adl.Parameter;
import org.ow2.mind.adl.ParameterAssignment;
import org.ow2.mind.adl.ParametricDefinition;
import org.ow2.mind.adl.PrimitiveDefinition;
import org.ow2.mind.adl.SubComponent;
import org.ow2.mind.adl.TemplateParameter;
import org.ow2.mind.adl.TemplateParameterAssignment;
import org.ow2.mind.adl.TemplateParameterDecl;
import org.ow2.mind.adl.TypeDefinition;
import org.ow2.mind.adl.util.AdlSwitch;

public class AdlSemanticHighlightingCalculator
    implements
      ISemanticHighlightingCalculator {

  protected interface Highlighter<T extends EObject> {
    void highlight(T object);
  }

  protected abstract class AbstractHighlighter<T extends EObject>
      extends
        AdlSwitch<Object> implements Highlighter<T> {
    protected final IHighlightedPositionAcceptor acceptor;

    protected AbstractHighlighter(IHighlightedPositionAcceptor acceptor) {
      this.acceptor = acceptor;
    }

    public void highlight(T object) {
      if (object != null)
        doSwitch(object);
    }
  }

  protected class AnnotationContainerHighlighter<T extends EObject>
      extends
        AbstractHighlighter<T> {

    protected AnnotationContainerHighlighter(
        IHighlightedPositionAcceptor acceptor) {
      super(acceptor);
    }

    @Override
    public Object caseAnnotationContainer(AnnotationContainer object) {
      highlightAnnotations(object, acceptor);
      return null;
    }
  }

  protected class DefinitionHighlighter
      extends
        AnnotationContainerHighlighter<Definition> {

    Highlighter<Content> contentVisitor = new ContentHighlighter(acceptor, this);

    protected DefinitionHighlighter(IHighlightedPositionAcceptor acceptor) {
      super(acceptor);
    }

    @Override
    public Object caseDefinition(Definition object) {
      for (Content content : AdlModelHelper.getContent(object)) {
        contentVisitor.highlight(content);
      }

      for (DefinitionReference defRef : object.getExtends()) {
        highlightDefinitionReference(defRef, acceptor);
      }
      return null;
    }

    @Override
    public Object caseParametricDefinition(ParametricDefinition object) {
      highlightParametricDefinition(object, acceptor);
      return null;
    }

    @Override
    public Object caseCompositeDefinition(CompositeDefinition object) {
      highlightCompositeDefinitionName(object, acceptor);

      for (TemplateParameterDecl param : object.getTemplateParameters()) {
        highlightTemplateParameterDecl(param, acceptor);
      }
      return null;
    }

    @Override
    public Object casePrimitiveDefinition(PrimitiveDefinition object) {
      highlightPrimitiveDefinitionName(object, acceptor);
      return null;
    }

    @Override
    public Object caseTypeDefinition(TypeDefinition object) {
      highlightTypeDefinitionName(object, acceptor);
      return null;
    }
  }

  protected class ContentHighlighter
      extends
        AnnotationContainerHighlighter<Content> {

    protected final DefinitionHighlighter definitionHighlighter;

    protected ContentHighlighter(IHighlightedPositionAcceptor acceptor,
        DefinitionHighlighter definitionHighlighter) {
      super(acceptor);
      this.definitionHighlighter = definitionHighlighter;
    }

    @Override
    public Object caseInterface(Interface object) {
      highlighInterface(object, acceptor);
      return null;
    }

    @Override
    public Object caseSubComponent(SubComponent object) {
      highlightSubComponentName(object, acceptor);

      if (object.getType() != null) {
        highlightDefinitionReference(object.getType(), acceptor);
      }

      AnonymousDefinition anonymousDef = object.getAnonymousDef();
      if (anonymousDef != null) {
        highlightAnnotations(anonymousDef, acceptor);
        for (Content content : anonymousDef.getContent()) {
          highlight(content);
        }
      }

      return null;
    }

    @Override
    public Object caseBinding(Binding object) {
      highlightBinding(object, acceptor);
      return null;
    }
  }

  public void provideHighlightingFor(XtextResource resource,
      final IHighlightedPositionAcceptor acceptor) {
    if (resource == null) return;

    IParseResult parseResult = resource.getParseResult();

    Definition definition = (Definition) parseResult.getRootASTElement();
    Highlighter<Definition> definitionVisitor = new DefinitionHighlighter(
        acceptor);
    definitionVisitor.highlight(definition);
  }

  protected void highlightTypeDefinitionName(TypeDefinition object,
      IHighlightedPositionAcceptor acceptor) {
    setStyle(object, acceptor,
        AdlPackage.eINSTANCE.getDefinitionOrTemplate_Name(),
        AdlHighlightingConfiguration.TYPE_ID);
  }

  protected void highlightPrimitiveDefinitionName(PrimitiveDefinition object,
      IHighlightedPositionAcceptor acceptor) {
    setStyle(object, acceptor,
        AdlPackage.eINSTANCE.getDefinitionOrTemplate_Name(),
        AdlHighlightingConfiguration.PRIMITIVE_ID);
  }

  protected void highlightCompositeDefinitionName(CompositeDefinition object,
      IHighlightedPositionAcceptor acceptor) {
    setStyle(object, acceptor,
        AdlPackage.eINSTANCE.getDefinitionOrTemplate_Name(),
        AdlHighlightingConfiguration.COMPOSITE_ID);
  }

  protected void highlightParametricDefinition(ParametricDefinition object,
      IHighlightedPositionAcceptor acceptor) {
    setStyle(object, acceptor,
        AdlPackage.eINSTANCE.getParametricDefinition_Parameters(),
        AdlHighlightingConfiguration.PARAMETERS_ID);
  }

  protected void highlightTemplateParameterDecl(TemplateParameterDecl object,
      IHighlightedPositionAcceptor acceptor) {
    setStyle(object, acceptor,
        AdlPackage.eINSTANCE.getDefinitionOrTemplate_Name(),
        AdlHighlightingConfiguration.TEMPLATE_PARAMETERS_ID);
    highlightDefinitionReference(object.getType(), acceptor);
  }

  protected void highlightAnnotations(AnnotationContainer container,
      IHighlightedPositionAcceptor acceptor) {
    for (Annotation annotation : container.getAnnotations()) {
      highlightAnnotation(annotation, acceptor);
    }
  }

  protected void highlightAnnotation(Annotation annotation,
      IHighlightedPositionAcceptor acceptor) {
    setStyle(annotation, acceptor, AdlPackage.eINSTANCE.getAnnotation_Name(),
        AdlHighlightingConfiguration.ANNOTATION_ID);

    // find '@' node
    for (AbstractNode subNode : NodeUtil.getNode(annotation).getChildren()) {
      if (subNode instanceof LeafNode) {
        if ("@".equals(((LeafNode) subNode).getText())) {
          setStyle(acceptor, subNode,
              AdlHighlightingConfiguration.ANNOTATION_ID);
        }
      }
    }
  }

  protected void highlightSubComponentName(SubComponent subComponent,
      IHighlightedPositionAcceptor acceptor) {
    setStyle(subComponent, acceptor,
        AdlPackage.eINSTANCE.getSubComponent_Name(),
        AdlHighlightingConfiguration.SUB_COMPONENT_ID);
  }

  protected void highlightDefinitionReference(DefinitionReference defRef,
      IHighlightedPositionAcceptor acceptor) {
    if (defRef.getDefinition() instanceof TemplateParameterDecl) {
      setStyle(defRef, acceptor,
          AdlPackage.eINSTANCE.getDefinitionReference_Definition(),
          AdlHighlightingConfiguration.TEMPLATE_PARAMETERS_ID);
    } else if (defRef.getDefinition() instanceof Definition) {
      Definition definition = (Definition) defRef.getDefinition();
      if (definition == null) return;

      if (definition instanceof TypeDefinition) {
        setStyle(defRef, acceptor,
            AdlPackage.eINSTANCE.getDefinitionReference_Definition(),
            AdlHighlightingConfiguration.TYPE_ID);
      } else if (definition instanceof PrimitiveDefinition) {
        setStyle(defRef, acceptor,
            AdlPackage.eINSTANCE.getDefinitionReference_Definition(),
            AdlHighlightingConfiguration.PRIMITIVE_ID);
      } else if (definition instanceof CompositeDefinition) {
        setStyle(defRef, acceptor,
            AdlPackage.eINSTANCE.getDefinitionReference_Definition(),
            AdlHighlightingConfiguration.COMPOSITE_ID);
      }

      for (TemplateParameter templateParameter : defRef.getTemplateParameters()) {
        if (templateParameter instanceof TemplateParameterAssignment) {
          setStyle(templateParameter, acceptor,
              AdlPackage.eINSTANCE.getTemplateParameterAssignment_Name(),
              AdlHighlightingConfiguration.TEMPLATE_PARAMETERS_ID);
        }
        highlightDefinitionReference(templateParameter.getValue(), acceptor);
      }

      for (Parameter parameter : defRef.getParameters()) {
        if (parameter instanceof ParameterAssignment) {
          setStyle(parameter, acceptor,
              AdlPackage.eINSTANCE.getParameterAssignment_Name(),
              AdlHighlightingConfiguration.PARAMETERS_ID);
        }
      }
    }
  }

  protected void highlighInterface(Interface itf,
      IHighlightedPositionAcceptor acceptor) {
    setStyle(itf, acceptor, AdlPackage.eINSTANCE.getInterface_Name(),
        AdlHighlightingConfiguration.INTERFACE_ID);
  }

  protected void highlightBinding(Binding binding,
      IHighlightedPositionAcceptor acceptor) {
    setStyle(binding, acceptor, AdlPackage.eINSTANCE.getBinding_FromSubComp(),
        AdlHighlightingConfiguration.SUB_COMPONENT_ID);
    setStyle(binding, acceptor, AdlPackage.eINSTANCE.getBinding_ToSubComp(),
        AdlHighlightingConfiguration.SUB_COMPONENT_ID);
    setStyle(binding, acceptor, AdlPackage.eINSTANCE.getBinding_FromItf(),
        AdlHighlightingConfiguration.INTERFACE_ID);
    setStyle(binding, acceptor, AdlPackage.eINSTANCE.getBinding_ToItf(),
        AdlHighlightingConfiguration.INTERFACE_ID);
  }

  protected void setStyle(IHighlightedPositionAcceptor acceptor,
      AbstractNode node, String id) {
    acceptor.addPosition(node.getOffset(), node.getLength(), id);
  }

  protected void setStyle(IHighlightedPositionAcceptor acceptor,
      List<AbstractNode> nodes, String id) {
    for (AbstractNode node : nodes) {
      setStyle(acceptor, node, id);
    }
  }

  protected void setStyle(EObject object,
      IHighlightedPositionAcceptor acceptor, EStructuralFeature feature,
      String id) {
    setStyle(acceptor, NodeUtil.findNodesForFeature(object, feature), id);
  }

}
