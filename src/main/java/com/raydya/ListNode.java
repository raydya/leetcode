package com.raydya;

public class ListNode {
    int val;

    ListNode next;

    public ListNode() {
    }

    public ListNode(final int val) {
        this.val = val;
    }

    public ListNode(final int val, final ListNode next) {
        this.val = val;
        this.next = next;
    }
}
