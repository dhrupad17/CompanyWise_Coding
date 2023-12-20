/*
Rotate by 90 degree

Given a square matrix[][] of size N x N. The task is to rotate it by 90 degrees in an anti-clockwise direction without using any extra space.

Example 1:

Input:
N = 3
matrix[][] = [[1 2 3],
              [4 5 6],
              [7 8 9]]
Output:
3 6 9 
2 5 8 
1 4 7

Expected Time Complexity: O(N*N)
Expected Auxiliary Space: O(1)
*/
class GFG
{
    static void rotate(int matrix[][]) 
    {
        // Code Here
        int size=matrix.length;
        for(int i=0;i<size;i++){
            int left=0;
            int right=size-1;
            while(left<right){
                swap(matrix,i,left,i,right);
                left++;
                right--;
            }
        }
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                swap(matrix,i,j,j,i);
            }
        }
    }
    static void swap(int[][] matrix,int r1,int c1,int r2,int c2){
        int temp=matrix[r1][c1];
        matrix[r1][c1]=matrix[r2][c2];
        matrix[r2][c2]=temp;
    }
}