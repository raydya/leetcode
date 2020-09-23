package com.raydya;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = null;
        ListNode pointer = null;
        do {
            if (l2 == null) {
                l2 = new ListNode(0);
            }
            if (l1 == null) {
                l1 = new ListNode(0);
            }
            int a = l1.val + l2.val;
            if (a >= 10) {
                a = a - 10;
                if (l1.next == null) {
                    l1.next = new ListNode(1);
                } else {
                    l1.next.val++;
                }
            }
            final ListNode tmp = new ListNode(a);
            if (first == null) {
                first = tmp;
                pointer = first;
            } else {
                pointer.next = tmp;
                pointer = pointer.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        } while (l1 != null || l2 != null);
        return first;
    }
}
