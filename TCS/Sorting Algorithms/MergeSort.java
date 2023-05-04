package com.gfgTcs.SortingAlgo;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {
	
	public static void merge(int[]  arr,int low,int mid,int high) {
		ArrayList<Integer>list=new ArrayList<>();
		int left=low;
		int right=mid+1;
		while(left<=mid && right<=high) {
			if(arr[left]<=arr[right]) {
				list.add(arr[left]);
				left++;
			}
			else {
				list.add(arr[right]);
				right++;
			}
				
		}
		while(left<=mid) {
			list.add(arr[left]);
			left++;
		}
		while(right<=high) {
			list.add(arr[right]);
			right++;
		}
		for(int i=low;i<=high;i++) {
			arr[i]=list.get(i-low);
		}
	}
	
	public static void mergesort(int [] arr,int low,int high) {
		if(low>=high)
			return;
		int mid=(low+high)/2;
		mergesort(arr,low,mid);
		mergesort(arr,mid+1,high);
		merge(arr,low,mid,high);
	}
	
	public static void print(int[] arr,int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		print(arr,n);
		System.out.println();
		mergesort(arr,0,n-1);
		print(arr,n);

	}

}
