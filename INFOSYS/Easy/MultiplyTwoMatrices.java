/*
 * Given two matrices, the task is to multiply them. Matrices can either be square or rectangular:

Examples: 

(Square Matrix Multiplication)

Input: mat1[m][n] = { {1, 1}, {2, 2} }
mat2[n][p] = { {1, 1}, {2, 2} }
Output: result[m][p] = { {3, 3}, {6, 6} }

(Rectangular Matrix Multiplication)

Input: mat1[3][2] = { {1, 1}, {2, 2}, {3, 3} }
mat2[2][3] = { {1, 1, 1}, {2, 2, 2} }
Output: result[3][3] = { {3, 3, 3}, {6, 6, 6}, {9, 9, 9} }
 * */

package com.gfgInfosys.easy;

import java.util.Scanner;

public class MultiplyTwoMatrices {
	
	public static void multiply(int[][] mat1,int r1,int c1,int[][] mat2,int r2,int c2) {
		
		if(c1!=r2)
			System.out.println("Not Possible");
		else {
			int[][] rst=new int[r1][c2];
			for(int i=0;i<r1;i++) {
				for(int j=0;j<c2;j++) {
					rst[i][j]=0;
					for(int k=0;k<r2;k++) {
						rst[i][j]+=mat1[i][k]*mat2[k][j];
					}
					System.out.print(rst[i][j]+" ");
				}
				System.out.println();
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		int[][] mat1=new int[r1][c1];
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				mat1[i][j]=sc.nextInt();
			}
		}
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		int[][] mat2=new int[r2][c2];
		for(int i=0;i<r2;i++) {
			for(int j=0;j<c2;j++) {
				mat2[i][j]=sc.nextInt();
			}
		}
		multiply(mat1,r1,c1,mat2,r2,c2);
	}
}

/*
Time complexity: O(R1 * C2 * R2) for given matrices mat1[R1][C1] and mat2[R2][C2]
Auxiliary space: O(R1 * C2)
*/

