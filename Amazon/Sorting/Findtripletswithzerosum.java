//Find triplets with zero sum
/*
Given an array arr[] of n integers. Check whether it contains a triplet that sums up to zero. 

Note: Return 1, if there is at least one triplet following the condition else return 0.

Example 1:

Input: n = 5, arr[] = {0, -1, 2, -3, 1}
Output: 1
Explanation: 0, -1 and 1 forms a triplet
with sum equal to 0.
Example 2:

Input: n = 3, arr[] = {1, 2, 3}
Output: 0
Explanation: No triplet with zero sum exists. 
*/
class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                 int sum=arr[left]+arr[right]+arr[i];
                if(sum==0)
                    return true;
                else if(sum>0)
                    right--;
                else
                    left++;
            }
           
        }
        return false;
    }
}
/*
Expected Time Complexity: O(n2)
Expected Auxiliary Space: O(1)
*/