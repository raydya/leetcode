package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberOfBallsInABoxTest {

    @Test
    public void test1() {
        final MaximumNumberOfBallsInABox solution = new MaximumNumberOfBallsInABox();
        final int output = solution.countBalls(1, 10);

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final MaximumNumberOfBallsInABox solution = new MaximumNumberOfBallsInABox();
        final int output = solution.countBalls(5, 15);

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final MaximumNumberOfBallsInABox solution = new MaximumNumberOfBallsInABox();
        final int output = solution.countBalls(19, 28);

        Assert.assertEquals(2, output);
    }
}
