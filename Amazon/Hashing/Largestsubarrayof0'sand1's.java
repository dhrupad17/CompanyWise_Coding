/*
Largest subarray of 0's and 1's

Given an array of 0s and 1s. Find the length of the largest subarray with equal number of 0s and 1s.

Example 1:

Input:
N = 4
A[] = {0,1,0,1}
Output: 4
Explanation: The array from index [0...3]
contains equal number of 0's and 1's.
Thus maximum length of subarray having
equal number of 0's and 1's is 4.
Example 2:

Input:
N = 5
A[] = {0,0,1,0,0}
Output: 2

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).
*/
class Solution {

    // arr[] : the input array containing 0s and 1s
    // N : size of the input array
    
    // return the maximum length of the subarray
    // with equal 0s and 1s
    int maxLen(int[] arr, int n)
    {
        // Your code here
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0;
        int len=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0)
                arr[i]=-1;
        }
        //subarray sum
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0)
                len=i+1;
            else if(hm.containsKey(sum))
                len=Math.max(len,i-hm.get(sum));
            else
                hm.put(sum,i);
        }
        return len;
    }
}
