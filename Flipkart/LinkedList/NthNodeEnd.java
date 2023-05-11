/*
Nth node from end of linked list
Given a linked list consisting of L nodes and given a number N. The task is to find the Nth node from the end of the linked list.

Example 1:

Input:
N = 2
LinkedList: 1->2->3->4->5->6->7->8->9
Output: 8
Explanation: In the first example, there
are 9 nodes in linked list and we need
to find 2nd node from end. 2nd node
from end is 8.  
Example 2:

Input:
N = 5
LinkedList: 10->5->100->5
Output: -1
Explanation: In the second example, there
are 4 nodes in the linked list and we
need to find 5th from the end. Since 'n'
is more than the number of nodes in the
linked list, the output is -1.
*/

class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here	
    	Node temp=head;
    	int count=0;
    	while(temp!=null){
    	    count++;
    	    temp=temp.next;
    	}
    	if(n>count)
    	    return -1;
    	int res=count-n;
    	Node temp1=head;
    	for(int i=0;i<res;i++){
    	    temp1=temp1.next;
    	}
    	return temp1.data;
    }
}

/*
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
*/
