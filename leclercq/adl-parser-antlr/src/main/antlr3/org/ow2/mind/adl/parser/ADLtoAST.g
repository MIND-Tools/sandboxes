tree grammar ADLtoAST;

options {
  output=AST;
  ASTLabelType=CommonTree;
  tokenVocab = ADL;
}

tokens {
  NODE_TYPE;
  ATT_NAME;
}

scope anno {
  CommonTree annos;
}

@header {
package org.ow2.mind.adl.parser;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
}

@members{

public static class SubTree extends CommonTree {
  public SubTree(int ttype, CommonTree subTree) {
    if (subTree != null) {
      if (subTree.isNil() && subTree.getChildren() != null) {
	      Iterator iter = subTree.getChildren().iterator();
	      while (iter.hasNext()) {
	        addChild((CommonTree) iter.next());
	      }
      } else {
        addChild(subTree);
      }
    }
  }

  public SubTree(int ttype, List<CommonTree> subTrees) {
    if (subTrees != null) {
      Iterator<CommonTree> iter = subTrees.iterator();
      while (iter.hasNext()) {
        addChild(iter.next());
      }
    }
  }
}

public static class MacroToken extends CommonTree {
  public MacroToken(int ttype, String text, CommonTree tree) {
    this(ttype, text, tree.getTokenStartIndex(), tree.getTokenStopIndex());
  }

  public MacroToken(int ttype, String text, CommonToken token) {
    this(ttype, text, token, token);
  }

  public MacroToken(int ttype, String text, Token startToken, Token stopToken) {
    this(ttype, text, startToken.getTokenIndex(), stopToken.getTokenIndex());
  }
  
  public MacroToken(int ttype, String text, int startIndex, int stopIndex) {
    super(new CommonToken(ttype, text));
    this.startIndex=startIndex;
    this.stopIndex=stopIndex;
  }
}

Set<String> typeParameters = new HashSet<String>();

public void addTypeParameter(Token id) {
  assert id.getType() == ID; 
  typeParameters.add(id.getText());
}

public boolean isTypeParameter(CommonTree defRef) {
  assert defRef.getType() == NODE_TYPE;
  
  if (defRef.getChildCount() != 2) return false;
  CommonTree fqn = (CommonTree) defRef.getChild(1);
  assert (fqn.getType() == FQN);
  return typeParameters.contains(fqn.getText());
}

public String extractTypeParameter(CommonTree defRef) {
  assert defRef.getType() == NODE_TYPE;
  assert defRef.getChildCount() != 2;
  CommonTree fqn = (CommonTree) defRef.getChild(1);
  assert (fqn.getType() == FQN);
  return fqn.getText();
}
}

adlFile 
  scope {List<CommonTree> imports;}
  scope anno;
  : ^(ADL a1=annotations {$anno::annos = $a1.tree;}
    {$adlFile::imports = new ArrayList<CommonTree>();} 
    (importDirective {$adlFile::imports.add($importDirective.tree);} a2=annotations {$anno::annos = $a2.tree;})* 
    architectureDefinition )
    -> architectureDefinition;

importDirective
  @init { 
    String pkgName = null; 
    String simpleName = null; 
  }
  : ^(IMPORT pkgs+=ID* name=ID ondemand=STAR?)
    {
      pkgName = "";
      simpleName = $name.getText();
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
    }
    -> ^(NODE_TYPE<MacroToken>["import", $IMPORT] 
         ATT_NAME["packageName"] ID[pkgName] 
         ATT_NAME["simpleName"] ID[simpleName]  
         AT<SubTree>[($anno.size() > 0)? $anno::annos : null]);

architectureDefinition :
  primitiveDefinition
  | typeDefinition;

// -----------------------------------------------------------------------------
// Definition prototypes grammar
// -----------------------------------------------------------------------------

typeDefinition
  : ^(TYPE fullyQualifiedName extendedTypeDefinitions? typeDefinitionBody)
    -> ^(NODE_TYPE<MacroToken>["type", $fullyQualifiedName.tree] 
         ATT_NAME["name"] fullyQualifiedName 
         extendedTypeDefinitions? 
         AT<SubTree>[($anno.size() > 0)? $anno::annos : null] 
         IMPORT<SubTree>[($adlFile.size() > 0)? $adlFile::imports : null]
         typeDefinitionBody?);

extendedTypeDefinitions 
  : ^(EXTENDS typeDefinitionReference+ )
    ->^(NODE_TYPE<MacroToken>["extends", $EXTENDS] typeDefinitionReference+ );

typeDefinitionReference 
  : ^(DEF_REF fullyQualifiedName )
    -> ^(NODE_TYPE<MacroToken>["definition", $fullyQualifiedName.tree] 
         ATT_NAME["name"] fullyQualifiedName);

typeDefinitionBody 
  : typeDefinitionElement*;

typeDefinitionElement
  scope anno;
  : annotations {$anno::annos = $annotations.tree;} 
    interfaceDefinition;

// -----------------------------------------------------------------------------

primitiveDefinition 
  @init{ String isAbstract = "false"; }
  : ^(PRIMITIVE (ABSTRACT { isAbstract="true"; }) ? 
      fullyQualifiedName formalParameterDeclarationList? 
      extendedPrimitiveDefinitions? primitiveDefinitionBody)
    -> ^(NODE_TYPE<MacroToken>["primitive", $fullyQualifiedName.tree] 
         ATT_NAME["name"] fullyQualifiedName 
         ATT_NAME["isAbstract"] ID[isAbstract]
         formalParameterDeclarationList? 
         extendedPrimitiveDefinitions? 
         AT<SubTree>[($anno.size() > 0)? $anno::annos : null] 
         IMPORT<SubTree>[($adlFile.size() > 0)? $adlFile::imports : null] 
         primitiveDefinitionBody?);

formalParameterDeclarationList 
  : ^(PARAM_DECL formalParameterDeclaration+ )
    -> formalParameterDeclaration+;

formalParameterDeclaration 
  : ID
    -> ^(NODE_TYPE<MacroToken>["parameter", $ID] 
         ATT_NAME["name"] ID);

extendedPrimitiveDefinitions 
  : ^(EXTENDS primitiveDefinitionReference+ )
    ->^(NODE_TYPE<MacroToken>["extends", $EXTENDS] primitiveDefinitionReference+ );

primitiveDefinitionReference 
  : ^(DEF_REF fullyQualifiedName argumentList? )
    -> ^(NODE_TYPE<MacroToken>["definition", $fullyQualifiedName.tree] 
         ATT_NAME["name"] fullyQualifiedName
         argumentList? );

argumentList
  : simpleArgumentList
  | argumentAssignementList;

simpleArgumentList
  : ^(ARGS argument+ )
    -> argument+;

argumentAssignementList
  : ^(ARGS argumentAssignement+ )
    -> argumentAssignement+;

argument 
  : value=(stringValue | integerValue | referenceValue | nullValue)
    -> ^(NODE_TYPE<MacroToken>["argument", $value.tree] $value);

argumentAssignement 
  : ^(ASSIGN ID value=( stringValue | integerValue | referenceValue | nullValue))
    -> ^(NODE_TYPE<MacroToken>["argument", $ID] 
         ATT_NAME["name"] ID $value);

primitiveDefinitionBody 
  : primitiveDefinitionElement*;

primitiveDefinitionElement 
  scope anno;
  : annotations {$anno::annos = $annotations.tree;} 
    (
      interfaceDefinition
      | attributeDefinition
      | dataDefinition
      | implementationDefinition
    );

// -----------------------------------------------------------------------------

compositeDefinition 
  : ^(COMPOSITE fullyQualifiedName 
      formalTypeParameterDeclarationList? formalParameterDeclarationList? 
      extendedCompositeDefinitions? compositeDefinitionBody)
    -> ^(NODE_TYPE<MacroToken>["composite", $fullyQualifiedName.tree] 
         ATT_NAME["name"] fullyQualifiedName
         formalTypeParameterDeclarationList? 
         formalParameterDeclarationList? 
         extendedCompositeDefinitions? 
         AT<SubTree>[($anno.size() > 0)? $anno::annos : null] 
         IMPORT<SubTree>[($adlFile.size() > 0)? $adlFile::imports : null] 
         compositeDefinitionBody?);

formalTypeParameterDeclarationList 
  : ^(TYPE_PARAM_DECL formalTypeParameterDeclaration+ )
    -> formalTypeParameterDeclaration+;

formalTypeParameterDeclaration 
  : ^(CONFORMSTO ID typeDefinitionReference)
    {
      addTypeParameter($ID.token);
    }
    -> ^(NODE_TYPE<MacroToken>["typeParameter", $ID] 
         ATT_NAME["name"] ID
         typeDefinitionReference);

compositeDefinitionReference 
  : ^(DEF_REF fullyQualifiedName typeArgumentList? argumentList? )
    -> ^(NODE_TYPE<MacroToken>["definition", $fullyQualifiedName.tree] 
         ATT_NAME["name"] fullyQualifiedName
         typeArgumentList? 
         argumentList? );

typeArgumentList 
  : simpleTypeArgumentList
  | typeArgumentAssignementList;

simpleTypeArgumentList 
  : ^(TYPE_ARGS typeArgument+ )
    -> typeArgument+;

typeArgumentAssignementList 
  : ^(TYPE_ARGS typeArgumentAssignement+ )
    -> typeArgumentAssignement+;

typeArgument 
  : typeParamOrDef 
    -> ^(NODE_TYPE<MacroToken>["typeArgument", $typeParamOrDef.tree]
         typeParamOrDef)
  | ANY 
    -> ^(NODE_TYPE<MacroToken>["typeArgument", $ANY]);

typeArgumentAssignement 
  : ^(ASSIGN ID 
    (
      typeParamOrDef 
      -> ^(NODE_TYPE<MacroToken>["typeArgument", $typeParamOrDef.tree]
           ATT_NAME["name"] ID 
           typeParamOrDef)
      | ANY
        -> ^(NODE_TYPE<MacroToken>["typeArgument", $ANY]
             ATT_NAME["name"] ID) 
    ));

typeParamOrDef
  : compositeDefinitionReference
    -> {isTypeParameter($compositeDefinitionReference.tree)}? 
       ATT_NAME["typeParameter"] ID[extractTypeParameter($compositeDefinitionReference.tree)]
    -> compositeDefinitionReference;
      

extendedCompositeDefinitions 
  : ^(EXTENDS compositeDefinitionReference+ )
    ->^(NODE_TYPE<MacroToken>["extends", $EXTENDS] compositeDefinitionReference+ );

compositeDefinitionBody 
  : compositeDefinitionElement*;

compositeDefinitionElement 
  scope anno;
  : annotations {$anno::annos = $annotations.tree;} 
    (
      interfaceDefinition
      | bindingDefinition
      | subComponentDefinition
    );

// -----------------------------------------------------------------------------
//  Content grammar
// -----------------------------------------------------------------------------

interfaceDefinition 
  : provideInterface
  | requireInterface;

provideInterface 
  : ^(PROVIDES OPTIONAL? fullyQualifiedName ID (collection=LBRACKET size=INTEGER_LITERAL? RBRACKET)?)
    -> {$size == null}? 
       ^(NODE_TYPE<MacroToken>["interface", $PROVIDES] 
         ATT_NAME["name"] ID
         ATT_NAME["role"] ID["server"]
         ATT_NAME["signature"] fullyQualifiedName 
         ATT_NAME["contingency"]  ID[($OPTIONAL == null)? "mandatory" : "optional"]
         ATT_NAME["cardinality"]  ID[($collection == null)? "singleton" : "collection"]
         AT<SubTree>[($anno.size() > 0)? $anno::annos : null] )
    -> ^(NODE_TYPE<MacroToken>["interface", $PROVIDES] 
         ATT_NAME["name"] ID
         ATT_NAME["role"] ID["server"]
         ATT_NAME["signature"] fullyQualifiedName 
         ATT_NAME["contingency"]  ID[($OPTIONAL == null)? "mandatory" : "optional"]
         ATT_NAME["cardinality"]  ID[($collection == null)? "singleton" : "collection"]
         ATT_NAME["numberOfElement"]  $size
         AT<SubTree>[($anno.size() > 0)? $anno::annos : null] );

requireInterface 
  : ^(REQUIRES annotations OPTIONAL? fullyQualifiedName ID (collection=LBRACKET size=INTEGER_LITERAL? RBRACKET)?)
    -> {$size == null}? 
       ^(NODE_TYPE<MacroToken>["interface", $REQUIRES]
         ATT_NAME["name"] ID
         ATT_NAME["role"] ID["client"]
         ATT_NAME["signature"] fullyQualifiedName 
         ATT_NAME["contingency"]  ID[($OPTIONAL == null)? "mandatory" : "optional"]
         ATT_NAME["cardinality"]  ID[($collection == null)? "singleton" : "collection"]
         AT<SubTree>[($anno.size() > 0)? $anno::annos : null] )
    -> ^(NODE_TYPE<MacroToken>["interface", $REQUIRES]
         ATT_NAME["name"] ID
         ATT_NAME["role"] ID["client"]
         ATT_NAME["signature"] fullyQualifiedName 
         ATT_NAME["contingency"]  ID[($OPTIONAL == null)? "mandatory" : "optional"]
         ATT_NAME["cardinality"]  ID[($collection == null)? "singleton" : "collection"]
         ATT_NAME["numberOfElement"]  $size
         AT<SubTree>[($anno.size() > 0)? $anno::annos : null] );

// -----------------------------------------------------------------------------

attributeDefinition 
  : ^(ATTRIBUTE annotations attributeType? ID (ASSIGN attributeValue)?)
    -> ^(NODE_TYPE<MacroToken>["attribute", $ATTRIBUTE]
         ATT_NAME["name"] ID 
         attributeType? 
         attributeValue?
         AT<SubTree>[($anno.size() > 0)? $anno::annos : null] );

attributeType 
  : type=(
      INT
      | STRING
      | INT8_T
      | UINT8_T
      | INT16_T
      | UINT16_T
      | INT32_T
      | UINT32_T
      | INT64_T
      | UINT64_T
      | INTPTR_T
      | UINTPTR_T
    )
    -> ATT_NAME["type"] $type;

attributeValue
  : stringValue
  | integerValue
  | referenceValue
  | nullValue;

// -----------------------------------------------------------------------------

dataDefinition 
  : ^(DATA 
    (
        path 
        -> ^(NODE_TYPE<MacroToken>["data", $DATA] 
             ATT_NAME["path"] path
             AT<SubTree>[($anno.size() > 0)? $anno::annos : null])
      | INLINED_CODE 
        -> ^(NODE_TYPE<MacroToken>["data", $DATA] 
             ATT_NAME["cCode"] INLINED_CODE
             AT<SubTree>[($anno.size() > 0)? $anno::annos : null])
    ));

implementationDefinition :
  ^(SOURCE 
    (
        path 
        -> ^(NODE_TYPE<MacroToken>["source", $SOURCE] 
             ATT_NAME["path"] path
             AT<SubTree>[($anno.size() > 0)? $anno::annos : null])
      | INLINED_CODE 
        -> ^(NODE_TYPE<MacroToken>["source", $SOURCE] 
             ATT_NAME["cCode"] INLINED_CODE
             AT<SubTree>[($anno.size() > 0)? $anno::annos : null])
    ));

path 
  @init{ String path = "";} 
  : rel=(DOT SLASH)? up+=(DOTDOT SLASH)* n1=ID n+=(SLASH ID)* DOT ext=ID
  {
    if ($rel != null) path += "./";
    if ($up != null) {
      for (int i = 0; i< $up.size(); i++) {
        path += "../";
      }
    }
    path += $n1.getText();
    
    if ($n != null) {
      for (int i = 0; i< $n.size(); i++) {
        path += ((CommonTree) $n.get(i)).getText();
      }
    }
    
    path += "." + $ext.getText();
  }
    -> ID[path];

// -----------------------------------------------------------------------------

bindingDefinition 
  : ^(BINDS fromSpec toSpec)
    -> ^(NODE_TYPE<MacroToken>["binding", $BINDS]
         fromSpec toSpec
         AT<SubTree>[($anno.size() > 0)? $anno::annos : null]);

fromSpec
  : comp=bindingComponentName itf=ID num=INTEGER_LITERAL
    -> ATT_NAME["fromComponent"] $comp 
       ATT_NAME["fromInterface"] $itf
       ATT_NAME["fromInterfaceNumber"] $num
  | comp=bindingComponentName itf=ID
    -> ATT_NAME["fromComponent"] $comp 
       ATT_NAME["fromInterface"] $itf;

toSpec
  : comp=bindingComponentName itf=ID num=INTEGER_LITERAL
    -> ATT_NAME["toComponent"] $comp 
       ATT_NAME["toInterface"] $itf
       ATT_NAME["toInterfaceNumber"] $num
  | comp=bindingComponentName itf=ID
    -> ATT_NAME["toComponent"] $comp 
       ATT_NAME["toInterface"] $itf;

bindingComponentName :
  ID
  | THIS;

// -----------------------------------------------------------------------------

subComponentDefinition 
  scope {CommonTree content;}
  @init {String typeParam = null;}
  : ^(CONTAINS 
      (
        compositeDefinitionReference
        {
          if (isTypeParameter($compositeDefinitionReference.tree))
            typeParam = extractTypeParameter($compositeDefinitionReference.tree);
          else 
            $subComponentDefinition::content=$compositeDefinitionReference.tree;
        }
      )? ID annonymousDefinition?)
    -> {typeParam != null}?
       ^(NODE_TYPE<MacroToken>["component", $ID]
         ATT_NAME["name"] ID
         ATT_NAME["typeParameter"] ID[typeParam]
         AT<SubTree>[$subComponentDefinition::content]
         AT<SubTree>[($anno.size() > 0)? $anno::annos : null])
    -> ^(NODE_TYPE<MacroToken>["component", $ID]
         ATT_NAME["name"] ID
         AT<SubTree>[$subComponentDefinition::content]
         AT<SubTree>[($anno.size() > 0)? $anno::annos : null]); 
       

annonymousDefinition 
  scope anno;
  : annotations {$anno::annos = $annotations.tree;} 
  (
    primitiveAnonymousDefinition 
      {$subComponentDefinition::content = $primitiveAnonymousDefinition.tree;}
    | compositeAnonymousDefinition 
      {$subComponentDefinition::content = $compositeAnonymousDefinition.tree;}
  );

primitiveAnonymousDefinition 
  @init {CommonTree extended = $subComponentDefinition::content;}
  : ^(PRIMITIVE primitiveDefinitionElement*)
    -> {extended != null}?
       ^(NODE_TYPE<MacroToken>["anonymousPrimitive", $PRIMITIVE]
         ^(NODE_TYPE<MacroToken>["extends", extended] AT<SubTree>[extended])
         primitiveDefinitionElement*
         AT<SubTree>[($anno.size() > 0)? $anno::annos : null])
    -> ^(NODE_TYPE<MacroToken>["anonymousPrimitive", $PRIMITIVE]
         primitiveDefinitionElement*
         AT<SubTree>[($anno.size() > 0)? $anno::annos : null]);

compositeAnonymousDefinition
  @init {CommonTree extended = $subComponentDefinition::content;}
  : ^(COMPOSITE compositeDefinitionElement*)
    -> {extended != null}?
       ^(NODE_TYPE<MacroToken>["anonymousComposite", $COMPOSITE]
         ^(NODE_TYPE<MacroToken>["extends", extended] AT<SubTree>[extended])
         compositeDefinitionElement*
         AT<SubTree>[($anno.size() > 0)? $anno::annos : null])
    -> ^(NODE_TYPE<MacroToken>["anonymousComposite", $COMPOSITE]
         compositeDefinitionElement*
         AT<SubTree>[($anno.size() > 0)? $anno::annos : null]);

// -----------------------------------------------------------------------------
//  Annotation grammar
// -----------------------------------------------------------------------------

annotations 
  : annotation*;

annotation 
  : ^(AT fullyQualifiedName annotationParameter?)
    -> ^(NODE_TYPE<MacroToken>["annotation", $fullyQualifiedName.tree] 
       ATT_NAME["type"] fullyQualifiedName 
       annotationParameter?);

annotationParameter
  : singleAnnotationValue
  | annotationValuePairs;

singleAnnotationValue :
  ^(ARGS annotationValue );

annotationValuePairs :
  ^(ARGS annotationValuePair+ );

annotationValuePair :
  ^(ASSIGN ID annotationValue);

annotationValue :
  stringValue
  | integerValue
  | booleanValue
  | annotationAnnotationValue
  | arrayAnnotationValue
  | nullValue;

annotationAnnotationValue :
  annotation;

arrayAnnotationValue :
  ^(ARRAY annotationValue+ );

// -----------------------------------------------------------------------------
//  Common grammar
// -----------------------------------------------------------------------------

fullyQualifiedName @init {String fqn = ""; Token first=null; Token last=null;} :
  ^(FQN ids+=ID+ )
  {
    if ($ids != null) {
	    Iterator iter = $ids.iterator();
	    while (iter.hasNext()) {
	      CommonTree id = (CommonTree) iter.next();
	      if (first == null) first = id.getToken();
	      last = id.getToken();
	      fqn += id.getText();
	      if (iter.hasNext()) {
	        fqn += ".";
	      }
	    }
    }
  }
    -> FQN<MacroToken>[fqn, first, last];

stringValue 
  : STRING_LITERAL
    -> ^(NODE_TYPE<MacroToken>["string", $STRING_LITERAL] 
         ATT_NAME["value"] STRING_LITERAL);

integerValue 
  @init {String intValue = null;} 
  : (
      sign=MINUS
      | sign=PLUS
    )?
    INTEGER_LITERAL
    {
      intValue = $INTEGER_LITERAL.getText();
      if ($sign != null)
        intValue = $sign.getText() + intValue;
    }
    -> ^(NODE_TYPE<MacroToken>["integer", $INTEGER_LITERAL] 
         ATT_NAME["value"] ID[intValue]);

booleanValue 
  : BOOLEAN_LITERAL
    -> ^(NODE_TYPE<MacroToken>["boolean", $BOOLEAN_LITERAL] 
         ATT_NAME["value"] BOOLEAN_LITERAL);

referenceValue 
  : ID
    -> ^(NODE_TYPE<MacroToken>["reference", $ID] 
         ATT_NAME["ref"] ID);

nullValue 
  : NULL
    -> ^(NODE_TYPE<MacroToken>["null", $NULL]);
