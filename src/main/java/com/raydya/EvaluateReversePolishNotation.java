package com.raydya;

import java.util.Deque;
import java.util.LinkedList;

public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList<>();

        for (final String token : tokens) {
            if (isSymbol(token)) {
                final Integer p2 = stack.pop();
                final Integer p1 = stack.pop();
                Integer result = null;
                switch (token) {
                    case "+":
                        result = p1 + p2;
                        break;
                    case "-":
                        result = p1 - p2;
                        break;
                    case "*":
                        result = p1 * p2;
                        break;
                    case "/":
                        result = p1 / p2;
                        break;
                    default:
                        break;
                }
                stack.push(result);
            } else {
                stack.push(Integer.valueOf(token));
            }
        }

        return stack.pop();
    }

    private boolean isSymbol(String str) {
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }
}
