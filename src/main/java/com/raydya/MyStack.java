package com.raydya;

import java.util.Arrays;

public class MyStack {
    private int[] queue = new int[]{};

    /**
     * Initialize your data structure here.
     */
    public MyStack() {
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        final int newLength = queue.length + 1;
        final int[] newQueue = Arrays.copyOf(queue, newLength);
        newQueue[queue.length] = x;
        queue = newQueue;
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        final int i = queue[queue.length - 1];
        queue = Arrays.copyOfRange(queue, 0, queue.length - 1);
        return i;
    }

    /**
     * Get the top element.
     */
    public int top() {
        return queue[queue.length - 1];
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queue.length == 0;
    }
}
