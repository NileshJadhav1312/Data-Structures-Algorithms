/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/
class Solution {
    // Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) {

        if (head == null) return null;

        HashSet<Integer> set = new HashSet<>();

        Node prev = null;
        Node curr = head;

        while (curr != null) {
            // If value already seen → remove node
            if (set.contains(curr.data)) {
                prev.next = curr.next;
            } 
            // First occurrence → keep node
            else {
                set.add(curr.data);
                prev = curr;
            }
            curr = curr.next;
        }

        return head;
    }
}
