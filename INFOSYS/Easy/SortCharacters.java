/*
 * Given a string of lowercase characters from ‘a’ – ‘z’. We need to write a program to print the characters of this string in sorted order.

Examples: 

Input : bbccdefbbaa 
Output : aabbbbccdef

Input : geeksforgeeks
Output : eeeefggkkorss
 * */

package com.gfgInfosys.easy;

import java.util.Scanner;

public class SortCharacters {
	
	static int maxchar=26;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int[] letters=new int[maxchar];
		for(char c:s.toCharArray()) {
			letters[c-'a']++;
		}
		for(int i=0;i<maxchar;i++) {
			for(int j=0;j<letters[i];j++) {
				System.out.print((char)(i+'a'));
			}
		}
	}
}

/*
 * Time Complexity: O(Max_CHAR*n) which becomes O(n) as MAX_CHAR is  constant,So Overall Time Complexity:- O(n) where n is the length of the string.  
Auxiliary Space: O( 1 ).
 * */
