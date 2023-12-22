/*
Sort an array according to the other

Given two integer arrays A1[ ] and A2[ ] of size N and M respectively. Sort the first array A1[ ] such that all the relative positions of the elements in the first array are the same as the elements in the second array A2[ ].
See example for better understanding.
Note: If elements are repeated in the second array, consider their first occurance only.

Example 1:

Input:
N = 11 
M = 4
A1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8}
A2[] = {2, 1, 8, 3}
Output: 
2 2 1 1 8 8 3 5 6 7 9
Explanation: Array elements of A1[] are
sorted according to A2[]. So 2 comes first
then 1 comes, then comes 8, then finally 3
comes, now we append remaining elements in
sorted order.
Example 2:

Input:
N = 11 
M = 4
A1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8}
A2[] = {99, 22, 444, 56}
Output: 
1 1 2 2 3 5 6 7 8 8 9
Explanation: No A1[] elements are in A2[]
so we cannot sort A1[] according to A2[].
Hence we sort the elements in non-decreasing 
order.

Expected Time Complexity: O(N * Log(N)).
Expected Auxiliary Space: O(N).
*/
class Solution{
    // A1[] : the input array-1
    // N : size of the array A1[]
    // A2[] : the input array-2
    // M : size of the array A2[]
    
    //Function to sort an array according to the other array.
    public static int[] sortA1ByA2(int a1[], int n, int a2[], int m)
    {
        //Your code here
        
        //auxiliary arraylist
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        
        //hashmap and storefreq of arr1 with element
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            int count=hm.getOrDefault(a1[i],0);
            hm.put(a1[i],count+1);
        }
        //traverse second array and put values into arraylist abd deleting them after being added
        for(int i=0;i<m;i++){
            if(hm.containsKey(a2[i])){
                for(int j=0;j<hm.get(a2[i]);j++){
                    l1.add(a2[i]);
                }
                hm.remove(a2[i]);
            }
        }
        //traverse first aray and add remaining elemnts into second list
        for(Map.Entry<Integer,Integer>e:hm.entrySet()){
            for(int i=0;i<e.getValue();i++){
                l2.add(e.getKey());
            }
        }
        //sort list2
        Collections.sort(l2);
        
        //add l1 and l2 in thhe array a1
        int i;
        for(i=0;i<l1.size();i++){
            a1[i]=l1.get(i);
        }
        for(int j=0;j<l2.size();j++){
            a1[i]=l2.get(j);
            i++;
        }
        return a1;
    }
}