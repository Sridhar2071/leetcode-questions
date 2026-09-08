/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public static int size(ListNode head){
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       ListNode h1=headA;
       ListNode h2=headB;
       int m=size(h1);
       int n=size(h2);
       if(m>n){
        for(int i=0;i<m-n;i++){
            h1=h1.next;
        }
       }else{
        for(int i=0;i<n-m;i++){
            h2=h2.next;
        }
       }
       while(h1!=h2){
        h1=h1.next;
        h2=h2.next;
       }
       return h1;
    }
}