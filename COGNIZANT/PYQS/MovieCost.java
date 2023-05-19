/*
 * Problem Statement  – In a theater, there is a discount scheme announced where one gets a 10% discount on the total cost of tickets when there is a bulk booking of more than 20 tickets, and a discount of 2% on the total cost of tickets if a special coupon card is submitted. Develop a program to find the total cost as per the scheme. The cost of the k class ticket is Rs.75 and q class is Rs.150. Refreshments can also be opted by paying an additional of Rs. 50 per member.

Hint: k and q and You have to book minimum of 5 tickets and maximum of 40 at a time. If fails display “Minimum of 5 and Maximum of 40 Tickets”.  If circle is given a value other than ‘k’ or ‘q’ the output should be “Invalid Input”.

The ticket cost should be printed exactly to two decimal places.

Sample Input 1:

Enter the no of ticket:35
Do you want refreshment:y
Do you have coupon code:y
Enter the circle:k
Sample Output 1:

Ticket cost:4065.25
Sample Input 2:

Enter the no of ticket:1
Sample Output 2:

Minimum of 5 and Maximum of 40 Tickets
 * */

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
