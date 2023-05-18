/*
 * Vohra went to a movie with his friends in a Wave theatre and during  break time he bought pizzas, puffs and cool drinks. Consider   the following prices : 

Rs.100/pizza
Rs.20/puffs
Rs.10/cooldrink
Generate a bill for What Vohra has bought.
 * */

package com.gfgCognizant.PYQS;

import java.util.Scanner;

public class MovieTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of pizzas bought: ");
		int pizza=sc.nextInt();
		System.out.print("Enter the no of puffs bought: ");
		int puffs=sc.nextInt();
		System.out.print("Enter the no of cool drinks bought: ");
		int cd=sc.nextInt();
		int price= (100*pizza + 20*puffs +10*cd);
		System.out.println("Bill Details\n");
		System.out.println("No of pizzas: "+pizza);
		System.out.println("No of puffs: "+puffs);
		System.out.println("No of cooldrinks: "+cd);
		System.out.println("Total price= "+price);
		System.out.println("ENJOY THE SHOW!!!");
	}

}
