package com.raydya;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {

    public boolean isValid(String s) {
        final char[] chars = s.toCharArray();

        Deque<Character> stackLeft = new ArrayDeque<>();
        Deque<Character> stackRight = new ArrayDeque<>();

        for (final char c : chars) {
            if (c == '(' || c == '[' || c == '{') {
                stackLeft.push(c);
            } else {
                if (stackLeft.isEmpty()) {
                    stackRight.push(c);
                    continue;
                }

                final char leftFirst = stackLeft.getFirst();
                if ((leftFirst == '(' && c == ')')
                    || (leftFirst == '[' && c == ']')
                    || (leftFirst == '{' && c == '}')) {
                    // POP
                    stackLeft.pop();
                } else {
                    stackRight.push(c);
                }
            }
        }

        return stackLeft.isEmpty() && stackRight.isEmpty();
    }
}
