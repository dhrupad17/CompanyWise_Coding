package com.gfgWipro.Patterns;

import java.util.Scanner;

public class HollowPyramidStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int k=n;k>i+1;k--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i*2;j++) {
				if(i==n-1)
					System.out.print("*");
				else
				{
					if(j==0||j>=i*2) {
						System.out.print("*");
					}
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
