/*
Maximize Number of 1's

Given a binary array arr of size N and an integer M. Find the maximum number of consecutive 1's produced by flipping at most M 0's.
 

Example 1:

Input:
N = 3
arr[] = {1, 0, 1}
M = 1
Output:
3
Explanation:
Maximum subarray is of size 3
which can be made subarray of all 1 after
flipping one zero to 1.
Example 2:

Input:
N = 11
arr[] = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1}
M = 2
Output:
8
Explanation:
Maximum subarray is of size 8
which can be made subarray of all 1 after
flipping two zeros to 1.
*/
public static int maximumOnes(int a[],int n,int m)
{
    //Your code here  
    int i=0;
    int j=0;
    int count1=0;
    int count0=0;
    while(j<n){
        if(a[j]==0)
            count0++;
        if(count0>m){
            if(a[i]==0){
                count0--;
            }
            i++;    
        }
        count1=Math.max(count1,j-i+1);
        j++;
    }
    return count1;
}