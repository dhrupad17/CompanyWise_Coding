/*
 * Print all the duplicates in the string

Problem Statement: Given a string of characters from a to z. Print the duplicate characters(which are occurring more than once) in the given string with their occurrences count.

Examples:

Example 1:
Input:
 str= "sinstriiintng"
Output:
i - 4
n - 3
s - 2
t - 2
Explanation:
In the above example, 's' occurs twice, 'i' occurs four times, 't' occurs twice and 'n' occurs thrice. 'r' and 'g' occur only one time and hence are not considered.

Example 2:
Input:
 str= "abcdefg"
Output:
< -- No Output -- >
Explanation:

In the above example, every character occurs only once(no duplicates), therefore nothing to print.
 * */

package com.gfgTcs.String;

import java.util.Scanner;

public class AllDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count[]=new int[26];
		for(int i=0;i<s.length();i++) {
			count[s.charAt(i)-'a']++;
		}
		for(int i=0;i<26;i++) {
			if(count[i]>1)
			{
				System.out.println((char)(i+'a')+" "+count[i]);
			}
		}

	}

}
/**/