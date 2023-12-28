/*
Sum of M elements after Kth smallest element in BST 
*/
class Sol
{
    public static int sumOfNElemsAfterKthSmallest(Node root , int m , int k)
        {
            int sum=0;
            Stack<Node> st=new Stack<>();
            while(root!=null){
                st.push(root);
                root=root.left;
            }
            
            for(int i=1;i<k+m+1;i++){
                Node temp=st.pop();
                if(i>k){
                    sum+=temp.data;
                }
                temp=temp.right;
                while(temp!=null){
                    st.push(temp);
                    temp=temp.left;
                }
            }
            return sum;
        }
}