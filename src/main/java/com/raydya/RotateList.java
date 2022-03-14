package com.raydya;

import com.raydya.data.type.ListNode;

public class RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int size = 1;
        ListNode tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
            size++;
        }

        int c = k % size;
        if (c == 0) {
            return head;
        }

        ListNode tail = tmp;
        ListNode curr = head;
        ListNode prev = null;
        int i = size - c;
        while (i > 0) {
            prev = curr;
            curr = curr.next;
            i--;
        }

        tail.next = head;
        prev.next = null;

        return curr;
    }
}
