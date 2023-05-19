package com.gfgCognizant.PYQS;

import java.util.Scanner;

public class FOEcollege {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of students placed in CSE: ");
		int c=sc.nextInt();
		System.out.print("Enter the no of students placed in ECE: ");
		int e=sc.nextInt();
		System.out.print("Enter the no of students placed in MECH: ");
		int m=sc.nextInt();
		
		if(c<0 || e<0 ||m<0) {
			System.out.println("Input is Invalid");
			System.exit(0);
		}
			
		if(c==e && e==m && c==m) {
			System.out.println("None of the department has got the highest placement");
			System.exit(0);
		}
		if(c==e && c>m && e>m) {
			System.out.println("Highest placement");
			System.out.println("CSE");
			System.out.println("ECE");
		}
		else if(e==m && e>c) {
			System.out.println("Highest placement");
			System.out.println("ECE");
			System.out.println("MECH");
		}
		else if(c==m && c>e) {
			System.out.println("Highest placement");
			System.out.println("CSE");
			System.out.println("MECH");
		}
		else {
			int max=(Math.max(Math.max(c, e), m));
			System.out.println("Highest placement");
			if(max==c)
				System.out.println("CSE");
			else if(max==e)
				System.out.println("ECE");
			else
				System.out.println("MECH");
		}
	}

}
