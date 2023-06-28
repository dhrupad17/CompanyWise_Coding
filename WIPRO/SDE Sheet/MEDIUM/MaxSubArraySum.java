/*
 * Largest Sum Contiguous Subarray (Kadane’s Algorithm)
 * Given an array arr[] of size N. The task is to find the sum of the contiguous subarray within a arr[] with the largest sum. 
 * -2, -3, 4, -1, -2, 1, 5, -3 Output -> 7
 * */

package com.gfgWipro.SDESheet.Medium;

import java.util.Scanner;

public class MaxSubArraySum {
	
	public static int maxSum(int arr[]) {
		int maxSoFar=Integer.MIN_VALUE;
		int maxEnd=0;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			maxEnd=maxEnd+arr[i];
			if(maxSoFar<maxEnd)
				maxSoFar=maxEnd;
			if(maxEnd<0)
				maxEnd=0;
		}
		return maxSoFar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(maxSum(arr));

	}

}
//Time Complexity: O(N)
//Auxiliary Space: O(1)