/* Structure of LinkedList
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/
class Solution {
    boolean isCircular(Node head) 
    {
      Node temp=head;
      while(temp!=null)
      {
          temp=temp.next;
          if(temp==head)
          {
              return true;
          }
      }
     return false;   
    }
}