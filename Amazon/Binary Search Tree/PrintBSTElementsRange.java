//Print BST elements in given range
/*
Given a Binary Search Tree and a range [low, high]. Find all the numbers in the BST that lie in the given range.
Note: Element greater than or equal to root go to the right side.

Example 1:

Input:
       17
     /    \
    4     18
  /   \
 2     9 
l = 4, h = 24
Output: 4 9 17 18 
Example 2:

Input:
       16
     /    \
    7     20
  /   \
 1    10
l = 13, h = 23
Output: 16 20 
*/
class Solution
{   
    //Function to return a list of BST elements in a given range.
	public static ArrayList<Integer> printNearNodes(Node root,int low,int high) {
        // code here.
        ArrayList<Integer> al=new ArrayList<>();
        print(root,low,high,al);
        return al;
    }
    public static void print(Node root,int low,int high,ArrayList<Integer> al){
        if(root==null)
            return;
        if(root.data>=low)
            print(root.left,low,high,al);
        if(root.data>=low && root.data<=high)
            al.add(root.data);
        if(root.data<=high)        
            print(root.right,low,high,al);
    }
    
}
/*
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Height of the BST).
*/