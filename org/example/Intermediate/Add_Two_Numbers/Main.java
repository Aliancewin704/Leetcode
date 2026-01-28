package org.example.Intermediate.Add_Two_Numbers;


public class Main {
    
    public static void main(String[] args) {
        ListNode listNode9 = new ListNode(9);
        ListNode listNode7 = new ListNode(9,listNode9);
        ListNode listNode8 = new ListNode(9,listNode7);
        ListNode listNode3 = new ListNode(9,listNode8);
        ListNode listNode4 = new ListNode(9, listNode3);
        ListNode listNode2 = new ListNode(9,listNode4);
        ListNode listNode4forSecond = new ListNode(9);
        ListNode listNode6 = new ListNode(9,listNode4forSecond);
        ListNode listNode5 = new ListNode(9,listNode6);
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        addTwoNumbers.addTwoNumbers(listNode2, listNode5);
    }
}
