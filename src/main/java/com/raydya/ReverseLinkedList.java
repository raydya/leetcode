package com.raydya;

import com.raydya.data.type.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cursor = head;
        ListNode holder = null;

        while (cursor != null) {
            holder = cursor.next;
            cursor.next = pre;
            pre = cursor;
            cursor = holder;
        }

        return pre;
    }
}
