/*
 * Problem Statement – Goutam and  Tanul plays  by  telling numbers.  Goutam says a number to Tanul.  Tanul should first reverse the number and check if it is same as the original.  If yes,  Tanul should say “Palindrome”.  If not, he should say “Not a Palindrome”.  If the number is negative, print “Invalid Input”.  Help Tanul by writing a program.

Sample Input 1 :

21212

Sample Output 1 :

Palindrome

Sample Input 2 :

6186

Sample Output 2 :

Not a Palindrome
 * */

package com.gfgCognizant.PYQS;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<0)
		{
			System.out.println("Invalid Input");
			return;
		}
		int num=n;
		int rev=0;
		while(num!=0)
		{
			int d=num%10;
			rev=rev*10+d;
			num=num/10;
		}
		if(rev==n)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}
