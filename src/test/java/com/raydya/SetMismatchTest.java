package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SetMismatchTest {
    @Test
    public void test1() {
        final SetMismatch solution = new SetMismatch();
        final int[] output = solution.findErrorNums(new int[]{1, 2, 2, 4});

        Assert.assertArrayEquals(new int[]{2, 3}, output);
    }

    @Test
    public void test2() {
        final SetMismatch solution = new SetMismatch();
        final int[] output = solution.findErrorNums(new int[]{1, 1});

        Assert.assertArrayEquals(new int[]{1, 2}, output);
    }
}
