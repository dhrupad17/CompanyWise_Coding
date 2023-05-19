/*
 * Problem Statement – FOE college wants to recognize the department which has succeeded in getting the maximum number of placements for this academic year. The departments that have participated in the recruitment drive are CSE,ECE, MECH. Help the college find the department getting maximum placements. Check for all the possible output given in the sample snapshot

Note : If any input is negative, the output should be “Input is Invalid”.  If all department has equal number of placements, the output should be “None of the department has got the highest placement”.

Sample Input 1:

Enter the no of students placed in CSE:90
Enter the no of students placed in ECE:45
Enter the no of students placed in MECH:70
Sample Output 1:

Highest placement
CSE

Sample Input 2:

Enter the no of students placed in CSE:55
Enter the no of students placed in ECE:85
Enter the no of students placed in MECH:85
Sample Output 2:

Highest placement
ECE

MECH

Sample Input 3:

Enter the no of students placed in CSE:0
Enter the no of students placed in ECE:0
Enter the no of students placed in MECH:0
Sample Output 3:

None of the department has got the highest placement
Sample Input 4:

Enter the no of students placed in CSE:10
Enter the no of students placed in ECE:-50
Enter the no of students placed in MECH:40
Sample Output 4:

Input is Invalid
 * */

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
