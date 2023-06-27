/*
 * Given an array of n distinct integers sorted in ascending order, write a function that returns a Fixed Point in the array, if there is any Fixed Point present in array, else returns -1. Fixed Point in an array is an index i such that arr[i] is equal to i. Note that integers in array can be negative. 
Examples: 
 

  Input: arr[] = {-10, -5, 0, 3, 7}
  Output: 3  // arr[3] == 3 

  Input: arr[] = {0, 2, 5, 8, 17}
  Output: 0  // arr[0] == 0 


  Input: arr[] = {-10, -5, 3, 4, 7, 9}
  Output: -1  // No Fixed Point
 * */

package com.gfgWipro.SDESheet.Easy;

import java.util.Scanner;

public class FixedPoint {
	
	public static int binarySearch(int[] arr,int low,int high) {
		if(low<=high) {
			int mid=low+(high-low)/2;
			if(mid==arr[mid])
				return mid;
			int res=-1;
			if(mid+1<=arr[high]) {
				res=binarySearch(arr,mid+1,high);
			}
			if(res!=-1)
				return res;
			if(mid-1>=arr[low])
				return binarySearch(arr,low,mid-1);
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int ans=binarySearch(arr,0,n-1);
		System.out.println(ans);

	}

}

/*
 * Time Complexity: O(log n)
Auxiliary Space: O(log n) (As implicit stack is used for recursive calls)
 * */
