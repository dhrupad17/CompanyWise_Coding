package com.gfgWipro.SDESheet.Easy;

import java.util.Scanner;

public class CirclesTouchOrIntersect {
	
	public static void check(int x1,int y1,int x2,int y2,int r1,int r2) {
		double d=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		if(d<=(r1-r2))
			System.out.println("Circle B is inside A.");
		else if(d<=(r2-r1))
			System.out.println("Circle A is inside B.");
		else if(d<(r1+r2))
			System.out.println("Circle intersects each other.");
		else if(d==(r1+r2))
			System.out.println("Circle A and B are in touch with each other.");
		else
			System.out.println("Circle A and B do not overlap");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		int r1=sc.nextInt();
		int r2=sc.nextInt();
		check(x1,y1,x2,y2,r1,r2);

	}

}
