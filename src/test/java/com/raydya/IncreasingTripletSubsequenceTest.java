package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class IncreasingTripletSubsequenceTest {
    @Test
    public void test1() {
        final IncreasingTripletSubsequence solution = new IncreasingTripletSubsequence();
        final boolean output = solution.increasingTriplet(new int[]{1, 2, 3, 4, 5});

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final IncreasingTripletSubsequence solution = new IncreasingTripletSubsequence();
        final boolean output = solution.increasingTriplet(new int[]{5, 4, 3, 2, 1});

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final IncreasingTripletSubsequence solution = new IncreasingTripletSubsequence();
        final boolean output = solution.increasingTriplet(new int[]{2, 1, 5, 0, 4, 6});

        Assert.assertTrue(output);
    }

    @Test
    public void test4() {
        final IncreasingTripletSubsequence solution = new IncreasingTripletSubsequence();
        final boolean output = solution.increasingTriplet(new int[]{0, 4, 2, 1, 0, -1, -3});

        Assert.assertFalse(output);
    }

    @Test
    public void test5() {
        final IncreasingTripletSubsequence solution = new IncreasingTripletSubsequence();
        final boolean output = solution.increasingTriplet(new int[]{20, 100, 10, 12, 5, 13});

        Assert.assertTrue(output);
    }
}
