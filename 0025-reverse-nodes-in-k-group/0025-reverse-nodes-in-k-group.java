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

    public ListNode reverseKGroup(ListNode head, int k)
     {
        if (head == null || k == 1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroupEnd = dummy;

        while (true) {

            // Step 1: Find kth node (end of group)
            ListNode kth = getKthNode(prevGroupEnd, k);
            if (kth == null) break;

            ListNode start = prevGroupEnd.next;
            ListNode end = kth;
            ListNode nextGroupStart = end.next;

            // Step 2: Reverse from start to end
            reverse(start, end);

            // Step 3: Connect previous group with reversed group
            prevGroupEnd.next = end;

            // Step 4: Connect end of reversed group to next part
            start.next = nextGroupStart;

            // Step 5: Move prevGroupEnd to end of reversed group
            prevGroupEnd = start;
        }

        return dummy.next;
    }

    // Helper to get kth node
    private ListNode getKthNode(ListNode curr, int k) {
        while (curr != null && k > 0) {
            curr = curr.next;
            k--;
        }
        return curr;
    }

    // Reverse from start to end (inclusive)
  private void reverse(ListNode start, ListNode end) {
    ListNode stop = end.next;  // 🔥 store boundary safely
    ListNode prev = stop;
    ListNode curr = start;

    while (curr != stop) {
        ListNode temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;
    }
}
}