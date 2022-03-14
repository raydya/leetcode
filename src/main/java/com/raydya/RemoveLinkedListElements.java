package com.raydya;

import com.raydya.data.type.ListNode;

public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        while (head != null && head.val == val) {
            head = head.next;
        }

        if (head == null) {
            return null;
        }

        ListNode tmp = head;
        ListNode pre = head;

        while (tmp != null) {
            if (tmp.val == val) {
                pre.next = tmp.next;
            }
            if (pre != tmp && tmp.val != val) {
                pre = tmp;
            }
            tmp = tmp.next;
        }

        return head;
    }
}
