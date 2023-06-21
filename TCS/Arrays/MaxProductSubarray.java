/*
 * Maximum Product Subarray in an Array
Problem Statement: Given an array that contains both negative and positive integers, find the maximum product subarray.

Examples:

Example 1:
Input:
 Nums = [1,2,3,4,5,0]
Output:
 120
Explanation:
 In the given array, we can see 1×2×3×4×5 gives maximum product value.


Example 2:
Input:
 Nums = [1,2,-3,0,-4,-5]
Output:
 20
Explanation:
 In the given array, we can see (-4)×(-5) gives maximum product value.
 * */

package com.gfg.Tcs.Arrays;

import java.util.Scanner;

public class MaxProductSubarray {
	
	public static int solve(int arr[],int n) {
		//Using Kadane's Algorithm
		int prod1=arr[0];
		int prod2=arr[0];
		int res=arr[0];
		for(int i=1;i<n;i++) {
			int temp=Math.max(arr[i], Math.max(arr[i]*prod1, arr[i]*prod2));
			prod2=Math.min(arr[i], Math.min(arr[i]*prod1, arr[i]*prod2));
			prod1=temp;
			res=Math.max(res, prod1);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int product=solve(arr,n);
		System.out.println(product);
	}
}
/*
 * Time Complexity: O(N)

Reason: A single iteration is used.

Space Complexity: O(1)

Reason: No extra data structure is used for computation
 * */
