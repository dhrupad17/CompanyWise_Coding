/*
Implement Atoi

Your task  is to implement the function atoi. The function takes a string(str) as argument and converts it to an integer and returns it.

Note: You are not allowed to use inbuilt function.

Example 1:

Input:
str = 123
Output: 123
Example 2:

Input:
str = 21a
Output: -1
Explanation: Output is -1 as all
characters are not digit only.

Expected Time Complexity: O(|S|), |S| = length of string str.
Expected Auxiliary Space: O(1)
*/
class Solution
{
    int atoi(String str) {
	// Your code here
	try{
	    return Integer.parseInt(str);
	    
	}catch(NumberFormatException e){
	    return -1;
	}
    }
}
