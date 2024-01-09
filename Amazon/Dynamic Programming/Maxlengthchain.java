/*
Max length chain

You are given N pairs of numbers. In every pair, the first number is always smaller than the second number. A pair (c, d) can follow another pair (a, b) if b < c. Chain of pairs can be formed in this fashion. You have to find the longest chain which can be formed from the given set of pairs. 
 

Example 1:

Input:
N = 5
P[] = {5  24 , 39 60 , 15 28 , 27 40 , 50 90}
Output: 3
Explanation: The given pairs are { {5, 24}, {39, 60},
{15, 28}, {27, 40}, {50, 90} },the longest chain that
can be formed is of length 3, and the chain is
{{5, 24}, {27, 40}, {50, 90}}

Example 2:

Input:
N = 2
P[] = {5 10 , 1 11}
Output: 1
Explanation:The max length chain possible is only of
length one.
*/
class GfG
{
    int maxChainLength(Pair arr[], int n)
    {
       // Sort the array of pairs based on the second element of each pair
       Arrays.sort(arr,(x1,y1)->x1.y-y1.y);
       int count=1;// Initialize the chain length to 1
       int curr_end=arr[0].y;// Initialize the current end with the second element of the first pair
       for(int i=1;i<n;i++){
           // If the first element of the current pair is greater than the current end,
            // increment the chain length, update the current end, and continue
           if(arr[i].x>curr_end){
               count++;
               curr_end=arr[i].y;
           }
       }
       return count;
    }
}