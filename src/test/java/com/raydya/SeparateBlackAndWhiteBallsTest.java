package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SeparateBlackAndWhiteBallsTest {

    @Test
    public void test1() {
        final SeparateBlackAndWhiteBalls solution = new SeparateBlackAndWhiteBalls();
        final long output = solution.minimumSteps("101");

        Assert.assertEquals(1L, output);
    }

    @Test
    public void test2() {
        final SeparateBlackAndWhiteBalls solution = new SeparateBlackAndWhiteBalls();
        final long output = solution.minimumSteps("100");

        Assert.assertEquals(2L, output);
    }

    @Test
    public void test3() {
        final SeparateBlackAndWhiteBalls solution = new SeparateBlackAndWhiteBalls();
        final long output = solution.minimumSteps("0111");

        Assert.assertEquals(0L, output);
    }
}
