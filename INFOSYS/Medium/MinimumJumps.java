/*
 * Given an array arr[] where each element represents the max number of steps that can be made forward from that index. The task is to find the minimum number of jumps to reach the end of the array starting from index 0. If the end isn’t reachable, return -1.

Examples: 

Input: arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
Output: 3 (1-> 3 -> 9 -> 9)
Explanation: Jump from 1st element to 2nd element as there is only 1 step.
Now there are three options 5, 8 or 9. I
f 8 or 9 is chosen then the end node 9 can be reached. So 3 jumps are made.

Input:  arr[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
Output: 10
Explanation: In every step a jump is needed so the count of jumps is 10.
 * */

package com.gfgInfosys.medium;

import java.util.Scanner;

public class MinimumJumps {
	
	public static int minJumps(int[] arr,int n) {
		if(n<=1)
			return 0;
		if(arr[0]==0)
			return -1;
		int maxReach=arr[0];
		int steps=arr[0];
		int jumps=1;
		for(int i=1;i<n;i++) {
			if(i==n-1)
				return jumps;
			maxReach=Math.max(maxReach, i+arr[i]);
			steps--;
			if(steps==0)
			{
				jumps++;
				if(i>=maxReach) {
					return -1;
				}
				steps=maxReach-i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int res=minJumps(arr,n);
		System.out.println(res);
	}
}

/*
 * Time complexity: O(n).
Auxiliary Space: O(1).
 * */
