package com.gfgTcs;

import java.util.Scanner;

public class AddTwoFractions {
	
	public static int gcd(int a,int b) {
		if(b==0)
			return a;
		return gcd(b,a%b);
	}
	
	public static void simplest(int num3,int den3) {
		
		int hcf=gcd(num3,den3);
		
		num3/=hcf;
		den3/=hcf;
		
		System.out.println(num3+"/"+den3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int den1=sc.nextInt();
		int num2=sc.nextInt();
		int den2=sc.nextInt();
		int lcm=(den1*den2)/gcd(den1,den2);
		
		int den3=lcm;
		
		int num3=num1*(den3/den1)+num2*(den3/den2);
		
		System.out.print(num1+"/"+den1+"+"+num2+"/"+den2+"= ");
		
		simplest(num3,den3);
		

	}

}
