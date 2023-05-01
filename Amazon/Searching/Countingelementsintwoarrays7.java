//Counting elements in two arrays

/*
Given two unsorted arrays arr1[] and arr2[]. They may contain duplicates. For each element in arr1[] count elements less than or equal to it in array arr2[].

Example 1:

Input:
m = 6, n = 6
arr1[] = {1,2,3,4,7,9}
arr2[] = {0,1,2,1,1,4}
Output: 4 5 5 6 6 6
Explanation: Number of elements less than
or equal to 1, 2, 3, 4, 7, and 9 in the
second array are respectively 4,5,5,6,6,6
Example 2:

Input:
m = 5, n = 7
arr1[] = {4,8,7,5,1}
arr2[] = {4,48,3,0,1,1,5}
Output: 5 6 6 6 3
Explanation: Number of elements less than
or equal to 4, 8, 7, 5, and 1 in the
second array are respectively 5,6,6,6,3
*/

class Countingelementsintwoarrays 
{
	public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
       // add your code here
       ArrayList<Integer> list=new ArrayList<>();
       Arrays.sort(arr2);
       for(int i=0;i<arr1.length;i++){
           list.add(binarySearch(arr1[i],arr2));
       }
       return list;
    }
    public static int binarySearch(int val,int[] arr2){
        int left=0;
        int right=arr2.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr2[mid]<=val){
                left=mid+1;
            }
            else
                right=mid-1;
        }
        return left;
    }
}

/*
Expected Time Complexity: O((m + n) * log n).
Expected Auxiliary Space: O(m)
*/