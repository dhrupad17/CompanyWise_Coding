/*
 * Counting frequencies of array elements
Given an array which may contain duplicates, print all elements and their frequencies.
 * */

package com.gfg.Tcs.PYQs;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Frequencies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		HashMap<Integer,Integer>hm=new HashMap<>();
		for(int i=0;i<n;i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i],hm.get(arr[i])+1);
			}
			else
				hm.put(arr[i], 1);
		}
		for(Entry<Integer, Integer> i:hm.entrySet()) {
			System.out.println(i.getKey()+" "+i.getValue());
		}
	}
}
