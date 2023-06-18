/*
 * Sort Elements of an Array by Frequency

Problem Statement: Given an array of integers, having some duplicate elements, sort the array by frequency.

Examples:

Example 1:
Input: N = 8, array[] = {1,2,3,2,4,3,1,2}
Output: 2 2 2 1 1 3 3 4 
Explanation: Since  2 is present 3 times in an array , so print it 3 times ,then print ‘1’ 2 times and then ‘3’ 2 times and 4 has least frequency, it will be printed at last.

Example 2:
Input: N = 6, array[] = {-199,6,7,-199,3,5}
Output: -199 -199 3 5 6 7
Explanation: Since -199 is present 2 times so it will be printed at first , then 3 , 5 ,6 ,7 are present once in array , so print them in their sorted order.
 * */
package com.gfg.Tcs.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Element{
	int val;
	int freq;
	Element(int val,int freq){
		this.val=val;
		this.freq=freq;
	}
}

public class SortByFrequency {
	
	public static void freqSort(int arr[],int n) {
		Map<Integer,Integer> hm=new HashMap<>();
		//Freq store
		for(int i:arr) {
			hm.put(i, hm.getOrDefault(i, 0)+1);
		}
		//List to store "ELEMENTS"
		List<Element> list=new ArrayList<>();
		for(int i:hm.keySet()) {
			list.add(new Element(i,hm.get(i)));
		}
		
		//Sorting by order of Frequencies
		Collections.sort(list,new Comparator<Element>(){
			public int compare(Element e1,Element e2) {
				if(e1.freq!=e2.freq) {
					return Integer.compare(e2.freq, e1.freq); // Sort by descending frequency
				}
				else
					return Integer.compare(e1.val, e2.val); // If frequencies are equal, sort by ascending value
			}
		});
		
		//Modify the original array by this sorted list
		
		int k=0;
		for(Element ele:list) {
			int value=ele.val;
			int frequency=ele.freq;
			while(frequency>0) {
				arr[k++]=value;
				frequency--;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		freqSort(arr,n);
		System.out.println("Sorted array by frequency:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
}
}
