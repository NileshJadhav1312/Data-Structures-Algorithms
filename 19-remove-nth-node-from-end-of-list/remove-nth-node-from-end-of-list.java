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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {

        ListNode temp=head;
        ListNode prev=null;
        int totalnode=0;
        

        if(head.next==null && n==1)
        {
            head=null;
            return head;
        }


        while(temp!=null)
        {
           totalnode+=1;
           temp=temp.next;
        }
        if(n==totalnode){
            return head.next;
        }

         temp=head;
        int pos=totalnode-n;
        int i=1;

        while(temp!=null)
        {
            if(i==pos)
            {
                temp.next=temp.next.next;
                break;

            }
            temp=temp.next;
            i++;
            
        }

   return  head;
    }
}