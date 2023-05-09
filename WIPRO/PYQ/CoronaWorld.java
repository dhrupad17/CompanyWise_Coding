/*
 * Dinesh is fond of video games. Due to the pandemic, he designs a video game called Corona world. In this game, the player enters the game with a certain energy. The player should defeat all the corona infected zombies to reach the next level. When time increases the zombies will increase double the previous minute. Anyhow the player can manage to fight against all the zombies. In this case, definitely the player can not achieve the promotion. Hence the player gets a superpower to destroy all the zombies in the current level when the current game time is a palindrome. Anyhow the player can manage only if he knows the time taken to get the superpower. Help the player by providing the minimum minutes needed to get the superpower by which he can destroy all the zombies. You will be provided with the starting time of the game.

Input Format:
First-line contains a string representing the starting time.

Output:
A string representing the minimum minutes needed to get the superpower.

Constraints:
Input time will be in 24 hours format

Sample Input:
05:39

Sample Output:
11

Explanation:
It takes 11 minutes for minute value to become 50, 05:50 is a palindromic time.

Sample Input :
Input
04:45

Sample Output:
65
 * */

package com.gfgWipro.PYQs;

import java.util.Scanner;

public class CoronaWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int hour,min;
		hour=((str.charAt(0)-'0')*10+(str.charAt(1)-'0'));
		min=((str.charAt(3)-'0')*10+(str.charAt(4)-'0'));
		int res=0;
		while(hour%10 != min/10 || hour/10 !=min%10) {
			min++;
			if(min==60) {
				min=0;
				hour++;
			}
			if(hour==24)
			{
				hour=0;
			}
			res++;
		}
		System.out.println(res);
	}
}
