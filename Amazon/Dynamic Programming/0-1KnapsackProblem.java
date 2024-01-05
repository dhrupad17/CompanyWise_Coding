/*
0 - 1 Knapsack Problem

You are given weights and values of N items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack. Note that we have only one quantity of each item.
In other words, given two integer arrays val[0..N-1] and wt[0..N-1] which represent values and weights associated with N items respectively. Also given an integer W which represents knapsack capacity, find out the maximum value subset of val[] such that sum of the weights of this subset is smaller than or equal to W. You cannot break an item, either pick the complete item or dont pick it (0-1 property).

Example 1:

Input:
N = 3
W = 4
values[] = {1,2,3}
weight[] = {4,5,1}
Output: 3
Explanation: Choose the last item that weighs 1 unit and holds a value of 3. 
Example 2:

Input:
N = 3
W = 3
values[] = {1,2,3}
weight[] = {4,5,6}
Output: 0
Explanation: Every item has a weight exceeding the knapsack's capacity (3).
*/
class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int w, int wt[], int val[], int n) 
    { 
         // your code here 
         int[][] dp=new int[n+1][w+1];
         
         for(int i=0;i<n+1;i++){
             for(int j=0;j<w+1;j++){
                  // Base case: if there are no items or the knapsack capacity is 0
                 if(i==0 || j==0)
                    dp[i][j]=0;
             }
         }
         for(int i=1;i<n+1;i++){
             for(int j=1;j<w+1;j++){
                 // If the current item's weight is less than or equal to the current capacity,
                // choose the maximum value between including and excluding the current item
                 if(wt[i-1]<=j)
                 {
                     dp[i][j]=Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
                 }else{
                     // If the current item's weight exceeds the current capacity,
                    // exclude the current item and take the value from the previous row
                     dp[i][j]=dp[i-1][j];
                 }
             }
         }
         return dp[n][w];
    } 
}