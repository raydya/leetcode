package com.raydya;

import java.util.Arrays;

public class MyQueue {
    private int[] stack = new int[]{};

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {

    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        final int length = stack.length;
        final int[] copyOf = Arrays.copyOf(stack, length + 1);
        copyOf[copyOf.length - 1] = x;
        stack = copyOf;
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        final int i = stack[0];
        stack = Arrays.copyOfRange(stack, 1, stack.length);
        return i;
    }

    /**
     * Get the front element.
     */
    public int peek() {
        return stack[0];
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return 0 == stack.length;
    }
}
