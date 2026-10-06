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
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        int result=0;
        while(temp!=null){
            if(temp.val==1){
                result=result*2+1;
            }else{
                result=result*2+0;
            }
            temp=temp.next;
        }
        return result;
    }
}