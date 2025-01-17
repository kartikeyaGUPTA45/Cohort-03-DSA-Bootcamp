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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dO = new ListNode(-1);
        ListNode dE = new ListNode(-1);

        ListNode d1 = dO;
        ListNode d2 = dE;
        ListNode temp = head;

        int idx = 1;

        while(temp != null) {
            if (idx%2 != 0) {
                d1.next = temp;
                d1 = d1.next;
            } else {
                d2.next = temp;
                d2 = d2.next;
            }
            idx++;
            temp = temp.next;
        }

        d2.next = null;

        d1.next = dE.next;
        dE.next = null;

        return dO.next;

    }
}
