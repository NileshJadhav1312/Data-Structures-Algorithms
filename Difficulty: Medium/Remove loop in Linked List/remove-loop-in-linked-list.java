/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static void removeLoop(Node head) {
        // code here
        HashSet <Node> set=new HashSet<>();
        Node prev=null;
        Node temp=head;
        while(temp!=null)
        {
            if(set.contains(temp))
            {   
                
                prev.next=null;
                break;
            }
            else
            {
                set.add(temp);
                prev=temp;
                temp=temp.next;
            }
            
        }
          
    }
}