package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class GetMaximumInGeneratedArrayTest {

    @Test
    public void test1() {
        final GetMaximumInGeneratedArray solution = new GetMaximumInGeneratedArray();
        final int output = solution.getMaximumGenerated(7);

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final GetMaximumInGeneratedArray solution = new GetMaximumInGeneratedArray();
        final int output = solution.getMaximumGenerated(2);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test3() {
        final GetMaximumInGeneratedArray solution = new GetMaximumInGeneratedArray();
        final int output = solution.getMaximumGenerated(3);

        Assert.assertEquals(2, output);
    }

    @Test
    public void test4() {
        final GetMaximumInGeneratedArray solution = new GetMaximumInGeneratedArray();
        final int output = solution.getMaximumGenerated(0);

        Assert.assertEquals(0, output);
    }

    @Test
    public void test5() {
        final GetMaximumInGeneratedArray solution = new GetMaximumInGeneratedArray();
        final int output = solution.getMaximumGenerated(1);

        Assert.assertEquals(1, output);
    }
}
