package com.raydya;

import java.util.Stack;

public class MinimumStringLengthAfterRemovingSubstrings {

    public int minLength(String s) {
        final Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            if (!stack.isEmpty() && stack.peek() == 'A' && c == 'B') {
                stack.pop();
            } else if (!stack.isEmpty() && stack.peek() == 'C' && c == 'D') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.size();
    }

}
