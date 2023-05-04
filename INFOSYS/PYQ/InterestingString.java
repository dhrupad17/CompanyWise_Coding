/*
 * You have an interesting string S of length N. It is interesting because you can rearrange the characters of this string in any order. You want to cut this string into some contiguous pieces such that after cutting, all the pieces are equal to one another.

You can’t rearrange the characters in the cut pieces or join the pieces together. You want to make the number of pieces as large as possible. What is the maximum number of pieces you can get?

Note: You can observe that you may not want to cut the string at all, therefore the number of pieces is 1. Hence, the answer always exists.

Input Format

S :: STRING
The first line contains a string, S, denoting the string.
length(S) :: 1 -> 2 * 10^5

Sample Input 1:
zzzzz

Sample Output 1 :
5

Sample input 2:
ababcc

Sample Output 2:
2

Sample input 2:
abccdcabacda

Sample Output 2:
2
 * */

package com.gfgInfosys.misc;

import java.util.HashMap;
import java.util.Scanner;

public class InterestingString {
	
	public static int ans(String s) {
		HashMap<Character,Integer> map=new HashMap<>();
		
		for(int i=0;i<s.length();i++) {
			if(!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), 1);
			}
			else
			{
				map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 1)+1);
			}
		}
		int key=10000;
		int val=0;
		for(int i=0;i<s.length();i++) {
			if(key>map.get(s.charAt(i)))
			{
				val=map.get(s.charAt(i));
				key=map.get(s.charAt(i));
			}
		}
		return val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		System.out.println(ans(s));

	}

}
