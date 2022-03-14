package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class TopKFrequentElementsTest {

    @Test
    public void test1() {
        final TopKFrequentElements solution = new TopKFrequentElements();
        final int[] output = solution.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);

        Assert.assertArrayEquals(new int[]{1, 2}, output);
    }

    @Test
    public void test2() {
        final TopKFrequentElements solution = new TopKFrequentElements();
        final int[] output = solution.topKFrequent(new int[]{1}, 1);

        Assert.assertArrayEquals(new int[]{1}, output);
    }
}
