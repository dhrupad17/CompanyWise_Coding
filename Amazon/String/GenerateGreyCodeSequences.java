/*
Generate Grey Code Sequences

Given a number N, your task is to complete the function which generates all n-bit grey code sequences, a grey code sequence is a sequence such that successive patterns in it differ by one bit.

Example 1:

Input:
N = 2
Output: 00 01 11 10
Explanation: All 2-bit gray codes are
00, 01, 11, 10 such that successive
patterns in it differ by one bit.
Example 2:

Input:
N = 1
Output: 0 1

Expected Time Complexity: O(N * 2N)
Expected Auxiliary Space: O(1)
*/
class Solution
{
    ArrayList <String> generateCode(int n)
    {
	// Your code here
	    if(n==1){
	        ArrayList<String> bres=new ArrayList<>();
	        bres.add("0");
	        bres.add("1");
	        return bres;
	    }
	    ArrayList<String> pres=generateCode(n-1);
	    ArrayList<String> mres=new ArrayList<>();
	    
	    for(int i=0;i<pres.size();i++){
	        mres.add("0"+pres.get(i));
	    }
	    for(int i=pres.size()-1;i>=0;i--){
	        mres.add("1"+pres.get(i));
	    }
	    return mres;
    }
}
