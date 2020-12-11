package com.raydya;

import com.raydya.data.type.ListNode;

import java.util.LinkedList;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        if (k == 0) return head;

        LinkedList<ListNode> nodes = new LinkedList<>();
        ListNode tmp = head;
        while (tmp.next != null) {
            nodes.add(tmp);
            tmp = tmp.next;
        }
        nodes.add(tmp);

        final int c = k % nodes.size();

        if (c == 0) return head;

        for (int i = 0; i < c; i++) {
            final ListNode last = nodes.pollLast();
            nodes.addFirst(last);
        }

        for (int i = 0; i < nodes.size(); i++) {
            final ListNode node = nodes.get(i);
            if (i + 1 >= nodes.size()) {
                node.next = null;
            } else {
                final ListNode next = nodes.get(i + 1);
                node.next = next;
            }
        }

        return nodes.get(0);
    }
}
