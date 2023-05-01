/*
 * Given a prime number N. The task is to check if it is possible to express N as the sum of two separate prime numbers.
Note: The range of N is less than 108.

Examples: 

Input: N = 13
Output: Yes
Explanation: The number 13 can be written as 11 + 2, 
here 11 and 2 are both prime.

Input: N = 11
Output: No*/

package com.gfgTcs;

import java.util.Scanner;

public class ExpressNumAsSumOfTwoPrime {
	
	public static boolean isPrime(int n) {
		if(n==1)
			return false;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public static boolean ispossible(int n) {
		if(isPrime(n) && isPrime(n-2))
			return true;
		return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(ispossible(n))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
