tree grammar ADLtoAST2;

options {
  ASTLabelType = CommonTree;
  tokenVocab   = ADL;
}

tokens {
  ATT_NAME;
}

@header {
package org.ow2.mind.adl.parser;

import java.util.Iterator;
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
import org.ow2.mind.adl.generic.ast.TypeArgument;
import org.ow2.mind.adl.generic.ast.TypeArgumentContainer;
import org.ow2.mind.adl.parameter.ast.Argument;
import org.ow2.mind.adl.parameter.ast.ArgumentContainer;
import org.ow2.mind.adl.parser.ADLParser;
import org.ow2.mind.annotation.ast.AnnotationContainer;
import org.ow2.mind.annotation.ast.AnnotationNode;
import org.ow2.mind.adl.imports.ast.Import;
import org.ow2.mind.value.ast.Value;
import org.xml.sax.SAXException;
}

@members {
private String filename;
private XMLNodeFactory nodeFactory;
private String adlDtd;

public void init(final XMLNodeFactory nodeFactory, final String adlDtd,
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
}

protected <T extends Node> T newNode(final String name,
		final Class<T> nodeClass, final Token beginToken, final Token endToken) {
	Node node;
	try {
		node = nodeFactory.newXMLNode(adlDtd, name);
	} catch (final SAXException e) {
		throw new CompilerError(GenericErrors.INTERNAL_ERROR, e,
				"Unable to create node");
	}
	setSource(node, beginToken, endToken);

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

protected void addAnnotations(List<AnnotationNode> annos, Node n) {
  AnnotationContainer container = (AnnotationContainer) n;
  for (AnnotationNode anno : annos) {
    container.addAnnotation(anno);
  }
}
}

// -----------------------------------------------------------------------------
// File level grammar
// -----------------------------------------------------------------------------

adlFile 
@init {
  List<AnnotationNode> anno;
  List<Import> imports = new ArrayList<Import>();
}
:
  a1=annotations {anno = $a1.result;}
  (
    importDirective 
    {
      addAnnotations(anno, $importDirective.result);
      imports.add($importDirective.result);
      
    }
    a2=annotations {anno = $a2.result;}
  )*
  architectureDefinition;

importDirective returns [Import result]:
  ^(IMPORT pkgs+=ID* name=ID ondemand=STAR? )
   {
     String pkgName = "";
     String simpleName = $name.getText();
     if ($pkgs != null) {
       Iterator iter = $pkgs.iterator();
       while (iter.hasNext()) {
         CommonTree pkg = (CommonTree) iter.next();
         pkgName += pkg.getText();
         if (iter.hasNext()) {
           pkgName += ".";
         }
       }
     }
     if ($ondemand != null) {
       pkgName += "." + $name.getText();
       simpleName = "*";
     }
     result = newNode("import", Import.class, $IMPORT.token, ($ondemand !=null)? $ondemand.token : $name.token);
     result.setPackageName(pkgName);
     result.setSimpleName(simpleName);
   };

architectureDefinition :
  typeDefinition;

typeDefinition : TYPE;


annotations returns [List<AnnotationNode> result = new ArrayList<AnnotationNode>()]:
   (annotation {result.add($annotation.result);})*;

annotation returns [AnnotationNode result]:
  ^(AT fullyQualifiedName)
  {
    result = newNode("annotation", AnnotationNode.class, $AT.token, null);
    result.setType($fullyQualifiedName.result);
  };

// -----------------------------------------------------------------------------
//  Common grammar
// -----------------------------------------------------------------------------

fullyQualifiedName returns [String result]:
  ^(FQN ids+=ID+ )
  {
    $result = "";
    Iterator iter = $ids.iterator();
    while (iter.hasNext()) {
      CommonTree id = (CommonTree) iter.next();
      $result += id.getText();
      if (iter.hasNext()) {
        $result += ".";
      }
    }
  }
  ;

  