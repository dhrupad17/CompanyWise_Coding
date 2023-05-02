package com.gfgTcs;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=n;
		int sum=0;
		while(n!=0) {
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		if(num%sum==0)
			System.out.println("Harshad");
		else
			System.out.println("Not Harshad");
	}

}
