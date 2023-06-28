/*
 * Fastest Efficient Approach: Using Binary Search
 * */

package com.gfgWipro.SDESheet.Medium;

import java.util.Scanner;

public class RemoveDuplicates {
	
	public static int binarySearch(int arr[],int low,int high,int val) {
		int n=arr.length;
		int res=-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]<=val)
				low=mid+1;
			else {
				res=mid;
				high=mid-1;
			}
		}
		if(res==-1)
			return n;
		return res;
	}
	
	public static int removeDuplicates(int arr[]) {
		int n=arr.length;
		int idx=0;
		while(idx!=n) {
			int i=binarySearch(arr,idx+1,n-1,arr[idx]);// It finds upper bound of elememt.
			if(i==n)//No Upper Bound
				return idx+1;
			idx++;
			arr[idx]=arr[i];
		}
		return idx+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int new_n=removeDuplicates(arr);
		for(int i=0;i<new_n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
/*
 * Time Complexity: O(logN) ,Using Binary Search as a traversal technique
Auxiliary Space: O(1),No extra space is used
 * */