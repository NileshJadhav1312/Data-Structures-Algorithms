/*
class Node {
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
};
*/

class Solution {
    public int cycleStart(Node head)
    {
       HashSet<Node> set = new HashSet<>();
           Node temp=head;
         
         if (head == null || head.next == null)
         {
            return -1;
        }
       
        while(temp!=null)  //actuallly in temp varibale the hashcode of that node will be store 
        {
           if(set.contains(temp))
           {
            return temp.data;
           }
           else
           {
            set.add(temp);
           }
           temp=temp.next;
        }
       return -1;    // code here
        
    }
}