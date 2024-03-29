/*
Longest Palindromic Substring

Given a string S, find the longest palindromic substring in S. Substring of string S: S[ i . . . . j ] where 0 ≤ i ≤ j < len(S). Palindrome string: A string which reads the same backwards. More formally, S is palindrome if reverse(S) = S. Incase of conflict, return the substring which occurs first ( with the least starting index ).


Example 1:

Input:
S = "aaaabbaa"
Output:
aabbaa
Explanation:
The longest palindrome string present in
the given string is "aabbaa".
*/
class Solution{
    String longestPalindrome(String S){
        // code here
        String res="";
        for(int i=0;i<S.length();i++){
            String odd=value(S,i,i);
            String even=value(S,i,i+1);
            if(odd.length()>even.length() && odd.length()>res.length())
                res=odd;
            else if(even.length()>odd.length() && even.length()>res.length())
                res=even;
        }
        return res;
    }
    String value(String S,int i,int j){
        String ans="";
        while(i>=0 && j<S.length() && S.charAt(i)==S.charAt(j)){
            i--;
            j++;
        }
        ans=S.substring(i+1,j);
        return ans;
    }
}