package com.gfgTcs.SortingAlgo;

import java.util.Scanner;

public class SelectionSort {
	
	public static void selectionsort(int[] arr,int n) {
		int i,j,temp,min;
		for(i=0;i<n-1;i++) {
			min=i;
			for(j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
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
		selectionsort(arr,n);
		print(arr,n);

	}

}
