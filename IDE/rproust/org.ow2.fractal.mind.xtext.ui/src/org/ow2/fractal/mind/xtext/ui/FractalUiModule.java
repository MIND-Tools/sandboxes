package org.ow2.fractal.mind.xtext.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.ui.editor.syntaxcoloring.antlr.AbstractAntlrTokenToAttributeIdMapper;

/**
 * Use this class to register components to be used within the IDE.
 */
public class FractalUiModule extends org.ow2.fractal.mind.xtext.ui.AbstractFractalUiModule {
	public FractalUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	/**
	 * register syntax coloring
	 * @return class which define MIND ADL syntax coloring
	 */
	
//TODO activate once Fractal Shape from GMF editor will be accessible
//	public Class<? extends IHighlightingConfiguration> bindILexicalHighlightingConfiguration() {
//		return LexicalHighlightingConfiguration.class;
//		}
	
//	/**
//	 * register mapping tokens to IDs
//	 * @return MIND ADL tokens mapping
//	 */
//	public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindTokenToAttributeIdMapper() {
//		return AntlrTokenToAttributeIdMapper.class;
//		}
//	
	/**
	 * 
	 * @return class which define the token that will be highlighted
	 */
	public Class<? extends ISemanticHighlightingCalculator> bindSemanticHighlightingCalculator() {
		    return SemanticHighlightingCalculator.class;
		}

	
	/**
	 * 
	 * @return class which define color for ID's
	 */
//	public Class<? extends IHighlightingConfiguration> bindSemanticHighlightingConfiguration() {
//		    return SemanticHighlightingConfiguration.class;
//		}
	
}
