/*
Add two numbers represented by linked lists

Given two decimal numbers represented by two linked lists of size N and M respectively. The task is to return a linked list that represents the sum of these two numbers.

For example, the number 190 will be represented by the linked list, 1->9->0->null, similarly 25 by 2->5->null. Sum of these two numbers is 190 + 25 = 215, which will be represented by 2->1->5->null. You are required to return the head of the linked list 2->1->5->null.

Example 1:

Input:
N = 2
valueN[] = {4,5}
M = 3
valueM[] = {3,4,5}
Output: 3 9 0  
Explanation: For the given two linked
list (4 5) and (3 4 5), after adding
the two linked list resultant linked
list will be (3 9 0).
Example 2:

Input:
N = 2
valueN[] = {6,3}
M = 1
valueM[] = {7}
Output: 7 0
Explanation: For the given two linked
list (6 3) and (7), after adding the
two linked list resultant linked list
will be (7 0).
*/
class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        
        //Stack Initialization and Data Push:
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        
        Node  temp=first;
        while(temp!=null){
            st1.push(temp.data);
            temp=temp.next;
        }
        temp=second;
        while(temp!=null){
            st2.push(temp.data);
            temp=temp.next;
        }
        
        //Addition with Carry Handling:
        Node head=null;
        int sum=0;
        int carry=0;
        while(!st1.isEmpty() && !st2.isEmpty()){
            int a=(int)st1.pop();
            int b=(int)st2.pop();
            sum=a+b+carry;
            if(sum>9){
                carry=1;
                head=addFirst(sum%10,head);
            }else{
                carry=0;
                head=addFirst(sum,head);
            }
        }
        
        //Remaining Digits Handling:
        while(!st1.isEmpty()){
             int a=(int)st1.pop();
            sum=a+carry;
            if(sum>9){
                carry=1;
                head=addFirst(sum%10,head);
            }else{
                carry=0;
                head=addFirst(sum,head);
            }
        }
        
        
        while(!st2.isEmpty()){
             int a=(int)st2.pop();
            sum=a+carry;
            if(sum>9){
                carry=1;
                head=addFirst(sum%10,head);
            }else{
                carry=0;
                head=addFirst(sum,head);
            }
        }
        
        //If there is a carry after processing all digits, 
        //it is added as the most significant digit.
        
        if(carry==1)
            head=addFirst(carry,head);
            
        return head;
    }
            
        static Node addFirst(int data, Node head){
        Node nn = new Node(data);
        if(head == null){
            head = nn;
        }else{
            nn.next = head;
            head = nn;
        }
        return head;
        }
    }