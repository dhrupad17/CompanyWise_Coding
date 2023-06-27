/*
 * Find all elements in array which have at-least two greater elements
 * Given an array of n distinct elements, the task is to find all elements in array which have at-least two greater elements than themselves.

Examples : 

Input : arr[] = {2, 8, 7, 1, 5};
Output : 2  1  5  
Explanation:
The output three elements have two or more greater elements

Explanation:
Input  : arr[] = {7, -2, 3, 4, 9, -1};
Output : -2  3  4 -1  

 In the second method we simply calculate the second maximum element of the array 
 and print all element which is less than the second maximum. 
 * */

package com.gfgWipro.SDESheet.Easy;

import java.util.Scanner;

public class AtLeastTwoGreaterElements {
	
	public static void find(int arr[],int n) {
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]>first)
			{
				second=first;
				first=arr[i];
			}
			else if(arr[i]>second) {
				second=arr[i];
			}
		}
		for(int i=0;i<n;i++) {
			if(arr[i]<second)
				System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		find(arr,n);
	}

}
/*
 * Time Complexity: O(n)
Auxiliary Space: O(1).
 * */
