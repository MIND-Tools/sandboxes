package org.ow2.fractal.mind.xtext;

import java.util.Iterator;
import java.util.List;

import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.LeafNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.ISemanticHighlightingCalculator;

/**
 * 
 * @author Nicolas LINGOIS
 * @contributor Rémi MELISSON
 *
 */
public class SemanticHighlightingCalculator implements ISemanticHighlightingCalculator{


	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		// TODO Auto-generated method stub
		if (resource == null)
			return;
		Iterable<AbstractNode> allNodes = NodeUtil.getAllContents(resource.getParseResult().getRootNode());

		for(Iterator<AbstractNode> it = allNodes.iterator();it.hasNext();){

			AbstractNode abstractNode = (AbstractNode)it.next();
			if(abstractNode instanceof LeafNode) {
				LeafNode leafNode = (LeafNode)abstractNode;

				//coloring Data tokens 
				colorData(it, leafNode, acceptor);

				//coloring Annotations tokens
				colorAnnotations(it,leafNode, acceptor);
			}
		}				
	}


	/**
	 * color DATA in double brackets
	 * @param it iterator on all nodes of the tree
	 * @param leafNode the current leaf node to test
	 * @param acceptor the acceptor to color the token
	 */
	private void colorData(Iterator<AbstractNode> it,LeafNode leafNode,IHighlightedPositionAcceptor acceptor) {
		AbstractNode abstractNode;
		if(leafNode.getText().equals("{{")) {

			if(it.hasNext())  {
				abstractNode = (AbstractNode)it.next();
				List<LeafNode> dataNodes = abstractNode.getLeafNodes();
				for(LeafNode dataLeaf: dataNodes) {
					acceptor.addPosition(dataLeaf.getOffset(), dataLeaf.getLength(), SemanticHighlightingConfiguration.DATA_ID);
				}
			}

			//consume all tokens till the closing brackets
			while (it.hasNext()) {
				abstractNode = (AbstractNode)it.next();
				if(abstractNode instanceof LeafNode ) {
					LeafNode leaf = (LeafNode)abstractNode;
					if(leaf.getText().equals("}}")) {
						//set the iterator to the token after the closing brackets token and end the loop at this position
						it.next();
						break;
					}
				}						
			}					
		}
	}



	/**
	 * color annotations
	 * @param it iterator on all nodes of the tree
	 * @param leafNode the current leaf node to test
	 * @param acceptor the acceptor to color the token
	 */
	private void colorAnnotations(Iterator<AbstractNode> it,LeafNode leafNode,IHighlightedPositionAcceptor acceptor) {
		if(leafNode.getText().equals("@")) {
			if(it.hasNext())  {
				List<LeafNode> AnnotationNodes = leafNode.getParent().getLeafNodes();
				for(LeafNode annotNode: AnnotationNodes) {
					acceptor.addPosition(annotNode.getOffset(), annotNode.getLength(), SemanticHighlightingConfiguration.ANNOTATIONS_ID);
				}
			}
		}
	}

}
