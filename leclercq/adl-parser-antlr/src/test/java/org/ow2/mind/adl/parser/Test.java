
package org.ow2.mind.adl.parser;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;
import org.objectweb.fractal.adl.Node;
import org.objectweb.fractal.adl.error.NodeErrorLocator;
import org.objectweb.fractal.adl.xml.XMLNode;
import org.objectweb.fractal.adl.xml.XMLNodeFactory;
import org.objectweb.fractal.adl.xml.XMLNodeFactoryImpl;
import org.ow2.mind.adl.parser.ADLParser.adlFile_return;
import org.xml.sax.SAXException;

public class Test {

  static XMLNodeFactory         xmlNodeFactory = new XMLNodeFactoryImpl();
  protected static final String DTD            = "classpath://org/ow2/mind/adl/mind_v1.dtd";

  /**
   * @param args
   * @throws Exception
   */
  public static void main(String[] args) throws Exception {

    try {
      ADLLexer lex = new ADLLexer(new ANTLRFileStream(args[0]));
      CommonTokenStream tokens = new CommonTokenStream(lex);
      ADLParser parser = new ADLParser(tokens);
      parser.setTreeAdaptor(new CommonTreeAdaptor() {
        @Override
        public Object errorNode(TokenStream input, Token start, Token stop,
            RecognitionException e) {
          return null;
        }
      });
      adlFile_return adlFile = parser.adlFile();

      System.out.println("tree1=" + ((Tree) adlFile.tree).toStringTree());
      CommonTreeNodeStream nodes = new CommonTreeNodeStream(adlFile.tree);
      nodes.setTokenStream(tokens);
      ADLtoAST adlToAST = new ADLtoAST(nodes);
      org.ow2.mind.adl.parser.ADLtoAST.adlFile_return adlFile2 = adlToAST
          .adlFile();

      System.out.println("tree2=" + ((Tree) adlFile2.tree).toStringTree());
      adlFile2.tree.setUnknownTokenBoundaries();
      Node n = toASTNode(adlFile2.tree, tokens);
      System.out.println("AST=" + toStringAST(n));

    } catch (RecognitionException e) {
      e.printStackTrace();
    }
  }

  static Node toASTNode(Tree t, TokenStream ts) throws Exception {
    String nodeType = t.getText();
    Node node = xmlNodeFactory.newXMLNode(DTD, nodeType);
    Token startToken = (t.getTokenStartIndex() >=0) ? ts.get(t.getTokenStartIndex()) : null;
    Token stopToken = (t.getTokenStopIndex() >= 0 ) ? ts.get(t.getTokenStopIndex()) : null;
    if (startToken == null || stopToken == null) {
      System.err.println("Warning unknown line info for tree \""
          + t.toStringTree() + "\"");
    } else {
      node.astSetSource(NodeErrorLocator.fullLocation("<input>", startToken
          .getLine(), stopToken.getLine(), startToken.getCharPositionInLine()+1,
          stopToken.getCharPositionInLine() + stopToken.getText().length()));
    }

    Map<String, String> nodeAttr = new HashMap<String, String>();
    int i;
    for (i = 0; i < t.getChildCount(); i++) {
      Tree child = t.getChild(i);
      if (child.getType() != ADLtoAST.ATT_NAME) break;
      Tree attrValue = t.getChild(++i);
      nodeAttr.put(child.getText(), attrValue.getText());
    }

    node.astSetAttributes(nodeAttr);

    for (; i < t.getChildCount(); i++) {
      node.astAddNode(toASTNode(t.getChild(i), ts));
    }

    return node;
  }

  static String toStringAST(Node n) {
    StringBuilder sb = new StringBuilder();
    toStringAST(n, "", sb);
    return sb.toString();
  }

  static void toStringAST(Node n, String indent, StringBuilder sb) {
    sb.append(indent).append("<").append(n.astGetType()).append(" ").append(
        n.astGetSource());
    Map<String, String> attributes = n.astGetAttributes();
    for (Map.Entry<String, String> attr : attributes.entrySet()) {
      if (attr.getValue() != null)
        sb.append(" ").append(attr.getKey()).append("=\"").append(
            attr.getValue()).append("\"");
    }
    boolean hasSubNodes = false;
    for (String subNodeType : n.astGetNodeTypes()) {
      for (Node subNode : n.astGetNodes(subNodeType)) {
        if (subNode == null) continue;

        if (!hasSubNodes) {
          hasSubNodes = true;
          sb.append(">\n");
        }
        toStringAST(subNode, indent + "  ", sb);
      }
    }

    if (hasSubNodes)
      sb.append(indent).append("</").append(n.astGetType()).append(">\n");
    else
      sb.append("/>\n");

  }

}
