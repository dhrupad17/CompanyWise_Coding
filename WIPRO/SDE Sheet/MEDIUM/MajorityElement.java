/*
 * Find the majority element in the array. A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element). 

Examples : 

Input : A[]={3, 3, 4, 2, 4, 4, 2, 4, 4}
Output : 4
Explanation: The frequency of 4 is 5 which is greater than the half of the size of the array size. 

Input : A[] = {3, 3, 4, 2, 4, 4, 2, 4}
Output : No Majority Element
Explanation: There is no element whose frequency is greater than the half of the size of the array size.
 * */

package com.gfgWipro.SDESheet.Medium;

import java.util.Scanner;

//Moore Voting's Algorithm

public class MajorityElement {
	
	public static int majority(int arr[],int n) {
		int res=0;
		int count=1;
		for(int i=0;i<n;i++) {
			if(arr[i]==arr[res])
			{
				count++;
			}
			else
				count--;
			if(count==0) {
				res=i;
				count=1;
			}
		}
		return arr[res];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(majority(arr,n));

	}

}
//wORKS Only when majority element occurs > n/2 times
//Time Complexity: O(n), As two traversal of the array, is needed, so the time complexity is linear.
//Auxiliary Space: O(1), As no extra space is required.