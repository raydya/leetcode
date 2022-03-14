package com.raydya;

import java.util.Deque;
import java.util.LinkedList;

public class RemoveAllAdjacentDuplicatesInString {

    /**
     * public String removeDuplicates(String s) { StringBuffer stack = new StringBuffer(); int top =
     * -1; for (int i = 0; i < s.length(); ++i) { char ch = s.charAt(i); if (top >= 0 &&
     * stack.charAt(top) == ch) { stack.deleteCharAt(top); --top; } else { stack.append(ch); ++top;
     * } } return stack.toString(); }
     *
     * @param s
     * @return
     */
    public String removeDuplicates(String s) {
        Deque<Character> stack = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(c);
            } else {
                final Character k = stack.peek();
                if (k == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}
