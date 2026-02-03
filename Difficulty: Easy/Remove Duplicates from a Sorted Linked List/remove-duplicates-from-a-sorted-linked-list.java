/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    // Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
        if(head.next==null)
        {
            return head;
        }
        Node temp=head.next;
        Node prev=head;
        
        while(temp!=null)
        {
            if(prev.data==temp.data)
            {
                prev.next=temp.next;
                temp=prev.next;
                
            }
            else
            {
              prev=prev.next;
              temp=temp.next;
            }
        }
     return head;    
    }
}