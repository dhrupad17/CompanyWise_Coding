/*
 * Check if two Strings are anagrams of each other
Problem Statement: Given two strings, check if two strings are anagrams of each other or not.

Examples:

Example 1:
Input: CAT, ACT
Output: true
Explanation: Since the count of every letter of both strings are equal.

Example 2:
Input: RULES, LESRT 
Output: false
Explanation: Since the count of U and T  is not equal in both strings.
 * */

package com.gfgTcs.String;

import java.util.Scanner;

public class Anagram {
	
	public static boolean isAnagram(String s1,String s2) {
		if(s1.length()!=s2.length())
			return false;
		int freq[]=new int[26];
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		for(int i=0;i<s1.length();i++) {
			freq[s1.charAt(i)-'a']++;
		}
		for(int i=0;i<s1.length();i++) {
			freq[s2.charAt(i)-'a']--;
		}
		for(int i=0;i<26;i++) {
			if(freq[i]!=0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		boolean flag=isAnagram(s1,s2);
		if(flag)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}

}

/*
 * Time Complexity: O(n) where n is the length of string

Space Complexity: O(1) 
 * */
