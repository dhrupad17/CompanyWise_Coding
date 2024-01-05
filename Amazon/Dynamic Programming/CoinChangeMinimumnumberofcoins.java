/*
Coin Change - Minimum number of coins

You are given an amount denoted by value. You are also given an array of coins. The array contains the denominations of the given coins. You need to find the minimum number of coins to make the change for value using the coins of given denominations. Also, keep in mind that you have infinite supply of the coins.

Example 1:

Input:
value = 5
numberOfCoins = 3
coins[] = {3,6,3}
Output: Not Possible
Explanation:We need to make the change for
value = 5 The denominations are {3,6,3}
It is certain that we cannot make 5 using
any of these coins.
Example 2:

Input:
value = 10
numberOfCoins = 4
coins[] = {2 5 3 6}
Output: 2
Explanation:We need to make the change for
value = 10 The denominations are {2,5,3,6}
We can use two 5 coins to make 10. So
minimum coins are 2.
*/
class Solution
{
    //Function to find the minimum number of coins to make the change 
    //for value using the coins of given denominations.
    public long minimumNumberOfCoins(int coins[],int numberOfCoins,int value)
    {
        // your code here
        int[] dp=new int[value+1];
        dp[0]=0;
         // Iterate through each coin denomination
        for(int i=0;i<numberOfCoins;i++){
            // Iterate through values from coins[i] to value
            for(int j=coins[i];j<=value;j++){
                if(j==coins[i])
                 // If the current coin denomination is equal to the current value,
                // set dp[j] to 1 (one coin of the current denomination)
                    dp[j]=1;
                else{
                    if(dp[j-coins[i]]>0){
                        // If using the current coin results in a non-zero value for dp[j-coins[i]],
                        // calculate the number of coins needed to make up the current value
                        int ways=1+dp[j-coins[i]];
                        
                        if(dp[j]>0)
                         // Update dp[j] with the minimum number of coins
                            dp[j]=Math.min(dp[j],ways);
                        else
                            dp[j]=ways;
                    }
                }
            }
        }// If dp[value] is still 0, it means it is not possible to make up the value
        if(dp[value]==0)
            return -1;
        return dp[value];
    }
}