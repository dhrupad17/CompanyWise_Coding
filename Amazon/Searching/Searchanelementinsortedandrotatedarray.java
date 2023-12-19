/*
Search an element in sorted and rotated array

Given a sorted and rotated array A of N distinct elements which are rotated at some point, and given an element K. The task is to find the index of the given element K in array A.

Example 1:

Input:
N = 9
A[] = {5,6,7,8,9,10,1,2,3}
K = 10
Output: 5
Explanation: 10 is found at index 5.
Example 1:

Input:
N = 3
A[] = {3,1,2}
K = 1
Output: 1

Expected Time Complexity: O(log N).
Expected Auxiliary Space: O(1).
*/
class Solution 
{ 
    static int Search(int arr[], int target)
	{
	    // code here
	    int low=0;
	    int high=arr.length-1;
	    while(low<=high){
	        int mid=(low+high)/2;
	        if(arr[mid]==target){
	            return mid;
	        }
	        else if(arr[low]<=arr[mid]){
	            if(arr[low]<=target && target<=arr[mid]){
	                high=mid-1;
	            }
	            else
	                low=mid+1;
	        }
	        else{
	            if(arr[mid]<=target && target<=arr[high]){
	                low=mid+1;
	            }
	            else
	                high=mid-1;
	            }
	        }
	    return -1;
	}
}