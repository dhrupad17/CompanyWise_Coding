/*
Left View of Binary Tree

Given a Binary Tree, return Left view of it. Left view of a Binary Tree is set of nodes visible when tree is visited from Left side. The task is to complete the function leftView(), which accepts root of the tree as argument.

Left view of following tree is 1 2 4 8.

          1
       /     \
     2        3
   /     \    /    \
  4     5   6    7
   \
     8   

Example 1:

Input:
   1
 /  \
3    2
Output: 1 3
*/
class Tree
{
    void leftView(Node root)
    {
      // Your code here
      List<Integer> res=new ArrayList<>();
      solve(root,res,0);
      
    }
    
    void solve(Node curr,List<Integer>res,int depth){
        if(curr==null)
            return;
        if(depth==res.size()){
            res.add(curr.data);
            System.out.print(curr.data+" ");
        }
        solve(curr.left,res,depth+1);
        solve(curr.right,res,depth+1);
    }
}