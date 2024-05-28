package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FindThePeaksTest {

    @Test
    public void test1() {
        final FindThePeaks solution = new FindThePeaks();
        final List<Integer> output = solution.findPeaks(new int[]{2, 4, 4});

        Assert.assertArrayEquals(new Integer[]{}, output.toArray());
    }

    @Test
    public void test2() {
        final FindThePeaks solution = new FindThePeaks();
        final List<Integer> output = solution.findPeaks(new int[]{1, 4, 3, 8, 5});

        Assert.assertArrayEquals(new Integer[]{1, 3}, output.toArray());
    }
}
