/*
 * Given a string as an input. We need to write a program that will print all non-empty substrings of that given string.
 * */

package com.gfg.Tcs.PYQs;

import java.util.Scanner;

public class PrintAllSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<=n;j++) {
				System.out.print(s.substring(i,j)+" ");
			}
		}
	}
}
