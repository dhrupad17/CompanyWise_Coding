/*
Find All Four Sum Numbers

Given an array A of integers and another number K. Find all the unique quadruple from the given array that sums up to K.

Also note that all the quadruples which you return should be internally sorted, ie for any quadruple [q1, q2, q3, q4] the following should follow: q1 <= q2 <= q3 <= q4.

Example 1:

Input:
N = 5, K = 3
A[] = {0,0,2,1,1}
Output: 0 0 1 2 
Explanation: Sum of 0, 0, 1, 2 is equal
to K.
Example 2:

Input:
N = 7, K = 23
A[] = {10,2,3,4,5,7,8}
Output: 2 3 8 10 
        2 4 7 10 
        3 5 7 8 
Explanation: Sum of 2, 3, 8, 10 = 23,
sum of 2, 4, 7, 10 = 23 and sum of 3,
5, 7, 8 = 23.

Expected Time Complexity: O(N3).
Expected Auxiliary Space: O(N2).
*/
class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        // code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        HashSet<ArrayList<Integer>> hs=new HashSet<>();
        int n=arr.length;
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                int l=j+1;
                int m=n-1;
                while(l<m){
                   int sum=arr[i]+arr[j]+arr[l]+arr[m];
                ArrayList<Integer>al=new ArrayList<>();
                if(sum==k){
                    al.add(arr[i]);
                    al.add(arr[j]);
                    al.add(arr[l]);
                    al.add(arr[m]);
                    if(!hs.contains(al)){
                        hs.add(al);
                        ans.add(al);
                    }
                    l++;
                    m--;
                }else if(sum>k)
                    m--;
                else
                  l++;  
                }
                 
            }
        }
        return ans;
    }
}