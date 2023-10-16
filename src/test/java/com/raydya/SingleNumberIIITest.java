package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SingleNumberIIITest {

    @Test
    public void test1() {
        final SingleNumberIII solution = new SingleNumberIII();
        final int[] output = solution.singleNumber(new int[]{1, 2, 1, 3, 2, 5});

        Assert.assertArrayEquals(new int[]{3, 5}, output);
    }

    @Test
    public void test2() {
        final SingleNumberIII solution = new SingleNumberIII();
        final int[] output = solution.singleNumber(new int[]{-1, 0});

        Assert.assertArrayEquals(new int[]{-1, 0}, output);
    }

    @Test
    public void test3() {
        final SingleNumberIII solution = new SingleNumberIII();
        final int[] output = solution.singleNumber(new int[]{0, 1});

        Assert.assertArrayEquals(new int[]{0, 1}, output);
    }

    @Test
    public void test4() {
        final SingleNumberIII solution = new SingleNumberIII();
        final int[] output = solution.singleNumber(new int[]{0, 1, 1, 2});

        Assert.assertArrayEquals(new int[]{0, 2}, output);
    }
}
