class Solution {
    // function to reverse a linked list
    private Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    Node compute(Node head) {
        if (head == null || head.next == null)
            return head;

        // Step 1: Reverse the list
        head = reverse(head);

        // Step 2: Traverse and delete nodes smaller than maxSoFar
        Node curr = head;
        int maxSoFar = curr.data;
        Node prev = curr;
        curr = curr.next;

        while (curr != null) {
            if (curr.data < maxSoFar) {
                // delete current node
                prev.next = curr.next;
            } else {
                maxSoFar = curr.data;
                prev = curr;
            }
            curr = curr.next;
        }

        // Step 3: Reverse the list again to restore original order
        head = reverse(head);

        return head;
    }
}
