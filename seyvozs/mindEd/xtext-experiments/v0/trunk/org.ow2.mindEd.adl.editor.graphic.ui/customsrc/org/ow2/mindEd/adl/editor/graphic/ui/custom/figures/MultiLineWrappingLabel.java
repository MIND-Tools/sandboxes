package org.ow2.mindEd.adl.editor.graphic.ui.custom.figures;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.text.FlowContext;
import org.eclipse.draw2d.text.FlowPage;
import org.eclipse.draw2d.text.ParagraphTextLayout;
import org.eclipse.draw2d.text.TextFlow;
import org.eclipse.draw2d.text.TextLayout;
import org.eclipse.gmf.runtime.draw2d.ui.text.TextFlowEx;
import org.eclipse.gmf.runtime.draw2d.ui.text.TruncatedSingleLineTextLayout;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.figures.AbstractComponentNameWrappingLabel;

/**
 * This class extends WrappingLabel to create a multiline wrapping label
 * by setting TextWrap to true.
 * To be able to add a line return you also have to change the default DirectEditManager.
 * See InlineCodeCCodeCCustomEditPart for an example.
 * @author Marot Olivier
 *
 */
public class MultiLineWrappingLabel extends AbstractComponentNameWrappingLabel {

	

    // reserve 4 bits for these alignment variables
    /**
     * @see #setTextAlignment(int)
     */
    private static int FLAG_TEXT_ALIGN = Figure.MAX_FLAG << 3;

    /**
     * @see #setIconAlignment(int)
     */
    private static int FLAG_ICON_ALIGN = Figure.MAX_FLAG << 7;

    /**
     * @see #setAlignment(int)
     */
    private static int FLAG_LABEL_ALIGN = Figure.MAX_FLAG << 11;

    /**
     * @see #setTextPlacement(int)
     */
    private static int FLAG_TEXT_PLACEMENT = Figure.MAX_FLAG << 15;
	
	public MultiLineWrappingLabel (){
		createTextFigures();

        setText("");//$NON-NLS-1$

        // default flags...
        setAlignmentFlags(CENTER, FLAG_TEXT_ALIGN);
        setAlignmentFlags(CENTER, FLAG_ICON_ALIGN);
        setAlignmentFlags(TOP | LEFT, FLAG_LABEL_ALIGN);
        setPlacementFlags(EAST, FLAG_TEXT_PLACEMENT);
        setTextJustification(LEFT);

        revalidate();
        
		setTextWrap(true);
	}
	
	private void setAlignmentFlags(int alignment, int flagOffset) {
        flags &= ~(0xF * flagOffset);
        switch (alignment) {
            case CENTER:
                flags |= 0x1 * flagOffset;
                break;
            case TOP:
                flags |= 0x2 * flagOffset;
                break;
            case LEFT:
                flags |= 0x3 * flagOffset;
                break;
            case RIGHT:
                flags |= 0x4 * flagOffset;
                break;
            case BOTTOM:
                flags |= 0x5 * flagOffset;
                break;
            case TOP | LEFT:
                flags |= 0x6 * flagOffset;
                break;
            case TOP | RIGHT:
                flags |= 0x7 * flagOffset;
                break;
            case BOTTOM | LEFT:
                flags |= 0x8 * flagOffset;
                break;
            case BOTTOM | RIGHT:
                flags |= 0x9 * flagOffset;
                break;
        }
    }
	
	private void setPlacementFlags(int align, int flagOffset) {
        flags &= ~(0x7 * flagOffset);
        switch (align) {
            case EAST:
                flags |= 0x1 * flagOffset;
                break;
            case WEST:
                flags |= 0x2 * flagOffset;
                break;
            case NORTH:
                flags |= 0x3 * flagOffset;
                break;
            case SOUTH:
                flags |= 0x4 * flagOffset;
                break;
        }
    }
		
	 public Dimension getPreferredSize(int wHint, int hHint) {
	        return super.getPreferredSize(wHint, hHint);
	 }
	 
	 /**
     * the top-level flow figure
     */
    protected FlowPage flowPage;
	 
	 
	
    private void createTextFigures() {
        TextFlowEx textFlow = new TextFlowEx();
        flowPage = new FlowPage();
        flowPage.add(textFlow);
        setLayoutManager(textFlow, false);
        add(flowPage);
    }
    
    @Override
    public void setTextWrap(boolean textWrapOn) {
        if (textWrapOn != isTextWrapOn()) {
            setLayoutManager(getTextFlow(), textWrapOn);
            revalidate();
            repaint();
        }
    }
    
    protected TextFlow getTextFlow() {
        return (TextFlow) flowPage.getChildren().get(0);
    }
    
    
    private void setLayoutManager(TextFlow textFlow, boolean wrappingOn) {
        TextLayout layout;
        if (wrappingOn) {
            layout = new ParagraphTextLayout(textFlow,
                ParagraphTextLayout.WORD_WRAP_HARD);
        } else {
            layout = new TruncatedSingleLineTextLayout((TextFlowEx) textFlow,
                getTruncationString());
        }
        layout.setFlowContext((FlowContext) ((FlowPage) textFlow.getParent())
            .getLayoutManager());
        textFlow.setLayoutManager(layout);
    }
	 
	 
	 
}
