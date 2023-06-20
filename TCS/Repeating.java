/*
 * Find all repeating elements in an array
Problem Statement: Find all the repeating elements present in an array.

Examples:

Example 1:
Input: 
Arr[] = [1,1,2,3,4,4,5,2]
Output:
 1,2,4
Explanation:
 1,2 and 4 are the elements which are occurring more than once.

Example 2:
Input:
 Arr[] = [1,1,0]
Output:
 1
Explanation:
 Only 1 is occurring more than once in the given array.
 * */

package com.gfg.Tcs.Arrays;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class Repeating {

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
			if(hm.get(arr[i])==null)
				hm.put(arr[i], 1);
			else
				hm.put(arr[i],hm.get(arr[i])+1);
		}
		for(Entry<Integer, Integer> ent:hm.entrySet()) {
			if(ent.getValue()>1)
			{
				System.out.print(ent.getKey()+" ");
			}
		}
	}
}
	


/*
 * Time Complexity: O(N)

Reason: Entire array is traversed to insert them in the map.

Space Complexity: O(N)

Reason: Map is used to store the count of each element
 * */
