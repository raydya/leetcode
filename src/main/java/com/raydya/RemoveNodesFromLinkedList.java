package com.raydya;

import com.raydya.data.type.ListNode;

public class RemoveNodesFromLinkedList {

    public ListNode removeNodes(ListNode head) {
        head = reverse(head);
        for (ListNode p = head; p.next != null; ) {
            if (p.val > p.next.val) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }
        return reverse(head);
    }

    public ListNode reverse(ListNode head) {
        ListNode dummy = new ListNode();
        while (head != null) {
            ListNode p = head;
            head = head.next;
            p.next = dummy.next;
            dummy.next = p;
        }
        return dummy.next;
    }
}
