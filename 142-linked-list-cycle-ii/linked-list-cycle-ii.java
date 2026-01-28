/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head)
     {
        HashSet<ListNode> set = new HashSet<>();
        ListNode temp=head;
         if (head == null || head.next == null)
         {
            return null;
        }
        while(temp!=null)  //actuallly in temp varibale the hashcode of that node will be store 
        {
           if(set.contains(temp))
           {
            return temp;
           }
           else
           {
            set.add(temp);
           }
           temp=temp.next;
        }
       return null;     
    }
}


// public class Solution {
//     public ListNode detectCycle(ListNode head)
//      {
        
// if (head == null || head.next == null) {
//             return null;
//         }

//         ListNode slow = head;
//         ListNode fast = head;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;

//             if (slow == fast) {  
//                 slow = head;
//                 while (slow != fast) {
//                     slow = slow.next;
//                     fast = fast.next;
//                 }

//                 return slow; 
//             }
//         }

//         return null;   
//     }
// }

