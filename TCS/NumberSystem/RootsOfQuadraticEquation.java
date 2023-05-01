/*Given a quadratic equation in the form ax2 + bx + c, (Only the values of a, b and c are provided) 
 * the task is to find the roots of the equation.
 * Input  :  a = 1, b = 7, c = 12
Output:  Roots are real and different
-3, -4

Input  :  a = 1, b = 1, c = 1
Output :  Roots are complex 
-0.5 + i1.73205, -0.5 – i1.73205*/

package com.gfgTcs;

import java.util.Scanner;

public class RootsOfQuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a==0) {
			System.out.println("iInvalid");
			System.exit(0);
		}
		double d=(b*b)-(4*a*c);
		double sq=Math.sqrt(Math.abs(a));
		double root1=0.0;
		double root2=0.0;
		if(d>0) {
			System.out.println("Roots are real and different");
			root1=(-b+sq)/(2*a);
			root2=(-b-sq)/(2*a);
			System.out.println(root1+"\t"+root2);
		}
		else if(d==0) {
			System.out.println("Roots are real and same");
			root1=(-b)/(2*a);
			root2=(-b)/(2*a);
			System.out.println(root1+"\t"+root2);
		}
		else {
			System.out.println("Roots are complex");
			System.out.println((-b)/(2*a)+"+i"+sq/(2*a)+"\t"+(-b)/(2*a)+"-i"+sq/(2*a));
		}
	}
}
