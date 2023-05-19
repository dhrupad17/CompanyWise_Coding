/*
 * Problem Statement – Ritik wants a magic board, which displays a character for a corresponding number for his science project. Help him to develop such an application.
For example when the digits 65,66,67,68 are entered, the alphabet ABCD are to be displayed.
[Assume the number of inputs should be always 4 ]
 * */


package com.gfgCognizant.PYQS;

import java.util.Scanner;

public class MagicBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digits: \n");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int n4=sc.nextInt();
		char a=(char)n1;
		char b=(char)n2;
		char c=(char)n3;
		char d=(char)n4;
		System.out.println(n1+"-"+a);
		System.out.println(n2+"-"+b);
		System.out.println(n3+"-"+c);
		System.out.println(n4+"-"+d);
	}

}
