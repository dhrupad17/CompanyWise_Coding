package com.gfgTcs;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean flag=true;
		int sq=n*n;
		while(n!=0) {
			if(sq%10!=n%10) {
				flag=false;
				break;
			}
			n=n/10;
			sq=sq/10;
		}
		if(flag==true)
			System.out.println("Automorphic");
		else
			System.out.println("Not Automorphic");	
	}
}
