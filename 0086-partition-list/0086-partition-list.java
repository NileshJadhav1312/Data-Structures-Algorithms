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
    public ListNode partition(ListNode head, int x) {
        
        // Create two dummy lists
        ListNode smallerHead = new ListNode(0);
        ListNode greaterHead = new ListNode(0);
        
        ListNode smaller = smallerHead;
        ListNode greater = greaterHead;
        
        ListNode curr = head;
        
        while (curr != null) {
            if (curr.val < x) {
                smaller.next = curr;
                smaller = smaller.next;
            } else {
                greater.next = curr;
                greater = greater.next;
            }
            curr = curr.next;
        }
        
        // Important: end the greater list
        greater.next = null;
        
        // Connect both lists
        smaller.next = greaterHead.next;
        
        return smallerHead.next;
    }
}