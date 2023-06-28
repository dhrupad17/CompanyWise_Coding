/*
 * Inversion count in Array using Merge Sort
 * Inversion Count for an array indicates – how far (or close) the array is from being sorted. If the array is already sorted, then the inversion count is 0, but if the array is sorted in reverse order, the inversion count is the maximum. 

Given an array arr[]. The task is to find the inversion count of arr[]. Where two elements arr[i] and arr[j] form an inversion if a[i] > a[j] and i < j.

Examples: 

Input: arr[] = {8, 4, 2, 1}
Output: 6
Explanation: Given array has six inversions: (8, 4), (4, 2), (8, 2), (8, 1), (4, 1), (2, 1).
 * */

package com.gfgWipro.SDESheet.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class CountInversions {
	
	public static int merge(int arr[],int low,int mid,int high) {
		int i=0;
		int j=0;
		int k=low;
		int swaps=0;
		int left[]=Arrays.copyOfRange(arr, low, mid+1);
		int right[]=Arrays.copyOfRange(arr, mid+1, high+1);
		while(i<left.length && j<right.length) {
			if(left[i]<=right[j]) {
				arr[k++]=left[i++];
			}
			else {
				arr[k++]=right[j++];
				swaps=swaps+((mid+1)-(low+i));
			}	
		}
		while(i<left.length)
			arr[k++]=left[i++];
		while(j<right.length)
			arr[k++]=right[j++];
		
		return swaps;
		
	}
	
	public static int mergeSortCount(int arr[],int low,int high) {
		int count=0;
		while(low<high) {
			int mid=low+(high-low)/2;
			count+=mergeSortCount(arr,low,mid);
			count+=mergeSortCount(arr,mid+1,high);
			count+=merge(arr,low,mid,high);
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(mergeSortCount(arr,0,n-1));

	}

}
//Time Complexity: O(N * log N), The algorithm used is divide and conquer i.e. merge sort whose complexity is O(n log n).
//Auxiliary Space: O(N), Temporary array.