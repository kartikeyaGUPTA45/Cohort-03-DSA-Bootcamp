class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        int count = 0;
        ListNode temp = head;

        // No of nodes present in a LL
        while(temp!= null) {
            count++;
            temp = temp.next;
        }

        temp = head;
        while(temp.next != null) {
            temp =temp.next;
        }

        temp.next = head;

        k = k%count;

        count = count-k;
        temp = null;

        while(count > 0) {
            temp = head;
            head = head.next;
            count--;
        }

        temp.next = null;
        return head;


    }
}
