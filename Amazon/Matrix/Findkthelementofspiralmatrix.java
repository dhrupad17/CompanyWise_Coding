/*
Find kth element of spiral matrix

Given a matrix with n rows and m columns. Your task is to find the kth element which is obtained while traversing the matrix spirally. You need to complete the method findK which takes four arguments the first argument is the matrix A and the next two arguments will be n and m denoting the size of the matrix A and then the forth argument is an integer k. The function will return the kth element obtained while traversing the matrix spirally.

Example 1:

Input:
n = 4, m = 4, k = 10
A[][] = {{1  2  3  4},
         {5  6  7  8},
         {9  10 11 12},
         {13 14 15 16}}
Output:
13
Explanation:

The spiral order of matrix will look like 1->2->3->4->8->12->16->15->14->13->9->5->6->7->11->10. So the 10th element in this order is 13. 

Expected Time Complexity: O(n*m)
Expected Auxiliary Space: O(n*m)
*/
class Solution
{
    /*You are required to complete this method*/
    int findK(int matrix[][], int r, int c, int k)
    {
	// Your code here	
        int top=0;
        int left=0;
        int bottom=r-1;
        int right=c-1;
        int count=0;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                count++;
                if(count==k)
                    return matrix[top][i];
            }
            top++;
            for(int i=top;i<=bottom;i++){
                count++;
                if(count==k)
                    return matrix[i][right];
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    count++;
                    if(count==k)
                        return matrix[bottom][i];
                }
            }
            bottom--;
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    count++;
                    if(count==k)
                        return matrix[i][left];
                }
            }
            left++;
        }
        return 0;
    }
}