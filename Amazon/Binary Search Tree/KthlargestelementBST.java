//Kth largest element in BST
/*
Given a Binary Search Tree. Your task is to complete the function which will return the Kth largest element without doing any modification in Binary Search Tree.

Example 1:

Input:
      4
    /   \
   2     9
k = 2 
Output: 4
Example 2:

Input:
       9
        \ 
          10
K = 1
Output: 10
*/
class Solution
{
    // return the Kth largest element in the given BST rooted at 'root'
    int count=0;
    public void inorder(Node root,int K,Node curr){
        if(root==null || count>=K)
            return;
        inorder(root.right,K,curr);
        count++;
        if(count==K)
            curr.data=root.data;
        inorder(root.left,K,curr);
    }
    public int kthLargest(Node root,int K)
    {
        //Your code here
        Node curr=new Node(-1);
        inorder(root,K,curr);
        return curr.data;
    }
}
/*
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(H) where H is max recursion stack of height H at a given time.
*/