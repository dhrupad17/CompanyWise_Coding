/*
 * Find all the non-repeating elements in an array
Problem Statement: Find all the non-repeating elements for a given array. Outputs can be in any order.

Examples:

Example 1:
Input:
 Nums = [1,2,-1,1,3,1]
Output:
 2,-1,3
Explanation:
 1 is the only element in the given array which occurs thrice in the array. -1,2,3 occurs only once and hence, these are non-repeating elements of the given array.

Example 2:
Input:
 Nums = [1,2,3]
Output:
 1,2,3
Explanation:
 All elements present in the array occur once. Hence, every element is non-repeating.
 * */

package com.gfg.Tcs.Arrays;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class NonRepeating {

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
			if(ent.getValue()==1)
			{
				System.out.print(ent.getKey()+" ");
			}
		}

	}

}

/*
 * Time Complexity: O(N)

Reason: Iterating once through the array once.

Space Complexity: O(N)

Reason: Map is used to insert elements.
 * */
