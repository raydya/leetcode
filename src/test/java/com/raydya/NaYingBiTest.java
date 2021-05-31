package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class NaYingBiTest {
    @Test
    public void test1() {
        final NaYingBi solution = new NaYingBi();
        final int output = solution.minCount(new int[]{4, 2, 1});

        Assert.assertEquals(4, output);
    }

    @Test
    public void test2() {
        final NaYingBi solution = new NaYingBi();
        final int output = solution.minCount(new int[]{2, 3, 10});

        Assert.assertEquals(8, output);
    }
}
