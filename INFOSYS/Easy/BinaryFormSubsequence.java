/*
 * Minimum number whose binary form is not a subsequence of given binary string
 * Given a binary string S of size N, the task is to find the minimum non-negative integer which is not a subsequence of the given string S in its binary form.

Examples:

Input: S = “0000”
Output:1
Explanation: 1 whose binary representation is “1” is the smallest non-negative integer which is not a subsequence of the given string in its binary form. 

Input: S = “10101”
Output: 8
 * */

package com.gfgInfosys.easy;

import java.util.Scanner;

public class BinaryFormSubsequence {
	
	public static boolean isSubsequence(String s1,int n,String s2,int m) {
		int j=0;
		for(int i=0;i<n && j<m; i++) {
			if(s1.charAt(j)==s2.charAt(i))
				j++;
		}
		return (j==m);
	}
	
	public static int findmin(String s) {
		int r=Integer.parseInt(s,2);
		int ans=r+1;
		for(int i=0;i<=r;i++){
			String p="";
			int j=i;
			while(j>0) {
				p+=(j%2)+"";
				j=j/2;
			}
			int m=p.length();
			int n=s.length();
			StringBuilder sb=new StringBuilder(p);
			sb.reverse();
			p=sb.toString();
			if(isSubsequence(p,m,s,n))
			{
				ans=i;
				break;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int res=findmin(s);
		System.out.println(res);

	}

}
