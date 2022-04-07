package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MaximumScoreAfterSplittingAStringTest {

    @Test
    public void test1() {
        final MaximumScoreAfterSplittingAString solution = new MaximumScoreAfterSplittingAString();
        final int output = solution.maxScore("011101");

        Assert.assertEquals(5, output);
    }

    @Test
    public void test2() {
        final MaximumScoreAfterSplittingAString solution = new MaximumScoreAfterSplittingAString();
        final int output = solution.maxScore("00111");

        Assert.assertEquals(5, output);
    }

    @Test
    public void test3() {
        final MaximumScoreAfterSplittingAString solution = new MaximumScoreAfterSplittingAString();
        final int output = solution.maxScore("1111");

        Assert.assertEquals(3, output);
    }

    @Test
    public void test4() {
        final MaximumScoreAfterSplittingAString solution = new MaximumScoreAfterSplittingAString();
        final int output = solution.maxScore("00");

        Assert.assertEquals(1, output);
    }

    @Test
    public void test5() {
        final MaximumScoreAfterSplittingAString solution = new MaximumScoreAfterSplittingAString();
        final int output = solution.maxScore("01001");

        Assert.assertEquals(4, output);
    }

    @Test
    public void test6() {
        final MaximumScoreAfterSplittingAString solution = new MaximumScoreAfterSplittingAString();
        final int output = solution.maxScore("11100");

        Assert.assertEquals(2, output);
    }

    @Test
    public void test7() {
        final MaximumScoreAfterSplittingAString solution = new MaximumScoreAfterSplittingAString();
        final int output = solution.maxScore("0100");

        Assert.assertEquals(2, output);
    }
}
