/******************************************************************************
 * Copyright (c) 2005, 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package org.ow2.mindEd.adl.editor.graphic.ui.custom.layouts;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.figures.LayoutHelper;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.MapModeUtil;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.jface.util.Assert;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.figures.InterfaceDefinitionShape;

/**
 * Layout for interfaces. Keep interfaces on the border of the components
 * @author Yann Davin
 *
 */
@SuppressWarnings("deprecation")
public class InterfaceBorderItemLocator
	implements IBorderItemLocator {
	static final int INTERFACE_IMAGE_WIDTH = 15;
	
	/** the figure around which this border item appears */
	private IFigure parentFigure = null;

	private Rectangle constraint = new Rectangle(0, 0, 0, 0);

	private Dimension borderItemOffset = new Dimension(1, 1);

	private int preferredSide = PositionConstants.WEST;

	private int currentSide = PositionConstants.WEST;
	
	public static int EAST_OR_WEST = 20;

	private int nbInterfaces = 0;
	/**
	 * Accessor to return the constraint location of the border item.
	 * 
	 * @return the constraint
	 */
	protected Rectangle getConstraint() {
		return constraint;
	}

	
	/**
	 * The preferred side determines placement of figure.
	 * 
	 * @param parentFigure
	 */
	public InterfaceBorderItemLocator(IFigure parentFigure) {
		Assert.isNotNull(parentFigure);
		this.parentFigure = parentFigure;
	}

	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator#resetPosition(org.eclipse.draw2d.geometry.Rectangle)
	 */
	public void setConstraint(Rectangle theConstraint) {
		this.constraint = theConstraint;

		if (theConstraint.getTopLeft().x == 0
			|| theConstraint.getTopLeft().y == 0) {
			setCurrentSideOfParent(getPreferredSideOfParent());
		}
		getParentFigure().revalidate();
	}

	/**
	 * Get the preferred location. If none has been previously set, use the
	 * preferred side to take an initial guess.
	 * 
	 * @return point
	 */
	protected Point getPreferredLocation(IFigure borderItem) {
		int side = PositionConstants.EAST;	
		
		if(borderItem.getChildren().get(0) != null && borderItem.getChildren().get(0) instanceof InterfaceDefinitionShape){
			InterfaceDefinitionShape interfaceShape = (InterfaceDefinitionShape)borderItem.getChildren().get(0);
			if(interfaceShape.getRole() == InterfaceDefinitionShape.Role.REQUIRES){
				side = PositionConstants.EAST;
			}else{
				side = PositionConstants.WEST;
			}
		}
		
		return getPreferredLocation(side, borderItem);
	}

	/**
	 * Utility to calculate the parent bounds with consideration for the handle
	 * bounds inset.
	 * 
	 * @return <code>Rectangle</code> that is the bounds of the parent.
	 */
	protected Rectangle getParentBorder() {
		Rectangle bounds = getParentFigure().getBounds().getCopy();
		if (getParentFigure() instanceof NodeFigure) {
			bounds = ((NodeFigure) getParentFigure()).getHandleBounds()
				.getCopy();
		}
		return bounds;
	}

	/**
	 * Get an initial location based on the side. ( choose middle of the side )
	 * 
	 * @param side
	 *            the preferred side of the parent figure on which to place this
	 *            border item as defined in {@link PositionConstants}
	 * @return point
	 */
	protected Point getPreferredLocation(int side, IFigure borderItem) {
		Rectangle bounds = getParentBorder();
		int parentFigureWidth = bounds.width;
		int parentFigureHeight = bounds.height;
		int parentFigureX = bounds.x;
		int parentFigureY = bounds.y;
		int x = parentFigureX;
		int y = parentFigureY;
		int vertical_gap = MapModeUtil.getMapMode(getParentFigure()).DPtoLP(5);
		
		Dimension borderItemSize = getSize(borderItem);
		if(side == PositionConstants.WEST){
			borderItem.repaint();
			borderItem.getLayoutManager().layout(borderItem);
			x = parentFigureX - borderItemSize.width
			- getBorderItemOffset().width;
			//WrappingLabel wrappingLabel = ((WrappingLabel)((InterfaceFigure)borderItem.getChildren().get(0)).getChildren().get(0));
		//	x = parentFigureX - wrappingLabel.getTextBounds().width - INTERFACE_IMAGE_WIDTH;
		}else{
			x = parentFigureX  + parentFigureWidth;
		}
		y = parentFigureY;
		
		Point recommendedLocation = new Point(x, y);
		
		IFigure itf = null;
		
		Point constraintLocation = getConstraint().getLocation();
		Point ptAbsoluteLocation = this.getAbsoluteToBorder(constraintLocation);
		recommendedLocation = new Point(ptAbsoluteLocation);
		recommendedLocation.x = x;
		
		return setInterfacePosition(borderItem, (IFigure)borderItem.getChildren().get(0), recommendedLocation);
	}
	
	private Point setInterfacePosition(IFigure borderItem, IFigure interface_, Point wantedPosition){
		int parentFigureHeight = getParentBorder().height;
		int parentY = getParentBorder().y;
		
		IFigure existingInterface = getExistingInterface(wantedPosition, borderItem);
		Point returnPosition = new Point(wantedPosition);
		
		List interfaces = borderItem.getParent().getChildren();
		int nbInterfaces = interfaces.size() + 1;
		
		int verticalStep = parentFigureHeight/nbInterfaces;
		if(returnPosition.y > parentY + parentFigureHeight){
			returnPosition.y = parentY + parentFigureHeight;
		}else if(existingInterface != null && (IFigure)existingInterface.getChildren().get(0) != interface_){
			returnPosition.y += verticalStep;
			returnPosition =  setInterfacePosition(borderItem,interface_,returnPosition);
		}else{
			
		}
		
		return returnPosition;
	}
	/**
	 * Ensure the suggested location actually lies on the parent boundary. The
	 * side takes precedence.
	 * 
	 * @param suggestedLocation
	 * @param suggestedSide
	 * @return point
	 */
	private Point locateOnParent(Point suggestedLocation,
			int suggestedSide, IFigure borderItem) {
		Rectangle bounds = getParentBorder();
		int parentFigureWidth = bounds.width;
		int parentFigureHeight = bounds.height;
		int parentFigureX = bounds.x;
		int parentFigureY = bounds.y;
		Dimension borderItemSize = getSize(borderItem);
		int newX = suggestedLocation.x;
		int newY = suggestedLocation.y;
		int westX = parentFigureX - borderItemSize.width
			+ getBorderItemOffset().width;
		int eastX = parentFigureX + parentFigureWidth
			- getBorderItemOffset().width;
		int southY = parentFigureY + parentFigureHeight
			- getBorderItemOffset().height;
		int northY = parentFigureY - borderItemSize.height
			+ getBorderItemOffset().height;
		
		// Both sides are allowed, find the closest one
		if (suggestedSide == EAST_OR_WEST) {
			int westRange = Math.abs(suggestedLocation.x - westX);
			int eastRange = Math.abs(suggestedLocation.x - eastX);
			if (eastRange > westRange) {
				// Border item is closer to west
				suggestedSide = PositionConstants.WEST;
			}
			else {
				// Border item is closer to east
				suggestedSide = PositionConstants.EAST;
			}
		} 
		// Basic behaviour
		if (suggestedSide == PositionConstants.WEST) {
			if (suggestedLocation.x != westX) {
				newX = westX;
			}
			if (suggestedLocation.y < bounds.getTopLeft().y) {
				newY = northY + borderItemSize.height;
			} else if (suggestedLocation.y > bounds.getBottomLeft().y
				- borderItemSize.height) {
				newY = southY - borderItemSize.height;
			}
		} else if (suggestedSide == PositionConstants.EAST) {
			if (suggestedLocation.x != eastX) {
				newX = eastX;
			}
			if (suggestedLocation.y < bounds.getTopLeft().y) {
				newY = northY + borderItemSize.height;
			} else if (suggestedLocation.y > bounds.getBottomLeft().y
				- borderItemSize.height) {
				newY = southY - borderItemSize.height;
			}
		} else if (suggestedSide == PositionConstants.SOUTH) {
			if (suggestedLocation.y != southY) {
				newY = southY;
			}
			if (suggestedLocation.x < bounds.getBottomLeft().x) {
				newX = westX + borderItemSize.width;
			} else if (suggestedLocation.x > bounds.getBottomRight().x
				- borderItemSize.width) {
				newX = eastX - borderItemSize.width;
			}
		} else if (suggestedSide == PositionConstants.NORTH) {
			if (suggestedLocation.y != northY) {
				newY = northY;
			}
			if (suggestedLocation.x < bounds.getBottomLeft().x) {
				newX = westX + borderItemSize.width;
			} else if (suggestedLocation.x > bounds.getBottomRight().x
				- borderItemSize.width) {
				newX = eastX - borderItemSize.width;
			}
		}
		return new Point(newX, newY);
	}

	/**
	 * Determine if the the given point conflicts with the position of an
	 * existing borderItemFigure.
	 * 
	 * @param recommendedLocation
	 * @return <code>ture</code> or <code>false</code>
	 */
	private boolean conflicts(Point recommendedLocation,
			IFigure targetBorderItem) {
		Rectangle recommendedRect = new Rectangle(recommendedLocation,
			targetBorderItem.getSize());
		List borderItems = targetBorderItem.getParent().getChildren();
        
        // Only check those border items that would have already been
        // relocated. See Bugzilla#214799.
        int currentIndex = borderItems.indexOf(targetBorderItem);
        for (int i = 0; i < currentIndex; i++) {
            IFigure borderItem = (IFigure) borderItems.get(i);
			if (borderItem.isVisible()) {
				Rectangle rect = borderItem.getBounds().getCopy();
				if (rect.intersects(recommendedRect)) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Determine if the the given point conflicts with the position of an
	 * existing borderItemFigure.
	 * 
	 * @param recommendedLocation
	 * @return <code>ture</code> or <code>false</code>
	 */
	private IFigure getExistingInterface(Point recommendedLocation,
			IFigure targetBorderItem) {
		Rectangle recommendedRect = new Rectangle(recommendedLocation,
			targetBorderItem.getSize());
		List borderItems = targetBorderItem.getParent().getChildren();
        
        // Only check those border items that would have already been
        // relocated. See Bugzilla#214799.
        int currentIndex = borderItems.size();
        for (int i = 0; i < currentIndex; i++) {
            IFigure borderItem = (IFigure) borderItems.get(i);
			if (borderItem.isVisible()) {
				Rectangle rect = borderItem.getBounds().getCopy();
				if (rect.intersects(recommendedRect)) {
					return borderItem;
				}
			}
		}
		return null;
	}
	
	/**
	 * Convert the relative coords in the model to ones that are Relative to the
	 * container (absolute in respect to the main figure)
	 * 
	 * @param ptRelativeOffset
	 * @return point
	 */
	protected Point getAbsoluteToBorder(Point ptRelativeOffset) {
		Point parentOrigin = getParentBorder().getTopLeft();
		return parentOrigin.translate(ptRelativeOffset);
	}
	
	/**
	 * The preferred side takes precedence.
	 * 
	 * @param suggestedLocation
	 * @param suggestedSide
	 * @param circuitCount
	 *            recursion count to avoid an infinite loop
	 * @return point
	 */
	private Point locateOnBorder(Point suggestedLocation,
			int suggestedSide, int circuitCount, IFigure borderItem) {
		Point recommendedLocation = locateOnParent(suggestedLocation,
			suggestedSide, borderItem);

		int vertical_gap = MapModeUtil.getMapMode(getParentFigure()).DPtoLP(8);
		int horizontal_gap = MapModeUtil.getMapMode(getParentFigure())
			.DPtoLP(8);
		Dimension borderItemSize = getSize(borderItem);

		if (circuitCount < 4 && conflicts(recommendedLocation, borderItem)) {
			if (suggestedSide == PositionConstants.WEST) {
				do {
					recommendedLocation.y += borderItemSize.height
						+ vertical_gap;
				} while (conflicts(recommendedLocation, borderItem));
				if (recommendedLocation.y > getParentBorder().getBottomLeft().y
					- borderItemSize.height) { // off the bottom,
					// wrap south
					return locateOnBorder(recommendedLocation,
						PositionConstants.SOUTH, circuitCount + 1, borderItem);
				}
			} else if (suggestedSide == PositionConstants.SOUTH) {
				do {
					recommendedLocation.x += borderItemSize.width
						+ horizontal_gap;
				} while (conflicts(recommendedLocation, borderItem));
				if (recommendedLocation.x > getParentBorder().getBottomRight().x
					- borderItemSize.width) {
					return locateOnBorder(recommendedLocation,
						PositionConstants.EAST, circuitCount + 1, borderItem);
				}
			} else if (suggestedSide == PositionConstants.EAST) {
				// move up the east side
				do {
					recommendedLocation.y += (borderItemSize.height + vertical_gap);
				} while (conflicts(recommendedLocation, borderItem));
				if (recommendedLocation.y > getParentBorder().getBottomRight().y) {
					// east is full, try north.
					return locateOnBorder(recommendedLocation,
						PositionConstants.EAST, circuitCount + 1, borderItem);
				}
			} else { // NORTH
				do {
					recommendedLocation.x -= (borderItemSize.width + horizontal_gap);
				} while (conflicts(recommendedLocation, borderItem));
				if (recommendedLocation.x < getParentBorder().getTopLeft().x) {
					return locateOnBorder(recommendedLocation,
						PositionConstants.WEST, circuitCount + 1, borderItem);
				}
			}
		}
		return recommendedLocation;
	}

	

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator#getValidLocation(org.eclipse.draw2d.geometry.Rectangle,
	 *      org.eclipse.draw2d.IFigure)
	 */
	public Rectangle getValidLocation(Rectangle proposedLocation,
			IFigure borderItem) {
		Rectangle realLocation = new Rectangle(proposedLocation);
		
		// Allow to drag on either side, role change will be handled in the drag tracker
		int side = EAST_OR_WEST;
		Point newTopLeft = locateOnBorder(realLocation.getTopLeft(), side, 0,
			borderItem);
		realLocation.setLocation(newTopLeft);
		return realLocation;
	}
	
	/**
	 * @param location
	 * @param borderItem
	 * @return the side of borderItem's parent on which the point is closer.
	 * Can be format PositionConstants.EAST or PositionConstants.WEST.
	 * @author maroto
	 */
	public int getSide(Point location, IFigure borderItem) {
		Rectangle bounds = getParentBorder();
		int parentFigureWidth = bounds.width;
		Point parentLoc = new Point(bounds.x,bounds.y);
		borderItem.translateToAbsolute(parentLoc);
		
		int parentFigureX = parentLoc.x;
		Dimension borderItemSize = getSize(borderItem);
		int westX = parentFigureX - borderItemSize.width
			+ getBorderItemOffset().width;
		int eastX = parentFigureX + parentFigureWidth
			- getBorderItemOffset().width;
		
		// Find the closest side
		int westRange = Math.abs(location.x - westX);
		int eastRange = Math.abs(location.x - eastX);
		if (eastRange > westRange) {
			// location is closer to west
			return PositionConstants.WEST;
		}
		else {
			// location is closer to east
			return PositionConstants.EAST;
		}
	}

	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.draw2d.Locator#relocate(org.eclipse.draw2d.IFigure)
	 */
	public void relocate(IFigure borderItem) {
        Dimension size = getSize(borderItem);
         
        Point ptNewLocation = getPreferredLocation(borderItem);
		borderItem.setLocation(ptNewLocation);
        borderItem.setSize(size);
	}

	/**
	 * getter for the parent figure
	 * 
	 * @return <code>IFigure</code>
	 */
	public IFigure getParentFigure() {
		return parentFigure;
	}

	/**
	 * @return Returns the borderItemOffset.
	 */
	public Dimension getBorderItemOffset() {
		return borderItemOffset;
	}

	/**
	 * @param borderItemOffset
	 *            The borderItemOffset to set.
	 */
	public void setBorderItemOffset(Dimension borderItemOffset) {
		this.borderItemOffset = borderItemOffset;
	}

	/**
	 * Returns the preferred side of the parent figure on which to place this
	 * border item.
	 * 
	 * @return the preferred side of the parent figure on which to place this
	 *         border item as defined in {@link PositionConstants}
	 */
	public int getPreferredSideOfParent() {
		return preferredSide;
	}

	/**
	 * Sets the preferred side of the parent figure on which to place this
	 * border item.
	 * 
	 * @param preferredSide
	 *            the preferred side of the parent figure on which to place this
	 *            border item as defined in {@link PositionConstants}
	 */
	public void setPreferredSideOfParent(int preferredSide) {
		this.preferredSide = preferredSide;
		setCurrentSideOfParent(preferredSide);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator#getSide()
	 */
	public int getCurrentSideOfParent() {
		return currentSide;
	}

	/**
	 * Sets the side of the parent figure on which the border item should
	 * appear.
	 * 
	 * @param side
	 *            the side on which this border item appears as defined in
	 *            {@link PositionConstants}
	 */
	public void setCurrentSideOfParent(int side) {
		this.currentSide = side;
	}
	
	/**
	 * Gets the size of the border item figure.
	 * @param borderItem
	 * @return the size of the border item figure.
	 */
	protected final Dimension getSize(IFigure borderItem) {
        Dimension size = getConstraint().getSize();
        if (LayoutHelper.UNDEFINED.getSize().equals(size)) {
        	size = borderItem.getPreferredSize();
        }
        return size;
	}
}
