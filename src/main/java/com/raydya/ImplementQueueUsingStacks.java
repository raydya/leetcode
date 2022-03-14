package com.raydya;

import java.util.Deque;
import java.util.LinkedList;

public class ImplementQueueUsingStacks {

    private ImplementQueueUsingStacks() {
    }

    public static class MyQueue {

        private final Deque<Integer> stack;

        public MyQueue() {
            this.stack = new LinkedList<>();
        }

        public void push(int x) {
            stack.addLast(x);
        }

        public int pop() {
            return stack.pop();
        }

        public int peek() {
            return stack.peek();
        }

        public boolean empty() {
            return stack.isEmpty();
        }
    }
}
