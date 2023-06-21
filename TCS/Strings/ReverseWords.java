/*
 * Reverse Words in a String
Problem Statement: Given a string s, reverse the words of the string.

Examples:

Example 1:
Input: s=”this is an amazing program”
Output: “program amazing an is this”

Example 2:
Input: s=”This is decent”
Output: “decent is This”
 * */

package com.gfgTcs.String;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int left=0;
		int right=s.length()-1;
		String ans="";
		String temp="";
		while(left<=right) {
			char ch=s.charAt(left);
			if(ch!=' ') {
				temp=temp+ch;
			}
			else if(ch==' ') {
				if(!ans.equals("")) {
					ans=temp+" "+ans;
				}
				else
				{
					ans=temp;
				}
				temp="";
			}
			left++;
		}
		//Last Word Addition
		if(!temp.equals("")) {
			if(!ans.equals("")) {
				ans=temp+" "+ans;
			}
			else {
				ans=temp;
			}
		}
		System.out.println(ans);
	}
}

/*
 * Time Complexity: O(N), N~length of string

Space Complexity: O(1), Constant Space
 * */
