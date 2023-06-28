package com.gfgWipro.SDESheet.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class MinHeights {
	
	public static int diff(int arr[],int k) {
		Arrays.sort(arr);
		int n=arr.length;
		int ans=arr[n-1]-arr[0];
		//Find TempMin and TempMax
		int tempMin=arr[0];
		int tempMax=arr[n-1];
		for(int i=1;i<n;i++) {
			//If negative
			if(arr[i]-k<0)
				continue;
			tempMin=Math.min(arr[0]+k, arr[i]-k);
			tempMax=Math.max(arr[i-1]+k, arr[n-1]-k);
			ans=Math.min(ans,tempMax-tempMin);
		}
		return ans;
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
		System.out.println(diff(arr,k));
	}

}
//Time Complexity: O(N * log(N)), Time is taken for sorting
//Auxiliary Space: O(1)