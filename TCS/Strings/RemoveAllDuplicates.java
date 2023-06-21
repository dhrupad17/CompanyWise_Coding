package com.gfgTcs.String;

import java.util.Scanner;

public class RemoveAllDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count[]=new int[26];
		for(int i=0;i<s.length();i++) {
			count[s.charAt(i)-'a']++;
		}
		String temp="";
		for(int i=0;i<26;i++) {
			if(count[i]==1)
				temp=temp+i;
		}
		System.out.println(temp);

	}

}
