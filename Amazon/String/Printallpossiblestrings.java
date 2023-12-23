/*
Print all possible strings

Given a string str your task is to complete the function spaceString which takes only one argument the string str and  finds all possible strings that can be made by placing spaces (zero or one) in between them. 

For eg .  for the string abc all valid strings will be
                abc
                ab c
                a bc
                a b c

Example 1:

Input:
str = abc
Output: abc$ab c$a bc$a b c$
Example 2:

Input:
str = xy
Output: xy$x y$

Expected Time Complexity: O(N * 2N)
Expected Auxiliary Space: O(N)
*/
class GfG
{
    ArrayList<String> spaceString(String str)
    {
        // Your code here
        ArrayList<String> ans=new ArrayList<>();
        helper(str,0,ans,"");
        return ans;
    }
    public static void helper(String str,int i,ArrayList<String> ans,String temp){
        if(i==str.length()-1){
            temp=temp+str.charAt(i);
            ans.add(temp);
            temp="";
            return;
        }
        helper(str,i+1,ans,temp+str.charAt(i));
        helper(str,i+1,ans,temp+str.charAt(i)+" ");  
    }
}
