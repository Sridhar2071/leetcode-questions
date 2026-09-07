class Solution {

    public static int size(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int m = size(head);
        if (n == m) {
            return head.next;
        }
        ListNode temp = head;
        for (int i = 1; i < m - n; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }
}