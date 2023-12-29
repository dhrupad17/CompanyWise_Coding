/*
Pairwise swap elements of a linked list

Given a singly linked list of size N. The task is to swap elements in the linked list pairwise.
For example, if the input list is 1 2 3 4, the resulting list after swaps will be 2 1 4 3.
Note: You need to swap the nodes, not only the data. If only data is swapped then driver will print -1.

Example 1:

Input:
LinkedList: 1->2->2->4->5->6->7->8
Output: 
2 1 4 2 6 5 8 7
Explanation: 
After swapping each pair considering (1,2), (2, 4), (5, 6).. so on as pairs, we get 2, 1, 4, 2, 6, 5, 8, 7 as a new linked list.
Example 2:

Input:
LinkedList: 1->3->4->7->9->10->1
Output: 
3 1 7 4 10 9 1
Explanation: 
After swapping each pair considering (1,3), (4, 7), (9, 10).. so on as pairs, we get 3, 1, 7, 4, 10, 9, 1 as a new linked list.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
*/
class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head)
    {
        // code here
        if(head==null)
            return null;
        
        Node dummy =new Node(0);
        dummy.next=head;
        
        Node prev=dummy;
        Node curr=head;
        
        while(curr!=null && curr.next!=null){
            Node nextN=curr.next;
            curr.next=nextN.next;
            nextN.next=prev.next;
            prev.next=nextN;
            
            prev=curr;
            curr=curr.next;
        }
        return dummy.next;
    }
}