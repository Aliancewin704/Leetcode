package org.example.Fundamental.Palindrome_Linked_List;

public class Main {
    public static void main(String[] args) {
//        ListNode first = new ListNode(1);
//        ListNode sec = new ListNode(1);
        ListNode three = new ListNode(0);
        ListNode foo = new ListNode(1,three);
        System.out.println(PalindromeLinkedList.isPalindrome(foo));
    }
}
