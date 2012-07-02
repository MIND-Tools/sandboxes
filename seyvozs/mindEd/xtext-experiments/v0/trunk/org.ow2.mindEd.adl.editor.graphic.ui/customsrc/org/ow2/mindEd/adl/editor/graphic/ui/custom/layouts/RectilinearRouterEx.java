package org.ow2.mindEd.adl.editor.graphic.ui.custom.layouts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.draw2d.AbsoluteBendpoint;
import org.eclipse.draw2d.Bendpoint;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.geometry.PointListUtilities;
import org.eclipse.gmf.runtime.draw2d.ui.internal.routers.ObliqueRouter;
import org.eclipse.gmf.runtime.draw2d.ui.internal.routers.OrthogonalRouter;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.MapModeUtil;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.figures.AbstractComponentShape;


/**
 * NEEDS TO BE FIXED
 * 
 * 
 * 
 * Extended to be able to customize the routers. Bad surprise how many things
 * need to be overridden before we can start doing things.
 * <p>
 * Scary: copied all necessary code to not refer to static methods Only
 * extending the ObliqueRouter
 * </p>
 * <p>
 * Here are the main differences with GMF's rectilinear router:
 * <ul>
 * <li>Implement avoid obstacles knowing that we are doing rectilinear routing.
 * The path searched strategy is quite different and we can take into account
 * the constraints</li>
 * <li>The extra bendpoints introduced to build the path are based on a
 * center-strategy: we try to introduce bendpoints in the bary center of the
 * segment decomposed</li>
 * <li>The anchors are not assumed to be slideable: not "adjust to middle" or
 * abusive "make it a linear bi-terminal."</li>
 * <li>The anchors are searched for an initial direction to make sure the
 * beginning of the polyline is perpendicular to the side of the rectangle they
 * are attached to and pointing outward</li>
 * </ul>
 * </p>
 * 
 * @author hmalphettes
 * @author <a href="http://www.intalio.com">&copy; Intalio, Inc.</a>
 * @author Stephane Drapeau - Obeo (added: router NORMALIZE_ON_HORIZONTAL_CENTER_REVERSE)
 */
// NON IMPLEMENTE POUR CAUSE DE BUGS
@SuppressWarnings("restriction")
public class RectilinearRouterEx extends ObliqueRouter implements OrthogonalRouter {

	private static int maxRoutingDepth = 10;

	private static int ALMOST_EQUAL = 3;

	/** the default behavior.. not supported here. */
	public static final int NORMALIZE_ON_SHORTEST_SEGMENT_FIRST = 1;

	/**
	 * appropriate to make segments horizontal when next to the anchor and
	 * introduce points in the middle.
	 */
	public static final int NORMALIZE_ON_VERTICAL_CENTER = 2;

	/**
	 * appropriate to make segments vertical when next to the anchor and
	 * introduce points in the middle.
	 */
	public static final int NORMALIZE_ON_HORIZONTAL_CENTER = 3;

	/**
	 * Strategy used when routing a sequence edge that starts on a shape on the
	 * sub-process border.
	 */
	public static final int NORMALIZE_ON_HORIZONTAL_EXCEPT_FIRST_SEG = 4;

	public static final int NORMALIZE_ON_HORIZONTAL_CENTER_REVERSE = 5;

	public int normalizeBehavior = NORMALIZE_ON_SHORTEST_SEGMENT_FIRST;

	public RectilinearRouterEx() {
	}

	/**
	 * Route the connection accordingly to the router paradigm.
	 */
	public void routeBendpoints(Connection conn) {
		if ((conn.getSourceAnchor() == null)
				|| (conn.getTargetAnchor() == null))
			return;

		PointList points = new PointList();

		// get rid of the connection to self:
		if (conn.getSourceAnchor().getOwner() == conn.getTargetAnchor()
				.getOwner()) {
			conn.setPoints(points);
			return;
		}

		/*
		 * if (isAvoidingObstructions(conn)) { // points =
		 * RouterHelper.getInstance().routeAroundObstructions(conn); //not
		 * supported. points = routeFromConstraint(conn); } else
		 */if (isClosestDistance(conn)) {
			points = routeClosestDistance(conn);
			// if (points.size() > 2) {
			// conn.setPoints(points);
			// return;
			// }
			routeAroundSelfForClosestDistance(conn, points);
			if (points.size() > 2) {
				conn.setPoints(points);
				return;
			}
		} else {
			points = routeFromConstraint(conn);
			if (points.size() == 2) {
				routeAroundSelfForClosestDistance(conn, points);
			}
		}
		routeLine(conn, 0, points);
		conn.setPoints(points);
	}

	/**
	 * Determines whether the router is going to avoid obstructions during the
	 * routing algorithm.
	 */
	public boolean isAvoidingObstructions(Connection conn) {
		if (conn instanceof PolylineConnectionEx) {
			return ((PolylineConnectionEx) conn).isAvoidObstacleRouting();
		}

		return false;
	}

	/**
	 * Determines whether the router is going use the closest distance during
	 * the
	 */
	public boolean isClosestDistance(Connection conn) {
		if (conn instanceof PolylineConnectionEx) {
			return ((PolylineConnectionEx) conn).isClosestDistanceRouting();
		}

		return false;
	}

	/**
	 * Check if this connection is currently being reoriented by seeing if the
	 * source or target owner are null.
	 */
	protected boolean isReorienting(Connection conn) {
		if (conn.getSourceAnchor().getOwner() == null
				|| conn.getTargetAnchor().getOwner() == null) {
			return true;
		}

		return false;
	}

	/**
	 * Method removePointsInViews. This method will parse through all the points
	 * in the given polyline and remove any of the points that intersect with
	 * the start and end figures.
	 * 
	 * @param conn
	 *            Connection figure that is currently being routed
	 * @param newLine
	 *            PointList that will contain the filtered list of points
	 * @return boolean true if newLine points changed, false otherwise.
	 * @throws IllegalArgumentException
	 *             if either paramter is null.
	 */
	protected boolean removePointsInViews(Connection conn, PointList newLine) {

		boolean bChanged = false;

		// error checking
		if (conn == null || newLine == null) {
			throw new IllegalArgumentException("null connection illegal");
		}

		// check whether the method should be executed.
		if (newLine.size() < 3)
			return false;
		if (conn.getSourceAnchor().getOwner() == null)
			return false;
		if (conn.getTargetAnchor().getOwner() == null)
			return false;

		Rectangle startRect = new Rectangle(getOwnerBounds(conn
				.getSourceAnchor()));
		conn.getSourceAnchor().getOwner().translateToAbsolute(startRect);
		conn.translateToRelative(startRect);

		Rectangle endRect = new Rectangle(
				getOwnerBounds(conn.getTargetAnchor()));
		conn.getTargetAnchor().getOwner().translateToAbsolute(endRect);
		conn.translateToRelative(endRect);

		// Ignore the first and last points
		PointList newPoints = new PointList(newLine.size());
		for (int i = 0; i < newLine.size(); i++) {

			Point pt = newLine.getPoint(i);
			if (i == 0 || i == newLine.size() - 1)
				newPoints.addPoint(pt);
			else if (!startRect.contains(pt) && !endRect.contains(pt)) {
				newPoints.addPoint(pt);
			} else {
				bChanged = true;
			}
		}

		if (newPoints.size() != newLine.size()) {
			newLine.removeAllPoints();
			for (int i = 0; i < newPoints.size(); i++)
				newLine.addPoint(new Point(newPoints.getPoint(i)));
		}

		return bChanged;
	}

	/**
	 * removeSegmentsInViews This method will parse through all the line
	 * segments in the given polyline and remove any of the segments that
	 * intersect with the start and end figures.
	 * 
	 * @param conn
	 *            Connection figure that is used to access anchors
	 * @param newLine
	 *            PointList that will be modified by the routine.
	 * @return boolean true if method change newLine PointList, false otherwise
	 */
	protected boolean removeSegmentsInViews(Connection conn, PointList newLine) {
		// Ignore the first and last points
		PointList newPoints = new PointList(newLine.size());
		Point ptStart = new Point(newLine.getFirstPoint());
		Point ptEnd = new Point(newLine.getLastPoint());
		for (int i = 0; i < newLine.size(); i++) {
			if (i != 0 && i != newLine.size() - 1)
				newPoints.addPoint(new Point(newLine.getPoint(i)));
		}

		if (newPoints.size() < 3)
			return false;

		int lastIntersect = 0;
		int count = 0;
		boolean found = false;
		boolean bChanged = false;

		if (conn.getSourceAnchor().getOwner() == null)
			return false;

		Rectangle startRect = new Rectangle(getOwnerBounds(conn
				.getSourceAnchor()));
		conn.getSourceAnchor().getOwner().translateToAbsolute(startRect);
		conn.translateToRelative(startRect);

		for (int i = 0; i < newPoints.size() - 1; i++) {
			boolean in1 = startRect.contains(newPoints.getPoint(i));
			boolean in2 = startRect.contains(newPoints.getPoint(i + 1));
			if (in1 != in2) {
				lastIntersect = count;
				found = true;
			} else if (!(in1 || in2)) // Neither intersect, so skip out
			{
				break;
			}
			++count;
		}

		// remove segments before the one that finally
		// intersects:
		if (found) {
			for (int i = 0; i <= lastIntersect; ++i) {
				newPoints.removePoint(0);
				bChanged = true;
			}
		}

		lastIntersect = count = newLine.size() - 1;
		found = false;

		if (conn.getTargetAnchor().getOwner() == null)
			return false;

		Rectangle endRect = new Rectangle(
				getOwnerBounds(conn.getTargetAnchor()));
		conn.getTargetAnchor().getOwner().translateToAbsolute(endRect);
		conn.translateToRelative(endRect);

		for (int i = newPoints.size() - 1; i > 0; i--) {
			boolean in1 = endRect.contains(newPoints.getPoint(i));
			boolean in2 = endRect.contains(newPoints.getPoint(i - 1));
			if (in1 != in2) {
				lastIntersect = count;
				found = true;
			} else if (!(in1 || in2)) // Neither intersect, so skip out
			{
				break;
			}
			--count;
		}

		// remove segments after the one that finally
		// intersects:
		if (found) {
			for (int i = newPoints.size() - 1; i >= lastIntersect; --i) {
				newPoints.removePoint(newPoints.size() - 1);
				bChanged = true;
			}
		}

		if (newPoints.size() != newLine.size()) {
			newLine.removeAllPoints();
			newLine.addPoint(ptStart);
			for (int i = 0; i < newPoints.size(); i++)
				newLine.addPoint(new Point(newPoints.getPoint(i)));
			newLine.addPoint(ptEnd);
		}

		return bChanged;
	}

	/**
	 * @param conn
	 *            the <code>Connection</code> that is to be check if it is a
	 *            feedback connection or not.
	 * @return <code>true</code> is it is a feedback connection,
	 *         <code>false</code> otherwise.
	 */
	public boolean isFeedback(Connection conn) {
		Dimension dim = new Dimension(100, 100);
		Dimension dimCheck = dim.getCopy();
		conn.translateToRelative(dimCheck);
		return dim.equals(dimCheck);
	}

	/**
	 * @param conn
	 *            the <code>Connection</code> that is to be routed.
	 * @return the <code>PointList</code> that is the list of points that are
	 *         a direct mapping of the constraint points.
	 */
	public PointList routeFromConstraint(Connection conn) {
		List<?> bendpoints = (List<?>) conn.getConnectionRouter().getConstraint(conn);
		if (bendpoints == null)
			bendpoints = Collections.EMPTY_LIST;

		PointList points = new PointList(bendpoints.size());

		int size = bendpoints.size();
		Point r1 = null;
		Point r2 = null;
		// if (size == 2) {
		// size = 0;
		// } else {
		for (int i = 0; i < size; i++) {
			Bendpoint bp = (Bendpoint) bendpoints.get(i);
			points.addPoint(bp.getLocation());
		}
		// }
		if (size == 0) {
			r1 = conn.getSourceAnchor().getReferencePoint().getCopy();
			conn.translateToRelative(r1);
			points.addPoint(r1);

			r2 = conn.getTargetAnchor().getReferencePoint().getCopy();
			conn.translateToRelative(r2);

			if (normalizeBehavior == NORMALIZE_ON_HORIZONTAL_EXCEPT_FIRST_SEG) {
				if (!areAlmostEqual(r1.x, r2.x)) {
					points.addPoint(new Point(r1.x, r2.y));
				}
			}

			points.addPoint(r2);
			return points;
		}

		// if the start anchor or the end anchor don't match the first and last
		// location of the bendpoints they have moved.
		// we need to go through relative bend points:
		r1 = conn.getSourceAnchor().getReferencePoint().getCopy();
		conn.translateToRelative(r1);

		r2 = conn.getTargetAnchor().getReferencePoint().getCopy();
		conn.translateToRelative(r2);

		Point startBp = ((Bendpoint) bendpoints.get(0)).getLocation();
		Point endBp = ((Bendpoint) bendpoints.get(size - 1)).getLocation();

		if (processAlmostZero(r1.x - startBp.x) == 0
				&& processAlmostZero(r2.x - endBp.x) == 0
				&& processAlmostZero(r1.y - startBp.y) == 0
				&& processAlmostZero(r2.y - endBp.y) == 0) {
			return points;// no change
		}

		int dX = processAlmostZero(endBp.x - startBp.x);
		int dY = processAlmostZero(endBp.y - startBp.y);

		int deltaX = processAlmostZero(r1.x - startBp.x)
				+ processAlmostZero(r2.x - endBp.x);
		int deltaY = processAlmostZero(r1.y - startBp.y)
				+ processAlmostZero(r2.y - endBp.y);

		List<Bendpoint> newBps = new ArrayList<Bendpoint>(size);
		PointList res = new PointList();
		res.addPoint(r1);
		newBps.add(new AbsoluteBendpoint(r1));
		for (int i = 1; i < size - 1; i++) {
			Point pt = points.getPoint(i);
			int distFromStartX = processAlmostZero(pt.x - startBp.x);
			int distFromStartY = processAlmostZero(pt.y - startBp.y);
			double weightX = dX != 0 ? distFromStartX / dX : 1;
			double weightY = dY != 0 ? distFromStartY / dY : 1;
			int newX = deltaX == 0 ? r1.x + distFromStartX
					: (int) (r1.x + (distFromStartX + deltaX) * weightX);
			int newY = deltaY == 0 ? r1.y + distFromStartY
					: (int) (r1.y + (distFromStartY + deltaY) * weightY);
			res.addPoint(newX, newY);
			newBps.add(new AbsoluteBendpoint(newX, newY));
		}
		res.addPoint(r2);
		newBps.add(new AbsoluteBendpoint(r2));
		conn.getConnectionRouter().setConstraint(conn, newBps);
		return res;
	}

	/**
	 * When comparing things with absolute coordinates, 2 numbers that have just
	 * one digit of difference can be assumed to be because of previous
	 * approximations: they should really be considered equals. This makes sure
	 * that when we compare them they are recognized as zero.
	 * 
	 * @param rawCompute
	 * @return
	 */
	private static final int processAlmostZero(int rawCompute) {
		if (rawCompute < ALMOST_EQUAL && rawCompute > -ALMOST_EQUAL) {
			return 0;
		}
		return rawCompute;
	}

	/**
	 * When comparing things with absolute coordinates, 2 numbers that have just
	 * one digit of difference can be assumed to be because of previous
	 * approximations: they should really be considered equals. This makes sure
	 * that when we compare them they are recognized as zero.
	 * 
	 * @param rawCompute
	 * @return true when they should be considered equal.
	 */
	static final boolean areAlmostEqual(int one, int two) {
		return processAlmostZero(one - two) == 0;
	}

	/**
	 * It 2 numbers are grossly equal, there is not enough distance between them
	 * to insert a mid-point that would not be almostEqual to both points.
	 * 
	 * @param rawCompute
	 * @return true when they are too close to insert a point in between them
	 *         that will be not almost equal to either of them.
	 */
	static final boolean areGrosslyEqual(int one, int two) {
		return Math.abs(one - two) <= 2 * ALMOST_EQUAL;
	}

	/**
	 * Our very own router. Implements a center based routing
	 * 
	 * @param conn
	 * @param pointList
	 */
	public void routeLine(Connection conn, int nestedRoutingDepth,
			PointList pointList) {
		// System.err.println("nestedRoutingDepth=" + nestedRoutingDepth);
		if (pointList.size() < 2) {
			// not much to route?
			return;
		}
		// int currentPointListLength = pointList.size();

		// if we are reorienting, then just default to the super class
		// implementation and don't try to do rectilinear routing.
		if (isReorienting(conn)) {
			return;
		}

		int minDistfromSide = MapModeUtil.getMapMode(conn).DPtoLP(16);

		PointList oldPointsCopy = pointList;// .getCopy();
		PointList newPoints = new PointList();
		Point oldPointA = oldPointsCopy.removePoint(0);
		newPoints.addPoint(oldPointA);
		Point oldPointB = oldPointsCopy.removePoint(0);
		route2Points(oldPointA, oldPointB, newPoints, true, oldPointsCopy
				.size() == 0, minDistfromSide);
		while (oldPointsCopy.size() > 0) {
			oldPointA = oldPointB;
			oldPointB = oldPointsCopy.removePoint(0);
			route2Points(oldPointA, oldPointB, newPoints, false, oldPointsCopy
					.size() == 0, minDistfromSide);
		}

		// Normalize the polyline to remove unwanted segments
		int tolerance = 3;
		if (!isFeedback(conn)) {
			tolerance = MapModeUtil.getMapMode(conn).DPtoLP(3);
		}

		PointListUtilities.normalizeSegments(newPoints, tolerance);
		pointList.addAll(newPoints);

		// Because we have created a polyline, it may have multiple points of
		// intersection with the originating and terminating views. We need to
		// find the last intersection point.
		boolean normalizationChangedLine = false;
		normalizationChangedLine = removeSegmentsInViews(conn, pointList);
		normalizationChangedLine |= removePointsInViews(conn, pointList);

		normalizationChangedLine |= PointListUtilities.normalizeSegments(
				pointList, tolerance);

		// check the end segments to ensure they conform to a minimum distance.
		// checkEndSegments(conn, pointList);

		// resetEndPointsToEdge(conn, pointList);
		if (/* currentPointListLength != pointList.size() || */normalizationChangedLine) {
			nestedRoutingDepth++;
			if (nestedRoutingDepth < maxRoutingDepth) {
				routeLine(conn, nestedRoutingDepth, pointList);
			}
		}

	}

	private void route2Points(Point oldPointA, Point oldPointB,
			PointList newPoints, boolean isFirst, boolean isLast,
			int minDistFromSide) {

		// comments apply for NORMALIZE_ON_HORIZONTAL_CENTER
		Point aPlus = null;// the one on the right of the first bendpoint.
		Point bMinus = null;// the one on the left of the second bendpoint.
		switch (normalizeBehavior) {
		case NORMALIZE_ON_HORIZONTAL_EXCEPT_FIRST_SEG:
			if (isFirst) {
				// oldA is the source anchor
				// oldB is the following point and must be down vertical to oldA
				// the point has already been inserted inside routeConstraint
				break;
			}

		case NORMALIZE_ON_HORIZONTAL_CENTER:
			if (isFirst && isLast && areGrosslyEqual(oldPointA.y, oldPointB.y)) {
				// for some reason, being perfectly aligned and vertical has
				// issue when the arrow is pointing up.
				// this seems to be fixing the issue.
				// make it perfectly vertical:
				newPoints.removeAllPoints();
				int midY = (oldPointA.y + oldPointB.y) / 2;
				newPoints.addPoint(new Point(oldPointA.x, midY));
				newPoints.addPoint(new Point(oldPointB.x, midY));
				break;// it is perfect don't touch it.
			}
			if (isFirst
					|| isLast
					|| (!areAlmostEqual(oldPointA.y, oldPointB.y) && !areAlmostEqual(
							oldPointA.x, oldPointB.x))) {
				int halfWayX = oldPointA.x == 0 ? 0 : oldPointA.x / 2;
				halfWayX += oldPointB.x == 0 ? 0 : oldPointB.x / 2;
				if ((isFirst || isLast)
						&& Math.abs(oldPointB.x - oldPointA.x) / 2 < minDistFromSide) {
					if (isFirst) {
						aPlus = new Point(oldPointA.x + minDistFromSide,
								oldPointA.y);
						bMinus = new Point(oldPointA.x + minDistFromSide,
								oldPointB.y);
						oldPointB.x = oldPointA.x + 2 * minDistFromSide;
					} else if (isLast) {
						aPlus = new Point(oldPointB.x - minDistFromSide,
								oldPointA.y);
						bMinus = new Point(oldPointB.x - minDistFromSide,
								oldPointB.y);
					}
				} else {
					aPlus = new Point(halfWayX, oldPointA.y);
					bMinus = new Point(halfWayX, oldPointB.y);
				}
				newPoints.addPoint(aPlus);
				newPoints.addPoint(bMinus);
			}
			break;
		case NORMALIZE_ON_HORIZONTAL_CENTER_REVERSE:
			if (isFirst && isLast && areGrosslyEqual(oldPointA.y, oldPointB.y)) {
				// for some reason, being perfectly aligned and vertical has
				// issue when the arrow is pointing up.
				// this seems to be fixing the issue.
				// make it perfectly vertical:
				newPoints.removeAllPoints();
				int midY = (oldPointA.y + oldPointB.y) / 2;
				newPoints.addPoint(new Point(oldPointA.x, midY));
				newPoints.addPoint(new Point(oldPointB.x, midY));
				break;// it is perfect don't touch it.
			}
			if (isFirst
					|| isLast
					|| (!areAlmostEqual(oldPointA.y, oldPointB.y) && !areAlmostEqual(
							oldPointA.x, oldPointB.x))) {
				int halfWayX = oldPointA.x == 0 ? 0 : oldPointA.x / 2;
				halfWayX += oldPointB.x == 0 ? 0 : oldPointB.x / 2;
				if ((isFirst || isLast)
						&& Math.abs(oldPointB.x - oldPointA.x) / 2 < minDistFromSide) {
					if (isFirst) {
						aPlus = new Point(oldPointA.x - minDistFromSide,
								oldPointA.y);
						bMinus = new Point(oldPointA.x - minDistFromSide,
								oldPointB.y);
						oldPointB.x = oldPointA.x + 2 * minDistFromSide;
					} else if (isLast) {
						aPlus = new Point(oldPointB.x + minDistFromSide,
								oldPointA.y);
						bMinus = new Point(oldPointB.x + minDistFromSide,
								oldPointB.y);
					}
				} else {
					aPlus = new Point(halfWayX, oldPointA.y);
					bMinus = new Point(halfWayX, oldPointB.y);
				}
				newPoints.addPoint(aPlus);
				newPoints.addPoint(bMinus);
			}
			break;
		case NORMALIZE_ON_VERTICAL_CENTER:
			if (isFirst && isLast && areGrosslyEqual(oldPointA.x, oldPointB.x)) {//
				// for some reason, being perfectly aligned and vertical has
				// issue when the arrow is pointing up.
				// this seems to be fixing the issue.
				// make it perfectly vertical:
				newPoints.removeAllPoints();
				int midX = (oldPointA.x + oldPointB.x) / 2;
				newPoints.addPoint(new Point(midX, oldPointA.y));
				newPoints.addPoint(new Point(midX, oldPointB.y));
				return;
				// break;//it is perfect don't touch it.
			}
			if (isFirst
					|| isLast
					|| (!areAlmostEqual(oldPointA.y, oldPointB.y) && !areAlmostEqual(
							oldPointA.x, oldPointB.x))) {
				int halfWayY = oldPointA.y == 0 ? 0 : oldPointA.y / 2;
				halfWayY += oldPointB.y == 0 ? 0 : oldPointB.y / 2;

				if ((isFirst || isLast)
						&& Math.abs(oldPointB.y - oldPointA.y) / 2 < minDistFromSide) {
					int signedMinDistFromSide = oldPointB.y > oldPointA.y ? minDistFromSide
							: -minDistFromSide;
					if (isFirst) {
						aPlus = new Point(oldPointA.x, oldPointA.y
								+ signedMinDistFromSide);
						bMinus = new Point(oldPointB.x, oldPointA.y
								+ signedMinDistFromSide);
						if (!isLast) {
							oldPointB.y = oldPointA.y + 2
									* signedMinDistFromSide;
						}
					} else if (isLast) {
						aPlus = new Point(oldPointB.x, oldPointB.y
								- signedMinDistFromSide);
						bMinus = new Point(oldPointB.x, oldPointB.y
								- signedMinDistFromSide);
					}
				} else {
					aPlus = new Point(oldPointA.x, halfWayY);
					bMinus = new Point(oldPointB.x, halfWayY);
				}

				newPoints.addPoint(aPlus);
				newPoints.addPoint(bMinus);
			}
			break;
		}

		// if the line has more than 3 points.
		// see if oldPointB, lastPoint and lastPointMinus1 are aligned.
		// in that case, just take lastpoint and replace it with oldPointB
		if (newPoints.size() > 3) {
			Point last = newPoints.getLastPoint();
			Point beforeLast = newPoints.getPoint(newPoints.size() - 2);
			if (areAlmostEqual(beforeLast.x, oldPointB.x)
					&& areAlmostEqual(last.x, oldPointB.x)) {
				newPoints.removePoint(newPoints.size() - 1);
			} else if (areAlmostEqual(beforeLast.y, oldPointB.y)
					&& areAlmostEqual(last.y, oldPointB.y)) {
				newPoints.removePoint(newPoints.size() - 1);
			}
		}
		newPoints.addPoint(oldPointB);

	}

	/**
	 * @param conn
	 *            the <code>Connection</code> that is to be routed.
	 * @return the <code>PointList</code> that is the list of points that
	 *         represent the closest distance possible to route the line.
	 */
	public PointList routeClosestDistance(Connection conn) {
		PointList newLine = routeFromConstraint(conn);

		Point ptOrig = new Point(newLine.getFirstPoint());
		Point ptTerm = new Point(newLine.getLastPoint());
		newLine.removeAllPoints();
		newLine.addPoint(ptOrig);

		if (normalizeBehavior == NORMALIZE_ON_HORIZONTAL_EXCEPT_FIRST_SEG) {
			if (!areAlmostEqual(ptOrig.x, ptTerm.x)) {
				newLine.addPoint(new Point(ptOrig.x, ptTerm.y));
			}
		}

		newLine.addPoint(ptTerm);
		return newLine;
	}

	/**
	 * Called for closest distance. Applies a custom algorithm for sequence edge
	 * to make sure that if the connection goes from right to left it goes
	 * around the source and target shapes.
	 * 
	 * @param conn
	 * @param newLine
	 */
	private void routeAroundSelfForClosestDistance(Connection conn,
			PointList newLine) {
		Point ptOrig = newLine.getPoint(newLine.size() - 2);
		Point ptTerm = newLine.getLastPoint();
		if (NORMALIZE_ON_HORIZONTAL_CENTER == normalizeBehavior
				|| NORMALIZE_ON_HORIZONTAL_EXCEPT_FIRST_SEG == normalizeBehavior) {
			// special algo when the sequence edge goes from right to left:
			int tolerance = MapModeUtil.getMapMode(conn).DPtoLP(3);
			int extra = MapModeUtil.getMapMode(conn).DPtoLP(16);
			if (ptOrig.x + extra >= ptTerm.x) {
				newLine.setSize(newLine.size() - 1);

				Rectangle src = conn.getSourceAnchor().getOwner() == null ? null
						: getOwnerBounds(conn.getSourceAnchor()).getCopy();
				if (src == null) {
					src = new Rectangle(ptOrig.getCopy().translate(
							new Dimension(-extra, -extra / 2)), ptOrig);
				} else {
					if (NORMALIZE_ON_HORIZONTAL_EXCEPT_FIRST_SEG == normalizeBehavior) {
						// then the source shape to route around is the
						// sub-process
						IFigure fig = conn.getSourceAnchor().getOwner();
						while (fig != null) {
							// [SDR]
							if (fig instanceof AbstractComponentShape) {// [/SDR]
								break;
							} else {
								fig = fig.getParent();
							}
						}
						if (fig == null) {
							fig = conn.getSourceAnchor().getOwner();
						}
						src = fig.getBounds().getCopy();
						fig.translateToAbsolute(src);
					} else {
						conn.getSourceAnchor().getOwner().translateToAbsolute(
								src);
					}
					conn.translateToRelative(src);
				}
				Rectangle target = conn.getTargetAnchor().getOwner() == null ? null
						: getOwnerBounds(conn.getTargetAnchor()).getCopy();
				if (target == null) {
					target = new Rectangle(ptTerm.getCopy().translate(
							new Dimension(extra, -extra / 2)), ptTerm);
				} else {
					conn.getTargetAnchor().getOwner().translateToAbsolute(
							target);
					conn.translateToRelative(target);
				}
				// compute how much away we should be: 1/2 of the biggest height
				int heightOwnerSrc = src.height;
				int heightOwnerTarget = target.height;

				int topRightSrcY = src.y;
				int bottomRightSrcY = src.y + src.height;
				int topLeftTargetY = target.y;
				int bottomLeftTargetY = target.y + target.height;

				// now compute where we draw the line: above or below the 2
				// shapes.
				int aboveY = -1;
				int farRightX = -1;
				// see if we should go in between the 2 shapes:
				if (NORMALIZE_ON_HORIZONTAL_EXCEPT_FIRST_SEG != normalizeBehavior
						&& topRightSrcY > bottomLeftTargetY + extra) {
					// src is below the target go in between:
					aboveY = (topRightSrcY + bottomLeftTargetY) / 2;
					farRightX = ptOrig.x + extra;
				} else if (topLeftTargetY > bottomRightSrcY + extra) {
					// target is below the src go in between:
					aboveY = (topLeftTargetY + bottomRightSrcY) / 2;
					farRightX = ptOrig.x + extra;
				} else {
					int extraY = // extra;
					Math.max(extra, Math.min(heightOwnerSrc / 2,
							heightOwnerTarget / 2));

					// min y if we go above
					int aboveYone = Math.min(topRightSrcY, topLeftTargetY);
					// max y if we go below
					int belowYone = Math
							.max(bottomLeftTargetY, bottomRightSrcY);

					if (NORMALIZE_ON_HORIZONTAL_EXCEPT_FIRST_SEG != normalizeBehavior) {
						// in that case, always go below as we are already at
						// the bottom-side of a sub-process
						aboveY = belowYone + extraY;
					} else {

						// see which one is shortest:
						int aboveDelta = Math.max(ptOrig.y - aboveYone,
								ptTerm.y - aboveYone);
						int belowDelta = Math.max(belowYone - ptOrig.y,
								belowYone - ptTerm.y);

						if (aboveDelta - belowDelta > tolerance) {
							// consider that one of them really is a shorter
							// path:
							aboveY = belowYone + extraY;
						} else if (belowDelta - aboveDelta > tolerance) {
							// consider that one of them really is a shorter
							// path:
							aboveY = aboveYone - extraY;
						} else {
							// they are pretty similar really.
							// we choose one according to the position of
							// the anchors within their shapes
							int midYSrc = src.getCenter().y;
							if (ptOrig.y + tolerance > midYSrc) {// +tolerance
								// as we
								// favor
								// going
								// above
								aboveY = belowYone + extraY;
							} else {
								aboveY = aboveYone - extraY;
							}
						}

					}
					farRightX = Math.max(ptOrig.x + extra, ptTerm.x + extra
							+ target.width);
				}
				int farLeft = ptTerm.x - extra;
				if (NORMALIZE_ON_HORIZONTAL_EXCEPT_FIRST_SEG == normalizeBehavior) {
					// make sure we are far enough on the left to avoid the
					// sub-process on which the src shape is anchored on.
					Point srcLeft = src.getLeft();
					conn.getSourceAnchor().getOwner().translateToRelative(
							srcLeft);
					farLeft = Math.min(farLeft, srcLeft.x + extra);
				}
				Point origPlus = new Point(farRightX, ptOrig.y);
				Point origAbove = new Point(origPlus.x, aboveY);
				Point termMinus = new Point(farLeft, ptTerm.y);
				Point termAbove = new Point(termMinus.x, aboveY);
				if (NORMALIZE_ON_HORIZONTAL_EXCEPT_FIRST_SEG != normalizeBehavior) {
					newLine.addPoint(origPlus);
					newLine.addPoint(origAbove);
				} else {
					newLine.setSize(1);// keep the original origine point
					// make sure we are still going down:
					Point orig = newLine.getFirstPoint();
					if (orig.y + extra > termAbove.y) {
						// oops looks like we are going up. let's fix everyone:
						ptOrig.y = orig.y + extra;
						termAbove.y = ptOrig.y;
					} else {
						ptOrig.y = termAbove.y;
					}
					newLine.addPoint(ptOrig);
				}
				newLine.addPoint(termAbove);
				newLine.addPoint(termMinus);
				newLine.addPoint(ptTerm);
			} else if (NORMALIZE_ON_HORIZONTAL_EXCEPT_FIRST_SEG == normalizeBehavior) {
				// this is a shape on the sub-process border.
				// let's make sure that we don't need to route around the
				// sub-process
				// if the target of the connection is higher than the ptOrig.
				Point orig = newLine.getFirstPoint();
				if (ptOrig.y < orig.y) {
					ptOrig.y = orig.y + extra;
				}
				if (ptOrig.y > ptTerm.y
						&& conn.getSourceAnchor().getOwner() != null) {
					// let's route around:
					IFigure fig = conn.getSourceAnchor().getOwner();
					while (fig != null) {
						// [SDR]
						if (fig instanceof AbstractComponentShape) {// [/SDR]
							break;
						} else {
							fig = fig.getParent();
						}
					}
					if (fig == null) {
						return;// never mind
					}
					Rectangle src = fig.getBounds().getCopy();
					fig.translateToAbsolute(src);
					conn.translateToRelative(src);
					// int extra = MapModeUtil.getMapMode(conn).DPtoLP(16);
					Point termMinus = new Point(ptTerm.x - extra, ptTerm.y);
					Point termBelow = new Point(termMinus.x, ptOrig.y);
					newLine.setSize(newLine.size() - 2);
					newLine.addPoint(ptOrig);
					newLine.addPoint(termBelow);
					newLine.addPoint(termMinus);
					newLine.addPoint(ptTerm);
				}
			}
		}

	}

	/**
	 * Helper method to return the bounds of the owner, or only the ones from
	 * its interesting feature.
	 * 
	 * @param anchor
	 * @return the bounds to create the anchor on.
	 */
	private Rectangle getOwnerBounds(ConnectionAnchor anchor) {
//		for (Object child : anchor.getOwner().getChildren()) {
			// [SDR]
//			if (child instanceof InterfaceEditPart.InterfaceFigure) {// [SDR]
//				return ((IFigure) child).getBounds().getCopy();
//			}
//		}
		return anchor.getOwner().getBounds().getCopy();
	}
}