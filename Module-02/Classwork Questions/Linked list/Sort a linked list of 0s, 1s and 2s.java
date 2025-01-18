Problem Link: https://www.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1


class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
        if (head == null || head.next == null) {
            return head;
        }
        
        Node dZ = new Node(-1);
        Node dO = new Node(-1);
        Node dT = new Node(-1);
        
        Node d1 = dZ;
        Node d2 = dO;
        Node d3 = dT;
        
        Node temp = head;
        
        while(temp != null) {
            if (temp.data == 0) {
                d1.next = temp;
                d1 = d1.next;
            } else if (temp.data == 1) {
                d2.next = temp;
                d2 = d2.next;
            } else {
                d3.next = temp;
                d3 = d3.next;
            }
            temp = temp.next;
        }
        
        
        d1.next = (dO.next != null) ? dO.next : dT.next;
        d2.next = dT.next;
        d3.next = null;
        
        return dZ.next;
    }
}
