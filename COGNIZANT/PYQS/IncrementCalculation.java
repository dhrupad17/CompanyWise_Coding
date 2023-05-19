/*
 * XYZ Technologies is in the process of increment the salary of the employees.  This increment is done based on their salary and their performance appraisal rating.

If the appraisal rating is between 1 and 3, the increment is 10% of the salary.
If the appraisal rating is between 3.1 and 4, the increment is  25% of the salary.
If the appraisal rating is between 4.1 and 5, the increment is  30% of the salary.
Help them to do this,  by writing a program that displays the incremented salary. Write a class “IncrementCalculation.java” and write the main method in it.

Note   :   If either the salary is 0 or negative  (or) if the appraisal rating is not in the range 1 to 5 (inclusive), then the output should be “Invalid Input”.

Sample Input 1 :

Enter the salary
8000

Enter the Performance appraisal rating
3

Sample Output  1 :

8800

Sample Input  2 :

Enter the salary
7500

Enter the Performance appraisal rating
4.3

Sample Output  2 :

9750

Sample Input  3 :

Enter the salary
-5000

Enter the Performance appraisal rating
6

Sample Output  3 :

Invalid Input
 * */

package com.gfgCognizant.PYQS;

import java.util.Scanner;

public class IncrementCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the salary :");
		int sal=sc.nextInt();
		System.out.print("Enter the Performance appraisal rating :");
		int rating=sc.nextInt();
		if(sal<=0 || (rating<=0 || rating >5)) {
			System.out.println("Invalid Input");
			return;
		}
		double total=0.0;
		double salary=sal*1.00;
		if(rating>=1 && rating <=3)
			total=salary+(0.1*salary);
		if(rating>3 && rating<=4)
			total=salary+(0.2*salary);
		if(rating>4 && rating<=5)
			total=salary+(0.3*salary);
		System.out.println(total);
	}
}
