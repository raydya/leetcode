package com.raydya;

import com.raydya.data.type.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReorderList {

    public void reorderList(ListNode head) {
        final Deque<ListNode> q = new ArrayDeque<>();
        ListNode n = head;
        while (n != null) {
            q.offer(n);
            n = n.next;
        }

        head = q.pollFirst();
        ListNode t = head;
        boolean f = true;
        while (!q.isEmpty()) {
            t.next = f ? q.pollLast() : q.pollFirst();
            t = t.next;
            f = !f;
        }
        t.next = null;
    }

}
