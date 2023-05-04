package com.gfgInfosys.misc;

import java.util.Scanner;

public class MaxDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int maxdig=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]<=arr[i+1]) {
				maxdig=Math.max(arr[i+1]-arr[i]+1,maxdig);
				arr[i+1]=arr[i]-1;
			}
			
		}
		int res=(int)Math.sqrt(maxdig);
		System.out.println(res);

	}

}
