package com.gfg.Tcs.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int target=sc.nextInt();
		int left=0;
		int right=n-1;
		int ans=-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(arr[mid]==target) {
				ans=mid;
				break;
			}
			else if(arr[mid]>target)
			{
				right=mid-1;
			}
			else
			{
				left=mid+1;
			}
		}
		if(ans==-1)
		{
			System.out.println("Not Found");
		}
		else
			System.out.println("Found at position "+ans);
	}
}
