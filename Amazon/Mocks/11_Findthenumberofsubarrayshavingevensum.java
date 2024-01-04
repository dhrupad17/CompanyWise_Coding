/*
Find the number of subarrays having even sum

Given an array Arr[] of size N. Find the number of subarrays whose sum is an even number.


Example 1:

Input:
N = 6
Arr[] = {1, 2, 2, 3, 4, 1}
Output: 9
Explanation: The array {1, 2, 2, 3, 4, 1} 
has 9 such possible subarrays. These are-
 {1, 2, 2, 3}          Sum = 8
 {1, 2, 2, 3, 4}       Sum = 12
 {2}                   Sum = 2 (At index 1)
 {2, 2}                Sum = 4
 {2, 2, 3, 4, 1}       Sum = 12
 {2}                   Sum = 2 (At index 2)
 {2, 3, 4, 1}          Sum = 10
 {3, 4, 1}             Sum = 8
 {4}                   Sum = 4

Example 2:

Input:
N = 4
Arr[] = {1, 3, 1, 1}
Output: 4
Explanation: The array {1, 3, 1, 1} 
has 4 such possible subarrays.
These are-
 {1, 3}            Sum = 4
 {1, 3, 1, 1}      Sum = 6
 {3, 1}            Sum = 4
 {1, 1}            Sum = 2
*/
static int countEvenSum(int arr[], int n) 
{ 
    //Your code here
    int res=0;
    int sum=0;
    int[] temp={1,0};
    
    for(int i=0;i<n;i++){
        sum=((sum+arr[i])%2 +2)%2; //Avoid negative
        temp[sum]++;
    }
    res= (temp[0]*(temp[0]-1))/2 + (temp[1]*(temp[1]-1))/2;
    return res;
} 