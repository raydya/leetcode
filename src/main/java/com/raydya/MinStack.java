package com.raydya;

import com.raydya.data.type.ListNode;

public class MinStack {

    private ListNode top;
    private int min = Integer.MAX_VALUE;

    public MinStack() {

    }

    public void push(int x) {
        final ListNode n = new ListNode(x);
        n.next = top;
        top = n;
        min = Math.min(min, x);
    }

    public void pop() {
        final int popVal = top.val;
        top = top.next;

        if (popVal == min) {
            ListNode tmp = top;
            min = Integer.MAX_VALUE;
            while (tmp != null) {
                min = Math.min(min, tmp.val);
                tmp = tmp.next;
            }
        }
    }

    public int top() {
        return top.val;
    }

    public int getMin() {
        return min;
    }
}
