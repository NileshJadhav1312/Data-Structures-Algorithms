class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) 
    {
        
        if (head == null || left == right) return head;

        // Dummy node to simplify edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode prev = dummy;

        // Step 1: Move prev to (left-1) position
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // Step 2: Reverse from left to right
        ListNode curr = prev.next;
        ListNode next = null;

        for (int i = 0; i < right - left; i++) {
            next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }

        return dummy.next;
    }
}