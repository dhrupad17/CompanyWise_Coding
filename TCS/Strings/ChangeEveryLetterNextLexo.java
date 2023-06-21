/*
 * Change every letter with next lexicographic alphabet
Problem Statement: Given a string, write a program to change every letter in the given string with the letter following it in the alphabet (ie. a becomes b, p becomes q, z becomes a)

Examples:

Example 1:
Input: string str = “abcdxyz”
Output: bcdeyza
Explanation:

Example 2:
Input: string str = “Java”
Output: Kbwb
Explanation:
 * */

package com.gfgTcs.String;

import java.util.Scanner;

public class ChangeEveryLetterNextLexo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String temp="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='z')
				ch='a';
			else if(ch=='Z')
				ch='A';
			else 
				ch=(char)(ch+1);
			temp=temp+ch;
		}
		System.out.println(temp);

	}

}
/*
 *  Time Complexity: O(n)
Space Complexity:  O(n), for StringBuffer
 */