// Efficiently compute sums of diagonals of a matrix

package com.gfgInfosys.easy;

import java.util.Scanner;

public class SumOfDiagonals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] mat=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		int psum=0;
		int ssum=0;
		for(int i=0;i<n;i++) {
			psum=psum+mat[i][i];
			ssum=ssum+mat[i][n-i-1];
		}
		System.out.println(psum);
		System.out.println(ssum);
	}
}

/*
 * Time Complexity: O(N), as we are using a loop to traverse N times.
Auxiliary Space: O(1), as we are not using any extra space.
 * */
