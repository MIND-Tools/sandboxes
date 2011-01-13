/**
 * Copyright (C) 2009 STMicroelectronics
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
 * Authors: ali-erdem.ozcan@st.com
 * Contributors:
 */

package org.ow2.mind.doc.adl.parser;

import static org.ow2.mind.doc.ast.CommentDecoration.setComment;

import org.objectweb.fractal.adl.Node;
import org.objectweb.fractal.adl.xml.XMLNodeFactory;
import org.ow2.mind.adl.jtb.syntaxtree.Annotation;
import org.ow2.mind.adl.jtb.syntaxtree.Annotations;
import org.ow2.mind.adl.jtb.syntaxtree.AttributeDefinition;
import org.ow2.mind.adl.jtb.syntaxtree.BindingDefinition;
import org.ow2.mind.adl.jtb.syntaxtree.CompositeDefinition;
import org.ow2.mind.adl.jtb.syntaxtree.DataDefinition;
import org.ow2.mind.adl.jtb.syntaxtree.ImplementationDefinition;
import org.ow2.mind.adl.jtb.syntaxtree.InterfaceDefinition;
import org.ow2.mind.adl.jtb.syntaxtree.NodeToken;
import org.ow2.mind.adl.jtb.syntaxtree.PrimitiveDefinition;
import org.ow2.mind.adl.jtb.syntaxtree.SubComponentDefinition;
import org.ow2.mind.adl.jtb.syntaxtree.TypeDefinition;

public class JTBProcessor
    extends
      org.ow2.mind.adl.parser.JTBProcessor {

  public JTBProcessor(final XMLNodeFactory nodeFactory, final String adlDtd,
      final String filename) {
    super(nodeFactory, adlDtd, filename);
  }

  private NodeToken getCommentFromAnnotation(final Annotations annotation) {
    NodeToken commentToken = null;
    if(annotation.f0.present()) {
      commentToken = ((Annotation)annotation.f0.elementAt(0)).f0;
    }
    return commentToken;
  }

  /**
   * Gets the comment from a NodeToken.
   *
   * @param token
   * @return null if there is no comment associated to this token.
   */
  private String getComment(final NodeToken token) {
    if (token.specialTokens != null) {
      return CommentProcessor.processComment(token.getSpecialAt(0).tokenImage);
    }
    return null;
  }

  @Override
  public Node visit(final TypeDefinition n, final Node argu) {
    final Node result = super.visit(n, argu);

    NodeToken commentToken = getCommentFromAnnotation(n.f0);
    if(commentToken == null)
      commentToken = n.f1;
    setComment(result, getComment(commentToken));

    return result;
  }

  @Override
  public Node visit(final PrimitiveDefinition n, final Node argu) {
    final Node result = super.visit(n, argu);
    NodeToken commentToken = getCommentFromAnnotation(n.f0);
    if(commentToken == null) {
      if (n.f1.present()) {
        commentToken = (NodeToken) n.f1.node;
      } else {
        commentToken = n.f2;
      }
    }

    setComment(result, getComment(commentToken));
    return result;
  }

  @Override
  public Node visit(final CompositeDefinition n, final Node argu) {
    final Node result = super.visit(n, argu);

    NodeToken commentToken = getCommentFromAnnotation(n.f0);
    if(commentToken == null)
      commentToken = n.f1;
    setComment(result, getComment(commentToken));
    return result;
  }

  @Override
  public Node visit(final SubComponentDefinition n, final Node argu) {
    final Node result = super.visit(n, argu);
    NodeToken commentToken = getCommentFromAnnotation(n.f0);
    if(commentToken == null)
      commentToken = n.f1;
    setComment(result, getComment(commentToken));
    return result;
  }

  @Override
  public Node visit(final BindingDefinition n, final Node argu) {
    final Node result = super.visit(n, argu);
    NodeToken commentToken = getCommentFromAnnotation(n.f0);
    if(commentToken == null)
      commentToken = n.f1;
    setComment(result, getComment(commentToken));
    return result;
  }

  @Override
  public Node visit(final InterfaceDefinition n, final Node argu) {
    final Node result = super.visit(n, argu);
    NodeToken commentToken = getCommentFromAnnotation(n.f0);
    if(commentToken == null)
      commentToken = (NodeToken) n.f1.choice;
    setComment(result, getComment(commentToken));
    return result;
  }

  @Override
  public Node visit(final AttributeDefinition n, final Node argu) {
    final Node result = super.visit(n, argu);
    NodeToken commentToken = getCommentFromAnnotation(n.f0);
    if(commentToken == null)
      commentToken = n.f1;
    setComment(result, getComment(commentToken));
    return result;
  }

  @Override
  public Node visit(final DataDefinition n, final Node argu) {
    final Node result = super.visit(n, argu);
    NodeToken commentToken = getCommentFromAnnotation(n.f0);
    if(commentToken == null)
      commentToken = n.f1;
    setComment(result, getComment(commentToken));
    return result;
  }

  @Override
  public Node visit(final ImplementationDefinition n, final Node argu) {
    final Node result = super.visit(n, argu);
    NodeToken commentToken = getCommentFromAnnotation(n.f0);
    if(commentToken == null)
      commentToken = n.f1;
    setComment(result, getComment(commentToken));
    return result;
  }
}
