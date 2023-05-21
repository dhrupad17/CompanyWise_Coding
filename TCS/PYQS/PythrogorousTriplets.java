/*
 * A Pythagorean triplet is a set of three integers a, b and c such that a2 + b2 = c2. Given a limit, generate all Pythagorean Triples with values smaller than given limit.

Input : limit = 20
Output : 3 4 5
         8 6 10
         5 12 13
         15 8 17
         12 16 20
 * */

package com.gfg.Tcs.PYQs;

import java.util.Scanner;

public class PythrogorousTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int limit=sc.nextInt();
		int a,b,c=0;
		int m=2;
		while(c<limit) {
			for(int n=1;n<m;n++) {
				a=m*m-n*n;
				b=2*m*n;
				c=m*m+n*n;
				if(c>limit)
					break;
				System.out.print(a+" "+b+" "+c+"\n");
			}
			m++;
		}
	}
}
