package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ShortestUnsortedContinuousSubarrayTest {

    @Test
    public void test1() {
        final ShortestUnsortedContinuousSubarray solution = new ShortestUnsortedContinuousSubarray();
        final int output = solution.findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15});

        Assert.assertEquals(5, output);
    }

    @Test
    public void test2() {
        final ShortestUnsortedContinuousSubarray solution = new ShortestUnsortedContinuousSubarray();
        final int output = solution.findUnsortedSubarray(new int[]{1, 2, 3, 4});

        Assert.assertEquals(0, output);
    }

    @Test
    public void test3() {
        final ShortestUnsortedContinuousSubarray solution = new ShortestUnsortedContinuousSubarray();
        final int output = solution.findUnsortedSubarray(new int[]{1});

        Assert.assertEquals(0, output);
    }

    @Test
    public void test4() {
        final ShortestUnsortedContinuousSubarray solution = new ShortestUnsortedContinuousSubarray();
        final int output = solution.findUnsortedSubarray(new int[]{5, 4, 3, 2, 1});

        Assert.assertEquals(5, output);
    }

    @Test
    public void test5() {
        final ShortestUnsortedContinuousSubarray solution = new ShortestUnsortedContinuousSubarray();
        final int output = solution.findUnsortedSubarray(new int[]{1, 3, 2, 2, 2});

        Assert.assertEquals(4, output);
    }

    @Test
    public void test6() {
        final ShortestUnsortedContinuousSubarray solution = new ShortestUnsortedContinuousSubarray();
        final int output = solution.findUnsortedSubarray(new int[]{1, 2, 3, 3, 3});

        Assert.assertEquals(0, output);
    }

    @Test
    public void test7() {
        final ShortestUnsortedContinuousSubarray solution = new ShortestUnsortedContinuousSubarray();
        final int output = solution.findUnsortedSubarray(new int[]{1, 3, 2, 3, 3});

        Assert.assertEquals(2, output);
    }

    @Test
    public void test8() {
        final ShortestUnsortedContinuousSubarray solution = new ShortestUnsortedContinuousSubarray();
        final int output = solution.findUnsortedSubarray(new int[]{2, 3, 3, 2, 4});

        Assert.assertEquals(3, output);
    }
}
