/*
Reverse words in a given string

Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

Example 1:

Input:
S = i.like.this.program.very.much
Output: much.very.program.this.like.i
Explanation: After reversing the whole
string(not individual words), the input
string becomes
much.very.program.this.like.i
Example 2:

Input:
S = pqr.mno
Output: mno.pqr
Explanation: After reversing the whole
string , the input string becomes
mno.pqr
*/
class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String s)
    {
        // code here 
        String words[]=s.split("\\.");
        String ans="";
        for(int i=words.length-1;i>=0;i--){
            if(i==0)
                ans+=words[i];
            else
                ans+=words[i]+".";
        }
        return ans;
    }
}