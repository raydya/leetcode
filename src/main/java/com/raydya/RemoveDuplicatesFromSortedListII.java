package com.raydya;

import com.raydya.data.type.ListNode;

public class RemoveDuplicatesFromSortedListII {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode sentinel = new ListNode(0, head);

        ListNode predecessor = sentinel;

        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                predecessor.next = head.next;
            } else {
                predecessor = predecessor.next;
            }

            head = head.next;
        }

        return sentinel.next;
    }
}
