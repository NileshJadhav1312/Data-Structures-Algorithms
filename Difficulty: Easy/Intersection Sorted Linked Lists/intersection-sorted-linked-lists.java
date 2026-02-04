/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    public static Node findIntersection(Node head1, Node head2) 
    {
      
      
      Node curr1=head1;
      Node curr2=head2;
      Node head3=new Node(0);  //creating new list
      Node temp=head3; // new list pointer
      
      
      while(curr1!=null && curr2!=null)
      {
          if(curr1.data<curr2.data)
          {
              curr1=curr1.next;
          }
          else if(curr1.data>curr2.data)
          {
                curr2=curr2.next;  
          }
          else{
               
               Node newnode=new Node(curr1.data);
               temp.next=newnode;
               temp=newnode;
               curr1=curr1.next;
                curr2=curr2.next;
          }
      }
      return head3.next;  //because new lists first element is 0 
    }
}