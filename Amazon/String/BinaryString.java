/*
Binary String

Given a binary string S. The task is to count the number of substrings that start and end with 1. For example, if the input string is “00100101”, then there are three substrings “1001”, “100101” and “101”.

Example 1:

Input:
N = 4
S = 1111
Output: 6
Explanation: There are 6 substrings from
the given string. They are 11, 11, 11,
111, 111, 1111.
Example 2:

Input:
N = 5
S = 01101
Output: 3
Explanation: There 3 substrings from the
given string. They are 11, 101, 1101.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
*/
class Solution
{
    //Function to count the number of substrings that start and end with 1.
    public static int binarySubstring(int a, String str)
    {
        // Your code here
        int total=0;
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                total+=count;
                count++;
            }
        }
        return total;
    }
}