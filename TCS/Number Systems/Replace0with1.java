package com.gfgTcs;

import java.util.Scanner;

public class Replace0with1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=1;
		int ans=0;
		while(n!=0) {
			int d=n%10;
			if(d==0) {
				d=1;
			}
			ans=d*temp+ans;
			temp=temp*10;
			n=n/10;
		}
		System.out.println(ans);
	}

}
