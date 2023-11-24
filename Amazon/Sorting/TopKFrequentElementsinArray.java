//Top K Frequent Elements in Array - I
/*
Given a non-empty array nums[] of integers of length N, find the top k elements which have the highest frequency in the array. If two numbers have same frequencies, then the larger number should be given more preference.

Example 1:

Input:
N = 6
nums = {1,1,1,2,2,3}
k = 2
Output: {1, 2}
Example 2:

Input:
N = 8
nums = {1,1,2,2,3,3,3,4}
k = 2
Output: {3, 2}
Explanation: Elements 1 and 2 have the
same frequency ie. 2. Therefore, in this
case, the answer includes the element 2
as 2 > 1.
*/
class Solution {
    public int[] topK(int[] nums, int k) {
        // Code here
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Put the frequencies in the priority queue
        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y)->{
            if(x[0] < y[0])     return -1;
            else if(x[0] > y[0])    return 1;
            else if(x[1] < y[1])    return -1;
            return 1;
        });
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            pq.add(new int[]{entry.getValue(), entry.getKey()});
            if(pq.size() > k)
                pq.poll();
        }
        
        int[] sol = new int[k];
        for(int i =k-1; i>=0; i--){
            sol[i] = pq.poll()[1];
        }
        return sol;
    }
}
/*
Expected Time Complexity : O(NlogN)
Expected Auxilliary Space : O(N)
*/