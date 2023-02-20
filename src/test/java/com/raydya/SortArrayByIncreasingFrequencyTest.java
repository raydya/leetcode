package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SortArrayByIncreasingFrequencyTest {

    @Test
    public void test1() {
        final SortArrayByIncreasingFrequency solution = new SortArrayByIncreasingFrequency();
        final int[] output = solution.frequencySort(new int[]{1, 1, 2, 2, 2, 3});

        Assert.assertArrayEquals(new int[]{3, 1, 1, 2, 2, 2}, output);
    }

    @Test
    public void test2() {
        final SortArrayByIncreasingFrequency solution = new SortArrayByIncreasingFrequency();
        final int[] output = solution.frequencySort(new int[]{2, 3, 1, 3, 2});

        Assert.assertArrayEquals(new int[]{1, 3, 3, 2, 2}, output);
    }

    @Test
    public void test3() {
        final SortArrayByIncreasingFrequency solution = new SortArrayByIncreasingFrequency();
        final int[] output = solution.frequencySort(new int[]{-1, 1, -6, 4, 5, -6, 1, 4, 1});

        Assert.assertArrayEquals(new int[]{5, -1, 4, 4, -6, -6, 1, 1, 1}, output);
    }

}
