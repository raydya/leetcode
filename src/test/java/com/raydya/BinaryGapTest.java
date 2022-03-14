package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class BinaryGapTest {

    @Test
    public void test1() {
        final BinaryGap solution = new BinaryGap();
        final int output = solution.binaryGap(22);

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final BinaryGap solution = new BinaryGap();
        final int output = solution.binaryGap(5);

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final BinaryGap solution = new BinaryGap();
        final int output = solution.binaryGap(6);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test4() {
        final BinaryGap solution = new BinaryGap();
        final int output = solution.binaryGap(8);

        Assert.assertEquals(0, output);
    }

    @Test
    public void test5() {
        final BinaryGap solution = new BinaryGap();
        final int output = solution.binaryGap(1);

        Assert.assertEquals(0, output);
    }
}
