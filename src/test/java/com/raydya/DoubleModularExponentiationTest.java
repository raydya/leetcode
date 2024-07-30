package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class DoubleModularExponentiationTest {

    @Test
    public void test1() {
        final DoubleModularExponentiation solution = new DoubleModularExponentiation();
        final List<Integer> output = solution.getGoodIndices(
            new int[][]{
                {2, 3, 3, 10},
                {3, 3, 3, 1},
                {6, 1, 1, 4}
            },
            2
        );

        Assert.assertArrayEquals(new Integer[]{0, 2}, output.toArray());
    }

    @Test
    public void test2() {
        final DoubleModularExponentiation solution = new DoubleModularExponentiation();
        final List<Integer> output = solution.getGoodIndices(
            new int[][]{
                {39, 3, 1000, 1000},
            },
            17
        );

        Assert.assertArrayEquals(new Integer[]{}, output.toArray());
    }

    @Test
    public void test3() {
        final DoubleModularExponentiation solution = new DoubleModularExponentiation();
        final List<Integer> output = solution.getGoodIndices(
            new int[][]{
                {30, 5, 43, 2}, {15, 50, 35, 41}, {45, 34, 41, 32}, {14, 37, 33, 13}, {6, 8, 1, 53}, {37, 1, 12, 52},
                {42, 37, 2, 52}, {9, 2, 15, 3}, {31, 12, 21, 24}, {52, 24, 6, 12}, {51, 35, 21, 52}, {30, 18, 10, 2},
                {27, 31, 50, 27}, {29, 25, 26, 32}, {15, 38, 43, 17}, {22, 12, 16, 43}, {48, 9, 15, 6},
                {41, 26, 22, 21}, {41, 49, 52, 26}, {53, 38, 9, 33}
            },
            1
        );

        Assert.assertArrayEquals(new Integer[]{5, 7, 8, 10, 17, 18}, output.toArray());
    }
}
