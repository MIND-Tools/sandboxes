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

package org.ow2.mind.yatl;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.AngleBracketTemplateLexer;
import org.ow2.mind.yatl.YATLParser.templateFile_return;

import antlr.debug.ParserEventSupport;

public class YATL2JavaCompiler {

  StringTemplateGroup stg;

  public YATL2JavaCompiler() {
    InputStream templateGroup = getClass().getClassLoader()
        .getResourceAsStream("YATL2JavaTemplates.stg");
    if (templateGroup == null) {
      throw new Error("Can't find template group");
    }
    stg = new StringTemplateGroup(new InputStreamReader(templateGroup),
        AngleBracketTemplateLexer.class);
  }

  public String yatl2Java(File inputFile) throws ParseException, IOException {
    return yatl2Java(new ANTLRFileStream(inputFile.getPath()));
  }

  public String yatl2Java(String inputContent) throws ParseException {
    return yatl2Java(new ANTLRStringStream(inputContent));
  }

  public String yatl2Java(ANTLRStringStream input) throws ParseException {
    YATLLexer lex = new YATLLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lex);
    YATLParser parser = new YATLParser(tokens);
// parser.setTreeAdaptor(new CommonTreeAdaptor() {
// @Override
// public Object errorNode(TokenStream input, Token start, Token stop,
// RecognitionException e) {
// return null;
// }
// });
    templateFile_return templateFile;
    try {
      templateFile = parser.templateFile();
    } catch (RecognitionException e) {
      throw new ParseException(parser.formatError(e), e);
    }

    if (!parser.errors.isEmpty()) {
      // error detected
      throw new ParseException(parser.errors);
    }
    //System.out.println("tree1=" + ((Tree) templateFile.tree).toStringTree());
    CommonTreeNodeStream nodes = new CommonTreeNodeStream(templateFile.tree);
    nodes.setTokenStream(tokens);
    YATL2Java yatl2Java = new YATL2Java(nodes);
    yatl2Java.setTemplateLib(stg);
    YATL2Java.templateFile_return templateFile2;
    try {
      templateFile2 = yatl2Java.templateFile();
    } catch (RecognitionException e) {
      throw new ParseException(yatl2Java.formatError(e), e);
    }
    if (!yatl2Java.errors.isEmpty()) {
      // error detected
      throw new ParseException(yatl2Java.errors);
    }
    return templateFile2.st.toString();
  }

}
