package org.example.Fundamental.ReverseLinkedList;

public class Main {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3)));
        ReverseLinkedList.reverseList(listNode);
    }
}
