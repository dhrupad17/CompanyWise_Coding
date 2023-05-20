/*
 * Problem
1, 2, 1, 3, 2, 5, 3, 7, 5, 11, 8, 13, 13, 17, ……..
This series is a mixture of 2 series – all the odd terms in this series form a Fibonacci series and all the even terms are the prime numbers in ascending order.

Write a program to find the Nth term in this series.

The value N is a Positive integer that should be read from STDIN.
The Nth term that is calculated by the program should be written to STDOUT.
Other than the value of Nth term, no other characters/strings or message should be written to STDOUT.
For example, when N = 14, the 14th term in the series is 17. So only the value 17 should be printed
 * */

package com.gfg.Tcs.PYQs;

import java.util.Scanner;

public class nthElementofSeries {
	
	static int max=9999;
	
	static void nthfibo(int n) {
		int a=0;
		int b=1;
		int c;
		for(int i=1;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(a);
	}
	
	static void nthprime(int n) {
		int count=0;
		for(int i=2;i<=max;i++) {
			int flag=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				if(++count==n)
				{
					System.out.println(i);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==1)
			nthfibo(n/2+1);
		else
			nthprime(n/2);
	}
}
