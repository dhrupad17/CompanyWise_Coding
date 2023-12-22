/*
First Non Repeating Character

Given a string S consisting of lowercase Latin Letters. Find the first non-repeating character in S.

Example 1:

Input:
N = 5
S = hello
Output: h
Explanation: 'h', 'e' and 'o' are the
non-repeating characters out of which
'h' has the least index.
Example 2:

Input:
N = 12
S = zxvczbtxyzvy
Output: c
Explanation: 'c', 'b' and 't' are the
non-repeating characters out of which
'c' has the least index.
Your Task:
You don't need to read input or print anything. Your task is to complete the function find() which takes the string S as its input and returns the first non-repeating character present in S or -1 if there is no non-repeating character. Since the return type is a string we first need to change the character into a string.

Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(|S|).
*/
class Sol
{
    // return the first non-repeating char in S.
    // if there's no non-repeating char, return "-1"
    public static String find(String s)
    {
        //code here.
        int[] freq=new int[26];
        String ans="";
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1){
                ans=ans+s.charAt(i);
                return ans;
            }
        }
        ans=ans+"-1";
        return ans;
    }
    
}