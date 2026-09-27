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
    public ListNode removeElements(ListNode head, int val) {
       ListNode temp=head;
       ListNode ans = new ListNode(100);
       ListNode temp2=ans;
       while(temp!=null){
        if(temp.val!=val){
            ans.next=temp;
            ans=temp;
            temp=temp.next;
        }else{
            temp=temp.next;
        }
       }
       ans.next=null;
       return temp2.next;
    }
}