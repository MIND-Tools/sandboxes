package org.ow2.mindEd.adl.textual.ui;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.impl.TerminalRuleImpl;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.impl.HiddenLeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.ow2.mindEd.adl.Annotation;
import org.ow2.mindEd.adl.DataDefinition;
import org.ow2.mindEd.adl.InlineCodeC;

/**
 * 
 * @author Nicolas LINGOIS
 * @contributor Rémi MELISSON
 * @contributor Damien Fournier
 */

public class SemanticHighlightingCalculator implements
ISemanticHighlightingCalculator {

	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {

		if (resource == null || acceptor == null
				|| resource.getParseResult() == null)
			return;

		INode rootNode = resource.getParseResult().getRootNode();
		Iterable<INode> allNodes = rootNode.getAsTreeIterable();
		Iterator<INode> it = allNodes.iterator();

		while (it.hasNext()) {

			// SSZ
			
			INode node = (INode) it.next();
			if (node instanceof ILeafNode && !(node instanceof HiddenLeafNode) ) {
				EObject nodeSemanticElement = node.getSemanticElement();

				if (nodeSemanticElement instanceof DataDefinition) {
					// node is "data"
					// TODO ?
				} else if (nodeSemanticElement instanceof Annotation) {
					// node is "@"

					// first color the @
					acceptor.addPosition(node.getOffset(), node.getLength(), SemanticHighlightingConfiguration.ANNOTATIONS_ID);
					
					/*
					// now we want what follows the "@"
					INode nextNode = skipWhiteSpace(acceptor, it);
					Iterable<ILeafNode> dataNodes = nextNode.getLeafNodes();
					for (ILeafNode dataLeaf : dataNodes) {
						acceptor.addPosition(dataLeaf.getOffset(), dataLeaf.getLength(), SemanticHighlightingConfiguration.ANNOTATIONS_ID);
					}
					*/
					
				} else if (nodeSemanticElement instanceof InlineCodeC) {
					// node is "{{ ... }}"
					Iterable<ILeafNode> dataNodes = node.getLeafNodes();
					for (ILeafNode dataLeaf : dataNodes) {
						acceptor.addPosition(dataLeaf.getOffset(), dataLeaf.getLength(), SemanticHighlightingConfiguration.DATA_ID);
					}
				}

				// coloring Data tokens
				//colorData(it, leafNode, acceptor);

				// coloring Annotations tokens
				//colorAnnotations(it, leafNode, acceptor);
			}
		}
	}

	INode skipWhiteSpace( IHighlightedPositionAcceptor acceptor, Iterator<INode> it ) {
		INode n = null;
		while ( it.hasNext() && (( n = it.next() ) instanceof HiddenLeafNode))
			processHiddenNode( acceptor, (HiddenLeafNode)n );
		return n;
	}

	void processHiddenNode( IHighlightedPositionAcceptor acceptor, HiddenLeafNode node ) {
		if( node.getGrammarElement() instanceof TerminalRuleImpl )
		{
			TerminalRuleImpl ge = (TerminalRuleImpl) node.getGrammarElement();
			// TODO ? What could it be ?
		}
 
	}
	
	/**
	 * color DATA in double brackets
	 * 
	 * @param it
	 *            iterator on all nodes of the tree
	 * @param leafNode
	 *            the current leaf node to test
	 * @param acceptor
	 *            the acceptor to color the token
	 */
	private void colorData(Iterator<INode> it, ILeafNode leafNode,
			IHighlightedPositionAcceptor acceptor) {
		INode abstractNode;
		if (leafNode.getText().equals("{{")) {

			if (it.hasNext()) {
				abstractNode = (INode) it.next();
				Iterable<ILeafNode> dataNodes = abstractNode.getLeafNodes();
				for (ILeafNode dataLeaf : dataNodes) {
					acceptor.addPosition(dataLeaf.getOffset(), dataLeaf
							.getLength(),
							SemanticHighlightingConfiguration.DATA_ID);
				}
			}

			// consume all tokens till the closing brackets
			while (it.hasNext()) {
				abstractNode = (INode) it.next();
				if (abstractNode instanceof ILeafNode) {
					ILeafNode leaf = (ILeafNode) abstractNode;
					if (leaf.getText().equals("}}")) {
						// set the iterator to the token after the closing
						// brackets token and end the loop at this position
						it.next();
						break;
					}
				}
			}
		}
	}

	/**
	 * color annotations
	 * 
	 * @param it
	 *            iterator on all nodes of the tree
	 * @param leafNode
	 *            the current leaf node to test
	 * @param acceptor
	 *            the acceptor to color the token
	 */
	private void colorAnnotations(Iterator<INode> it, ILeafNode leafNode,
			IHighlightedPositionAcceptor acceptor) {
		if (leafNode.getText().equals("@")) {
			if (it.hasNext()) {
				Iterable<ILeafNode> AnnotationNodes = leafNode.getParent()
				.getLeafNodes();
				for (ILeafNode annotNode : AnnotationNodes) {
					acceptor.addPosition(annotNode.getOffset(), annotNode
							.getLength(),
							SemanticHighlightingConfiguration.ANNOTATIONS_ID);
				}
			}
		}
	}

}
