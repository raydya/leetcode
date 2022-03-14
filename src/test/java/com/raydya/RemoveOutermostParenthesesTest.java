package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class RemoveOutermostParenthesesTest {

    @Test
    public void test1() {
        final RemoveOutermostParentheses solution = new RemoveOutermostParentheses();
        final String output = solution.removeOuterParentheses("(()())(())");

        Assert.assertEquals("()()()", output);
    }

    @Test
    public void test2() {
        final RemoveOutermostParentheses solution = new RemoveOutermostParentheses();
        final String output = solution.removeOuterParentheses("(()())(())(()(()))");

        Assert.assertEquals("()()()()(())", output);
    }

    @Test
    public void test3() {
        final RemoveOutermostParentheses solution = new RemoveOutermostParentheses();
        final String output = solution.removeOuterParentheses("()()");

        Assert.assertEquals("", output);
    }
}
