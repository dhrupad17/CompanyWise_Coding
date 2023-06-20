/*
 * Remove Duplicates From an Unsorted Array
Problem Statement: Given an unsorted array, remove duplicates from the array.

Examples:

Example 1:
Input: arr[]={2,3,1,9,3,1,3,9}
Output:  {2,3,1,9}

Explanation: Removed all the duplicate elements

Example 2:
Input: arr[]={4,3,9,2,4,1,10,89,34}
Output: {3,4,9,2,1,10,34,89}
Explanation: Removed all the duplicate elements
 * */

package com.gfg.Tcs.Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class RemoveDuplicatesUnsorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		HashMap<Integer,Integer>hm=new HashMap<>();
		for(int i=0;i<n;i++) {
			if(!hm.containsKey(arr[i])) {
				System.out.print(arr[i]+" ");
			}
			hm.put(arr[i], 1);
		}
	}

}
/*
 * Time Complexity: O(n) + O(n) = O(n)

Reason:Iteration in array , searching hash table

Space Complexity : O(n) 

Reason : Using hashing
 * */
