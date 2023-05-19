/*
Last duplicate element in a sorted array
Given a sorted array with duplicate elements and we have to find the index of the last duplicate element and return the index of it and also return the duplicate element.

 

Example 1:

Input : arr[ ] = {1, 5, 5, 6, 6, 7}
Output : 4 6
Explanation:
Last duplicate element is 6 having index 4.​

Example 2:

Input : arr[ ] = {1, 2, 3, 4, 5}
Output: -1
*/

class Complete{
    public static ArrayList<Integer> dupLastIndex (int arr[], int n) {
        //Complete the function
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=n-1;i>0;i--){
            if(arr[i]==arr[i-1])
            {
                al.add(i);
                al.add(arr[i]);
                break;
            }
        }
        if(al.isEmpty())
            al.add(-1);
        return al;
    }
}

/*
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
*/