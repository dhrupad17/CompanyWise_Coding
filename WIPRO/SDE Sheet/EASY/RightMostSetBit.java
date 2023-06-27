/*
 * Position of rightmost set bit
 * 
 * Write a one-line function to return the position of the first 1 from right to left, in the binary representation of an Integer. 

Examples:

Input: n = 18
Output: 2
Explanation: Binary Representation of 18 is 010010, hence position of first set bit from right is 2.

Input:  n = 19
Output: 1
Explanation: Binary Representation of 19 is 010011, hence position of first set bit from right is 1.
 * */

package com.gfgWipro.SDESheet.Easy;

import java.util.Scanner;

/*
 * n&~(n-1)) always return the binary number containing the rightmost set bit as 1.
 *  if N = 12 (1100) then it will return 4 (100). 
 *  Here log2 will return, the number of times we can express that number in a power of two.
 *   For all binary numbers containing only the rightmost set bit as 1 like 2, 4, 8, 16, 32…. 
 *   Find that position of rightmost set bit is always equal to log2(Number) + 1.
 * */

public class RightMostSetBit {
	
	public static int position(int n) {
		return (int)((Math.log10(n & -n)/Math.log10(2))+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int pos=position(n);
		System.out.println(pos);

	}

}
/*
 * Time Complexity: O(log2N), Time taken by log2 function.
Auxiliary Space: O(1)
*/
