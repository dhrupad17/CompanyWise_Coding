/*
Boundary traversal of matrix

You are given a matrix of dimensions n x m. The task is to perform boundary traversal on the matrix in a clockwise manner.

Example 1:

Input:
n = 4, m = 4
matrix[][] = {{1, 2, 3, 4},
         {5, 6, 7, 8},
         {9, 10, 11, 12},
         {13, 14, 15,16}}
Output: 1 2 3 4 8 12 16 15 14 13 9 5
Explanation:
The matrix is:
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
The boundary traversal is:
1 2 3 4 8 12 16 15 14 13 9 5

Expected Time Complexity: O(N + M)
Expected Auxiliary Space: O(N+M)
*/
class Solution
{
    //Function to return list of integers that form the boundary 
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int r, int c)
    {
        // code here 
        ArrayList<Integer>list =new ArrayList<>();
        int top=0;
        int left=0;
        int bottom=r-1;
        int right=c-1;
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                list.add(matrix[bottom][i]);
            }
            }
            bottom--;
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                list.add(matrix[i][left]);
            }
            }
            
            left++;
        return list;
    }
}
