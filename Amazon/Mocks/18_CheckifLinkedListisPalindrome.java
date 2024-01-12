/*
Check if Linked List is Palindrome 

Given a singly linked list of size N of integers. The task is to check if the given linked list is palindrome or not.

Example 1:

Input:
N = 3
value[] = {1,2,1}
Output: 1
Explanation: The given linked list is
1 2 1 , which is a palindrome and
Hence, the output is 1.
Example 2:

Input:
N = 4
value[] = {1,2,3,4}
Output: 0
Explanation: The given linked list
is 1 2 3 4 , which is not a palindrome
and Hence, the output is 0.
*/
class Palindrome
{
    // Function to check if linked list is palindrome
    boolean isPalindrome(Node head) 
    {
        //Your code here
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        // If the number of nodes is odd, move slow pointer to the next node
        if(fast!=null){
            slow=slow.next;
        }
         // Reverse the second half of the linked list
        slow=reverse(slow);
        fast=head;
        // Compare the first half and the reversed second half of the linked list
        while(slow!=null){
            if(fast.data!=slow.data)
                return false;
            fast=fast.next;
            slow=slow.next;
        }
        return true;
    }
    Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node newN=curr.next;
            curr.next=prev;
            prev=curr;
            curr=newN;
        }
        return prev;
    }
}

