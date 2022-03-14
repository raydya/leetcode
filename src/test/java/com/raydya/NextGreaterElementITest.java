package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class NextGreaterElementITest {

    @Test
    public void test1() {
        final NextGreaterElementI solution = new NextGreaterElementI();
        final int[] output = solution.nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2});

        Assert.assertArrayEquals(new int[]{-1, 3, -1}, output);
    }

    @Test
    public void test2() {
        final NextGreaterElementI solution = new NextGreaterElementI();
        final int[] output = solution.nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4});

        Assert.assertArrayEquals(new int[]{3, -1}, output);
    }
}
