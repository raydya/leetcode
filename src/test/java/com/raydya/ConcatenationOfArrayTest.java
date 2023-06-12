package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ConcatenationOfArrayTest {

    @Test
    public void test1() {
        final ConcatenationOfArray solution = new ConcatenationOfArray();
        final int[] output = solution.getConcatenation(new int[]{1, 2, 1});

        Assert.assertArrayEquals(new int[]{1, 2, 1, 1, 2, 1}, output);
    }

    @Test
    public void test2() {
        final ConcatenationOfArray solution = new ConcatenationOfArray();
        final int[] output = solution.getConcatenation(new int[]{1, 3, 2, 1});

        Assert.assertArrayEquals(new int[]{1, 3, 2, 1, 1, 3, 2, 1}, output);
    }
}
