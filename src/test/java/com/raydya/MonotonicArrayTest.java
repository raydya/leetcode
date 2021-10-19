package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MonotonicArrayTest {
    @Test
    public void test1() {
        final MonotonicArray solution = new MonotonicArray();
        final boolean output = solution.isMonotonic(new int[]{1, 2, 2, 3});

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final MonotonicArray solution = new MonotonicArray();
        final boolean output = solution.isMonotonic(new int[]{6, 5, 4, 4});

        Assert.assertTrue(output);
    }

    @Test
    public void test3() {
        final MonotonicArray solution = new MonotonicArray();
        final boolean output = solution.isMonotonic(new int[]{1, 3, 2});

        Assert.assertFalse(output);
    }

    @Test
    public void test4() {
        final MonotonicArray solution = new MonotonicArray();
        final boolean output = solution.isMonotonic(new int[]{1, 2, 4, 5});

        Assert.assertTrue(output);
    }

    @Test
    public void test5() {
        final MonotonicArray solution = new MonotonicArray();
        final boolean output = solution.isMonotonic(new int[]{1, 1, 1});

        Assert.assertTrue(output);
    }

    @Test
    public void test6() {
        final MonotonicArray solution = new MonotonicArray();
        final boolean output = solution.isMonotonic(new int[]{1, 1, 0});

        Assert.assertTrue(output);
    }
}
