/*
K closest point to origin

Given a list of points on the 2-D plane and an integer K. The task is to find K closest points to the origin and print them.

Note: The distance between two points on a plane is the Euclidean distance.You are require to prints the points in increasing order of their distance from the origin. If two points are at same distance from origin then print points in sorted order(First sort the coordinates according to the X-coordinate and in case X-coordinate is same, then sort  according to Y-coordinate).

Example 1:

Input:
N = 3, K = 2
Points[] = {(3,3),(5,-1),(-2,4)}
Output: 3 3 -2 4
Explanation: Distance between (-2, 4) and
origin is sqrt(20).
Distance between (3, 3) and origin is
sqrt(18).
Distance between (5, -1) and origin is
sqrt(26).
Since two(K) shortest distance from origin
are from points (-2, 4) and (3, 3).
Example 2:

Input:
N = 3, K = 2
Points[] = {(1,3),(-1,3),(5,8)}
Output: -1 3 1 3
Explanation: Distance between (-1, 3) and
origin is sqrt(10).
Distance between (1, 3) and origin is
sqrt(10).
Distance between (5, 8) and origin is
sqrt(89).
Since two(K) shortest distance from origin
are from points (-1, 3) and (1, 3) 

Expected Time Complexity: O(nLogn)
Expected Auxiliary Space: O(n) 
*/
class Solution
{
    public static ArrayList<ArrayList<Integer>> kClosest(ArrayList<ArrayList<Integer>> points, int K)
    {
        //code here.
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        
        PriorityQueue<ArrayList<Integer>> pq = new PriorityQueue<>(new 
        Comparator<ArrayList<Integer>>()
        {
            public int compare(ArrayList<Integer> a,ArrayList<Integer> b){
                int sq1=a.get(1)*a.get(1)+a.get(0)*a.get(0);
                int sq2=b.get(1)*b.get(1)+b.get(0)*b.get(0);
                
                if(sq1==sq2){
                    return a.get(0).equals(b.get(0))?a.get(1)-b.get(1):a.get(0)-b.get(0);
                }
                else{
                    return sq1-sq2;
                }
            }
        });
        for(ArrayList<Integer> point:points){
            pq.add(point);
        }
        int size=0;
        while(size<K && !pq.isEmpty()){
            list.add(pq.remove());
            size++;
        }
        return list;
    }

}
