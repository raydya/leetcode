package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TwoOutOfThreeTest {

    @Test
    public void test1() {
        final TwoOutOfThree solution = new TwoOutOfThree();
        final List<Integer> output = solution.twoOutOfThree(new int[]{1, 1, 3, 2}, new int[]{2, 3}, new int[]{3});

        Assert.assertArrayEquals(new Integer[]{2, 3}, output.toArray());
    }

    @Test
    public void test2() {
        final TwoOutOfThree solution = new TwoOutOfThree();
        final List<Integer> output = solution.twoOutOfThree(new int[]{3, 1}, new int[]{2, 3}, new int[]{1, 2});

        Assert.assertArrayEquals(new Integer[]{1, 2, 3}, output.toArray());
    }

    @Test
    public void test3() {
        final TwoOutOfThree solution = new TwoOutOfThree();
        final List<Integer> output = solution.twoOutOfThree(new int[]{1, 2, 2}, new int[]{4, 3, 3}, new int[]{5});

        Assert.assertArrayEquals(new Integer[]{}, output.toArray());
    }

}
