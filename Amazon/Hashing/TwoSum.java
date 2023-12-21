/*
Two Sum

Given an array of positive integers and an integer. Determine whether or not there exist two elements in A whose sum is exactly equal to that integer.

Example 1:

Input:
N = 6, X = 16
A[] = {1,4,45,6,10,8}
Output: Yes
Explanation: 10 and 6 are numbers
making a pair whose sum is equal to 16.
Example 2:

Input:
N = 5, X = 10
A[] = {1,2,4,3,6}
Output: Yes

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).
*/
class Solution
{
    // A[] : the input array of positive integers
    // N : size of the array arr[]
    // X : the required sum
    public boolean keypair(int[] a, int n, int x)
    {
        // code here
        boolean flag=false;
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<n;i++){
            int key=a[i];
            if(hs.contains(x-key))
                flag=true;
            hs.add(key);
        }
        return flag;
        
    }
}