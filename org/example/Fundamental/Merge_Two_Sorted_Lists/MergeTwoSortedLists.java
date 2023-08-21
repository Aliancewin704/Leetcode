package org.example.Fundamental.Merge_Two_Sorted_Lists;

public class MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return recursion(list1,list2);
    }

    public static ListNode recursion(ListNode val1, ListNode val2) {
        if (val1 != null && val2 != null) {
            if (val1.val <= val2.val) {
                int val = val1.val;
                return new ListNode(val, recursion(val1.next, val2));
            } else {
                int val = val2.val;
                return new ListNode(val, recursion(val1, val2.next));
            }
        }
        if (val1 != null) {
            return new ListNode(val1.val, val1.next);
        } else if (val2 != null) {
            return new ListNode(val2.val, val2.next);
        } else {
            return null;
        }
    }
}
