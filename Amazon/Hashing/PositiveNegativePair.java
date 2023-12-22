/*
Positive Negative Pair

Given an array of distinct integers, find all the pairs having both negative and positive values of a number in the array.


Example 1:

Input:
n = 8
arr[] = {1,3,6,-2,-1,-3,2,7}
Output: -1 1 -3 3 -2 2
Explanation: 1, 3 and 2 are present 
pairwise positive and negative. 6 and 
7 have no pair.
Example 2:

Input:
n = 3
arr[] = {3,2,1}
Output: 0
Explanation: No such pair exists so the 
output is 0.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)
*/
class Solution
{
    //Function to return list containing all the pairs having both
    //negative and positive values of a number in the array.
    public static ArrayList<Integer>findPairs(int arr[], int n) 
    { 
    	// code here.
    	ArrayList<Integer> list=new ArrayList<>();
    	HashSet<Integer> hs=new HashSet<>();
    	for(int i:arr){
    	    if(hs.contains(-i)){
    	        list.add(-Math.abs(i));
    	        list.add(Math.abs(i));
    	    }
    	    hs.add(i);
    	}
    	return list;
    	
    }
}