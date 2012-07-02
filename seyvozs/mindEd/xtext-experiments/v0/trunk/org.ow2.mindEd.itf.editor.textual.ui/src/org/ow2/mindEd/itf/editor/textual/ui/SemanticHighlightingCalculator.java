package org.ow2.mindEd.itf.editor.textual.ui;

import java.util.Iterator;
import java.util.List;

import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

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

		for (Iterator<INode> it = allNodes.iterator(); it.hasNext();) {

			INode abstractNode = (INode) it.next();
			if (abstractNode instanceof ILeafNode) {

				ILeafNode leafNode = (ILeafNode) abstractNode;

				// coloring Annotations tokens
				colorAnnotations(it, leafNode, acceptor);
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

				INode abstractNode = it.next();

				if (abstractNode instanceof ICompositeNode) {
					ICompositeNode compositeNode = (ICompositeNode) abstractNode;


					acceptor.addPosition(leafNode.getOffset(), compositeNode
							.getTotalLength()+1,
							SemanticHighlightingConfiguration.ANNOTATIONS_ID);
				}

				// List<LeafNode> AnnotationNodes = leafNode.getParent()
				// .getLeafNodes();
				// for (LeafNode annotNode : AnnotationNodes) {
				// acceptor.addPosition(annotNode.getOffset(), annotNode
				// .getLength(),
				// SemanticHighlightingConfiguration.ANNOTATIONS_ID);
				// }
			}
		}
	}

}
