package com.gfgInfosys.easy;

import java.util.HashSet;
import java.util.Scanner;

public class CountUniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		HashSet<Character> hs=new HashSet<>();
		for(int i=0;i<s.length();i++) {
			hs.add(s.charAt(i));
		}
		System.out.println(hs.size());
		

	}

}
