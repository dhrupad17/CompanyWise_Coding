/*
Add 1 to a number represented as linked list

A number N is represented in Linked List such that each digit corresponds to a node in linked list. You need to add 1 to it.

Example 1:

Input:
LinkedList: 4->5->6
Output: 457
Explanation: 4->5->6 represents 456 and when 1 is added it becomes 457. 
Example 2:

Input:
LinkedList: 1->2->3
Output: 124 

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
*/
class Solution
{
    public static Node addOne(Node head) 
    { 
        //code here.
        if(head==null)
            return head;
        head=reverse(head);
        
        int sum=0;
        int rem=0;
        Node curr=head;
        curr.data=curr.data+1;
        Node prev=null;
        
        while(curr!=null){
            sum=curr.data+rem;
            rem=sum/10;
            curr.data=sum%10;
            prev=curr;
            curr=curr.next;
        }
        if(rem!=0){
            Node newNode=new Node(rem);
            prev.next=newNode;
        }
        return reverse(head);
    }
    static Node reverse(Node head)
    {
        // code here
        if(head==null || head.next==null)
            return head;
        Node prev=null;
        Node curr=head;
        Node nextNode=null;
        while(curr!=null){
            nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        return prev;
    }
    
}
