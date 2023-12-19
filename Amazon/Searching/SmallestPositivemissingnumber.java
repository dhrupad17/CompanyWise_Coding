/*
Smallest Positive missing number

Given an array arr[] of size N, find the smallest positive number missing from the array.

 

Example 1:

Input:
N = 5
arr[] = {1,2,3,4,5}
Output: 6
Explanation: Smallest positive missing
number is 6.
 

Example 2:

Input:
N = 5
arr[] = {0,-10,1,3,-20}
Output: 2

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
*/
class Solution{
    
    // Function to find 
    static int findMissing(int arr[], int size)
    {
       
       // Your code here
       for(int i=0;i<size;i++){
           if(arr[i]<0 || arr[i]>size)
            arr[i]=0;
       }
       for(int i=0;i<size;i++){
           if(arr[i]>0){
               int k=arr[i];
               while(k>0){
                   int temp=arr[k-1];
                   arr[k-1]=-1;
                   k=temp;
               }
               if(arr[i]>0)
                arr[i]=0;
           }
       }
       for(int i=0;i<size;i++){
           if(arr[i]==0)
            return i+1;
       }
       return size+1;
       
    }
}