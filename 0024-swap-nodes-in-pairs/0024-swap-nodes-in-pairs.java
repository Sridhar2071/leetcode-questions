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
    public ListNode swapPairs(ListNode head) {
        // if(head==null) return null;
        // if(head.next==null) return head;
        // ListNode a=head;
        // while(a!=null && a.next!=null){
        //     ListNode b=a.next;
        //     int temp=a.val;
        //     a.val=b.val;
        //     b.val=temp;
        //     a=b.next;
        // }
        // return head;
        ListNode dummy = new ListNode(10);
        dummy.next=head;
        ListNode t = dummy;
        while(t.next!=null && t.next.next!=null){
            ListNode f= t.next, s=t.next.next;
            f.next=s.next;
            s.next=f;
            t.next=s; 
            t=f;
        }
        return dummy.next;
    }
}