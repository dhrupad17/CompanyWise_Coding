//Binary Tree to BST

/*
Given a Binary Tree, convert it to Binary Search Tree in such a way that keeps the original structure of Binary Tree intact.
 Example 1:

Input:
      1
    /   \
   2     3
Output: 
1 2 3
Explanation:
The converted BST will be 
      2
    /   \
   1     3

Example 2:

Input:
          1
       /    \
     2       3
   /        
 4       
Output: 
1 2 3 4
Explanation:
The converted BST will be

        3
      /   \
    2     4
  /
 1
*/
class Solution
{
    // The given root is the root of the Binary Tree
    // Return the root of the generated BST
   Node bst(int data,Node root){
        if(root==null){return new Node(data);}
        if(root.data<data){
            root.right=bst(data,root.right);
        }else{
            root.left=bst(data,root.left);
        }
        return root;
    }
    Node preorder(Node root,Node ans){
        if(root==null)return ans;
        ans=preorder(root.left,ans);
        ans=bst(root.data,ans);
        ans=preorder(root.right,ans);
        return ans;
    }
    Node binaryTreeToBST(Node root)
    {
        Node ans=null;
        return preorder(root,ans);
        // return ans;
    }
}
 
/*
Expected Time Complexity: O(NLogN).
Expected Auxiliary Space: O(N).
*/