/*
Search in a row-column sorted Matrix

Given a matrix of size n x m, where every row and column is sorted in increasing order, and a number x. Find whether element x is present in the matrix or not.

Example 1:

Input:
n = 3, m = 3, x = 62
matrix[][] = {{ 3, 30, 38},
              {36, 43, 60},
              {40, 51, 69}}
Output: 0
Explanation:
62 is not present in the matrix, 
so output is 0.
Example 2:

Input:
n = 1, m = 6, x = 55
matrix[][] = {{18, 21, 27, 38, 55, 67}}
Output: 1
Explanation: 55 is present in the matrix.

Expected Time Complexity: O(N + M)
Expected Auxiliary Space: O(1)
*/
class Solution 
{ 
    //Function to search a given number in row-column sorted matrix.
	static boolean search(int matrix[][], int r, int c, int x) 
	{  
	    // code here 
	    int i=0;//start of top row
	    int j=c-1;//start of bottom column
	    boolean ans=false;
	    while(i<r && j>=0){
	        if(matrix[i][j]==x){
	            ans=true;
	            break;
	        }else if(matrix[i][j]>x){
	            j--;//shift left in the current row
	        }else{
	            i++;//move to next row
	        }
	    }
	    return ans;
	} 
} 
