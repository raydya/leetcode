package com.raydya;

import com.raydya.data.type.ListNode;

public class LinkedListCycle {
    /*
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        if (head.next == null) return false;

        ListNode node = head;

        final List<ListNode> holder = new ArrayList<>();

        while (node.next != null) {
            if (holder.contains(node)) {
                return true;
            }

            holder.add(node);
            node = node.next;
        }

        return false;
    }
     */

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        if (head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}
