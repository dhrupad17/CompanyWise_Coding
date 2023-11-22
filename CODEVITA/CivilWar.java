/*
Civil War
========
Problem Description
In this superhero epic, the denizens of the Marvel Universe are forced to pick sides when Captain America and Iron Man come to blows over ideological differences.
The government decides to push for the Hero Registration Act, a law that limits a hero’s actions. This results in a division in The Avengers. Iron Man stands with this Act, claiming that their actions must be kept in check otherwise cities will continue to be destroyed, but Captain America feels that saving the world is daring enough and that they cannot rely on the government to protect the world. And here the civil war begins.

They are trying make their team stronger by adding more avengers to their team. There are N avengers lined up.

Rules to add avenger to their team-

Any team can start first. But they will alternatively only.
They can select avenger from any side. But if they start from one side they can’t move to other side in current chance.
They can select consecutive avengers as many they want.
They will stop only when all the avengers are part of either side.
Every Avenger has a power associated with him
There are some spurious avengers who will decrease the overall power of the team.
Both teams will select players optimally. Find the difference of powers of the two teams

Constraints
1<= N <= 10^6
-10^9 <= p[i] <= 10^9

Input
First line contains an integer denoting the number of Avengers(N).
Next lines contain N space separated values denoting power of every avenger(P[i]).

Output
Print the difference of the powers of teams
– Time Limit (secs)
1

Examples :
Input
5
2-78-1 20

Output
2
*/

package com.codevita;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class CivilWar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> powers=new ArrayList<>();
		for(int i=0;i<n;i++) {
			powers.add(sc.nextInt());
		}
		int powerA=0;
		int powerB=0;
		Collections.sort(powers, new Comparator() {
			@Override
			public int compare(Object A, Object B) {
				// TODO Auto-generated method stub
				int absA=Math.abs((int) A);
				int absB=Math.abs((int) B);
				if(absA==absB)
					return Integer.compare((int)B, (int)A);
				return Integer.compare(absB, absA);
			}
		});
		boolean ironMan=true;
		for(int i=0;i<n;i++) {
			if(ironMan) {
				powerA+=powers.get(i);
			}else
				powerB+=powers.get(i);
			ironMan=!ironMan;
		}
		int diff=Math.abs(powerA-powerB);
		System.out.println(diff);
		
	}

}
