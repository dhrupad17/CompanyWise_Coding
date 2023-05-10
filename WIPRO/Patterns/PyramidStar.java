package com.gfgWipro.Patterns;

import java.util.Scanner;

public class PyramidStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int k=n;k>i+1;k--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i*2;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
