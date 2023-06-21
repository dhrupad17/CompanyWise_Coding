/*
 * Problem Statement: Given an array of pairs, find all the symmetric pairs in the array.

Examples:

Example 1:
Input: (1,2),(2,1),(3,4),(4,5),(5,4)
Output: (2,1) (5,4)
Explanation: Since (1,2) and (2,1) are symmetric pairs and (4,5) and (5,4) are symmetric pairs.

Example 2:
Input: (1,5),(2,3),(4,2),(5,1),(2,4)
Output: (2,4) (5,1)
Explanation: Since (1,5) and (2,4) are symmetric pairs and (5,1) and (4,2) are symmetric pairs.
 * */

package com.gfg.Tcs.Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class SymmetricPairs {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][2];
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<n;i++) {
			int first=arr[i][0];
			int second=arr[i][1];
			if(hm.get(second)!=null && hm.get(second)==first)
				System.out.println("( "+first+" ,"+second+" )");
			hm.put(first, second);
		}
		
	}
}

/*
 * Time Complexity: O(N).

Space Complexity: O(N), for using a hashmap.
 * */
