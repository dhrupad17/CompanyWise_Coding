// Problem- Rearrange an array with O(1) extra space

/*
Given an array arr[] of size N where every element is in the range from 0 to n-1. Rearrange the given array so that arr[i] becomes arr[arr[i]].

 

Example 1:

Input:
N = 2
arr[] = {1,0}
Output: 0 1
Explanation: 
arr[arr[0]] = arr[1] = 0.
arr[arr[1]] = arr[0] = 1.
 

Example 2:

Input:
N = 5
arr[] = {4,0,2,1,3}
Output: 3 4 2 0 1
Explanation: 
arr[arr[0]] = arr[4] = 3.
arr[arr[1]] = arr[0] = 4.
and so on.*/


class RearrangeArraywithConstantSpace
{
    static void arrange(long arr[], int n)
    {
        int old;
        long newval;
        for(int i=0;i<n;i++){
            old=(int)arr[i];
            newval=arr[old];
            arr[i]=(old+(newval%n)*n);
        }
        for(int i=0;i<n;i++){
            arr[i]=(arr[i]/n);
        }
    }
}


//Time Complexity: O(N)
//Auxiliary Space: O(1)