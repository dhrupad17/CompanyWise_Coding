/*
 * Given the heights of N towers and a value of K, Either increase or decrease the height of every tower by K (only once) where K > 0. After modifications, the task is to minimize the difference between the heights of the longest and the shortest tower and output its difference.

Examples: 

Input: arr[] = {1, 15, 10}, k = 6
Output:  Maximum difference is 5.
Explanation: Change 1 to 7, 15 to 9 and 10 to 4. Maximum difference is 5 (between 4 and 9). We can’t get a lower difference.

Input: arr[] = {1, 5, 15, 10}, k = 3   
Output: Maximum difference is 8, arr[] = {4, 8, 12, 7}
 * */

package com.gfgInfosys.medium;

import java.util.Arrays;
import java.util.Scanner;

public class MinimizeMaximumDifferenceHeights {
	
	public static int find(int[] arr,int n,int k) {
		int minheight=Arrays.stream(arr).min().getAsInt();
		int maxheight=Arrays.stream(arr).max().getAsInt();
		
		int initialdiff=maxheight-minheight;
		int avgheight=(maxheight+minheight)/2;
		
		for(int i=0;i<n;i++) {
			if(arr[i]<=avgheight) {
				arr[i]+=k;
			}
			else
			{
				arr[i]-=k;
			}
		}
		int newminheight=Arrays.stream(arr).min().getAsInt();
		int newmaxheight=Arrays.stream(arr).max().getAsInt();
		
		int newdiff=newmaxheight-newminheight;
		return (newdiff > initialdiff) ? initialdiff
                : newdiff;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int res=find(arr,n,k);
		System.out.println(res);
	}
}

/*
 * Time Complexity: O(N), where N refers to the number of towers.
Auxiliary Space: O(1), this is because we are not using any additional data structure.
 * */
