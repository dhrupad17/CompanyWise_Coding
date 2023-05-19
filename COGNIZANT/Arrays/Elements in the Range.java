/*
Elements in the Range
Given an array arr[] containing positive elements. A and B are two numbers defining a range. The task is to check if the array contains all elements in the given range.

Example 1:

Input: N = 7, A = 2, B = 5
arr[] =  {1, 4, 5, 2, 7, 8, 3}
Output: Yes
Explanation: It has elements between 
range 2-5 i.e 2,3,4,5
Example 2:

Input: N = 7, A = 2, B = 6
arr[] = {1, 4, 5, 2, 7, 8, 3}
Output: No
Explanation: Array does not contain 6.
*/

class Solution{
   public static boolean check_elements(int arr[], int n,int A, int B)
    {
		int range = B - A;
        for (int i = 0; i < n; i++) {
            if (Math.abs(arr[i]) >= A && Math.abs(arr[i]) <= B)  
                int z = Math.abs(arr[i]) - A;
                if (arr[z] > 0) {
                    arr[z] = arr[z] * -1;
                }
            }
        }
        int count=0;
        for (int i = 0; i <= range && i<n; i++) {
            if (arr[i] > 0)
                return false;
            else
                count++;
        }
        if(count!= (range+1))
            return false;
        return true;
    }
}

/*
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
*/