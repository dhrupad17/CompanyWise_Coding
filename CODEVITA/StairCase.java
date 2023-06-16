/*There are n stairs, a person standing at the bottom wants to reach the top. The person can climb either 1 stair or 2 stairs at a time. Count the number of ways, the person can reach the top.
 Input: n = 1
Output: 1
There is only one way to climb 1 stair

Input: n = 2
Output: 2
There are two ways: (1, 1) and (2)

Input: n = 4
Output: 5
(1, 1, 1, 1), (1, 1, 2), (2, 1, 1), (1, 2, 1), (2, 2) */

package com.codevita;

import java.util.Scanner;

public class StairCase {
	
	public static int countWays(int n) {
		int prev1=1;
		int prev2=1;
		for(int i=2;i<=n;i++) {
			int curr=prev1+prev2;
			prev2=prev1;
			prev1=curr;
		}
		return prev1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=countWays(n);
		System.out.println(res);
	}
}
