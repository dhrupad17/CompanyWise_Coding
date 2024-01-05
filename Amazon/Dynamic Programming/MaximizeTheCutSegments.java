/*
Maximize The Cut Segments

Given an integer N denoting the Length of a line segment. You need to cut the line segment in such a way that the cut length of a line segment each time is either x , y or z. Here x, y, and z are integers.
After performing all the cut operations, your total number of cut segments must be maximum.

Note: if no segment can be cut then return 0.

Example 1:

Input:
N = 4
x = 2, y = 1, z = 1
Output: 4
Explanation:Total length is 4, and the cut
lengths are 2, 1 and 1.  We can make
maximum 4 segments each of length 1.
Example 2:

Input:
N = 5
x = 5, y = 3, z = 2
Output: 2
Explanation: Here total length is 5, and
the cut lengths are 5, 3 and 2. We can
make two segments of lengths 3 and 2.
*/
class Solution
{
    //Function to find the maximum number of cuts.
    public int maximizeCuts(int n, int x, int y, int z)
    {
       //Your code here
       int dp[]=new int[n+1];
       int a=Integer.MIN_VALUE;
       int b=Integer.MIN_VALUE;
       int c=Integer.MIN_VALUE;
       
       for(int i=1;i<=n;i++){
           if(i-x>=0)
            a=1+dp[i-x];
           if(i-y>=0)
            b=1+dp[i-y];
           if(i-z>=0)
            c=1+dp[i-z];
            
            dp[i]=Math.max(a,(Math.max(b,c)));
       }
       if(dp[n]>=0)
        return dp[n];
       return 0;
       
    }
}
