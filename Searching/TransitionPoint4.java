// Find Transition Point

/*
Given a sorted array containing only 0s and 1s, find the transition point. 


Example 1:

Input:
N = 5
arr[] = {0,0,0,1,1}
Output: 3
Explanation: index 3 is the transition 
point where 1 begins.

Example 2:

Input:
N = 4
arr[] = {0,0,0,0}
Output: -1
Explanation: Since, there is no "1",
the answer is -1.
*/

class  TransitionPoint
{
	int transitionPoint(int arr[], int n) {
        // code here
        if(arr[0]==1)
            return 0;
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==1 && arr[mid-1]==0)
                return mid;
            else if(arr[mid]==0)
            {
                left=mid+1;
            }
            else
                right=mid-1;
        }
        return -1;
    }
}

/*
Expected Time Complexity: O(LogN)
Expected Auxiliary Space: O(1)
*/