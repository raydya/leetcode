package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class BinaryNumberWithAlternatingBitsTest {
    @Test
    public void test1() {
        final BinaryNumberWithAlternatingBits solution = new BinaryNumberWithAlternatingBits();
        final boolean output = solution.hasAlternatingBits(5);

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final BinaryNumberWithAlternatingBits solution = new BinaryNumberWithAlternatingBits();
        final boolean output = solution.hasAlternatingBits(7);

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final BinaryNumberWithAlternatingBits solution = new BinaryNumberWithAlternatingBits();
        final boolean output = solution.hasAlternatingBits(11);

        Assert.assertFalse(output);
    }

    @Test
    public void test4() {
        final BinaryNumberWithAlternatingBits solution = new BinaryNumberWithAlternatingBits();
        final boolean output = solution.hasAlternatingBits(10);

        Assert.assertTrue(output);
    }

    @Test
    public void test5() {
        final BinaryNumberWithAlternatingBits solution = new BinaryNumberWithAlternatingBits();
        final boolean output = solution.hasAlternatingBits(3);

        Assert.assertFalse(output);
    }
}
