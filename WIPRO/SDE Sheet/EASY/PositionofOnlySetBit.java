/*
 * Find position of the only set bit
 * Given a number N having only one ‘1’ and all other ’0’s in its binary representation, find position of the only set bit. If there are 0 or more than 1 set bit the answer should be -1. Position of set bit ‘1’ should be counted starting with 1 from the LSB side in the binary representation of the number.
 * */
package com.gfgWipro.SDESheet.Easy;

import java.util.Scanner;

public class PositionofOnlySetBit {
	
	public static boolean checkPowerof2(int n) {
		if(n>0 && (n & (n-1))==0)
			return true;
		return false;
	}
	
	public static int position(int n) {
		// If not power of 2 then the number do not have only one set bit
		if(!checkPowerof2(n)) {
			return -1;
		}
		int pos=1;
		int i=1;
		while((i & n)==0) {
			i=i<<1;
			pos++;
		}
		return pos;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=position(n);
		if(ans==-1)
			System.out.println("Invalid Input");
		else
			System.out.println(ans);
	}

}
// Time Complexity: O(log2n), where n is the given number
// Space Complexity: O(1)