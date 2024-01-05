/*
Distinct occurrences

Given two strings S and T of length n and m respectively. Find count of distinct occurrences of T in S as a sub-sequence. 
 

Example 1:

Input:
S = "banana" , T = "ban"
Output: 3
Explanation: There are 3 sub-sequences:
[ban], [ba n], [b an].
Example 2:

Input:
S = "geeksforgeeks" , T = "ge"
Output: 6
Explanation: There are 6 sub-sequences:
[ge], [ ge], [g e], [g e] [g e] and [ g e].
*/
class Solution
{
    int  subsequenceCount(String S, String T)
    {
	// Your code here	
	    int mod=(int)(1e9+7);
	    int n=S.length();
	    int m=T.length();
	    
	    int dp[][]=new int[n+1][m+1];
	    // Initialization: There is one subsequence of an empty string that matches any string
	    for(int i=0;i<=n;i++){
	        dp[i][0]=1;
	    }
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=m;j++){
	            //check if current charcaters matching
	            if(S.charAt(i-1)==T.charAt(j-1)){
	                // Two possibilities:
                    // 1. Include the current character in the subsequence match
                    // 2. Exclude the current character from the subsequence match
                    dp[i][j]=(dp[i-1][j-1]+dp[i-1][j])%mod;
	            }else{
	                // Characters don't match, so just exclude the current character
	                dp[i][j]=dp[i-1][j]%mod;
	            }
	        }
	    }
	    return dp[n][m]%mod;
    }
}