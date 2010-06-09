tree grammar YATL2Java;

options {
  output       = template;
  backtrack = true;
  ASTLabelType = CommonTree;
  tokenVocab   = YATL;
}


scope qualifiers {
  String separator;
  String nullValue;
}


@header {
package org.ow2.mind.yatl;

import java.util.Set;
}

@members {
List<String> errors = new ArrayList<String>();

public String formatError(RecognitionException e) {
  return getErrorHeader(e) + " " + getErrorMessage(e, tokenNames);
}

public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
  errors.add(formatError(e));
}
}
// -----------------------------------------------------------------------------
//  Top-level grammar
// -----------------------------------------------------------------------------

templateFile :
  ^(TEMPLATE_FILE imports+=importDirective* pkg=packageDirective? tmplClasses+=templateClass+ )
    ->templateFile(imports={$imports}, pkg={$pkg.st}, tmplClasses={$tmplClasses});

importDirective :
  ^(IMPORT STATIC? pkgs+=ID* name=ID ondemand=STAR? )
    ->inlinedCode(code={$importDirective.text});

packageDirective :
  ^(PACKAGE fullyQualifiedName )
    ->packageDirective(fqn={$fullyQualifiedName.st});

templateClass :
  ^(
    CLASS q+=qualifier* ID
    (
      EXTENDS ext=type
    )?
    (
      IMPLEMENTS impls+=type+
    )?
    content+=templateClassBody*
    )
    ->templateClass(name={$ID.text}, qualifiers={$q}, ext={$ext.st}, impls={$impls}, content={$content});

templateClassBody :
  memberDeclaration
    ->{$memberDeclaration.st}
  | template
    ->{$template.st};

memberDeclaration :
  ^(MEMBER .*)
    -> inlinedCode(code={$memberDeclaration.text});

type :
  ^(ID genericSpecifierList? (ID genericSpecifierList?)* (LBRACKET RBRACKET)*)
    ->inlinedCode(code={$type.text});

genericSpecifierList :
  ^(LT genericSpecifier+);

genericSpecifier :
  type
  | QUESTION
  (
    (
      EXTENDS
      | SUPER
    )
    type
  )?;

declarator returns [String name]:
  ^(DECL ID type) {$declarator.name=$ID.text;}
    ->inlinedCode(code={$declarator.text});

qualifier :
  PRIVATE -> {%{"private "}}
  | PROTECTED -> {%{"protected "}}
  | PUBLIC -> {%{"public "}}
  | STATIC -> {%{"static "}}
  | FINAL -> {%{"final "}}
  | SYNCHRONIZED -> {%{"synchronized "}};

// -----------------------------------------------------------------------------
//  Template grammar
// -----------------------------------------------------------------------------

template :
  ^(TEMPLATE templatePrototype content+=templateBody* )
    ->templateMethod(proto={$templatePrototype.st}, content={$content});

templatePrototype 
@init {
  List params = new ArrayList();
  List paramNames = new ArrayList();
}:
  ^(ID q+=qualifier* (declarator{params.add($declarator.st);
                   paramNames.add($declarator.name);})* )
    ->templateProto(name={$ID.text}, qualifiers={$q}, params={params}, paramNames={paramNames});

templateBody
@init {
  String s = "";
} :
  INLINED_CODE
    ->inlinedCode(code={$INLINED_CODE.text.substring(2, $INLINED_CODE.text.length()-2)})
  | templateExpr
    ->inlinedCode(code={$templateExpr.st})
  | (STRING{s+=StringHelper.escapeString($STRING.text);})+
    ->appendString(s={s});

templateExpr :
  simpleExpr
    ->{$simpleExpr.st}
  | iterableExpr
    ->{$iterableExpr.st}
  | questionExpr
    ->{$questionExpr.st}
  | callExpr
    ->{$callExpr.st};

simpleExpr 
  scope qualifiers; 
  : ^(SIMPLE_EXPR expr exprQualifier*)
    ->appendExpr(s={$expr.st}, nullValue={$qualifiers::nullValue});

iterableExpr 
  scope qualifiers;
  : ^(ITERABLE_EXPR declarator e1=expr e2=innerExpr exprQualifier*)
    ->appendForEach(decl={$declarator.st}, iterable={$e1.st}, iteration={$e2.st}, separator={$qualifiers::separator}, nullValue={$qualifiers::nullValue});

innerExpr :
  anonymousTemplate 
  | templateExpr;

anonymousTemplate :
  ^(TEMPLATE content+=templateBody*)
   ->inlinedCode(code={$content});

questionExpr
  scope qualifiers;
  : ^(QUESTION_EXPR e1=expr e2=innerExpr e3=innerExpr? exprQualifier*)
    ->appendQuestion(test={$e1.st}, then_={$e2.st}, else_={$e3.st}, nullValue={$qualifiers::nullValue});

callExpr :
  ^(CALL_EXPR ID expr? )
    ->callTemplate(name={$ID.text}, params={$expr.st});

exprQualifier :
  ^(SEPARATOR STRING_LITERAL)
    {$qualifiers::separator=$STRING_LITERAL.text;}
  | ^(NULL STRING_LITERAL)
    {$qualifiers::nullValue=$STRING_LITERAL.text;};

expr :
  ^(LPAREN e1=expr? RPAREN e2=expr?)
    ->parentExpr(e1={$e1.st}, e2={$e2.st})
  | ^(LT e1=expr? GT e2=expr?)
    ->ltExpr(e1={$e1.st}, e2={$e2.st})
  | ^(EXPR anyExpr e2=expr?)
    ->expr(e1={$anyExpr.st}, e2={$e2.st});

anyExpr :
  ~(
    LPAREN
    | LT
    | RPAREN
    | GT
    | DASH
   )
 ->inlinedCode(code={$anyExpr.text});

// -----------------------------------------------------------------------------
//  Tokens
// -----------------------------------------------------------------------------

fullyQualifiedName :
  ^(FQN ids+=ID+ )
    ->fullyQualifiedName(ids={$ids});
