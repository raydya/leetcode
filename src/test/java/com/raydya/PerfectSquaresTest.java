package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class PerfectSquaresTest {

    @Test
    public void test1() {
        final PerfectSquares solution = new PerfectSquares();
        final int output = solution.numSquares(12);

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final PerfectSquares solution = new PerfectSquares();
        final int output = solution.numSquares(13);

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final PerfectSquares solution = new PerfectSquares();
        final int output = solution.numSquares(43);

        Assert.assertEquals(3, output);
    }
}
