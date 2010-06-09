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

package org.ow2.adl.parser;

import static org.objectweb.fractal.adl.NodeUtil.castNodeError;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.tree.TreeAdaptor;
import org.objectweb.fractal.adl.CompilerError;
import org.objectweb.fractal.adl.Definition;
import org.objectweb.fractal.adl.Node;
import org.objectweb.fractal.adl.NodeUtil;
import org.objectweb.fractal.adl.error.GenericErrors;
import org.objectweb.fractal.adl.error.NodeErrorLocator;
import org.objectweb.fractal.adl.interfaces.InterfaceContainer;
import org.objectweb.fractal.adl.types.TypeInterface;
import org.objectweb.fractal.adl.xml.XMLNodeFactory;
import org.ow2.mind.adl.ast.DefinitionReference;
import org.ow2.mind.adl.ast.DefinitionReferenceContainer;
import org.ow2.mind.adl.ast.MindDefinition;
import org.ow2.mind.adl.ast.MindInterface;
import org.ow2.mind.adl.imports.ast.Import;
import org.ow2.mind.adl.generic.ast.TypeArgument;
import org.ow2.mind.adl.generic.ast.TypeArgumentContainer;
import org.ow2.mind.adl.parameter.ast.Argument;
import org.ow2.mind.adl.parameter.ast.ArgumentContainer;
import org.ow2.mind.adl.parser.ADLParser;
import org.ow2.mind.annotation.ast.AnnotationContainer;
import org.ow2.mind.value.ast.Value;
import org.xml.sax.SAXException;

public class ToASTVisitor {

  private final String                    filename;
  private final XMLNodeFactory            nodeFactory;
  private final String                    adlDtd;
  private final TreeAdaptor               adaptor  = new CommonTreeAdaptor();
  private final Map<Integer, TreeVisitor> visitors = new HashMap<Integer, TreeVisitor>();

  /**
   * @param nodeFactory The node factory to be used for instantiating AST nodes.
   * @param adlDtd The grammar definition for ADL nodes.
   * @param filename The name of the parsed file.
   */
  public ToASTVisitor(final XMLNodeFactory nodeFactory, final String adlDtd,
      final String filename) {
    this.nodeFactory = nodeFactory;
    this.adlDtd = adlDtd;
    this.filename = filename;
    try {
      nodeFactory.checkDTD(adlDtd);
    } catch (final SAXException e) {
      throw new CompilerError(GenericErrors.INTERNAL_ERROR, e,
          "Error in dtd file '" + adlDtd + "'");
    }
    initVisitors();
  }

  protected void initVisitors() {
    visitors.put(Token.INVALID_TOKEN_TYPE, new NullVisitor());
    visitors.put(ADLParser.TYPE, new TypeVisitor());
    visitors.put(ADLParser.EXTENDS, new ExtendsVisitor());
    visitors.put(ADLParser.DEF_REF, new DefRefVisitor());
    visitors.put(ADLParser.ARGS, new ArgVisitor());
    visitors.put(ADLParser.TYPE_ARGS, new TypeArgVisitor());
    InterfaceVisitor itfVisitor = new InterfaceVisitor();
    visitors.put(ADLParser.PROVIDES, itfVisitor);
    visitors.put(ADLParser.REQUIRES, itfVisitor);
  }
  
  protected <T extends Node> T newNode(final String name,
      final Class<T> nodeClass, final Tree tree) {
    Node node;
    try {
      node = nodeFactory.newXMLNode(adlDtd, name);
    } catch (final SAXException e) {
      throw new CompilerError(GenericErrors.INTERNAL_ERROR, e,
          "Unable to create node");
    }
    TreeVisitor visitor = getTreeVisitor(tree);
    setSource(node, visitor.getFirstToken(tree), visitor.getLastToken(tree));

    return NodeUtil.castNodeError(node, nodeClass);
  }

  protected void setSource(final Node node, final Token beginToken,
      final Token endToken) {
    if (beginToken == null)
      node.astSetSource(filename);
    else
      node.astSetSource(NodeErrorLocator.lineLocation(filename, beginToken
          .getLine()));
  }

  public Definition toDefinition(Tree tree) {
    Tree archDef = tree.getChild(tree.getChildCount() -1);
    Definition definition = visitTree(archDef, null, Definition.class);
    // TODO process imports
    return definition;
  }
  
  protected Node visitTree(Tree tree, Node astNode) {
    return getTreeVisitor(tree).visit(tree, astNode);
  }

  protected <T extends Node> T visitTree(Tree tree, Node astNode,
      Class<T> nodeClass) {
    return castNodeError(getTreeVisitor(tree).visit(tree, astNode), nodeClass);
  }

  protected TreeVisitor getTreeVisitor(Tree tree) {
    TreeVisitor visitor = visitors.get(tree.getType());
    assert visitor != null;
    return visitor;
  }

  protected Token lastToken(Tree tree) {
    return adaptor.getToken(adaptor.getChild(tree,
        adaptor.getChildCount(tree) - 1));
  }

  protected void processAnnotations(Tree tree, Node astNode) {
    assert astNode instanceof AnnotationContainer;
    Iterator<Tree> iter = new TreeChildIterator(tree);
    while (iter.hasNext()) {
      Tree child = iter.next();
      if (child.getType() == ADLParser.AT) {
        visitTree(child, astNode);
        iter.remove();
      }
    }
  }

  protected String processID(Tree tree) {
    assert tree.getType() == ADLParser.ID;
    return tree.getText();
  }

  protected String processFQN(Tree tree) {
    assert tree.getType() == ADLParser.FQN;
    String name = "";
    Iterator<Tree> iter = new TreeChildIterator(tree);
    while (iter.hasNext()) {
      Tree child = iter.next();
      name += processID(child);
      if (iter.hasNext()) name += ".";
    }
    return name;
  }

  protected class NullVisitor implements TreeVisitor{

    public Token getFirstToken(Tree tree) {
      return null;
    }

    public Token getLastToken(Tree tree) {
      return null;
    }

    public Node visit(Tree tree, Node astNode) {
      return null;
    }
  }
  
  protected class TypeVisitor implements TreeVisitor {

    public Token getFirstToken(Tree tree) {
      return adaptor.getToken(tree);
    }

    public Token getLastToken(Tree tree) {
      // TODO Auto-generated method stub
      return null;
    }

    public Node visit(Tree tree, Node astNode) {
      assert tree.getType() == ADLParser.TYPE;
      MindDefinition def = newNode("type", MindDefinition.class, tree);
      processAnnotations(tree, def);
      Iterator<Tree> iter = new TreeChildIterator(tree);

      // process name
      Tree child = iter.next();
      def.setName(processFQN(child));

      // if there is neither extends, nor body. return
      if (!iter.hasNext()) return def;

      // process extends (if any)
      child = iter.next();
      if (child.getType() == ADLParser.EXTENDS) {
        def.setExtends(visitTree(child, astNode,
            DefinitionReferenceContainer.class));
        if (!iter.hasNext()) return def;
        child = iter.next();
      }

      // process body
      while (true) {
        visitTree(child, def);
        if (!iter.hasNext()) return def;
        child = iter.next();
      }
    }
  }

  protected class ExtendsVisitor implements TreeVisitor {

    public Token getFirstToken(Tree tree) {
      return adaptor.getToken(tree);
    }

    public Token getLastToken(Tree tree) {
      // TODO Auto-generated method stub
      return null;
    }

    public Node visit(Tree tree, Node astNode) {
      assert tree.getType() == ADLParser.EXTENDS;
      DefinitionReferenceContainer extend = newNode("extends",
          DefinitionReferenceContainer.class, tree);
      Iterator<Tree> iter = new TreeChildIterator(tree);
      while (iter.hasNext()) {
        Tree child = iter.next();
        extend.addDefinitionReference(visitTree(child, extend,
            DefinitionReference.class));
      }
      return extend;
    }
  }

  protected class DefRefVisitor implements TreeVisitor {

    public Token getFirstToken(Tree tree) {
      return adaptor.getToken(tree.getChild(0).getChild(0));
    }

    public Token getLastToken(Tree tree) {
      // TODO Auto-generated method stub
      return null;
    }

    public Node visit(Tree tree, Node astNode) {
      assert tree.getType() == ADLParser.DEF_REF;
      DefinitionReference defRef = newNode("definition",
          DefinitionReference.class, tree);
      Iterator<Tree> iter = new TreeChildIterator(tree);

      // process name
      Tree child = iter.next();
      defRef.setName(processFQN(child));

      // process type_args and ARGS (if any)
      while (iter.hasNext()) {
        visitTree(iter.next(), defRef);
      }

      return defRef;
    }
  }

  protected class ArgVisitor implements TreeVisitor {

    public Token getFirstToken(Tree tree) {
      // TODO Auto-generated method stub
      return null;
    }

    public Token getLastToken(Tree tree) {
      // TODO Auto-generated method stub
      return null;
    }

    public Node visit(Tree tree, Node astNode) {
      assert tree.getType() == ADLParser.ARGS;
      assert astNode instanceof ArgumentContainer;
      Iterator<Tree> iter = new TreeChildIterator(tree);

      while (iter.hasNext()) {
        Tree child = iter.next();
        Argument arg = newNode("argument", Argument.class, child);
        if (child.getType() == ADLParser.ASSIGN) {
          // argumentAssignement
          arg.setName(child.getChild(0).getText());
          arg.setValue(visitTree(child.getChild(1), arg, Value.class));
        } else {
          arg.setValue(visitTree(child, arg, Value.class));
        }
        ((ArgumentContainer) astNode).addArgument(arg);
      }
      return null;
    }
  }

  protected class TypeArgVisitor implements TreeVisitor {

    public Token getFirstToken(Tree tree) {
      // TODO Auto-generated method stub
      return null;
    }

    public Token getLastToken(Tree tree) {
      // TODO Auto-generated method stub
      return null;
    }

    public Node visit(Tree tree, Node astNode) {
      assert tree.getType() == ADLParser.TYPE_ARGS;
      assert astNode instanceof TypeArgumentContainer;
      Iterator<Tree> iter = new TreeChildIterator(tree);

      while (iter.hasNext()) {
        Tree child = iter.next();
        TypeArgument arg = newNode("typeArgument", TypeArgument.class, child);
        if (child.getType() == ADLParser.ASSIGN) {
          // typeArgumentAssignement
          arg.setTypeParameterName(child.getChild(0).getText());
          Tree typeArg = child.getChild(1);
          if (typeArg.getType() != ADLParser.ANY) {
            arg.setDefinitionReference(visitTree(typeArg, arg,
                DefinitionReference.class));
          }
        } else {
          // typeArgument
          if (child.getType() != ADLParser.ANY) {
            arg.setDefinitionReference(visitTree(child, arg,
                DefinitionReference.class));
          }
        }
      }
      return null;
    }
  }

  protected class InterfaceVisitor implements TreeVisitor {

    public Token getFirstToken(Tree tree) {
      return adaptor.getToken(tree);
    }

    public Token getLastToken(Tree tree) {
      // TODO Auto-generated method stub
      return null;
    }

    public Node visit(Tree tree, Node astNode) {
      assert tree.getType() == ADLParser.PROVIDES
          || tree.getType() == ADLParser.REQUIRES;
      MindInterface itf = newNode("interface", MindInterface.class, tree);
      processAnnotations(tree, itf);
      Iterator<Tree> iter = new TreeChildIterator(tree);

      // process itf role
      if (tree.getType() == ADLParser.PROVIDES) {
        itf.setRole(TypeInterface.SERVER_ROLE);
      } else {
        itf.setRole(TypeInterface.CLIENT_ROLE);
      }

      // process optional contingency (if any)
      Tree child = iter.next();
      if (child.getType() == ADLParser.OPTIONAL) {
        itf.setContingency(TypeInterface.OPTIONAL_CONTINGENCY);
        child = iter.next();
      }

      // process signature
      itf.setSignature(processFQN(child));

      // process name
      child = iter.next();
      itf.setName(processID(child));

      // process cardinality (if any)
      if (iter.hasNext()) {
        child = iter.next();
        assert child.getType() == ADLParser.LBRACKET;
        itf.setCardinality(TypeInterface.COLLECTION_CARDINALITY);

        // process numberOfElement (if any)
        if (iter.hasNext()) {
          child = iter.next();
          assert child.getType() == ADLParser.INTEGER_LITERAL;
          itf.setNumberOfElement(child.getText());

          // should be at the end.
          assert !iter.hasNext();
        }
      }

      castNodeError(astNode, InterfaceContainer.class).addInterface(itf);
      return itf;
    }
  }

  class TreeChildIterator implements Iterator<Tree> {

    final Tree parent;
    int        i = 0;

    TreeChildIterator(Tree parent) {
      this.parent = parent;
    }

    public boolean hasNext() {
      return i < parent.getChildCount();
    }

    public Tree next() {
      if (!hasNext()) throw new NoSuchElementException();
      Tree child = parent.getChild(i);
      i++;
      return child;
    }

    public void remove() {
      if (i == 0) throw new IllegalStateException();
      parent.deleteChild(i - 1);
    }
  }
}
