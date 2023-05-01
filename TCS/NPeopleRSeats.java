package com.gfgTcs;

import java.util.Scanner;

public class NPeopleRSeats {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		int ans=1;
		for(int i=n;i>=n-r+1;i--) {
			ans=ans*i;
		}
		System.out.println(ans);
	}
}
