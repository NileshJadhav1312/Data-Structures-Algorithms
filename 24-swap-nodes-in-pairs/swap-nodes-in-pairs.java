/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) 
    {
        if(head==null || head.next ==null)
        {
         return head; 
        }

        ListNode temp=head.next;
        ListNode prev=head;

        while(temp!=null && prev!=null)
        {
            int x=prev.val;
            prev.val=temp.val;
            temp.val=x;
           
            prev = temp.next;
           
            if (prev != null)
                temp = prev.next;
            else
                temp = null;
        }

    return head;
    }
}