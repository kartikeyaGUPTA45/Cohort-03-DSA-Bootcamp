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

    public int findLength(ListNode head) {
        if (head == null) {
            return 0;
        }

        int count = 0;
        ListNode temp = head;

        while(temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        } 

        int len1 = findLength(headA);
        int len2 = findLength(headB);

        ListNode t1 = headA;
        ListNode t2 = headB;

        int diff = Math.abs(len1-len2);

        if (len1 > len2) {
            for(int i=1;i<=diff;i++) {
                t1 = t1.next;
            }
        } else {
            for(int i=1;i<=diff;i++) {
                t2 = t2.next;
            }
        }

        while(t1 != null) {
            if (t1 == t2) {
                return t1;
            }

            t1 = t1.next;
            t2 = t2.next;
        }

        return null;
    }
}
