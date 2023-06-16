/*
 * Question – :  Some prime numbers can be expressed as a sum of other consecutive prime numbers.

For example
5 = 2 + 3,
17 = 2 + 3 + 5 + 7,
41 = 2 + 3 + 5 + 7 + 11 + 13.
Your task is to find out how many prime numbers which satisfy this property are present in the range 3 to N subject to a constraint that summation should always start with number 2.
Write code to find out the number of prime numbers that satisfy the above-mentioned property in a given range.

Input Format: First line contains a number N

Output Format: Print the total number of all such prime numbers which are less than or equal to N.

Constraints: 2<N<=12,000,000,000*/

package com.codevita;

import java.util.List;
import java.util.Scanner; 

public class ConsecutivePrimeSum { 
	
	public static int Prime(int n) {
		if(n<2)
			return 0;
		for(int i=2;i<Math.sqrt(n);i++) {
			if(n%i==0)
				return 0;
		}
		return 1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N: ");
		int n = sc.nextInt();
		int sum =0; int k =1;
		int count =0;
		int arr[] = new int[25];
		arr[0] = 2;
		for(int i = 3 ; i<=n ;i++){
		int flag = 0;
		for(int j = 2 ; j <= i/2 ; j++) {
		if(i%j == 0)
		flag =1;
		}
		if(flag == 0) {
		arr[k] =i;
		k++;
		}
		} 
		for(int i =0 ; i<k;i++) {
		sum = sum +arr[i];
		int res =0;
		if(sum !=2 && sum <= n) {
		res = Prime(sum);
		if(res == 1) {
		System.out.println("Sum of Consecutive prime no : " + sum);
		count++;
		}
	}
}
System.out.println("Total Count: "+count);
} }