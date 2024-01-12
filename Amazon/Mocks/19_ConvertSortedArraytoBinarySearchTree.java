/*
Convert Sorted Array to Binary Search Tree
*/
class Sol 
{
    public static Node sortedArrayToBST(int a[], int n)
        {
            // code here
            return help(a,0,n-1);
        }
    public static Node help(int[] arr,int l,int r){
        if(l>r)
            return null;
        int mid=l+(r-l)/2;
        Node newN=new Node(arr[mid]);
        newN.left=help(arr,l,mid-1);
        newN.right=help(arr,mid+1,r);
        return newN;
    }
}