package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class MaximumSplitOfPositiveEvenIntegersTest {

    @Test
    public void test1() {
        final MaximumSplitOfPositiveEvenIntegers solution = new MaximumSplitOfPositiveEvenIntegers();
        final List<Long> output = solution.maximumEvenSplit(12);

        Assert.assertArrayEquals(new Long[]{2L, 4L, 6L}, output.toArray(new Long[0]));
    }

    @Test
    public void test2() {
        final MaximumSplitOfPositiveEvenIntegers solution = new MaximumSplitOfPositiveEvenIntegers();
        final List<Long> output = solution.maximumEvenSplit(7);

        Assert.assertArrayEquals(new Long[]{}, output.toArray(new Long[0]));
    }

    @Test
    public void test3() {
        final MaximumSplitOfPositiveEvenIntegers solution = new MaximumSplitOfPositiveEvenIntegers();
        final List<Long> output = solution.maximumEvenSplit(28);

        Assert.assertArrayEquals(new Long[]{2L, 4L, 6L, 16L}, output.toArray(new Long[0]));
    }

    @Test
    public void test4() {
        final MaximumSplitOfPositiveEvenIntegers solution = new MaximumSplitOfPositiveEvenIntegers();
        final List<Long> output = solution.maximumEvenSplit(8);

        Assert.assertArrayEquals(new Long[]{2L, 6L}, output.toArray(new Long[0]));
    }
}
