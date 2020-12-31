package com.raydya;

import com.raydya.data.type.ListNode;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode sentinel1 = new ListNode(0, head);
        ListNode predecessor1 = sentinel1;
        ListNode sentinel2 = new ListNode(0, head);
        ListNode predecessor2 = sentinel2;

        while (head != null) {
            final int val = head.val;
            if (val < x) {
                predecessor1.next = head;
                predecessor1 = predecessor1.next;
                if (head.next == null) {
                    predecessor2.next = null;
                }
            } else {
                predecessor2.next = head;
                predecessor2 = predecessor2.next;
            }

            head = head.next;
        }

        predecessor1.next = sentinel2.next;

        return sentinel1.next;
    }
}
