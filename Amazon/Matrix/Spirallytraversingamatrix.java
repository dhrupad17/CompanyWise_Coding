/*
Spirally traversing a matrix

Given a matrix of size r*c. Traverse the matrix in spiral form.

Example 1:

Input:
r = 4, c = 4
matrix[][] = {{1, 2, 3, 4},
           {5, 6, 7, 8},
           {9, 10, 11, 12},
           {13, 14, 15,16}}
Output: 
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10

Expected Time Complexity: O(r*c)
Expected Auxiliary Space: O(r*c), for returning the answer only.
*/
class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        ArrayList<Integer>list =new ArrayList<>();
        int top=0;
        int left=0;
        int bottom=r-1;
        int right=c-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;
            if(!(top<=bottom && left<=right)){
                break;
            }
            for(int i=right;i>=left;i--){
                list.add(matrix[bottom][i]);
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                list.add(matrix[i][left]);
            }
            left++;
        }
        return list;
    }
}
