package com.gfgWipro.SDESheet.Easy;

import java.util.Scanner;

public class MaxOccuringCharacter {
	
	public static char maxOccur(String s) {
		int n=s.length();
		int count[]=new int[256];
		for(int i=0;i<n;i++) {
			count[s.charAt(i)]++;
		}
		char res = ' ';
		int max=-1;
		for(int i=0;i<n;i++) {
			if(max<count[i])
			{
				max=count[i];
				res=s.charAt(i);
			}
		}
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch=maxOccur(s);
		System.out.println(ch);

	}

}
/*
 * Time Complexity: O(N), Traversing the string of length N one time.
Auxiliary Space: O(1)
 * */