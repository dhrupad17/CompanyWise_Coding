//Merge Sort
/*
Given an array arr[], its starting position l and its ending position r. Sort the array using merge sort algorithm.
Example 1:

Input:
N = 5
arr[] = {4 1 3 9 7}
Output:
1 3 4 7 9
Example 2:

Input:
N = 10
arr[] = {10 9 8 7 6 5 4 3 2 1}
Output:
1 2 3 4 5 6 7 8 9 10
*/
class Solution
{
     void merge(int arr[], int low, int mid, int high)
    {
         ArrayList<Integer> result = new ArrayList<>();
         int left = low;
         int right = mid+1;
         
         while(left<=mid && right<=high)
         {
             if(arr[left]<=arr[right])
             {
                 result.add(arr[left]);
                 left++;
             }
             else
             {
                 result.add(arr[right]);
                 right++;
             }
         }
         while(left<=mid)
         {
             result.add(arr[left]);
             left++;
         }
         while(right<=high)
         {
             result.add(arr[right]);
             right++;
         }
         for(int i=low; i<=high; i++)
         {
             arr[i] = result.get(i-low);
         }
    }
    void mergeSort(int arr[], int low, int high)
    {
        if(low>=high)
        {
            return;
        }
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
}
/*
Expected Time Complexity: O(nlogn) 
Expected Auxiliary Space: O(n)
*/