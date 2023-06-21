/*
 * Maximum occurring character in a string

Problem Statement: Given a string, return the character that occurs the maximum number of times in the string. If the maximum occurrence of two or more characters is the same, return any one of them. 

Examples:

Example 1:
Input: str = “takeuforward”
Output: a
Explanation: The character 'a' and 'r’ have the same  maximum occurrence i.e 2. Hence we can print any one of them

Example 2:
Input: str = “apple”
Output: p
Explanation: The character 'p' have the maximum occurrence i.e 2.
 * */

package com.gfgTcs.String;

import java.util.Scanner;

public class maxCharacterOccuring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count[]=new int[256];
		int maxfreq=0;
		char ans='a';
		for(int i=0;i<s.length();i++) {
			count[s.charAt(i)]++;
			if(count[s.charAt(i)]>maxfreq) {
				maxfreq=count[s.charAt(i)];
				ans=s.charAt(i);
			}
		}
		System.out.println(ans);

	}

}
/*
 * Time Complexity: O(N) to iterate through an array of size N.

Space Complexity: O(1) because for any input string only a fixed-size array is being allocated.
 * */
