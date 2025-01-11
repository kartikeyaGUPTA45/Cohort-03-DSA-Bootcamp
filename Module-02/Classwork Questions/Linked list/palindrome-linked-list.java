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
    public ListNode midNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode curr = head;
        ListNode prev = null;

        while(curr != null) {
            ListNode backUp = curr.next;

            curr.next = prev;

            prev = curr;
            curr = backUp;
        }

        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode mid = midNode(head);
        ListNode temp = mid.next;

        mid.next = null;

        temp = reverse(temp);

        ListNode l1 = head;
        ListNode l2 = temp;

        while (l1 != null && l2 != null) {
            if (l1.val != l2.val) {
                return false;
            }

            l1 = l1.next;
            l2 = l2.next;
        }

        return true;
    }
}
