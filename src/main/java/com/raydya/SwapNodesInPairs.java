package com.raydya;

import com.raydya.data.type.ListNode;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode cursor = head;

        while (cursor != null) {
            if (cursor == head) {
                final ListNode next = cursor.next;
                if (next == null) break;
                head = next;
                cursor.next = next.next;
                next.next = cursor;
                cursor = next.next;
            } else {
                final ListNode pre = cursor.next;
                if (pre == null) break;
                final ListNode next = pre.next;
                if (next == null) break;
                pre.next = next.next;
                next.next = pre;
                cursor.next = next;
                cursor = pre;
            }
        }

        return head;
    }
}
