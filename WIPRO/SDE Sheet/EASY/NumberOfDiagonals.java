/*
 * Find number of diagonals in n sided convex polygon
 * 
 * Given n > 3, find number of diagonals in n sided convex polygon.
According to Wikipedia, In geometry, a diagonal is a line segment joining two vertices of a polygon or polyhedron, when those vertices are not on the same edge. Informally, any sloping line is called diagonal.

Examples : 

Input : 5
Output : 5
 * */

package com.gfgWipro.SDESheet.Easy;

import java.util.Scanner;

public class NumberOfDiagonals {
	
	public static int diagonals(int n) {
		return (n*(n-3))/2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(diagonals(n));
	}

}
/*
 * Time Complexity: O(1)
Auxiliary Space: O(1)
 * */