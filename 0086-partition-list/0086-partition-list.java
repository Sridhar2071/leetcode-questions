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
    public ListNode partition(ListNode head, int x) {
       ListNode l=head;
        ListNode t1=new ListNode(100);
        ListNode h1=t1;
        ListNode t2=new ListNode(100);
        ListNode h2=t2;
        while(l!=null){
            if(l.val<x){
                t1.next=l;
                t1=l;
                l=l.next;
            }else{
                t2.next=l;
                t2=l;
                l=l.next;
            }
        }
        t2.next=null;
        t1.next=h2.next;
        return h1.next;

    }
} 