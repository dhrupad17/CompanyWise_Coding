/*
 * Given an array of integers A, and an integer K find number of happy elements.

Element X is happy if there exists at least 1 element whose difference is less than K i.e. an element X is happy if there is another element in the range [X-K, X+K] other than X itself.

Constraints

1 <= N <= 10^5
0 <= K <= 10^5
0 <= A[i] <= 10^9
Input

First line contains two integers N and K where N is size of the array and K is a number as described above.
Second line contains N integers separated by space.
Output

Print a single integer denoting the total number of happy elements.
Example 1

Input

6 3

5 5 7 9 15 2

Output

5

Explanation

Other than number 15, everyone has at least 1 element in the range [X-3, X+3]. Hence they are all happy elements. Since these five are in number, the output is 5.

Example 2

Input

3 2

1 3 5

Output

3

Explanation

All numbers have at least 1 element in the range [X-2, X+2]. Hence they are all happy elements. Since these three are in number, the output is 3.
 * */

package com.codevita;

import java.util.Scanner;
import java.util.TreeSet;

public class CountPairs {
	
	public static int count(int[] arr,int k) {
		int hc=0;
		TreeSet<Integer> ts=new TreeSet<>();
		for(int i=0;i<arr.length;i++) {
			int curr=arr[i];
			//Find smallest element greater than or equal to x-k
			Integer higher=ts.ceiling(curr-k);
			if(higher!=null && higher<=(curr+k)) {
				hc++;
			}
			ts.add(arr[i]);
		}
		return hc+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int happyCount=count(arr,k);
		System.out.println(happyCount);

	}

}
