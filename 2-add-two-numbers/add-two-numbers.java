class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode temp1 = l1;
        ListNode temp2 = l2;

        ListNode l3= new ListNode();
        ListNode temp3 =l3;

        int carry = 0;

        while (temp1 != null || temp2 != null)
         {
            int x = 0;
            int y = 0;

            if (temp1 != null)
             {
                x = temp1.val;
            }

            if (temp2 != null)
             {
                y = temp2.val;
            }

            int sum = x + y + carry;

            carry = sum / 10;
            int digit = sum % 10;
               ListNode newnode = new ListNode(digit);

            temp3.next = newnode;
            temp3 = newnode;

            if (temp1 != null) 
            {
                temp1 = temp1.next;
            }
            if (temp2 != null)
             {
                temp2 = temp2.next;
            }
        }

        if (carry > 0) {
            temp3.next = new ListNode(carry);
        }

        return l3.next;
    }
}



// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    
//      {
//         ListNode temp1=l1;
//         ListNode temp2=l2;
//         ListNode l3=new ListNode();
//         ListNode temp3 = l3;
       
//          int carry=0;
        
//         if(temp2==null)
//         {
//             return l1;
//         }

//         while(temp1!=null ||  temp2!=null)
//         { 
//            int addition=0; 

//             if(temp2==null)
//             {
//               addition=temp1.val+0+carry;
//               if(addition >9)
//               {
//                   carry=addition/10;
//                   ListNode newnode;
//                    temp3.next=newnode;
//                    temp3=newnode;
//                    newnode.val=addition%10;
//                    addition=0;
//               }
             
//             }
//             else
//             {
//               addition=temp1.val+temp2.val+carry;
//               carry=addition/10;
//               ListNode newnode;
//               newnode.val=addition%10;
//               temp3.next=newnode;
//               temp3=newnode;
//               addition=0;
//             }
//         }
// return l3;   
//     }
// }