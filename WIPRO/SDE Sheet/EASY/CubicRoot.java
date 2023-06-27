package com.gfgWipro.SDESheet.Easy;

import java.util.Scanner;

public class CubicRoot {
	
	public static double cubic(double n) {
		double start=0;
		double end=n;
		double e=0.0000001;
		while(start<=end) {
			double mid=start+(end-start)/2;
			if(Math.abs(n-(Math.pow(mid, 3)))<e) {
				return mid;
			}
			else if(Math.pow(mid,3)>n)
				end=mid;
			else if(Math.pow(mid, 3)<n)
				start=mid;	
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double n=sc.nextDouble();
		System.out.println(cubic(n));

	}

}
/*
 * Time Complexity: O(logn)
Auxiliary Space: O(1)
 * */