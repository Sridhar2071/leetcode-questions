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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     ListNode dummy = new ListNode(10);
     ListNode tail=dummy;
      int carr=0;
      while(l1!=null || l2!=null || carr!=0){
        int sum=0;
        if(l1!=null){
            sum=sum+l1.val;
            l1=l1.next;
        }
           if(l2!=null){
            sum=sum+l2.val;
            l2=l2.next;
        }
        sum=sum+carr;
         carr = sum / 10;
            int digit = sum % 10;

            ListNode newNode = new ListNode(digit);

            tail.next = newNode;
            tail = tail.next;
        }
        return dummy.next;
      }
}