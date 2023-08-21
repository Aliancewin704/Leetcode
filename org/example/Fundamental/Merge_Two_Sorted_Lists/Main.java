package org.example.Fundamental.Merge_Two_Sorted_Lists;

public class Main {

    public static void main(String[] args) {
       ListNode listNode1 = new ListNode(1);
       ListNode listNode2 = new ListNode(2);
       ListNode listNode4 = new ListNode(4);
       ListNode listNod11 = new ListNode(1);
       ListNode listNode3 = new ListNode(3);
       listNode1.next = listNode2;
       listNode2.next = listNode4;
       listNod11.next = listNode3;
       listNode3.next = listNode4;
       MergeTwoSortedLists.mergeTwoLists(listNode1,listNod11);
    }
}
