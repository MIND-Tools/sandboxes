
package org.ow2.mind.adl.parser;

import java.util.Map;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.Tree;
import org.objectweb.fractal.adl.Definition;
import org.objectweb.fractal.adl.Node;
import org.objectweb.fractal.adl.xml.XMLNodeFactory;
import org.objectweb.fractal.adl.xml.XMLNodeFactoryImpl;
import org.ow2.adl.parser.ToASTVisitor;
import org.ow2.mind.adl.parser.ADLParser.adlFile_return;
import org.testng.annotations.Test;

public class Test1 {

  static XMLNodeFactory         xmlNodeFactory = new XMLNodeFactoryImpl();
  protected static final String DTD            = "classpath://org/ow2/mind/adl/mind_v1.dtd";

  @Test
  public void test1() throws Exception {

    ADLLexer lex = new ADLLexer(new ANTLRInputStream(this.getClass()
        .getClassLoader().getResourceAsStream("test.adl")));
    CommonTokenStream tokens = new CommonTokenStream(lex);
    ADLParser parser = new ADLParser(tokens);
    adlFile_return adlFile = parser.adlFile();
    System.out.println("tree1=" + ((Tree) adlFile.tree).toStringTree());

    ToASTVisitor visitor = new ToASTVisitor(xmlNodeFactory, DTD, "inputFile");
    Definition d = visitor.toDefinition((Tree) adlFile.tree);
    System.out.println("AST=" + toStringAST(d));
  }

   String toStringAST(Node n) {
    StringBuilder sb = new StringBuilder();
    toStringAST(n, "", sb);
    return sb.toString();
  }

   void toStringAST(Node n, String indent, StringBuilder sb) {
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
