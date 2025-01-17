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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dN = new ListNode(-101);
        ListNode d = dN;
        ListNode temp = head;

        while(temp != null) {
            while (temp != null && d.val == temp.val) temp = temp.next;

            d.next = temp;
            d = d.next;

            if(temp != null) {
                temp = temp.next;
            }
        }
        return dN.next;
    }
}
