/*
 * Find Median of the given Array
Problem Statement: Given an unsorted array, find the median of the given array.

Examples:

Example 1:
Input: [2,4,1,3,5]
Output: 3

Example 2:
Input: [2,5,1,7]
Output: 3.5
 * */

package com.gfg.Tcs.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Median {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		double med=0.0;
		if(n%2==0)
		{
			int idx1=n/2;
			int idx2=n/2-1;
			med=(arr[idx1]+arr[idx2])/2.0;
		}
		else
			med=arr[n/2];
		System.out.println(med);
	}

}

/*
 * Time Complexity: O(N*log N), Sorting of array

Space Complexity: O(1)
 * */
