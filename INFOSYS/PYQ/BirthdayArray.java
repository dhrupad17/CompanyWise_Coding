/*
 * Problem Statement:

Your birthday is coming soon and one of your friends, Alex, is thinking about a gift for you. He knows that you really like integer arrays with interesting properties.

He selected two numbers, N and K and decided to write down on paper all integer arrays of length K (in form a[1], a[2], …, a[K]), where every number a[i] is in range from 1 to N, and, moreover, a[i+1] is divisible by a[i] (where 1 < i <= K), and give you this paper as a birthday present.

Alex is very patient, so he managed to do this. Now you’re wondering, how many different arrays are written down on this paper?

Since the answer can be really large, print it modulo 10000.

Input:

The first line contains an integer, n, denoting the maximum possible value in the arrays.
The next line contains an integer, k, denoting the length of the arrays.
Input	Output	Output Description
2
1	2	The required length is 1, so there are only two possible arrays: [1] and [2].
2
2	3	All possible arrays are [1, 1], [1, 2], [2, 2].
[2, 1] is invalid because 1 is not divisible by 2.
3
2	5	All possible arrays are [1, 1], [1, 2], [1, 3], [2, 2], [3, 3].
 * */

package com.gfgInfosys.misc;

import java.util.Scanner;

public class BirthdayArray {
	
	public static int counter(int n,int k) {
		if(k==1)
			return n;
		int c=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j%i==0)
					c++;
			}
		}
		return c;
	}
	
	public static int count(int n,int k) {
		if(k==1)
			return n;
		if(k==2)
			return counter(n,k);
		int mid=k/2;
		int x=count(n,k-mid);
		int y=count(n,mid);
		return x+y-1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		System.out.println(count(n,k));
		
	}

}
