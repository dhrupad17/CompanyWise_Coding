/*
Wildcard Pattern Matching

Given two strings 'str' and a wildcard pattern 'pattern' of length N and M respectively,  You have to print '1' if the wildcard pattern is matched with str else print '0' .

The wildcard pattern can include the characters ‘?’ and ‘*’
‘?’ – matches any single character
‘*’ – Matches any sequence of characters (including the empty sequence)

Note: The matching should cover the entire str (not partial str).

 

Example 1:

Input:
pattern = "ba*a?"
str = "baaabab"
Output: 1
Explanation: replace '*' with "aab" and 
'?' with 'b'. 
Example 2:

Input:
pattern = "a*ab"
str = "baaabab"
Output: 0
Explanation: Because of'a' at first position,
pattern and str can't be matched. 
*/
class Solution
{
    int wildCard(String pattern, String str)
    {
        // Your code goes here
        int n=pattern.length();
        int m=str.length();
        
        boolean dp[][]=new boolean[n+1][m+1];
        // Initialize dp[0][0] to true since an empty pattern matches an empty text
        dp[0][0]=true;
        // Initialize dp[i][0] for patterns with consecutive '*' characters
        for(int i=1;i<=n;i++){
            boolean flag=true;
            for(int j=0;j<i;j++){
                if(pattern.charAt(j)!='*'){
                    flag=false;
                    break;
                }
            }
            dp[i][0]=flag;
        }
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                // If the current characters match or the pattern has '?', move diagonally
                if(pattern.charAt(i-1)==str.charAt(j-1)|| pattern.charAt(i-1)=='?')
                
                    dp[i][j]=dp[i-1][j-1];
                else if(pattern.charAt(i-1)=='*')
                // If the pattern has '*', consider two possibilities:
                // 1. '*' matches one character in the text (move horizontally)
                // 2. '*' matches an empty sequence in the text (move vertically)
                    dp[i][j]=dp[i][j-1]||dp[i-1][j];
                else
                // If the current characters do not match and the pattern is not '*', set to false
                    dp[i][j]=false;
            }
        }
        // Return 1 if the final result is true (pattern matches text), otherwise return 0
        if(dp[n][m]==true)
            return 1;
        else
            return 0;
    }
}
