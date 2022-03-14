package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ValidBoomerangTest {

    @Test
    public void test1() {
        final ValidBoomerang solution = new ValidBoomerang();
        final boolean output = solution.isBoomerang(new int[][]{{1, 1}, {2, 3}, {3, 2}});

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final ValidBoomerang solution = new ValidBoomerang();
        final boolean output = solution.isBoomerang(new int[][]{{1, 1}, {2, 2}, {3, 3}});

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final ValidBoomerang solution = new ValidBoomerang();
        final boolean output = solution.isBoomerang(new int[][]{{0, 0}, {1, 2}, {0, 1}});

        Assert.assertTrue(output);
    }
}
