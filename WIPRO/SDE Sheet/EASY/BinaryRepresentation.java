package com.gfgWipro.SDESheet.Easy;

import java.util.Scanner;

public class BinaryRepresentation {
	
	//Approach using bitwise operator
	public static void binary(int num) {
		if(num>1)
		{
			binary(num>>1);
		}
		System.out.print(num&1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		binary(n);

	}

}
/*
 * Time Complexity: O(log N)
Auxiliary Space: O(log N)
 * */
