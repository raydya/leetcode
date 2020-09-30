package com.raydya;

import com.raydya.data.type.ListNode;

public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode tmp = head;
        while (tmp.next != null) {
            final ListNode next = tmp.next;
            final int val = tmp.val;
            final int nextVal = next.val;

            if (val == nextVal) {
                tmp.next = next.next;
                next.next = null;
            } else {
                tmp = next;
            }
        }

        return head;
    }
}
