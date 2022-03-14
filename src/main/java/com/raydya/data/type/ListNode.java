package com.raydya.data.type;

public class ListNode {

    public int val;

    public ListNode next;

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
