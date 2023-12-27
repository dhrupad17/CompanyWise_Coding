/*
Number of Rotations

Given an ascending sorted rotated array Arr of distinct integers of size N. The array is right rotated K times. Find the value of K.

Example 1:

Input:
N = 5
Arr[] = {5, 1, 2, 3, 4}
Output: 1
Explanation: The given array is 5 1 2 3 4. 
The original sorted array is 1 2 3 4 5. 
We can see that the array was rotated 
1 times to the right.
*/
class Solution 
{ 
    static int NumberOfRotations(int arr[], int n) 
    { 
       // code here 
       int start=0;
       int end=n-1;
       while(start<end){
           int mid=start+(end-start)/2;
           if(arr[mid]>arr[end]){
               start=mid+1;
           }else{
               end=mid;
           }
       }
       return start;
    }
} 
