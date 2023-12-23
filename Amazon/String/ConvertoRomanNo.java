/*
Convert to Roman No

Given an integer n, your task is to complete the function convertToRoman which prints the corresponding roman number of n. Various symbols and their values are given below
Note:- There are a few exceptions for some numbers like 4 in roman is IV,9 in roman is IX, similarly, 40 is XL while 90 is XC. Similarly, 400 is CD while 900 is CM

I 1
V 5
X 10
L 50
C 100
D 500
M 1000

 

Example 1:

Input:
n = 5
Output: V
 

Example 2:

Input:
n = 3
Output: III

Expected Time Complexity: O(log10N)
Expected Auxiliary Space: O(log10N * 10)
*/

class Solution
{
	String convertToRoman(int n) {
		//code here
		String[] thos = {"","M","MM","MMM","MMM"};
		String[] huns = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String[] tens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String[] ones = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		
		return thos[n/1000]+huns[(n%1000)/100]+tens[(n%100)/10]+ones[n%10];
	}
}