package org.example.Fundamental.ReverseLinkedList;

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode ans = new ListNode();
        return reverse(head);
    }

    public static ListNode reverse(ListNode node) {
        ListNode prev = null;
        ListNode current = node;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
}
