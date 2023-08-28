package org.example.Fundamental.Palindrome_Linked_List;


public class PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        ListNode mid = getMid(head);
        ListNode second = reverse(mid);
        if(head == null || head.next == null){
            return true;
        }
        while(head != null && second != null){
            if(head.val != second.val){
                return false;
            }
            head = head.next;
            second = second.next;

        }
        return true;
    }

    static ListNode getMid(ListNode head) {
        ListNode fast =  head;
        ListNode slow = head;
        while(fast!= null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    static ListNode reverse(ListNode mid) {
        ListNode prev = null;
        ListNode curr = mid;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
