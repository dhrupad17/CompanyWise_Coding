/*
 * Number of perfect squares between two given numbers
 * Given two given numbers a and b where 1<=a<=b, find the number of perfect squares between a and b (a and b inclusive).
 * */

package com.gfgWipro.SDESheet.Medium;

import java.util.Scanner;

public class PerfectSquaresWithinRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int res=(int)(Math.floor(Math.sqrt(b))-Math.ceil(Math.sqrt(a)))+1;
		System.out.print(res);

	}

}
/*
 * Time Complexity: O(logn)

Auxiliary Space: O(1)
 * */