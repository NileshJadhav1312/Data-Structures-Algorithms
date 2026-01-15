/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode()
             {}
 *     ListNode(int val) 
            { this.val = val; }
 *     ListNode(int val, ListNode next)
            { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) 
    {
      ListNode prev=null; //prev to reverse the link 
      ListNode curr=head;  // changing the conection of current node
      ListNode nextn=null;  // stroring the address of next node which is unlinked 

      while(curr!=null)  // until head not became null
      {
        nextn=curr.next;  // moving nextnode next to the current node 
        curr.next=prev;  //cuurent node geting connect to previoue node 
        prev=curr;   // prev now denote current node
        curr=nextn;   // current to next node
      }
     return prev;     // our last node will be previous it denotes the current
    }
}
 