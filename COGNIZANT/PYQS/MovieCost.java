package com.gfgCognizant.PYQS;

import java.util.Scanner;

public class MovieCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of ticket: ");
		int t=sc.nextInt();
		if(t<5 || t>40) {
			System.out.print("Minimum of 5 and Maximum of 40 Tickets");
			System.exit(0);
		}
		System.out.print("Do you want refreshment: ");
		char r=sc.next().charAt(0);
		System.out.print("Do you have coupon code: ");
		char c=sc.next().charAt(0);
		System.out.print("Enter the circle: ");
		char cir=sc.next().charAt(0);
		int cost=0;
		if(cir=='k') {
			cost=75*t;
		}
		else if(cir=='q') {
			cost=150*t;
		}
		else
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		double totalcost=cost;
		if(t>20) {
			totalcost=cost-(0.1*cost);
		}
		if(c=='y') {
			totalcost=totalcost-(0.02*totalcost);
		}
		if(r=='y') {
			totalcost=totalcost+(50*t);
		}
		System.out.printf("Ticket cost: %.2f",totalcost);

	}

}
