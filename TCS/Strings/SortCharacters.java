package com.gfgTcs.String;

import java.util.Arrays;
import java.util.Scanner;

public class SortCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		Arrays.sort(ch);
		String ans=new String(ch);
		System.out.println(ans);
	}
}
