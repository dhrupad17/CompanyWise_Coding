/*
Largest BST
*/
class Solution{
    
    public static int[] largestBSTBT(Node root)
    {
        // Base cases : When tree is empty or it has one
        // child.
        if (root == null)
            return new int[] { Integer.MAX_VALUE,
                               Integer.MIN_VALUE, 0 };
        if (root.left == null && root.right == null)
            return new int[] { root.data, root.data, 1 };
 
        // Recur for left subtree and right subtrees
        int[] left = largestBSTBT(root.left);
        int[] right = largestBSTBT(root.right);
 
        // Create a return variable and initialize its size.
        int[] ans = new int[3];
 
        // If whole tree rooted under current root is BST.
        if ((left[1] < root.data)
            && (right[0] > root.data)) {
            ans[0] = Math.min(
                left[0], Math.min(right[0], root.data));
            ans[1] = Math.max(right[1],
                              Math.max(left[1], root.data));
 
            // Update answer for tree rooted under current
            // 'root'
            ans[2] = 1 + left[2] + right[2];
            return ans;
        }
 
        // If whole tree is not BST, return maximum of left
        // and right subtrees
        ans[0] = Integer.MIN_VALUE;
        ans[1] = Integer.MAX_VALUE;
        ans[2] = Math.max(left[2], right[2]);
 
        return ans;
    }
    
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root)
    {
        // Write your code here
        return largestBSTBT(root)[2];
        
        
    }
    
}