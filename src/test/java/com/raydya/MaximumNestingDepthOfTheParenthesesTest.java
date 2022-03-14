package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNestingDepthOfTheParenthesesTest {

    @Test
    public void test1() {
        final MaximumNestingDepthOfTheParentheses solution = new MaximumNestingDepthOfTheParentheses();
        final int output = solution.maxDepth("(1+(2*3)+((8)/4))+1");

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final MaximumNestingDepthOfTheParentheses solution = new MaximumNestingDepthOfTheParentheses();
        final int output = solution.maxDepth("(1)+((2))+(((3)))");

        Assert.assertEquals(3, output);
    }

    @Test
    public void test3() {
        final MaximumNestingDepthOfTheParentheses solution = new MaximumNestingDepthOfTheParentheses();
        final int output = solution.maxDepth("1+(2*3)/(2-1)");

        Assert.assertEquals(1, output);
    }

    @Test
    public void test4() {
        final MaximumNestingDepthOfTheParentheses solution = new MaximumNestingDepthOfTheParentheses();
        final int output = solution.maxDepth("1");

        Assert.assertEquals(0, output);
    }

    @Test
    public void test5() {
        final MaximumNestingDepthOfTheParentheses solution = new MaximumNestingDepthOfTheParentheses();
        final int output = solution.maxDepth("()");

        Assert.assertEquals(1, output);
    }

    @Test
    public void test6() {
        final MaximumNestingDepthOfTheParentheses solution = new MaximumNestingDepthOfTheParentheses();
        final int output = solution.maxDepth("(1())");

        Assert.assertEquals(2, output);
    }
}
