package com.problems;

public class RectangleOverlap {

	public static void main(String[] args) {
		/*
		 * An axis-aligned rectangle is represented as a list [x1, y1, x2, y2], where
		 * (x1, y1) is the coordinate of its bottom-left corner, and (x2, y2) is the
		 * coordinate of its top-right corner. Its top and bottom edges are parallel to
		 * the X-axis, and its left and right edges are parallel to the Y-axis.
		 * 
		 * Two rectangles overlap if the area of their intersection is positive. To be
		 * clear, two rectangles that only touch at the corner or edges do not overlap.
		 * 
		 * Given two axis-aligned rectangles rec1 and rec2, return true if they overlap,
		 * otherwise return false.
		 * 
		 * 
		 */

		
		int[] rec1 = {0,0,1,1}; //s
		int[] rec2 = {2,2,3,3}; //p
		/*
		 * s.x1 < p.x2
		 * 
		 */
		
		boolean isOverlapping = false;
		if(rec2[0] < rec1[2] && rec1[2] < rec2[2] )
		{
			isOverlapping = true;
		}else {
			isOverlapping = false;
		}
		
		System.out.println(isOverlapping);
		
	}

}
