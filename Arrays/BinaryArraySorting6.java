// Binary Array Sorting

/*
Given a binary array A[] of size N. The task is to arrange the array in increasing order.

Note: The binary array contains only 0  and 1.

Example 1:

Input:
N = 5
A[] = {1,0,1,1,0}
Output: 0 0 1 1 1
Example 2:

Input:
N = 10
A[] = {1,0,1,1,1,1,1,0,0,0}
Output: 0 0 0 0 1 1 1 1 1 1
*/

class BinaryArraySorting 
{
	static int[] SortBinaryArray(int arr[], int n) 
	{ 
	    int count0=0;
	    for(int i=0;i<n;i++){
	        if(arr[i]==0){
	            count0++;
	        }
	    }
	    for(int i=0;i<count0;i++){
	        arr[i]=0;
	    }
	    for(int i=count0;i<n;i++){
	        arr[i]=1;
	    }
	    return arr;
	}
}

// Expected Time Complexity: O(N).
// Expected Auxiliary Space: O(1).