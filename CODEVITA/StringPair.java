/*
 * String Pairs | TCS Codevita 2020
 * One person hands over the list of digits to Mr. String, But Mr. String understands only strings. Within strings also he understands only vowels. Mr. String needs your help to find the total number of pairs which add up to a certain digit D.

The rules to calculate digit D are as follows:

Take all digits and convert them into their textual representation.
Next, sum up the number of vowels i.e. {a, e, i, o, u} from all textual representation. This sum is digit D.
Now, once digit D is known find out all unordered pairs of numbers in input whose sum is equal to D. 
Problem Statement: Given an array arr[] consisting of N ( 1 ≤ N ≤ 100 ) integers, the task is to convert each array element ( 1 ≤ arr[i] ≤ 100 ) into their respective textual representations and print the lowercase representation of the count of all possible pairs from the array whose sum is equal to the total count of vowels present in their textual representation. If the count exceeds 100 print “greater 100”. Note: For the number 100, convert it to textual representation as hundred and not as one hundred.

Examples:

Input: arr[] = {1, 2, 3, 4, 5}
Output: one
Explanation:
1 -> one -> o, e (2 vowels)
2 -> two -> o (1 vowel)
3 -> three -> e, e (2 vowels)
4 -> four -> o, u (2 vowels)
5 -> five – > i, e (2 vowels)
The total count of vowels in their textual representations = {2 + 1 + 2 + 2 + 2} = 9. Now from the given array, only a single unordered pair {4, 5} sums up to 9. Therefore, the count is 1. Hence, the required output is “one“.

Input: arr[] = {7, 4, 2, }
Output: zero
Explanation:
7 -> seven -> e, e (2 vowels)
4 -> four -> o, u (2 vowels)
2 -> two -> o (1 vowel)
The total count of vowels in their textual representation = {2 + 2 + 1} = 5. Now from the given array, no pair exists which adds up to 5. Therefore, the answer is “zero“.
 * */

package com.codevita;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(getPairsCount(arr,n));
	}
	public static String getPairsCount(int[] arr,int n) {
		String[] vowels= {"a","e","i","o","u"};
		int vowelCount=0;
		for(int num:arr) {
			String numText=convertToText(num);
			
			for(String vowel:vowels) {
				vowelCount=vowelCount+countOccurrences(numText,vowel);
			}
		}
		int pairCount=countPairs(arr,vowelCount);
		
		if(pairCount>100)
			return "greater 100";
		else
			return convertToText(pairCount);
	}
	
	public static String convertToText(int num) {
		String[] digitTexts = {
	            "zero", "one", "two", "three", "four",
	            "five", "six", "seven", "eight", "nine",
	            "ten", "eleven", "twelve", "thirteen", "fourteen",
	            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
	            "twenty", "thirty", "forty", "fifty", "sixty",
	            "seventy", "eighty", "ninety", "hundred"
	        };
		if(num<20)
			return digitTexts[num];
		else if(num<100) {
			int tens=num/10;
			int ones=num%10;
			return digitTexts[18+tens]+ (ones != 0 ? "-" + digitTexts[ones] : "");
		}
		else if(num==100)
			return "hundred";
		
		return "";
	}
	
	public static int countOccurrences(String text,String target) {
		int count=0;
		int ind=text.indexOf(target);
		while(ind!=-1) {
			count++;
			ind=text.indexOf(target,ind+1);
		}
		
		return count;			
	}
	
	public static int countPairs(int[] arr,int targetSum) {
		int pairCount=0;
		Map<Integer,Integer> hm=new HashMap<>();
		for(int i:arr) {
			int complement=targetSum-i;
			if(hm.containsKey(complement)) {
				pairCount=pairCount+(hm.get(complement));
			}
			hm.put(i, hm.getOrDefault(i, 0)+1);
		}
		return pairCount;
	}

}

/*
 * Time Complexity: O(N2)
Auxiliary Space: O(N2)
 * */
