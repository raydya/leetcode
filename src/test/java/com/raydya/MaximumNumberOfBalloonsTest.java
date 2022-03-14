package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberOfBalloonsTest {

    @Test
    public void test1() {
        final MaximumNumberOfBalloons solution = new MaximumNumberOfBalloons();
        final int output = solution.maxNumberOfBalloons("nlaebolko");

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final MaximumNumberOfBalloons solution = new MaximumNumberOfBalloons();
        final int output = solution.maxNumberOfBalloons("loonbalxballpoon");

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final MaximumNumberOfBalloons solution = new MaximumNumberOfBalloons();
        final int output = solution.maxNumberOfBalloons("leetcode");

        Assert.assertEquals(0, output);
    }

    @Test
    public void test4() {
        final MaximumNumberOfBalloons solution = new MaximumNumberOfBalloons();
        final int output = solution.maxNumberOfBalloons("balon");

        Assert.assertEquals(0, output);
    }
}
