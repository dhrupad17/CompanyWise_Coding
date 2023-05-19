/*
 * Problem Statement – To speed up his composition of generating unpredictable rhythms, Blue Bandit wants the list of prime numbers available in a range of numbers.Can you help him out?

Write a java program to print all prime numbers in the interval [a,b] (a and b, both inclusive).

Note

Input 1 should be lesser than Input 2. Both the inputs should be positive. 
Range must always be greater than zero.
If any of the condition mentioned above fails, then display “Provide valid input”
Use a minimum of one for loop and one while loop
Sample Input 1:

2

15

Sample Output 1:

2 3 5 7 11 13

Sample Input 2:

8

5

Sample Output 2:

Provide valid input
 * */

package com.gfgCognizant.PYQS;

import java.util.Scanner;

public class PrimeRange {
	
	public static boolean isPrime(int n) {
		if(n<=1)
			return false;
		else
		{
			for(int i=2;i*i<=n;i++) {
				if(n%i==0)
					return false;
			}
			return true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b)
		{
			System.out.println("Provide valid input");
			return;
		}
		for(int i=a;i<=b;i++) {
			if(isPrime(i))
				System.out.print(i+" ");
		}
	}
}
