/*
 * Problem Statement – Write a program to calculate the fuel consumption of your truck.The program should ask the user to enter the quantity of diesel to fill up the tank and the distance covered till the tank goes dry.Calculate the fuel consumption and display it in the format (liters per 100 kilometers).

Convert the same result to the U.S. style of miles per gallon and display the result. If the quantity or distance is zero or negative display ” is an Invalid Input”.

[Note: The US approach of fuel consumption calculation (distance / fuel) is the inverse of the European approach (fuel / distance ). Also note that 1 kilometer is 0.6214 miles, and 1 liter is 0.2642 gallons.]

The result should be with two decimal place.To get two decimal place refer the below-mentioned print statement :

float cost=670.23;

System.out.printf(“You need a sum of Rs.%.2f to cover the trip”,cost);
 * */


package com.gfgCognizant.PYQS;

import java.util.Scanner;

public class FuelConsumption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of liters to fill the tank ");
		int l=sc.nextInt();
		double ll=l*1.00;
		if(l<=0)
		{
			System.out.println(l+" is an invalid input ");
			System.exit(0);
		}
		System.out.println("Enter the distance covered ");
		int d=sc.nextInt();
		double dd=d*1.00;
		if(d<=0)
		{
			System.out.println(d+" is an invalid input ");
			System.exit(0);
		}
		
		double lp100=(ll/dd)*100;
		System.out.printf("Liters/100KM :\n%.2f\n",lp100);
		
		double dim=d*0.6214;
		double fig=l*0.2642;
		double mg=dim/fig;
		
		System.out.printf("Miles/gallons :\n%.2f",mg);
		
	}

}
