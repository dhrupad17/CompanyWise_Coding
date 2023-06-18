/*
 * Check if array is subset of another array.

Write a program to find whether an array is a subset of another array or not.

Given arr1[] and arr2[], we need to find whether arr1[] is a subset of arr2[]. An array is called a subset of another if all of its elements are present in the other array.

Note: Array elements are assumed to be unique.
 * */
package com.gfg.Tcs.Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class CheckSubsetArray {
	
	public static boolean checkSubset(int[] arr1,int m,int[] arr2,int n) {
		if(m>n)
			return false;
		HashMap<Integer,Boolean> hm=new HashMap<>();
		for(int i=0;i<n;i++) {
			hm.put(arr2[i], true);
		}
		for(int i=0;i<m;i++) {
			if(hm.containsKey(arr1[i])==false)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int arr1[]=new int[m];
		for(int i=0;i<m;i++) {
			arr1[i]=sc.nextInt();
		}
		int n=sc.nextInt();
		int arr2[]=new int[n];
		for(int i=0;i<n;i++) {
			arr2[i]=sc.nextInt();
		}
		if(checkSubset(arr1,m,arr2,n)) 
			System.out.println("Subset");
		else
			System.out.println("Not subset");
				
	}
}

