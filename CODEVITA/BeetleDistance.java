/*
 * Problem Description
A 10cm x 10cm x 10cm solid cube rests on the ground. It has a beetle on it, as well as some sweet honey spots on the cube’s surface. The beetle begins at a point on the cube’s surface and moves in a clockwise direction along the cube’s surface to the honey spots.

If it goes from one point on the same face to another (say, X to Y), it goes in an arc of a circle that subtends an angle of 60 degrees at the circle’s center.
If it travels from one point to another on a different face, it takes the shortest path on the cube’s surface, except that it never travels along its bottom.
The beetle is a Cartesian geometry student who knows the coordinates (x, y, z) of all the points it needs to visit. Its coordinate origin is one of the cube’s corners on the ground, and the z-axis points up. As a result, z=0 is the bottom surface (on which it does not crawl), and z=10 is the top. The beetle keeps track of all distances traveled and rounded the distance to two decimal places when it arrives at the following location so that the final distance is a sum of the rounded distances from spot to spot.

Input

The first line returns an integer N, the total number of points visited by the beetle (including the starting point).

The second line contains 3N non-negative numbers, each with two decimal places. These are to be interpreted as the x, y, and z coordinates of the points the beetle must visit in the given order.

Output

One line containing a number representing the total distance traveled by the beetle to two decimal places. Even if the travel distance is an integer, the output should have two decimal places.

Constraints

None of the points visited by the beetle are on the bottom face (z=0) or on any of the cube’s edges (the lines where two faces meet)

2<=N<=10

Example
Input : 3
            1 1 10 2 1 10 0 1 9
Output : 4.05
Explanation :The beetle visits three different locations (N=3). The beetle begins on the cube's top face (z=10) at point (1,1,10) and moves to another point on the same face (2,1,10). Although the straight line distance is one, it travels on the arc of a circle with an angle of 60 degrees at its center and thus travels (2*pi)/6 or 1.05 (note that it rounds the distance at each leg of the journey). It moves along the cube's surface from (2,1,10) on the face z=10 to (0,1,9) on the face x=0. This is a three-mile distance. The total travel distance is 1.05+3=4.05. The result is 4.05
 * */

package com.codevita;

import java.util.Scanner;

public class BeetleDistance {
	
	static int sx,sy,sz;
	
	public static float shortestDistance(int x,int y,int z) {
		float dis;
        
        // check if the Z-axis and any other one axis are the same.
        if(z == sz && (y == sy || x == sx ) && sz != 0){
            
            //check if the x axis of next co-ordinate is same
            if(x != sx){
                dis = (2 * 3.14f * (Math.abs(x - sx))) / 6.0f;
            }
            
            //check if the y axis of next co-ordinate is same
            else{
                dis = (2 * 3.14f * (Math.abs(y - sy))) / 6.0f;
            }
        }
        else{
            dis = (int)(Math.sqrt(Math.pow(x - sx, 2) + Math.pow(y - sy, 2)) + Math.abs(z - sz));
        }
        sx = x;
        sy = y;
        sz = z;
        return dis;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		float sum=0.0f;
		int[] arr=new int[3*n];
		n=3*n;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sx=arr[0];
		sy=arr[1];
		sz=arr[2];
		
		for(int i=3;i<n;i=i+3) {
			sum=sum+shortestDistance(arr[i],arr[i+1],arr[i+2]);
		}
		System.out.printf("%.2f",sum);
	}

}
