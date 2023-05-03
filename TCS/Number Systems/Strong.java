package com.gfgTcs;

import java.util.Scanner;

public class Strong {
	
	public static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=n;
		int sum=0;
		while(n!=0) {
			int d=n%10;
			sum=sum+factorial(d);
			n=n/10;
		}
		if(num!=0 && sum==num)
			System.out.println("Strong");
		else
			System.out.println("Not Strong");
	}

}
