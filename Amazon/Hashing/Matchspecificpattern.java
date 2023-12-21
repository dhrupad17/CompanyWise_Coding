/*
Match specific pattern

Given a dictionary of words and a pattern. Every character in the pattern is uniquely mapped to a character in the dictionary. Find all such words in the dictionary that match the given pattern. 

Example 1:

Input:
N = 4
dict[] = {abb,abc,xyz,xyy}
pattern  = foo
Output: abb xyy
Explanation: xyy and abb have the same
character at index 1 and 2 like the
pattern.

Expected Time Complexity: O(N*K) (where K is the length of the pattern).
Expected Auxiliary Space: O(N).
*/
class GfG
{
/* The function returns an array of strings 
present in the dictionary which matches
the string pattern.
You are required to complete this method */
public static ArrayList<String> findMatchedWords(ArrayList<String> dict, String pattern)
	{
	    //add code here.
	    ArrayList<String> ans=new ArrayList<>();
	    for(int i=0;i<dict.size();i++){
	        if(check(dict.get(i),pattern))
	            ans.add(dict.get(i));
	    }
	    return ans;
	}
	public static boolean check(String s,String p){
	    if(s.length()!=p.length())
	        return false;
	   HashMap<Character,Character>hm=new HashMap<>();
	   for(int i=0;i<s.length();i++){
	       char c1=s.charAt(i);
	       char c2=p.charAt(i);
	       
	       if(hm.containsKey(c1)){
	           if(hm.get(c1)!=c2)
	            return false;
	       }
	       else if(hm.containsKey(c2)){
	           if(hm.get(c2)!=c1)
	            return false;
	       }
	       else {
	        hm.put(c1,c2);
	        hm.put(c2,c1);
	       }
	           
	   }
	   return true;
	}
}