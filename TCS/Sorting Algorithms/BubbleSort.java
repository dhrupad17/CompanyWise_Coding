package com.gfgTcs.SortingAlgo;

import java.util.Scanner;

public class BubbleSort {
	
	public static void bubblesort(int[] arr,int n) {
		boolean swapped;
		int i,j,temp;
		for(i=0;i<n-1;i++) {
			swapped=false;
			for(j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
			}
			if(swapped==false)
				break;
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
		bubblesort(arr,n);
		print(arr,n);
	}

}
