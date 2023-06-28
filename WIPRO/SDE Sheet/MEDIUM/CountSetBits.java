/*
 * Count set bits in an integer
 * Write an efficient program to count the number of 1s in the binary representation of an integer.
Examples : 

Input : n = 6
Output : 2
Binary representation of 6 is 110 and has 2 set bits

Input : n = 13
Output : 3
Binary representation of 13 is 1101 and has 3 set bits
 * */

package com.gfgWipro.SDESheet.Medium;

import java.util.Scanner;

public class CountSetBits {
	
	public static int count(int n) {
		int c=0;
		while(n>0) {
			c=c+(n & 1);
			n=n>>1;
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//		System.out.println(Integer.bitCount(n)); Method 1 
		System.out.println(count(n));

	}

}

//Time Complexity: O(log n) 
//Auxiliary Space: O(1)
