/*
 * Remove Characters from first String present in the Second String
Problem Statement: Given two strings, write a program to remove characters from the first string which are present in the second string.

Examples:

Example 1:
Input: String str1 = “abcdef”
       String str2 = “cefz”
Output: abd
Explanation: The common characters in both strings are c, e, f.
So after removing these characters from string 1 we get string resulting string as abd.


Example 2:
Input: String str1 = “xyzpw”
       String str2 = “lmno”
Output: xyzpw
Explanation: As there is no common character in both the strings, string 1 remains unchanged.
 * */

package com.gfgTcs.String;

import java.util.HashMap;
import java.util.Scanner;

public class OnlyFirstString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		StringBuffer sb=new StringBuffer();
		HashMap<Character,Integer>hm=new HashMap<>();
		for(int i=0;i<s2.length();i++) {
			hm.put(s2.charAt(i), 1);
		}
		for(int i=0;i<s1.length();i++) {
			if(hm.get(s1.charAt(i))==null) {
				sb.append(s1.charAt(i));
			}
		}
		System.out.println(sb.toString());

	}

}

/*
 * Time Complexity: O(n)

Space Complexity: O(n) for HashMap in Java
 * */
