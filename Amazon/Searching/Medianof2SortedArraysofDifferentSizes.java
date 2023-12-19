/*
Median of 2 Sorted Arrays of Different Sizes

Given two sorted arrays array1 and array2 of size m and n respectively. Find the median of the two sorted arrays.

Example 1:

Input:
m = 3, n = 4
array1[] = {1,5,9}
array2[] = {2,3,6,7}
Output: 5
Explanation: The middle element for
{1,2,3,5,6,7,9} is 5
Example 2:

Input:
m = 2, n = 4
array1[] = {4,6}
array2[] = {1,2,3,5}
Output: 3.5

Expected Time Complexity: O(min(log n, log m)).
Expected Auxiliary Space: O((n+m)/2).
*/
class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        // Your Code Here
        int l=0,h=a.length;
        if(b.length<a.length){
            return medianOfArrays(n,m,b,a);
        }
        while(l<=h){
        int m1=(l+h)/2;
        int m2=((a.length+b.length+1)/2)-m1;
        
        int l1=(m1==0)?Integer.MIN_VALUE:a[m1-1];
        int l2=(m2==0)?Integer.MIN_VALUE:b[m2-1];
        int r1=(m1==a.length)?Integer.MAX_VALUE:a[m1];
        int r2=(m2==b.length)?Integer.MAX_VALUE:b[m2];
        
        if(l1<=r2 && l2<=r1){
            if((a.length+b.length)%2==0){
                return (double)(Integer.max(l1,l2)+Integer.min(r1,r2))/2;
            }
            else{
                return (double)(Integer.max(l1,l2));
            }
        }
        else if(l2>r1){
            l=m1+1;
        }
        else{
            h=m1-1;
        }
        }
        return 0.0d;
    }
}