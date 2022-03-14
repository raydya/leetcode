package com.raydya;

import java.util.Stack;

public class BaseballGame {

    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (String op : ops) {
            switch (op) {
                case "C":
                    stack.pop();
                    break;
                case "D":
                    Integer calPointsDPeek = stack.peek();
                    stack.push(calPointsDPeek * 2);
                    break;
                case "+":
                    Integer calPointsAddPop = stack.pop();
                    Integer calPointsAddPeek = stack.peek();
                    stack.push(calPointsAddPop);
                    stack.push(calPointsAddPop + calPointsAddPeek);
                    break;
                default:
                    stack.push(Integer.valueOf(op));
            }
        }
        return stack.stream().reduce(Integer::sum).orElse(0);
    }
}
