/*
 * Count number of occurrences (or frequency) in a sorted array
Given a sorted array arr[] and a number x, write a function that counts the occurrences of x in arr[]. Expected time complexity is O(Logn)
 * */

package com.gfg.Tcs.PYQs;

import java.util.Scanner;

public class CountOccurances {
	
	public static int countfreq(int[] arr,int n,int k) {
		int firstoccur=firstocc(arr,n,k);
		if(firstoccur==-1)
			return 0;
		int lastoccur=lastocc(arr,n,k);
		return lastoccur-firstoccur+1;
	}
	
	public static int firstocc(int[] arr,int n,int k) {
		int low=0;
		int high=n-1;
		int res=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==k) {
				res=mid;
				high=mid-1;
			}
			else if(arr[mid]<k) {
				low=mid+1;
			}
			else
				high=mid-1;
		}
		return res;
	}
	public static int lastocc(int[] arr,int n,int k) {
		int low=0;
		int high=n-1;
		int res=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==k) {
				res=mid;
				low=mid+1;
			}
			else if(arr[mid]<k) {
				low=mid+1;
			}
			else
				high=mid-1;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int res=countfreq(arr,n,k);
		System.out.println(res);
	}

}
