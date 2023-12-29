/*
Rotate a Linked List

Given a singly linked list of size N. The task is to left-shift the linked list by k nodes, where k is a given positive integer smaller than or equal to length of the linked list.

Example 1:

Input:
N = 5
value[] = {2, 4, 7, 8, 9}
k = 3
Output: 8 9 2 4 7
Explanation:
Rotate 1: 4 -> 7 -> 8 -> 9 -> 2
Rotate 2: 7 -> 8 -> 9 -> 2 -> 4
Rotate 3: 8 -> 9 -> 2 -> 4 -> 7
Example 2:

Input:
N = 8
value[] = {1, 2, 3, 4, 5, 6, 7, 8}
k = 4
Output: 5 6 7 8 1 2 3 4

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
*/
class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        //temp to tail
        Node newHead=null;
        Node find=head;
        int count=1;
        while(find!=null){
            if(count==k){
                temp.next=head;
                newHead=find.next;
                find.next=null;
            }
            count++;
            find=find.next;
        }
        return newHead;
    }
}
