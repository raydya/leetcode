package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifferenceTest {
    @Test
    public void test1() {
        final MinimumAbsoluteDifference solution = new MinimumAbsoluteDifference();
        final List<List<Integer>> output = solution.minimumAbsDifference(new int[]{4, 2, 1, 3});

        Assert.assertEquals(Arrays.asList(1, 2), output.get(0));
        Assert.assertEquals(Arrays.asList(2, 3), output.get(1));
        Assert.assertEquals(Arrays.asList(3, 4), output.get(2));
    }

    @Test
    public void test2() {
        final MinimumAbsoluteDifference solution = new MinimumAbsoluteDifference();
        final List<List<Integer>> output = solution.minimumAbsDifference(new int[]{1, 3, 6, 10, 15});

        Assert.assertEquals(Arrays.asList(1, 3), output.get(0));
    }

    @Test
    public void test3() {
        final MinimumAbsoluteDifference solution = new MinimumAbsoluteDifference();
        final List<List<Integer>> output = solution.minimumAbsDifference(new int[]{3, 8, -10, 23, 19, -4, -14, 27});

        Assert.assertEquals(Arrays.asList(-14, -10), output.get(0));
        Assert.assertEquals(Arrays.asList(19, 23), output.get(1));
        Assert.assertEquals(Arrays.asList(23, 27), output.get(2));
    }
}
