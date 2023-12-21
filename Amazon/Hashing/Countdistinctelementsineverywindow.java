/*
Count distinct elements in every window

Given an array of integers and a number K. Find the count of distinct elements in every window of size K in the array.

Example 1:

Input:
N = 7, K = 4
A[] = {1,2,1,3,4,2,3}
Output: 3 4 4 3
Explanation: Window 1 of size k = 4 is
1 2 1 3. Number of distinct elements in
this window are 3. 
Window 2 of size k = 4 is 2 1 3 4. Number
of distinct elements in this window are 4.
Window 3 of size k = 4 is 1 3 4 2. Number
of distinct elements in this window are 4.
Window 4 of size k = 4 is 3 4 2 3. Number
of distinct elements in this window are 3.
Example 2:

Input:
N = 3, K = 2
A[] = {4,1,1}
Output: 2 1

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).
*/
class Solution
{
    ArrayList<Integer> countDistinct(int a[], int n, int k)
    {
        // code here 
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        int j=0;//leftmost of current subarray
        
        for(int i=0;i<n;i++){
            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
            if(i>=k-1){
                ans.add(hm.size());
                int left=a[j];
                if(hm.get(left)==1)
                    hm.remove(left);
                else
                {
                    hm.put(left,hm.get(left)-1);
                }
                j++;
            }
        }
        return ans;
    }
}
