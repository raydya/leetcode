package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class FindTheLongestEqualSubarrayTest {

    @Test
    public void test1() {
        final FindTheLongestEqualSubarray solution = new FindTheLongestEqualSubarray();
        final int output = solution.longestEqualSubarray(Arrays.asList(1, 3, 2, 3, 1, 3), 3);

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final FindTheLongestEqualSubarray solution = new FindTheLongestEqualSubarray();
        final int output = solution.longestEqualSubarray(Arrays.asList(1, 1, 2, 2, 1, 1), 2);

        Assert.assertEquals(4, output);
    }

    @Test
    public void test3() {
        final FindTheLongestEqualSubarray solution = new FindTheLongestEqualSubarray();
        final int output = solution.longestEqualSubarray(Arrays.asList(2, 1), 0);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test4() {
        final FindTheLongestEqualSubarray solution = new FindTheLongestEqualSubarray();
        final int output = solution.longestEqualSubarray(Arrays.asList(1), 1);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test5() {
        final FindTheLongestEqualSubarray solution = new FindTheLongestEqualSubarray();
        final int output = solution.longestEqualSubarray(Arrays.asList(2, 2), 1);

        Assert.assertEquals(2, output);
    }
}
