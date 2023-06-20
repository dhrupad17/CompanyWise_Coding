/*
 * Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.

Examples:

Example 1:
Input: [1,2,4,7,7,5]
Output: Second Smallest : 2
	Second Largest : 5
Explanation: The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2

Example 2:
Input: [1]
Output: Second Smallest : -1
	Second Largest : -1
Explanation: Since there is only one element in the array, it is the largest and smallest element present in the array. There is no second largest or second smallest element present.
 * */

package com.gfg.Tcs.Arrays;

import java.util.Scanner;

public class SecondSmallLarge {
	
	public static int secondLargest(int arr[],int n) {
		if(n<2)
			return -1;
		int large=Integer.MIN_VALUE;
		int secondlarge=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]>large) {
				secondlarge=large;
				large=arr[i];
			}
			else if(arr[i]>secondlarge && arr[i]!=large ) {
				secondlarge=arr[i];
			}
		}
		return secondlarge;
	}
	
	public static int secondSmallest(int arr[],int n) {
		if(n<2)
			return -1;
		int small=Integer.MAX_VALUE;
		int secondSmall=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]<small) {
				secondSmall=small;
				small=arr[i];
			}
			else if(arr[i]<secondSmall && arr[i]!=small ) {
				secondSmall=arr[i];
			}
		}
		return secondSmall;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int ss=secondSmallest(arr,n);
		int sl=secondLargest(arr,n);
		System.out.println(ss);
		System.out.println(sl);
	}
}

/*
 * Time Complexity: O(N), Single-pass solution

Space Complexity: O(1)
 * */
