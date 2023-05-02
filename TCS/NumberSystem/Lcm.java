package com.gfgTcs;

import java.util.Scanner;

public class Lcm {
	
	public static int gcd(int a,int b) {
		if(b==0)
			return a;
		return gcd(b,a%b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int GCD=gcd(a,b);
		int res=(a*b)/GCD;
		System.out.println(res);

	}

}
