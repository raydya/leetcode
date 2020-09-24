package com.raydya;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class ValidParentheses {

    public boolean isValid(String s) {
        return primitiveImpl(s);
    }

    private boolean primitiveImpl(String s) {
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

    private boolean stackImpl(String s) {
        final HashMap<String, Boolean> leftMap = new HashMap<>();
        leftMap.put("(", true);
        leftMap.put("[", true);
        leftMap.put("{", true);
        leftMap.put(")", false);
        leftMap.put("]", false);
        leftMap.put("}", false);

        final HashMap<String, String> matchMap = new HashMap<>();
        matchMap.put("(", ")");
        matchMap.put("[", "]");
        matchMap.put("{", "}");

        Deque<String> stackLeft = new ArrayDeque<>();
        Deque<String> stackRight = new ArrayDeque<>();

        final String[] strings = s.split("");
        for (final String string : strings) {
            final Boolean isLeft = leftMap.get(string);
            if (Boolean.TRUE.equals(isLeft)) {
                stackLeft.push(string);
            } else {
                if (stackLeft.isEmpty()) {
                    stackRight.push(string);
                    continue;
                }

                final String leftFirst = stackLeft.getFirst();
                final String rightParentheses = matchMap.get(leftFirst);
                if (rightParentheses.equals(string)) {
                    stackLeft.pop();
                } else {
                    stackRight.push(string);
                }
            }
        }

        return stackLeft.isEmpty() && stackRight.isEmpty();
    }
}
