/*
Boundary Traversal of binary tree

Given a Binary Tree, find its Boundary Traversal. The traversal should be in the following order: 

Left boundary nodes: defined as the path from the root to the left-most node ie- the leaf node you could reach when you always travel preferring the left subtree over the right subtree. 
Leaf nodes: All the leaf nodes except for the ones that are part of left or right boundary.
Reverse right boundary nodes: defined as the path from the right-most node to the root. The right-most node is the leaf node you could reach when you always travel preferring the right subtree over the left subtree. Exclude the root from this as it was already included in the traversal of left boundary nodes.
Note: If the root doesn't have a left subtree or right subtree, then the root itself is the left or right boundary. 

Example 1:

Input:
        1 
      /   \
     2     3  
    / \   / \ 
   4   5 6   7
      / \
     8   9
   
Output: 1 2 4 8 9 6 7 3
*/
class Solution
{
	void printBoundary(Node node)
	{
	    ArrayList<Integer> ans=new ArrayList<>();
	    if(isLeaf(node)==false){
	        ans.add(node.data);
	    }
	    leftBoundary(node,ans);
	    addLeafNodes(node,ans);
	    rightBoundary(node,ans);
	    for(int i:ans){
	        System.out.print(i+" ");
	    }
	}
	boolean isLeaf(Node node){
	    if(node.left==null && node.right==null)
	        return true;
	    return false;
	}
	void leftBoundary(Node node,ArrayList<Integer> ans){
	    Node curr=node.left;
	    while(curr!=null){
	        if(isLeaf(curr)==false)
	            ans.add(curr.data);
	        if(curr.left!=null)
	            curr=curr.left;
	        else
	            curr=curr.right;
	    }
	}
	void addLeafNodes(Node node,ArrayList<Integer> ans){
	    if(isLeaf(node)==true){
	        ans.add(node.data);
	        return;
	    }
	    if(node.left!=null){
	        addLeafNodes(node.left,ans);
	    }
	    if(node.right!=null){
	        addLeafNodes(node.right,ans);
	    }
	}
	void rightBoundary(Node node,ArrayList<Integer> ans){
	    Node curr=node.right;
	    ArrayList<Integer> temp=new ArrayList<>();
	    while(curr!=null){
	        if(isLeaf(curr)==false)
	            temp.add(curr.data);
	        if(curr.right!=null)
	            curr=curr.right;
	        else
	            curr=curr.left;
	    }
	    for(int i=temp.size()-1;i>=0;i--){
	        ans.add(temp.get(i));
	    }
	}
}
