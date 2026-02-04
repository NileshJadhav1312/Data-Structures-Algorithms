/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static Node moveToFront(Node head) {
       Node lastnode=head;
       
       while(lastnode.next!=null)
        {
          lastnode=lastnode.next;   
        }
       
        Node newnode = new Node(lastnode.data);

         
         newnode.next=head;
         head=newnode;
       
       
       Node curr=head;
        while(curr.next.next!=null)
        {
         curr=curr.next;
          
       }
          curr.next=null;
     
      return head;   
    }
}
