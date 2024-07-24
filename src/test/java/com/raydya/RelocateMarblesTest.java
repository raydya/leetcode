package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class RelocateMarblesTest {

    @Test
    public void test1() {
        final RelocateMarbles solution = new RelocateMarbles();
        final List<Integer> output = solution.relocateMarbles(
            new int[]{1, 6, 7, 8},
            new int[]{1, 7, 2},
            new int[]{2, 9, 5}
        );

        Assert.assertArrayEquals(new Integer[]{5, 6, 8, 9}, output.toArray());
    }

    @Test
    public void test2() {
        final RelocateMarbles solution = new RelocateMarbles();
        final List<Integer> output = solution.relocateMarbles(
            new int[]{1, 1, 3, 3},
            new int[]{1, 3},
            new int[]{2, 2}
        );

        Assert.assertArrayEquals(new Integer[]{2}, output.toArray());
    }
}
