
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } 

        if (list2 == null) {
            return list1;
        }

        ListNode l1 = list1;
        ListNode l2 = list2;

        ListNode dN = new ListNode(-1);
        ListNode d = dN;

        while(l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                d.next = l1;
                l1 = l1.next;
            } else {
                d.next = l2;
                l2 = l2.next;
            }

            d = d.next;
        }

        if (l1 != null) {
            d.next = l1;
        } else {
            d.next = l2;
        }

        return dN.next;
    }
}
