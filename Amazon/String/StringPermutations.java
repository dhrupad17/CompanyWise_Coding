/*
String Permutations

Given a string S. The task is to find all permutations (need not be different) of a given string.

Note: return the permutations in lexicographically increasing order.

Example 1:

Input:
S = AAA
Output: AAA AAA AAA AAA AAA AAA
Explanation: There are total 6 permutations, as given in the output.
Example 2:

Input:
S = ABSG
Output: ABGS ABSG AGBS AGSB ASBG ASGB
BAGS BASG BGAS BGSA BSAG BSGA GABS
GASB GBAS GBSA GSAB GSBA SABG SAGB
SBAG SBGA SGAB SGBA
Explanation: There are total 24 permutations, as given in the output.

Expected Time Complexity: O(N * N!), N = length of string.
Expected Auxiliary Space: O(N!)
*/
class Solution
{
    public ArrayList<String> permutation(String s)
    {
        //Your code here
        ArrayList<String> ans=new ArrayList<>();
        solve(ans,s,"",0,new boolean[s.length()]);
        Collections.sort(ans);
        return ans;
    }
    public void solve(ArrayList<String> ans,String s,String temp,int index,boolean[] vis){
        if(temp.length()==s.length()){
            ans.add(temp);
            return;
        }
        if(index==s.length())
            return;
        //take
        if(!vis[index]){
            vis[index]=true;
            solve(ans,s,temp+s.charAt(index),0,vis);
            vis[index]=false;//all permutations so backtrack
        }
        //not take
        solve(ans,s,temp,index+1,vis);
            
    }
	   
}
