/*
 * Java Program to Swap two Strings Without Using any Third Variable
 * Given two string variables, a and b, your task is to write a Java Program to swap these variables without using any temporary or third variable. Use of library methods is allowed.

Examples: 

Input: a = "Hello"
       b = "World"

Output:
Strings before swap: a = Hello and b = World
Strings after swap: a = World and b = Hello
 * */

package com.gfgInfosys.easy;

import java.util.Scanner;

public class SwapStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		str1=str1+str2;
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length());
		System.out.println(str1);
		System.out.println(str2);

	}

}
