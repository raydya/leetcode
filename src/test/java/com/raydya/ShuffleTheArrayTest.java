package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ShuffleTheArrayTest {

    @Test
    public void test1() {
        final ShuffleTheArray solution = new ShuffleTheArray();
        final int[] output = solution.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3);

        Assert.assertArrayEquals(new int[]{2, 3, 5, 4, 1, 7}, output);
    }

    @Test
    public void test2() {
        final ShuffleTheArray solution = new ShuffleTheArray();
        final int[] output = solution.shuffle(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 4);

        Assert.assertArrayEquals(new int[]{1, 4, 2, 3, 3, 2, 4, 1}, output);
    }

    @Test
    public void test3() {
        final ShuffleTheArray solution = new ShuffleTheArray();
        final int[] output = solution.shuffle(new int[]{1, 1, 2, 2}, 2);

        Assert.assertArrayEquals(new int[]{1, 2, 1, 2}, output);
    }
}
