/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
             Node temp = head;
        Node last = null;

        while (temp != null) {
            // swap next and prev
            Node swap = temp.next;
            temp.next = temp.prev;
            temp.prev = swap;

            // keep track of last node (new head)
            last = temp;

            // move forward (which is prev after swap)
            temp = temp.prev;
        }

        return last;
   }
}