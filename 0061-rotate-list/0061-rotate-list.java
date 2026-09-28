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
    public ListNode rotateRight(ListNode head, int k) {
          if(head==null || head.next==null){
            return head;
          }
          int length=0;
           ListNode p = head;
        while (p != null) {
            length++;
            p = p.next;
        }
        k = k % length;
        while(k!=0){ 
            ListNode tail=head;
          ListNode temp=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        while(temp.next.next!=null){
            temp=temp.next;
        }
        k--;
        tail.next=head;
        head=tail;
        temp.next=null;
        }
       // temp.next=null;
        return head;
    }
}