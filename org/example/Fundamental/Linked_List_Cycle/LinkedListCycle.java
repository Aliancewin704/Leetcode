package org.example.Fundamental.Linked_List_Cycle;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        Set<ListNode> set = new HashSet<>();
        while (head.next != null) {
            if (!set.add(head)) return true;
            head = head.next;
        }
        return false;
    }
}
