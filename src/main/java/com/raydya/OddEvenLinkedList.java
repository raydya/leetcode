package com.raydya;

import com.raydya.data.type.ListNode;

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;

        ListNode oddList = null;
        ListNode evenList = null;
        ListNode sentinel = null;
        ListNode cursor = head;

        boolean odd = true;
        while (cursor != null) {
            if (odd) {
                if (oddList == null) {
                    oddList = cursor;
                } else {
                    oddList.next = cursor;
                    oddList = oddList.next;
                }
            } else {
                if (evenList == null) {
                    evenList = cursor;
                    sentinel = cursor;
                } else {
                    evenList.next = cursor;
                    evenList = evenList.next;
                }
            }
            odd = !odd;
            cursor = cursor.next;
        }

        evenList.next = null;
        oddList.next = sentinel;

        return head;
    }
}
