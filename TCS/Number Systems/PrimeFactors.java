package com.gfgTcs;

import java.util.Scanner;

public class PrimeFactors {
	
	public static void primeFactors(int n) {
		for(int i=2;i*i<=n||n>1;i++) {
			if(n%i==0)
			{
				while(n%i==0) {
					System.out.print(i+",");
					n=n/i;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		primeFactors(n);

	}

}
