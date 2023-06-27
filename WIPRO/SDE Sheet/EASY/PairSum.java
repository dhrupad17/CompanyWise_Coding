package com.gfgWipro.SDESheet.Easy;

import java.util.HashSet;
import java.util.Scanner;

public class PairSum {
	
	public static void checkPairSum(int arr[],int n,int k) {
		HashSet<Integer>hs=new HashSet<>();
		for(int i=0;i<n;i++) {
			int temp=k-arr[i];
			if(hs.contains(temp)) {
				System.out.println("True");
				return;
			}
			hs.add(arr[i]);
		}
		System.out.println("No");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		checkPairSum(arr,n,k);

	}

}
/*
 * Time Complexity: O(N), As the whole array is needed to be traversed only once.
Auxiliary Space: O(N), A hash map has been used to store array elements.
 * */
