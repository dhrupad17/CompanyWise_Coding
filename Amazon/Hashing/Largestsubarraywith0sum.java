/*
Largest subarray with 0 sum

Given an array having both positive and negative integers. The task is to compute the length of the largest subarray with sum 0.

Example 1:

Input:
N = 8
A[] = {15,-2,2,-8,1,7,10,23}
Output: 5
Explanation: The largest subarray with
sum 0 will be -2 2 -8 1 7.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).
*/
class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        int sum=0;
        int len=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(sum,-1);
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(hm.get(sum)!=null)
                len=Math.max(len,i-hm.get(sum));
            else
                hm.put(sum,i);
        }
        return len;
    }
}