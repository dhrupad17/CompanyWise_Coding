package com.gfgTcs;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int u=sc.nextInt();
		int sum=0;
		for(int i=l;i<=u;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
