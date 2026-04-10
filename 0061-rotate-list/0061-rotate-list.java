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
    public ListNode rotateRight(ListNode head, int k) 
    {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode temp = head;
        int n = 1;
        // get length and last node
        while (temp.next != null)
        {
            n++;
            temp = temp.next;
        }

        // handle k > n
        k = k % n;
        if (k == 0) return head;

        ListNode temp2 = head;

        // move to (n - k - 1)th node (new tail)
        int steps = n - k - 1;
        while (steps > 0)
        {
            temp2 = temp2.next;
            steps--;
        }

        ListNode newhead = temp2.next;

        // connect last node to head
        temp.next = head;

        // break link
        temp2.next = null;

        return newhead;
    }
}
// class Solution {
//     public ListNode rotateRight(ListNode head, int k) {
//         if (head == null || head.next == null || k == 0) {
//             return head;
//         }

//         // Step 1: Find length and last node
//         ListNode temp = head;
//         int n = 1;
//         while (temp.next != null) {
//             temp = temp.next;
//             n++;
//         }

//         // Step 2: Make it circular
//         temp.next = head;

//         // Step 3: Normalize k
//         k = k % n;

//         // Step 4: Find new tail
//         int steps = n - k;
//         ListNode newTail = head;

//         for (int i = 1; i < steps; i++) {
//             newTail = newTail.next;
//         }

//         // Step 5: Set new head
//         ListNode newHead = newTail.next;

//         // Step 6: Break circle
//         newTail.next = null;

//         return newHead;
//     }
// }