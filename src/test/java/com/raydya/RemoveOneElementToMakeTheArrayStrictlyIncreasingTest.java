package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class RemoveOneElementToMakeTheArrayStrictlyIncreasingTest {

    @Test
    public void test1() {
        final RemoveOneElementToMakeTheArrayStrictlyIncreasing solution = new RemoveOneElementToMakeTheArrayStrictlyIncreasing();
        final boolean output = solution.canBeIncreasing(new int[]{1, 2, 10, 5, 7});

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final RemoveOneElementToMakeTheArrayStrictlyIncreasing solution = new RemoveOneElementToMakeTheArrayStrictlyIncreasing();
        final boolean output = solution.canBeIncreasing(new int[]{2, 3, 1, 2});

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final RemoveOneElementToMakeTheArrayStrictlyIncreasing solution = new RemoveOneElementToMakeTheArrayStrictlyIncreasing();
        final boolean output = solution.canBeIncreasing(new int[]{1, 1, 1});

        Assert.assertFalse(output);
    }

    @Test
    public void test4() {
        final RemoveOneElementToMakeTheArrayStrictlyIncreasing solution = new RemoveOneElementToMakeTheArrayStrictlyIncreasing();
        final boolean output = solution.canBeIncreasing(new int[]{1, 2, 3});

        Assert.assertTrue(output);
    }
}
