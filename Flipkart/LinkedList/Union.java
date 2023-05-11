/*
Union of Two Linked Lists

Given two linked lists, your task is to complete the function makeUnion(), that returns the union of two linked lists. This union should include all the distinct elements only.

Example 1:

Input:
L1 = 9->6->4->2->3->8
L2 = 1->2->8->6->2
Output: 1 2 3 4 6 8 9
*/

class Sol
{
	public static Node findUnion(Node head1,Node head2)
	{
	    //Add your code here.
	    HashSet<Integer> set=new HashSet<>();
	    Node temp1=head1;
	    Node temp2=head2;
	    Node ans=null;
	    while(temp1!=null){
	        set.add(temp1.data);
	        temp1=temp1.next;
	    }
	    while(temp2!=null){
	        set.add(temp2.data);
	        temp2=temp2.next;
	    }
	    ArrayList<Integer> list=new ArrayList<>();
	    for(int i:set){
	        list.add(i);
	    }
	    Collections.sort(list);
	    Collections.reverse(list);
	    for(int i: list){
	        Node item=new Node(i);
	        item.next=ans;
	        ans=item;
	    }
	    return ans;
	}
}

/*
Expected Time Complexity: O(N * Log(N))
Expected Auxiliary Space: O(N)
*/
