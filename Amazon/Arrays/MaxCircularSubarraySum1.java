//Problem :- Max Circular Subarray Sum

/*
Given an array arr[] of N integers arranged in a circular fashion. Your task is to find the maximum contiguous subarray sum.


Example 1:

Input:
N = 7
arr[] = {8,-8,9,-9,10,-11,12}
Output:
22
Explanation:
Starting from the last element
of the array, i.e, 12, and 
moving in a circular fashion, we 
have max subarray as 12, 8, -8, 9, 
-9, 10, which gives maximum sum 
as 22.
Example 2:

Input:
N = 8
arr[] = {10,-3,-4,7,6,5,-4,-1}
Output:
23
Explanation: Sum of the circular 
subarray with maximum sum is 23*/

class MaxCircularSubarraySum{

    static int circularSubarraySum(int a[], int n) {
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+a[i];
        }
        
        int maxsum=summax(a,n);
        int minsum=sum - summin(a,n);
        
        if(minsum==0)
            return maxsum;
        return Math.max(maxsum,minsum);
    }
    static int summin(int[] a,int n){
        int sum=0;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            sum=sum+a[i];
            res=Math.min(sum,res);
            sum=Math.min(sum,0);
        }
        return res;
    }
    static int summax(int[] a,int n){
        int sum=0;
        int res=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum=sum+a[i];
            res=Math.max(sum,res);
            sum=Math.max(sum,0);
        }
        return res;
    }
}

//Time Complexity: O(N).
//Auxiliary Space: O(1).