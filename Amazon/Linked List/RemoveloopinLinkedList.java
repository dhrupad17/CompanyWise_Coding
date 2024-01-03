/*
Remove loop in Linked List

Given a linked list of N nodes such that it may contain a loop.

A loop here means that the last node of the link list is connected to the node at position X(1-based index). If the link list does not have any loop, X=0.

Remove the loop from the linked list, if it is present, i.e. unlink the last node which is forming the loop.


Example 1:

Input:
N = 3
value[] = {1,3,4}
X = 2
Output: 1
Explanation: The link list looks like
1 -> 3 -> 4
     ^    |
     |____|    
A loop is present. If you remove it 
successfully, the answer will be 1. 

Example 2:

Input:
N = 4
value[] = {1,8,3,4}
X = 0
Output: 1
Explanation: The Linked list does not 
contains any loop. 

Expected time complexity: O(N)
Expected auxiliary space: O(1)
*/
class Solution {
    public static void removeLoop(Node head) {
        // Initialize slow and fast pointers
        Node slow = head;
        Node fast = head;

        // Detect loop using Floyd's cycle detection algorithm
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }

        // If no loop is found
        if (slow != fast || slow == null || fast == null) {
            return;
        }

        // Move one pointer to the beginning and keep the other at the meeting point
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // Find the last node in the loop
        Node p = slow.next;
        while (p.next != slow) {
            p = p.next;
        }

        // Remove the loop by setting the next of the last node in the loop to null
        p.next = null;
    }
}