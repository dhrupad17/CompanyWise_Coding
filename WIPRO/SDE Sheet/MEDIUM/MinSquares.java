/*
 * Minimum number of squares whose sum equals to given number n
 * A number can always be represented as a sum of squares of other numbers. Note that 1 is a square and we can always break a number as (1*1 + 1*1 + 1*1 + …). Given a number n, find the minimum number of squares that sum to X.

Examples : 

Input:  n = 100
Output: 1
Explanation:
100 can be written as 102. Note that 100 can also be written as 52 + 52 + 52 + 52, but this representation requires 4 squares.

Input:  n = 6
Output: 3
 * */

package com.gfgWipro.SDESheet.Medium;

import java.util.Scanner;

/*
 * The solution is based on Lagrange’s Four Square Theorem.
According to the theorem, there can be atmost 4 solutions to the problem, i.e. 1, 2, 3, 4

Case 1:

Ans = 1 => This can happen if the number is a square number. 
n = {a2 : a ∈ W}
Example : 1, 4, 9, etc.

Case 2:

Ans = 2 => This is possible if the number is the sum of 2 square numbers.

n = {a2 + b2 : a, b ∈  W}  
Example : 2, 5, 18, etc. 

Case 3:

Ans = 3 => This can happen if the number is not of the form 4k(8m + 7).


n = {a2 + b2 + c2 : a, b, c ∈  W} ⟷  n ≢ {4k(8m + 7) : k, m ∈ W }
Example : 6, 11, 12 etc.

Case 4:

Ans = 4 => This can happen if the number is of the form 4k(8m + 7).

n = {a2 + b2 + c2 + d2 : a, b, c, d ∈  W} ⟷  n ≡  {4k(8m + 7) : k, m ∈ W }
Example : 7, 15, 23 etc.
 * */

public class MinSquares {
	
	public static boolean isSquare(int n) {
		int s=(int)(Math.sqrt(n));
		return ((s*s)==n);
	}
	
	public static int countSquares(int n) {
		//Case 1: Perfect Square
		if(isSquare(n))
			return 1;
		//Case 2:
		//Check for reach n-(i*i) is a Perfect Square or not
		for(int i=1;i<=(int)(Math.sqrt(n));i++) {
			if(isSquare(n-(i*i)))
				return 2;
		}
		//Case 4: if the number is of the form 4^a(8b+7)
		while(n%4==0) {
			n=n>>2;
		}
		if(n%8==7)
			return 4;
		//Case 3
		return 3;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=countSquares(n);
		System.out.println(res);
		
	}

}
/*
 * Time Complexity: O(sqrtn)
Auxiliary Space: O(1)
 * */
