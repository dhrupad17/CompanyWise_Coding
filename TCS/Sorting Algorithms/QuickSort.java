package com.gfgTcs.SortingAlgo;

import java.util.Scanner;

public class QuickSort {
	
	public static int partition(int[] arr,int low,int high) {
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<=pivot) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		
		return i+1;
	}
	
	
	
	public static void quicksort(int[] arr,int low,int high) {
		if(low<high) {
			int part=partition(arr,low,high);
			quicksort(arr,low,part-1);
			quicksort(arr,part+1,high);
		}
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
		quicksort(arr,0,n-1);
		print(arr,n);

	}

}
