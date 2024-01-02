/*
Given a linked list of 0s, 1s and 2s, sort it.

Given a linked list of N nodes where nodes can contain values 0s, 1s, and 2s only. The task is to segregate 0s, 1s, and 2s linked list such that all zeros segregate to head side, 2s at the end of the linked list, and 1s in the mid of 0s and 2s.

Example 1:

Input:
N = 8
value[] = {1,2,2,1,2,0,2,2}
Output: 0 1 1 2 2 2 2 2
Explanation: All the 0s are segregated
to the left end of the linked list,
2s to the right end of the list, and
1s in between.
Example 2:

Input:
N = 4
value[] = {2,2,0,1}
Output: 0 1 2 2
Explanation: After arranging all the
0s,1s and 2s in the given format,
the output will be 0 1 2 2.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        if(head==null)
            return head;
        Node curr=head;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        while(curr!=null){
            pq.add(curr.data);
            curr=curr.next;
        }
        curr=head;
        while(!pq.isEmpty()){
            curr.data=pq.poll();
            curr=curr.next;
        }
        return head;
    }
}

