/*
 * Given an integer matrix of size N x N. Traverse it in a spiral form.

Format:
Input:
The first line contains N, which represents the number of rows and columns of a matrix. The next N lines contain N values, each representing the values of the matrix.

Output:
A single line containing integers with space, representing the desired traversal.

Constraints: 0 < N < 500
Example 1:
Input:
3
1 2 3
4 5 6
7 8 9

Output:
1 2 3 6 9 8 7 4 5

Example 2:
Input
3
1 2 3
4 5 6
7 8 9

Output:
1 2 3 6 9 8 7 4 5
 * */

package com.gfgWipro.PYQs;

import java.util.Scanner;

public class MatrixTraversal {
	
	public static void matrixTraversal(int[][] arr,int row,int col) {
		int i,k=0,l=0;
		while(k<row && l<col) {
			for(i=l;i<col;i++) {
				System.out.print(arr[k][i]+" ");
			}
			k++;
			for(i=k;i<row;i++) {
				System.out.print(arr[i][col-1]+" ");
			}
			col--;
			if(k<row) {
				for(i=col-1;i>=l;--i) {
					System.out.print(arr[row-1][i]+" ");
				}
				row--;
			}
			if(l<col) {
				for(i=row-1;i>=k;--i) {
					System.out.print(arr[i][l]+" ");
				}
				l++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		matrixTraversal(arr,n,n);
	}

}
