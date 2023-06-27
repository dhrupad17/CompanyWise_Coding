package com.gfgWipro.SDESheet.Easy;

import java.util.Scanner;

public class PythagrasTriplet {
	
	public static boolean checkTriplet(int[] arr,int n) {
		//Step 1: Find maximum
		int max=-1;
		for(int i=0;i<n;i++) {
			max=Math.max(max, arr[i]);
		}
		// Step 2: Hash Array
		int hash[]=new int[max+1];
		for(int i=0;i<n;i++) {
			hash[arr[i]]++;
		}
		// Step 3: Iterate and find possible combinations of a and b and check C with conditions
		for(int i=1;i<max+1;i++) {
			if(hash[i]==0)//no a
				continue;
			for(int j=1;j<max+1;j++) {
				if((i==j && hash[i]==1) || hash[j]==0)
					continue;
				int c=(int)(Math.sqrt(i*i+j*j));
				//check for perfect square
				if((c*c)!=(i*i+j*j))
					continue;
				if(c>max)
					continue;
				if(hash[c]==1)
					return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		if(checkTriplet(arr,n))
			System.out.println("True");
		else
			System.out.println("False");
	}
}
/*
 * Time Complexity: O(N), Traversing the string of length N one time.
Auxiliary Space: O(1)
 * */