/*
 * You are playing an online game. In the game, a list of N numbers is given. The player has to arrange the numbers so that all the odd numbers of the list come after the even numbers. Write an algorithm to arrange the given list such that all the odd numbers of the list come after the even numbers.

Input

The first line of the input consists of an integer numbers, representing the size of the list(N).
The second line of the input consists of N space-separated integers representing the values of the list
Output

Print N space-separated integers such that all the odd numbers of the list come after the even numbers

Example

Sample Input

8

10 98 3 33 12 22 21 11

Sample Output

10 98 12 22 3 33 21 11
 * */

package com.gfgWipro.PYQs;

import java.util.Scanner;

public class ArrangeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int p1=0;
		int p2=n-1;
		while(p1<p2) {
			while(arr[p1]%2==0 && p1<p2) {
				p1++;
			}
			while(arr[p2]%2!=0 && p1<p2) {
				p2--;
			}
			if(p1<p2) {
				int temp=arr[p1];
				arr[p1]=arr[p2];
				arr[p2]=temp;
				p1++;
				p2--;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
