/*
Insert in a Sorted List

Given a linked list sorted in ascending order and an integer called data, insert data in the linked list such that the list remains sorted.

Example 1:

Input:
LinkedList: 25->36->47->58->69->80
data: 19
Output: 
19 25 36 47 58 69 80
Explanation:
After inserting 19 the sorted linked list will look like the one in the output.
Example 2:

Input:
LinkedList: 50->100
data: 75
Output: 
50 75 100
Explanation:
After inserting 75 the sorted linked list will look like the one in the output.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
*/
class Solution {
    Node sortedInsert(Node head1, int key) {
        // Add your code here.
        Node newNode=new Node(key);
        if(head1==null)
            head1=newNode;
        else{
            Node temp=head1;
            if(temp.data>key){
                newNode.next=head1;
                head1=newNode;
                return head1;
            }
            while(temp.next!=null){
                if(temp.next.data>key){
                    newNode.next=temp.next;
                    temp.next=newNode;
                    return head1;
                }
                temp=temp.next;
            }
            temp.next=newNode;
        }
        return head1;
    }
}