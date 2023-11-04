//Lowest Common Ancestor in a BST
/*
Given a Binary Search Tree (with all values unique) and two node values n1 and n2 (n1!=n2). Find the Lowest Common Ancestors of the two nodes in the BST.

Example 1:

Input:
              5
            /   \
          4      6
         /        \
        3          7
                    \
                     8
n1 = 7, n2 = 8
Output: 7
Example 2:

Input:
     2
   /   \
  1     3
n1 = 1, n2 = 3
Output: 2
*/
class BST
{   
    //Function to find the lowest common ancestor in a BST. 
	Node LCA(Node root, int n1, int n2)
	{
        // code here.    
        if(root==null)
            return null;
        int x=root.data;
        if(x>n1 && x> n2)
            return LCA(root.left,n1,n2);
        if(x<n1 && x<n2)
            return LCA(root.right,n1,n2);
        return root;
    }
    
}
/*
Expected Time Complexity: O(Height of the BST).
Expected Auxiliary Space: O(Height of the BST).
*/