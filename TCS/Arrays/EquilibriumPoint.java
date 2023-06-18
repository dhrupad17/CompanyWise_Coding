/*
 * Finding Equilibrium index in an array

Given a 0-indexed integer array nums, find the leftmost equilibrium Index.

An equilibrium Index is an index at which sum of elements on its left is equal to the sum of element on its right. That is, nums[0] + nums[1] + … + nums[equilibriumIndex-1] == nums[equilibriumIndex+1] + nums[equilibriumIndex+2] + … + nums[nums.length-1]. If equilibriumIndex == 0, the left side sum is considered to be 0. Similarly, if equilibriumIndex == nums.length – 1, the right side sum is considered to be 0.

Return the leftmost equilibrium Index that satisfies the condition, or -1 if there is no such index.
 * */

package com.gfg.Tcs.Arrays;

import java.util.Scanner;

public class EquilibriumPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int equi=-1;
		int totalsum=0;
		int leftsum=0;
		for(int i=0;i<n;i++) {
			totalsum=totalsum+arr[i];
		}
		int rightsum=totalsum;
		for(int i=0;i<n;i++) {
			rightsum=rightsum-arr[i];
			if(leftsum==rightsum)
			{
				equi=i;
				System.out.println(equi);
				System.exit(0);
			}
			leftsum+=arr[i];
		}
		System.out.println(equi);
	}
}

/*
 * Time Complexity: O(N)

Space Complexity: O(1)
 * */
