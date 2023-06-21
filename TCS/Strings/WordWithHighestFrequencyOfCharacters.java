/*
 * Find word with highest number of repeated letters in string
Problem Statement: Write a program to find a word in a given string that has the highest number of repeated letters. If not found, return -1.

Examples:

Example 1:
Input: string=”abcdefghij google microsoft”
Output: google
Explanation: In “google” g appears 2 times, o appears 2 times which is highest among all words

Example 2:
Input: string = “cameron blue”
Output: -1
Explanation: No word has more than 1 letter.
 * */

package com.gfgTcs.String;

import java.util.Scanner;

public class WordWithHighestFrequencyOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String res="";
		
		int len=s.length();
		int max=0;
		int currmax=0;
		for(int left=0;left<len;) {
			int right=left+1;
			while(right<len && s.charAt(right)!=' ') {
				right++;
			}
			int[] freq=new int[26];
			currmax=0;
			for(int i=left;i<right;i++){
				freq[s.charAt(i)-'a']++;
			}
			for(int i=0;i<freq.length;i++) {
				if(freq[i]>1) {
					currmax++;
				}
			}
			if(currmax>max) {
				max=currmax;
				res="";
				for(int j=left;j<right;j++) {
					res=res+s.charAt(j);
				}
			}
			left=right+1;
		}
		
		if(res.equals("")) {
			System.out.println(-1);
		}
		else
		{
			System.out.println(res);
		}
	}
}
/*
 * Time complexity: O(n^2)

Reason: Outer Loop is used to traverse the Left pointer. Updating frequency array, traversing right pointer, updating curr_maximumword are part of the inner loop.

Space complexity: O(1)
 * */
