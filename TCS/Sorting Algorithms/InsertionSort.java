package com.gfgTcs.SortingAlgo;

import java.util.Scanner;

public class InsertionSort {
	
	public static void insertionsort(int[] arr,int n) {
		int i,j,temp;
		for(i=0;i<n;i++) {
			j=i;
			while(j>0 && arr[j-1]>arr[j]) {
				temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				j--;
			}
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
		insertionsort(arr,n);
		print(arr,n);

	}

}
