/*
Remove minimum elements
Given an unsorted array Arr of size N. Find the minimum number of removals required such that twice of minimum element in the array is greater than or equal to the maximum in the array.

Example 1:

Input:
N = 9
Arr[] = {4,5,100,9,10,11,12,15,200}
Output: 4
Explanation: In the given array 4 elements 
4, 5, 200 and 100 are removed from the
array to make the array such that
2*minimum >= max (2*9 > 15).
Example 2:

Input:
N = 4
Arr[] = {4,7,5,6}
Output: 0
Explanation: We don't need to remove any
element as  4*2 > 7 (Note that min = 4,
max = 7).
*/

class Solution {
    int minRemoval(int arr[], int n) {
        // code here
        int longstart=-1;
        int longend=0;
        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            for(int j=i;j<n;j++){
                int val=arr[j];
                if(val<min)
                {
                    min=val;
                }
                if(val>max){
                    max=val;
                }
                if(2*min<=max)
                    break;
                    
                if(j-i>longend-longstart|| longstart==-1){
                    longstart=i;
                    longend=j;
                }
            }
        }
        if(longstart==-1)
            return n;
        return (n-(longend-longstart+1));
    }
}

/*
Expected Time Complexity: O(N*logN)
Expected Auxiliary Space: O(1)
*/
