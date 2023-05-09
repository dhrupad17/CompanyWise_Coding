/*
 * Write a program to implement a bubble sort algorithm for sorting the elements of an array. We are given with a array of N elements and we need to sort them in ascending order. But in this question we need to use Bubble sort, to sort the given array.

Input Format:

The first line corresponds to the size of an array.
The second line corresponds to the elements.
Output Format:

Print the N elements of the array in ascending order.

Sample Input:

6

11 15 26 38 9 10 

Sample Output:

9 10 11 15 26 38

Explanation :

Here, we have 6 elements and array elements are 11 15 26 38 9 10, Sorted array in ascending order will be 9 10 11 15 26 38.
 * */

package com.gfgWipro.PYQs;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<n-1;i++) {
			count=0;
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					count++;
				}
			}
			if(count==0)
				break;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
