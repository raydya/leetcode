package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SingleNumberIITest {
    @Test
    public void test1() {
        final SingleNumberII solution = new SingleNumberII();
        final int output = solution.singleNumber(new int[]{2, 2, 3, 2});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final SingleNumberII solution = new SingleNumberII();
        final int output = solution.singleNumber(new int[]{0, 1, 0, 1, 0, 1, 99});

        Assert.assertEquals(99, output);
    }

    @Test
    public void test3() {
        final SingleNumberII solution = new SingleNumberII();
        final int output = solution.singleNumber(new int[]{30000, 500, 100, 30000, 100, 30000, 100});

        Assert.assertEquals(500, output);
    }
}
