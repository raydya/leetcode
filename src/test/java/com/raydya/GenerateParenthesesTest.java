package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GenerateParenthesesTest {
    @Test
    public void test1() {
        final GenerateParentheses solution = new GenerateParentheses();
        final List<String> parenthesis = solution.generateParentheses(3);

        Assert.assertArrayEquals(
            new String[]{"((()))", "(()())", "(())()", "()(())", "()()()"},
            parenthesis.toArray()
        );
    }

    @Test
    public void test2() {
        final GenerateParentheses solution = new GenerateParentheses();
        final List<String> parenthesis = solution.generateParentheses(1);

        Assert.assertArrayEquals(
            new String[]{"()"},
            parenthesis.toArray()
        );
    }
}
