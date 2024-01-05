/*
Count number of hops

A frog jumps either 1, 2, or 3 steps to go to the top. In how many ways can it reach the top of Nth step. As the answer will be large find the answer modulo 1000000007.

Example 1:

Input:
N = 1
Output: 1
Example 2:

Input:
N = 4
Output: 7
Explanation:Below are the 7 ways to reach
4
1 step + 1 step + 1 step + 1 step
1 step + 2 step + 1 step
2 step + 1 step + 1 step
1 step + 1 step + 2 step
2 step + 2 step
3 step + 1 step
1 step + 3 step
*/
class Solution
{
    //Function to count the number of ways in which frog can reach the top.
    static long countWays(int n)
    {
        // add your code here
         // If the distance is non-positive, there are no ways to cover it
        if(n<=0)
            return 0;
        // If the distance is 1 or 2, the number of ways is equal to the distance    
        if(n<=2)
            return n;
        long mod=(long)1e9+7;
        // Initialize variables for the first three distances (base cases)
        long first=1;
        long second=2;
        long third=4;
        for(int i=4;i<=n;i++){
            // Calculate the sum of the ways to reach the previous three distances
            long sum=(first+second+third)%mod;
            first=second;
            second=third;
            third=sum%mod;
        }
        return third;
        
    }
    
}
