/*
 * A digital machine generates binary data which consists of a string of 0s and 1s. A maximum signal M, in the data, consists of the maximum number of either 1s or 0s appearing consecutively in the data but M can’t be at the beginning or end of the string. Design a way to find the length of the maximum signal.

Input
The first line of the input consists of an integer N, representing the length of the binary string. The second line consists of a string of length N consisting of 0s and 1s only.

Output
Print an integer representing the length of the maximum signal.

Example
Example 1:

Input
6
101000

Output
1

Explanation
For 101000, M can be 0 at the second index or at the third index so in both cases max length = 1.

Example2:

Input
9
101111110

Output
6

Explanation
For 101111110, M = 111111 so maxlength = 6.
 * */

package com.gfgWipro.PYQs;

import java.util.Scanner;

public class DigitalMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		char ch=s.charAt(n-1);
		int i=n-1;
		while(s.charAt(i)==ch)
			i--;
		s=s.substring(0,i+1);
		ch=s.charAt(0);
		i=0;
		while(s.charAt(i)==ch)
			i++;
		s=s.substring(i);
		int count0=0;
		int count1=0;
		for(int j=0;j<s.length();j++) {
			if(s.charAt(j)=='0')
				count0++;
			else
				count0=0;
			if(s.charAt(j)=='1')
				count1++;
			else
				count1=0;
		}
		int res=Math.max(count0, count1);
		System.out.println(res);
	}

}
