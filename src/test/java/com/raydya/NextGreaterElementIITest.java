package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class NextGreaterElementIITest {

    @Test
    public void test1() {
        final NextGreaterElementII solution = new NextGreaterElementII();
        final int[] output = solution.nextGreaterElements(new int[]{1, 2, 1});

        Assert.assertArrayEquals(new int[]{2, -1, 2}, output);
    }

    @Test
    public void test2() {
        final NextGreaterElementII solution = new NextGreaterElementII();
        final int[] output = solution.nextGreaterElements(new int[]{1, 2, 3, 4, 3});

        Assert.assertArrayEquals(new int[]{2, 3, 4, -1, 4}, output);
    }
}
