//Closet 0s 1s and 2s
/*
Given an array of 0s, 1s, and 2s. Arrange the array elements such that all 0s come first, followed by all the 1s and then, all the 2s.

Note: Do not use the inbuilt sort function.
 

Example 1:

Input: N = 5, arr[] = {0, 2, 1, 2, 0}
Output: 0 0 1 2 2
Example 2:

Input: N = 3, arr[] = {0, 1, 0}
Output: 0 0 1
*/
class Solution
{
    // The function should do the stated modifications in the given array arr[]
    // Do not return anything.
    
    // arr[]: Input Array
    // N: Size of the Array arr[]
    //Function to segregate 0s, 1s and 2s in sorted increasing order.
    public static void segragate012(int arr[], int n){
        // Your Code Here
        int low=0;
        int high=n-1;
        int mid=0;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp2=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp2;
                high--;
            }
        }
        
    }
}
/*
Expected Time Complexity: O(n).
Expected Auxiliary Space: O(1).
*/