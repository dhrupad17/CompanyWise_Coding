package com.gfgCognizant.PYQS;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the month: ");
		int m=sc.nextInt();
		if(m>=3 && m<=5)
			System.out.println("Season:Spring");
		else if(m>=6 && m<=8)
			System.out.println("Season:Summer");
		else if(m>=9 && m<=11)
			System.out.println("Season:Autumn");
		else if(m== 12 || m==1 || m==2)
			System.out.println("Season:Winter");
		else
			System.out.println("Invalid Input");
	}
}
